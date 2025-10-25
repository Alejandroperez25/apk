# Strike Pros Android reconstruido

Este repositorio contiene un proyecto Android nativo reconstruido a partir de los artefactos que se extrajeron del APK oficial. El objetivo es que puedas volver a compilar un binario sin depender del tooling de Flutter.

## Estructura principal

- `app/`: módulo de aplicación Android con el manifiesto, recursos y código Java/Kotlin recuperado.
- `app/src/main/assets/flutter_assets`: activos empaquetados por la app original.
- `src/`: artefactos adicionales extraídos del APK original que aún no se han reubicado dentro del módulo.

## Requisitos previos

1. Instala el JDK 17 (o superior) y el Android SDK con las plataformas necesarias (API 29).
2. Instala Gradle 8.4 o superior en tu entorno y asegúrate de que el ejecutable `gradle` esté disponible en tu `PATH`.
3. Crea un archivo `local.properties` en la raíz del proyecto apuntando a tu instalación del SDK de Android, por ejemplo:

   ```
   sdk.dir=/home/usuario/Android/Sdk
   ```

## Pasos para compilar

Desde la raíz del repositorio ejecuta:

```bash
gradle assembleDebug
```

También puedes abrir la carpeta en Android Studio y utilizar las tareas estándar de Gradle para generar el APK.
