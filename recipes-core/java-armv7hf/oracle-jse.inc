LICENSE_FLAGS = "oracle_java"
LICENSE = "Oracle_Binary_Code_License_Agreement"
LIC_FILES_CHKSUM = "\
	file://${WORKDIR}/${JDK_JRE}${PV}_${PV_UPDATE}/LICENSE;md5=98f46ab6481d87c4d77e0e91a6dbc15f \
	file://${WORKDIR}/${JDK_JRE}${PV}_${PV_UPDATE}/COPYRIGHT;md5=3a11238025bf13b87f04753183ffeb90 \
	file://${WORKDIR}/${JDK_JRE}${PV}_${PV_UPDATE}/THIRDPARTYLICENSEREADME.txt;md5=f3a388961d24b8b72d412a079a878cdb \
	"

# get the java update version in the resulting package
PR =. "u${PV_UPDATE}"
S = "${WORKDIR}"
JDK ="${JDK_JRE}${PV}_${PV_UPDATE}"

do_install () {
	install -d -m 0755 ${D}${bindir}/
	install -d -m 0755 ${D}/usr/java/${JDK}

	cp -a ${S}/${JDK} ${D}/usr/java/
	ln -sf /usr/java/${JDK}/bin/java ${D}/${bindir}/java
}

# All the files are provided in a binaray package, and keeping all the
# files in a single package causes packaging QA errors and warnings.
# Avoid these packaging failure by skiping all the QA checks
INSANE_SKIP_${PN} = "${ERROR_QA} ${WARN_QA}"

# Inhibit warnings about files being stripped, we can't do anything about it.
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

FILES_${PN} = "/usr/"

RPROVIDES_${PN} += "java2-runtime"
