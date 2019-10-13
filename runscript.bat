call runcrud
if "%ERRORLEVEL%" == "0" goto execbrowser
echo Error
goto fail

:execbrowser
start chrome.exe http://localhost:8080/crud/v1/task/getTasks

:fail
echo.
echo This is Error
