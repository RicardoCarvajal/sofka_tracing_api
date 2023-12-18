#!/bin/bash

docker build --tag rcarvajalf/sofkaTracingApi:0.0.1 .

docker push rcarvajalf/sofkaTracingApi:0.0.1
