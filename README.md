# Strike Pros Flutter Skeleton

Este repositorio contiene un esqueleto de proyecto Flutter reconstruido para que puedas volver a compilar un APK a partir de los artefactos que se extrajeron del binario original.

## Estructura principal

- `lib/main.dart`: punto de entrada de la aplicación Flutter.
- `assets/`: directorio donde puedes ir ubicando los recursos que recuperaste del APK.
- `android/`: configuración mínima de Gradle y Android necesaria para compilar el APK usando Flutter.

## Requisitos previos

1. Instala el SDK de Flutter y Android Studio / Android SDK.
2. Define la variable de entorno `FLUTTER_SDK` apuntando a la ruta donde tengas instalado Flutter (por ejemplo `/home/usuario/sdks/flutter`).
3. Dentro de `android/`, genera el `gradle-wrapper.jar` ejecutando `gradle wrapper` si aún no existe.

## Pasos para compilar

```bash
flutter pub get
flutter build apk
```

A partir de este punto ya puedes comenzar a migrar el código y la lógica original reimplementando pantallas, estados y servicios necesarios para tu proyecto.
