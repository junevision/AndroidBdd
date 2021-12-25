# Android BDD Framework with Espresso and Cucumber in Kotlin

## How to run 

### Run all smoke tests written with Cucumber and BDD execute : 
- `./gradlew connectedDebugAndroidTest -Pcucumber -Ptags="@smoke"`

### Run individual feature test execute : 
- `./gradlew connectedDebugAndroidTest  -Pcucumber -Pscenario="Successful Login"`

### Run pure Espresso test :
- `./gradlew connectedAndroidTest`
