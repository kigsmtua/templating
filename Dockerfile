FROM java

ADD target /usr/share/target

ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/target/templating-1.0-SNAPSHOT.jar"]
