#/*******************************************************************************
#* <ELA>
#* Copyright (c) 2013, 2014 Institut de Recherche Technologique SystemX
#* All rights reserved.
#*******************************************************************************/

SUMMARY = "All packages required for a base installation of qt5 on nitrogen6x"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"
PR = "r5"

inherit packagegroup

RDEPENDS_${PN} = " \
    gcc \
    g++ \
    binutils \
    libgcc \
    libgcc-dev \
    libstdc++ \
    libstdc++-dev \
    libstdc++-staticdev \
    autoconf \
    automake \
    ccache \
    chkconfig \
    glib-networking \
    glibmm \
    packagegroup-core-buildessential \
    pkgconfig \
    boost \
    cmake \
    zlib \
    glib-2.0 \
    git \
    \
    ruby \
    cpufrequtils \
    nano \
    gdb \
    gstreamer \
    gst-meta-video \
    gst-fsl-plugin \
    gst-plugins-base-app \
    gst-plugins-base \
    gst-plugins-good \
    gst-plugins-good-rtsp \
    gst-plugins-good-udp \
    gst-plugins-good-rtpmanager \
    gst-plugins-good-rtp \
    gst-plugins-good-video4linux2 \
    openssh-sftp-server \
    imx-vpu \
    imx-test \    	
    qtbase-fonts \
    qtbase-plugins \
    qtbase-tools \
    qtbase-examples \
    qtdeclarative \
    qtdeclarative-plugins \
    qtdeclarative-tools \
    qtdeclarative-examples \
    qtdeclarative-qmlplugins \
    qtmultimedia \
    qtmultimedia-plugins \
    qtmultimedia-examples \
    qtmultimedia-qmlplugins \
    qtquickcontrols-qmlplugins \
    qtsvg \
    qtsvg-plugins \
    qtsensors \
    qtimageformats-plugins \
    qtsystems \
    qtsystems-tools \
    qtsystems-examples \
    qtsystems-qmlplugins \
    qtscript \
    qt3d \
    qt3d-examples \
    qt3d-qmlplugins \
    qt3d-tools \
    qtwebkit \
    qtwebkit-examples-examples \
    qtwebkit-qmlplugins \
    qtgraphicaleffects-qmlplugins \
    qtconnectivity-qmlplugins \
    qtlocation-plugins \
    qtlocation-qmlplugins \
    cinematicexperience \
    cairo pango fontconfig freetype pulseaudio dbus \
    alsa-lib alsa-tools alsa-state alsa-utils-alsaconf fsl-alsa-plugins \
    i2c-tools \ 
"
