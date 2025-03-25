#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.ewalletonly --module-path aisco.product.ewalletonly -m aisco.product.ewalletonly &

wait