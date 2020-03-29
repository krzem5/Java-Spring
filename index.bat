echo off
echo NUL>_.class&&del /s /f /q *.class
cls
javac com/krzem/spring/Main.java&&java com/krzem/spring/Main
start /min cmd /c "echo NUL>_.class&&del /s /f /q *.class"