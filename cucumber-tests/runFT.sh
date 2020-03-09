#!/usr/bin/env bash


mvn verify -Dcucumber.options="--strict --tags @ft --plugin pretty classpath:features"