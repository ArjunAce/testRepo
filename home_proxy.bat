@REM is used to comment a line
@REM These are the system variables set to be reset for home use

reg delete "HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\Session Manager\Environment" /F /V http_proxy
reg delete "HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\Session Manager\Environment" /F /V https_proxy
reg delete "HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\Session Manager\Environment" /F /V HTTPS_PROXY
reg delete "HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\Session Manager\Environment" /F /V HTTP_PROXY
reg delete "HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\Session Manager\Environment" /F /V NO_PROXY

@REM HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\Session Manager\Environment is the location of system variables

@REM set= will work only for the current session

@REM have to check for ill-effects of deleting sys.variables