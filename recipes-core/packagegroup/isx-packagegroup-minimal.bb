SUMMARY = "All packages available for sx-images"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
    isx-helloworld \
    \
    psplash \
    rt-tests \
    \
    libsocketcan \
    canutils \
    \
    busybox \
    sudo \
    setxkbmap \
    apt \
    vim \
    wget \
    dhcp-client \
    \
"

