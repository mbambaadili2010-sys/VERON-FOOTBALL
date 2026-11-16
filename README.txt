VERON FOOTBALL — Android Studio project wrapper

This is an Android Studio project structure that packages the current web prototype inside an Android WebView.
It is NOT a compiled APK yet.

BUILD AN APK
1. Install Android Studio on a computer.
2. Open this folder (the folder containing settings.gradle) in Android Studio.
3. Allow Gradle sync to finish. Use JDK 17 if Android Studio asks.
4. Choose Build > Build Bundle(s) / APK(s) > Build APK(s).
5. Android Studio will show the generated APK location, usually app/build/outputs/apk/debug/app-debug.apk.

CURRENT LIMITATIONS
- Sample scores are demonstrations, not live scores.
- Real account registration, Google sign-in, phone verification, news and push notifications are not connected.
- The app needs a backend and authorized football data provider before those functions can be production-ready.
- Do not enter real passwords into the prototype.

Application ID: com.veronfootball.app
Version: 1.0
