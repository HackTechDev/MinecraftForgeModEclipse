#!/bin/sh

./gradlew build
ls -l build/libs/
cp  build/libs/weaponmod-universal-1.15.0.jar ~/.minecraft/mods/
