# quarkus-config-list-override

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

This is a small reproducer of the override behaviour, when configuring nested objects in collections with quarkus

With the command we run a test suite with two profiles [test, myprofile]. We expect lists configured in test to be overriden 
in myprofile. That works for a list of strings, but not for a list of objects.  

```shell script
./mvnw test
```

