## How to run

- Run axon server and mysql firstly

```
cd infra
docker-compose up
```

## Build common API & Run each service

'''
cd common-api
mvn install
cd ..

cd bbb
mvn spring-boot:run
cd ..

cd b2
mvn spring-boot:run
cd ..

'''
