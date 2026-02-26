The runtime environment is now configured:

**Warmup script** — Runs `./gradlew jsMainClasses` to download the Gradle distribution, all dependencies (Kotlin compiler, npm packages including MUI, React, date-fns), and pre-compile Kotlin/JS sources. This significantly reduces startup time.

**Run script** — Starts the Webpack Dev Server via `./gradlew jsRun -t` with:
- `--host 0.0.0.0` to make it accessible externally
- `--port 8080` for the preview port
- `--allowed-hosts all` to allow the Matter preview URL
- `-t` flag for continuous/watching build mode (hot-reload)

The app will be available on **port 8080** in the preview environment.