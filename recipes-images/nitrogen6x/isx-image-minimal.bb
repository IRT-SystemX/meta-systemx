DESCRIPTION = "SystemX image minimal with CAN feature."

IMAGE_FEATURES += "\
	splash \
	package-management \
	ssh-server-dropbear \
	hwcodecs \
	\
"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += "\
	\
	isx-packagegroup-minimal \
	\
"
export IMAGE_BASENAME = "isx-image-minimal"
