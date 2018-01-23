# Checker Framework - Liner checker development repository

This repository is used to develop and test the linear type checker.

The reason why this is a separate repository from the Checker Framework is so that I can re-compile then write/run tests
in a matter of one or two seconds, rather than 30 seconds in the normal build.

To build this project, place the root dir under the following path in the main Checker Framework repo:

```
jsr308/checker-framework/
```

## Building

To compile and run tests, from the root dir, run this command:

```
./gradlew test
```
