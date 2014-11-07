DESCRIPTION = "SystemX image demo based on linux boundary kernel and presented for Future@SystemX 2014."

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
