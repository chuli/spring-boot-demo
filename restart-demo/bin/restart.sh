#!/bin/bash
if [[ "$OSTYPE" == "darwin"* ]]; then
    PORT=$(netstat -anvp tcp | grep 12581)
else
    PORT=$(netstat -ntulp | grep 12581)
if [[ -n $PORT ]]; then
    echo "The process is working. Are you sure close?"
    result = '0'
    while [[ $RESULT == '0' ]]; do
        echo "ready to close ..."
        RESULT = $(curl -X POST http://127.0.0.1:12581/restartactuator/shutdown)
        sleep 2
    done
    echo "close success"
fi
echo "The process is ready to start ..."
#java -jar ../target/