# scala-js.g8
A Giter8 template for Scala.js

## Use
```sh
sbt new deadblackclover/scala.g8
```

## Build
```sh
sbt fastLinkJS 
```
or
```sh
docker run -it -v .:/root/project -w "/root/project" --rm sbtscala/scala-sbt:eclipse-temurin-17.0.2_1.6.2_2.12.15 sbt fastLinkJS
```
