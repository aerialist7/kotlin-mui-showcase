# AGENTS.md

## Project

Kotlin MUI Showcase is a Kotlin/JS browser application built with Kotlin Multiplatform and the published Kotlin Wrappers. Application code lives in `src/jsMain/kotlin/`.

## Local build environment

Use JDK 21 for Gradle tasks. On the maintainer's macOS workstation, the installed Homebrew JDK is at:

```sh
export JAVA_HOME=/opt/homebrew/opt/openjdk@21/libexec/openjdk.jdk/Contents/Home
export PATH="$JAVA_HOME/bin:$PATH"
./gradlew build
```

Setting `JAVA_HOME` explicitly worked when `java_home -v 21` did not find the installed JDK. On other machines, use the local JDK 21 path. Run Gradle through the checked-in `./gradlew` wrapper.

## Gradle Wrapper updates

Keep the Gradle version in `build.gradle.kts` (`tasks.wrapper { gradleVersion = ... }`) and the distribution URL in `gradle/wrapper/gradle-wrapper.properties` in sync. After changing the configured version, run `./gradlew wrapper` with JDK 21 so the checked-in wrapper files are regenerated.

## Kotlin/JS package lock

The repository tracks `kotlin-js-store/package-lock.json`. If the build reports that this lock is stale or inconsistent after Kotlin Gradle Plugin or npm dependency changes, regenerate it with:

```sh
./gradlew kotlinUpgradePackageLock
./gradlew build
```

The combined command `./gradlew kotlinUpgradePackageLock build` also works. Review the generated lockfile diff; the Kotlin Gradle Plugin may update JavaScript tooling and its transitive npm packages. Do not fix a generated-lock mismatch by hand-editing `package-lock.json`.

## Kotlin Wrapper gaps

When an API used by the showcase is missing from the published Kotlin Wrappers, always add a local wrapper in `src/jsMain/kotlin/io/github/aerialist7/MissedWrappers.kt` (usually a typed extension property or function). Keep call sites typed and free of ad hoc `asDynamic()` access or casts; confine any necessary interop workaround to that local wrapper. Add a short comment describing the missing upstream API and the relevant runtime/type behavior. These local wrappers are the record of generator gaps and should later guide fixes in the Kotlin Wrappers generator.

## Previous build notes

The Kotlin and Gradle Wrapper upgrade built successfully with JDK 21 after refreshing the Kotlin/JS package lock. The build emitted a Kotlin DSL deprecation warning for `jsMain by getting` and a webpack bundle-size advisory; neither prevented the build from succeeding.
