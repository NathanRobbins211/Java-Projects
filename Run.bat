@echo off
cd /D "%~dp0"
color A

REM --User inputs filename to compile.--
:start
set i=
set /p i=Input the name of the java file: 
echo.
goto :compile

REM --The above input is compiled.--
:compile
echo Compiling java script to class...
javac %i%.java
goto :run

REM --Runs the .class file.--
:run
echo Running program...
java %i%
pause

:end