#!/usr/bin/env bash
DIR="${BASH_SOURCE%/*}"
if [[ ! -d "$DIR" ]]; then DIR="$PWD"; fi

source "$(pwd)/scripts/header.sh"
echo $(pwd)
echo "test"
echo $(test_function)