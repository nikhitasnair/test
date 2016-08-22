set projectLocation=C:\Users\NAIRNX\workspace\LCProject
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\plugins\\org.testng.eclipse_6.9.12.201607091356\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause