#!/usr/bin/env bash

cd authuser/ && mvn clean package -Pdocker

cd ../course/ && mvn clean package -Pdocker

cd ../notification/ && mvn clean package -Pdocker

cd ../