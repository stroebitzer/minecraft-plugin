#!/bin/bash

# BUILD
export TERM=cygwin
./gradlew build

# DEPLOY
echo '>>>>> Hast du den Minecraft Server auf Thor gestoppt?'
read
scp build/libs/ueberbiber.jar stroebitzers@loki:Schreibtisch/minecraft/plugins
echo '>>>>> Jetzt den Minecraft Server auf Thor wieder starten!'
read
