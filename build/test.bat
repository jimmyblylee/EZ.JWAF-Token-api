@echo off
title Testing EZ.JWAF User Token API
call msg info "[INFO] Testing EZ.JWAF User Token API" & echo.

set BASEDIR=%~sdp0

pushd %BASEDIR%\..\src
  call mvn clean package -DperformTest=true -DperformSource=true
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