DESCRIPTION = "BL1 for s5p6818"
LICENSE = "GPLv2"

inherit deploy

#https://github.com/SamsungARTIK/boot-firmwares-artik710s
#SRC_URI = "git:://github.com/SamsungARTIK/bl1-artik710;protocol=git;branch=artik"
#SRC_URI = "git:://github.com/NexellCorp/bl1_s5p6818;protocol=git;branch=artik"
#SRC_URI = "git://git.nexell.co.kr/nexell/bl1/bl1-s5p6818;protocol=git;branch=nexell"
SRC_URI = "git://github.com/friendlyarm/sd-fuse_s5p6818.git;protocol=https;"
SRCREV = "ff5d9d52f6dd8d608a4fc3829976a078d3defe0f"

LIC_FILES_CHKSUM = "file://README.md;md5=0d6c7f42efcf5e2931accdbdf5d2bcfc"

S = "${WORKDIR}/git"

do_deploy() {
	install -m 0644 ${S}/prebuilt/bl1-mmcboot.bin ${DEPLOYDIR}/
}

do_configure() {
	:
}

do_install() {
	:
}

addtask deploy before do_build after do_compile
