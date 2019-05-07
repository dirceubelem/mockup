./gradlew clean assemble &&
rm -rf /opt/tomcat/webapps/fourti.me.mockup &&
rm -r /opt/tomcat/webapps/fourti.me.mockup.war &&
cp build/libs/*.war /opt/tomcat/webapps