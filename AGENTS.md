# AGENTS.md

## Project

Kotlin MUI Showcase is a Kotlin/JS browser application built with Kotlin Multiplatform and the published Kotlin Wrappers. Application code lives in `src/jsMain/kotlin/`.

## Local build environment

Use JDK 21 for Gradle tasks. On the maintainer's macOS workstation, `java_home` finds the installed JDK 21:

```sh
export JAVA_HOME=$(/usr/libexec/java_home -v 21)
export PATH="$JAVA_HOME/bin:$PATH"
./gradlew build
```

On other machines, use the local JDK 21 path. Run Gradle through the checked-in `./gradlew` wrapper.

A continuous `./gradlew jsBrowserDevelopmentRun -t` (for example, started from the IDE) keeps writing to `build/`, so `./gradlew clean` fails with "Unable to delete directory" while it runs. Stop it before cleaning, or run an incremental `./gradlew build` instead.

Run production and development Kotlin/JS tasks in separate Gradle invocations. Both sync into `build/js/packages/kotlin-mui-showcase/kotlin`, and Gradle rejects a combined `./gradlew build jsBrowserDevelopmentExecutableDistribution` with an implicit dependency validation error.

## Gradle Wrapper updates

Keep the Gradle version in `build.gradle.kts` (`tasks.wrapper { gradleVersion = ... }`) and the distribution URL in `gradle/wrapper/gradle-wrapper.properties` in sync. After changing the configured version, run `./gradlew wrapper` with JDK 21 so the checked-in wrapper files are regenerated.

## Kotlin/JS package lock

The repository tracks `kotlin-js-store/package-lock.json`. If the build reports that this lock is stale or inconsistent after Kotlin Gradle Plugin or npm dependency changes, regenerate it with:

```sh
./gradlew kotlinUpgradePackageLock
./gradlew build
```

The combined command `./gradlew kotlinUpgradePackageLock build` also works. Review the generated lockfile diff; the Kotlin Gradle Plugin may update JavaScript tooling and its transitive npm packages. Do not fix a generated-lock mismatch by hand-editing `package-lock.json`.

An incremental local build may not detect a stale lock when generated Gradle/JavaScript outputs are already up to date. After Kotlin/JS dependency, npm override, or root package configuration changes, run `./gradlew kotlinUpgradePackageLock` and verify with `./gradlew clean build`.

## Kotlin Wrapper gaps

When an API used by the showcase is missing from the published Kotlin Wrappers, always add a local wrapper in `src/jsMain/kotlin/io/github/aerialist7/MissedWrappers.kt` (usually a typed extension property or function). Keep call sites typed and free of ad hoc `asDynamic()` access or casts; confine any necessary interop workaround to that local wrapper. Add a short comment describing the missing upstream API and the relevant runtime/type behavior. These local wrappers are the record of generator gaps and should later guide fixes in the Kotlin Wrappers generator.

When the missing API is a component or function imported from a JS module, declare it in a sibling `MissedWrappers.<Name>.kt` file with `@file:JsModule(...)` (for example, `MissedWrappers.Timeline.kt`). Kotlin applies JS module imports per file, so these external declarations cannot live in `MissedWrappers.kt` itself.

## Previous build notes

The Kotlin and Gradle Wrapper upgrade built successfully with JDK 21 after refreshing the Kotlin/JS package lock. The build emits a webpack bundle-size advisory; it does not prevent the build from succeeding.
