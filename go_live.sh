#!/bin/bash

# BUILD
export TERM=cygwin
./gradlew build

# DEPLOY
echo '>>>>> Hast du den Minecraft Server auf Loki gestoppt?'
read
scp build/libs/ueberbiber.jar stroebitzers@loki:Schreibtisch/minecraft/plugins
echo '>>>>> Jetzt den Minecraft Server auf Loki wieder starten!'
read
