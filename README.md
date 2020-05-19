List indices in metadata
=============================

A simple utility that displays index name from metadata state file.

Building
-----------
Update elasticsearch version in `build.gradle` (it is currently set to `7.6.2`)

```shell script
$ ./gradlew build
```
The distribution can be found in `build/distributions/index-state-reader-1.0-SNAPSHOT.zip`.

Running
-----------
```shell script
$ index-state-reader-1.0-SNAPSHOT/bin/index-state-reader indices/*/_state/state-*.st
```
