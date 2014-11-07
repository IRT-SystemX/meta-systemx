#/*******************************************************************************
#* <ELA>
#* Copyright (c) 2013, 2014 Institut de Recherche Technologique SystemX
#* All rights reserved.
#*******************************************************************************/

DESCRIPTION = "Compilation and installation of isx-helloworld"
PR = "r1"
LICENSE = "MIT"

S = "${WORKDIR}"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302" 
SRC_URI = "file://isx-helloworld.c"

do_compile() {
		${CC} ${CFLAGS} ${LDFLAGS} -o isx-helloworld isx-helloworld.c
}

do_install() {
		install -d ${D}${bindir}/
		install -m 0755 ${S}/isx-helloworld ${D}${bindir}/
}

FILES_${PN} = "${bindir}/isx-helloworld"
