# toberichAPIServer

This Kotlin based [Spring Boot](https://spring.io/projects/spring-boot) application has been generated using the [OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator).

## OpenApi Generator
```
openapi-generator generate \
  -i api.yaml \
  -g kotlin-spring \
  -o . \
  --additional-properties=gradleBuildFile=true \
  --artifact-id toberich \
  --model-name-suffix Dto \
  --group-id com.lightsrc \
  --invoker-package com.lightsrc.toberich \
  --package-name com.lightsrc.toberich
```

## Getting Started

This document assumes you have either maven or gradle available, either via the wrapper or otherwise. This does not come with a gradle / maven wrapper checked in.

By default a [`pom.xml`](pom.xml) file will be generated. If you specified `gradleBuildFile=true` when generating this project, a `build.gradle.kts` will also be generated. Note this uses [Gradle Kotlin DSL](https://github.com/gradle/kotlin-dsl).

To build the project using maven, run:
```bash
mvn package && java -jar target/toberich-1.0.0.jar
```

To build the project using gradle, run:
```bash
gradle build && java -jar build/libs/toberich-1.0.0.jar
```

If all builds successfully, the server should run on [http://localhost:8080/](http://localhost:8080/)
