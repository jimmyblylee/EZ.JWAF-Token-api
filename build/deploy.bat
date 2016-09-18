@echo off
title Deploying EZ.JWAF User Token API
call msg info "[INFO] Deploying EZ.JWAF User Token API" & echo.

set BASEDIR=%~sdp0

pushd %BASEDIR%\..\src\token-api
  call mvn clean deploy -DperformTest=true -DperformSource=true -DperformDeploy=true
popd

call beep.bat
timeout /t 1 >NUL 
call beep.bat
timeout /t 1 >NUL 
call beep.bat
timeout /t 1 >NUL 
call beep.bat
timeout /t 1 >NUL 
call beep.bat
timeout /t 1 >NUL 

pause