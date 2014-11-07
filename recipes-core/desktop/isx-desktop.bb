#/*******************************************************************************
#* <ELA>                      
#* Copyright (c) 2013, 2014 Institut de Recherche Technologique SystemX
#* All rights reserved.
#*******************************************************************************/

DESCRIPTION = "Customise the isx-image-demo wallpaper with isx-wallpaper.jpg"

PR = "r1"
LICENSE = "MIT"
DEPENDS = "xfdesktop"

S = "${WORKDIR}"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI = "file://isx-wallpaper.jpg"

do_install() {
		install -d ${D}${datadir}/backgrounds/xfce
                cp ${S}/isx-wallpaper.jpg ${D}${datadir}/backgrounds/xfce/
}

FILES_${PN} += "${datadir}/backgrounds/xfce/isx-wallpaper.jpg"
