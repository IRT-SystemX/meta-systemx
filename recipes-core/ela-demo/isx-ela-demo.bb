#/*******************************************************************************
#* <ELA>
#* Copyright (c) 2013, 2014 Institut de Recherche Technologique SystemX
#* All rights reserved.
#*******************************************************************************/

DESCRIPTION = "Integration of isx-ela-demo script and isx-ela-demo java application"
PR = "r1"
LICENSE = "MIT"

S = "${WORKDIR}"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302" 
SRC_URI = "file://isx-ela-demo-jar"
SRC_URI += "file://isx-ela-demo-script"

do_compile() {
}

do_install() {
		install -d ${D}${bindir}/
		install -d ${D}/usr/ELA/
		install -m 0755 ${S}/isx-ela-demo-script ${D}${bindir}/ 
		install -m 0755 ${S}/isx-ela-demo-jar ${D}/usr/ELA/isx-ela-demo.jar 
}

FILES_${PN} = "${bindir}/isx-ela-demo-script"
FILES_${PN} += "usr/ELA/isx-ela-demo.jar"
