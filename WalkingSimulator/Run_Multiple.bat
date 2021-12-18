@echo off
cd /D "%~dp0"
color A

REM --.java files are compiled.--
:compile
echo Compiling java script to class...
javac *.java
goto :input

REM --Asks for the primary .class file from user.--
:input
echo.
set c=
set /p c=Which .class file is the primary one? 
goto :run

REM --Runs the inputted .class file.--
:run
echo Running program...
java %c%
pause
goto :choice

REM --Asks the user if they want the .class files in a folder or not.--
:choice
echo.
set m=
set /p m=Would you like the .class files moved to a folder? (y/n):
if /I '%m%'=='Y' goto :directory
if /I '%m%'=='N' goto :delete
echo "%m%" is not valid, try again.
goto :choice

REM --Deletes the .class files and terminates.--
:delete
echo.
color C
echo Deleting .class files... press 'Enter' to continue (or CTRL+C to terminate)
pause
del *.class
echo All .class files are deleted.
goto :end

REM --Asks the user what name the folder is.--
:directory
echo.
set d=
set /p d=What do you want the folder named? 
mkdir "%d%"
move /Y *.class "%d%"

:end