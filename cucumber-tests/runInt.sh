#!/usr/bin/env bash


mvn verify -Dcucumber.options="--strict --tags @int --plugin pretty classpath:features"