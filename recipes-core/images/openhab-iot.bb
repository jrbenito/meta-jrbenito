SUMMARY = "Provides a basic image capable for running OpenHAB, Mosquitto and other tools for IoT"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += "\
                  kernel-modules \
     packagegroup-core-ssh-dropbear \
                  screen \
                  openhab \
                  mosquitto \
                  "
