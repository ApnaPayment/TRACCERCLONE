#!/bin/sh

cd $(dirname $0)/../web

SDK="/opt/Sencha/Cmd/6.0.2.14"

sencha compile --classpath=app.js,app,$SDK/packages/core/src,$SDK/packages/core/overrides,$SDK/classic/classic/src,$SDK/classic/classic/overrides \
       exclude -all \
       and \
       include -recursive -file app.js \
       and \
       exclude -namespace=Ext \
       and \
       concatenate -closure app.min.js
