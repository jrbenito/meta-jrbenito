SUMMARY = "Provides a basic image capable for running OpenHAB, Mosquitto and other tools for IoT"

LICENSE = "MIT"

IMAGE_FEATURES += "package-management ssh-server-openssh \
                  "

IMAGE_INSTALL += "packagegroup-core-boot packagegroup-core-full-cmdline ${CORE_IMAGE_EXTRA_INSTALL} \
                  kernel-modules kernel-devicetree \
                  screen openhab mosquitto \
                 "
inherit core-image
