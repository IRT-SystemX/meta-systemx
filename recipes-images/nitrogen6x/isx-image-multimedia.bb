DESCRIPTION = "SystemX image with multimedia features : X11 and Qt5."

IMAGE_FEATURES += "\
	splash \
	package-management \
	ssh-server-dropbear \
	hwcodecs \
	x11 \
	\
"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += "\
	packagegroup-xfce-base \
	\
	isx-packagegroup-minimal \
	isx-packagegroup-qt5 \
	\
	isx-helloworld-qt \
	isx-speedcluster-qt \
"
export IMAGE_BASENAME = "isx-image-multimedia"
