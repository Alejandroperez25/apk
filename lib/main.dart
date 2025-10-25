import 'package:flutter/material.dart';

void main() {
  runApp(const StrikeProsApp());
}

class StrikeProsApp extends StatelessWidget {
  const StrikeProsApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Strike Pros',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        useMaterial3: true,
      ),
      home: const HomeScreen(),
    );
  }
}

class HomeScreen extends StatelessWidget {
  const HomeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Strike Pros'),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: const [
            Text(
              'Proyecto reconstruido',
              style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
            ),
            SizedBox(height: 12),
            Text(
              'Este es un esqueleto de aplicación Flutter agregado a partir de los artefactos '
              'que venían dentro del APK descompilado. Puedes usarlo como punto de partida '
              'para volver a implementar la lógica de la aplicación original, añadir vistas '
              'y conectar servicios según sea necesario.',
            ),
            SizedBox(height: 12),
            Text(
              'Los assets importados desde el APK se encuentran en la carpeta "assets". '
              'Revísalos y muévelos a la estructura correspondiente mientras recreas la app.',
            ),
          ],
        ),
      ),
    );
  }
}
