# vsc
install vsc
set AUTO_SAVE
install Plugins
* Gradle for JAva
* German Lang pack
* Debugger for Java

# java
download java https://www.oracle.com/java/technologies/downloads/#jdk17-windows
set JAVA_HOME and PATH C:\Program Files\Java\jdk-17.0.1

# add DNS entries
C:\Windows\System32\drivers\etc\hosts
10.0.0.143       thor
10.0.0.144       loki

# scp
ssh-keygen
C:\Users\StroebEri/.ssh/id_rsa.pub
ssh stroebitzers@loki

# build
gradlew.bat build
scp build/libs/plugin.jar stroebitzers@loki:Schreibtisch/minecraft/plugins

# git
VSC git extension pack
git http://git-scm/download/win
git bash as standard terminal
in git terminal git clone plugin and resourcepack
git config --global user.name "your_username"
git config --global user.email "your_email_address@example.com"
git credentials via doing first push
