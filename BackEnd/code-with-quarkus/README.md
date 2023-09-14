
# Alticci Sequence

This is a Quarkus-based API that calculates the Alticci sequence. The Alticci sequence is defined as follows:

- n=0 => a(0) = 0
- n=1 => a(1) = 1
- n=2 => a(2) = 1
- n>2 => a(n) = a(n-3) + a(n-2)

# API

## Endpoints

- `GET /hello`: Returns a simple greeting message.
- `GET /hello/{n}`: Calculates the value of the Alticci sequence for the provided index (n) and returns the result.

## Caching Method

The API implements caching to improve performance when calculating the Alticci sequence for a specific index (n). Here's how the caching method works:

- When a request is made to calculate the Alticci sequence for a specific index (n), the API first checks if the result for that index is already cached.

- If the result is found in the cache, the API returns the cached result without performing the calculation again, which significantly reduces response time.

- If the result is not in the cache, the API calculates the Alticci sequence for the requested index and stores the result in the cache for future requests.

### Alternative: Using `@CacheResult` Annotation

Quarkus provides the `@CacheResult` annotation, which can be used to simplify caching. Here's how it works and the differences compared to the custom caching method:

- With `@CacheResult`, you can annotate the method that performs the Alticci sequence calculation directly, specifying the cache key and cache name.

- Quarkus automatically handles caching based on the method parameters and cache key, eliminating the need for manual cache management.

- The caching behavior is more declarative and reduces the amount of code needed for caching.

# CORS Configuration for Angular and Quarkus

By default, web browsers restrict web pages from making requests to domains other than the one from which the web page was served. In your case, your Angular app is running on http://localhost:4200, and it's trying to make a request to http://localhost:8080, which is a different domain, and the browser is blocking it.

To resolve this issue during development, you can configure CORS settings in your Quarkus application to allow requests from http://localhost:4200. Here's how you can do it:

## Step 1: Install the Quarkus CORS Extension

You can use Quarkus extensions to add CORS support to your application. Open a terminal and navigate to your Quarkus project directory, then run the following command:

    ```shell
    ./mvnw quarkus:add-extension -Dextensions="quarkus-resteasy-cors"

## Step 2: Configure CORS Settings

To configure CORS (Cross-Origin Resource Sharing) settings for your Quarkus application, follow these steps:

1. Edit the `application.properties` file in your Quarkus project's `src/main/resources` directory.

2. Add the following CORS configuration to the `application.properties` file:

   ```properties
   quarkus.http.cors=true
   quarkus.http.cors.origins=http://localhost:4200
   quarkus.http.cors.methods=GET,POST,PUT,DELETE
   quarkus.http.cors.headers=Content-Type

 - This configuration allows CORS requests from http://localhost:4200 and specifies the allowed HTTP methods and headers.



## Documentation

The API documentation is available at [http://localhost:8080/swagger-ui](http://localhost:8080/swagger-ui). You can use the Swagger UI to explore and test the API endpoints.


=======================================================================================================================


# code-with-quarkus

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/code-with-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- RESTEasy Classic ([guide](https://quarkus.io/guides/resteasy)): REST endpoint framework implementing Jakarta REST and more

## Provided Code

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
