#/*******************************************************************************
#* <ELA>
#* Copyright (c) 2013, 2014 Institut de Recherche Technologique SystemX
#* All rights reserved.
#*******************************************************************************/

DESCRIPTION = "Firmware copy program for SystemX neatgear wifi dongle"
PR = "r1"
LICENSE = "MIT"

S = "${WORKDIR}"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302" 
SRC_URI = "file://htc_9271.fw"

do_compile() {
}

do_install() {
		install -d ${D}/lib/firmware/
		install -D ${S}/htc_9271.fw ${D}/lib/firmware/ 
}

FILES_${PN} = "/lib/firmware/htc_9271.fw"
