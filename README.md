# ESIA Fill Form
## Software
+ JRE
+ Java 8
+ Maven 3.6.3
+ Chrome + ChromeDriver
## Developer
Ivan Rastorguev

e-mail: rastorguev.i.a@yandex.ru
## Build App
```
//open console as admin
//install chocolatey
@powershell -NoProfile -ExecutionPolicy unrestricted -Command "iex ((new-object net.webclient).DownloadString('https://chocolatey.org/install.ps1'))" && SET PATH=%PATH%;%ALLUSERSPROFILE%\chocolatey\bin

choco install javaruntime
choco install chromedriver
choco install maven

//build project
cd..
mvn clean install

//fill info.ini and then run app, threadCount = 1(min)-5(max)
java app.java
```