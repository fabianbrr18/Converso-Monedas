<h1 align="center">💱 Conversor de Monedas - Challenge Alura</h1>

<p align="center">
<img src="https://www.google.com/search?q=https://img.shields.io/badge/Java-17-orange%3Fstyle%3Dfor-the-badge%26logo%3Djava" alt="Java 17" />
<img src="https://www.google.com/search?q=https://img.shields.io/badge/Gson-2.10.1-blue%3Fstyle%3Dfor-the-badge" alt="Gson" />
<img src="https://www.google.com/search?q=https://img.shields.io/badge/API-ExchangeRate-green%3Fstyle%3Dfor-the-badge" alt="API" />
<img src="https://www.google.com/search?q=https://img.shields.io/badge/Status-Terminado-brightgreen%3Fstyle%3Dfor-the-badge" alt="Status" />
</p>

<p align="center">
Un desafío de programación Back-End parte del programa <strong>Oracle Next Education (ONE)</strong> en alianza con <strong>Alura</strong>.
</p>

📖 Descripción

Esta herramienta es un Conversor de Monedas desarrollado en Java que se ejecuta en la consola (CLI). Su objetivo es filtrar y procesar divisas específicas conectándose a la API ExchangeRate-API para obtener tasas de cambio en tiempo real.

El proyecto demuestra el dominio de conceptos fundamentales como:

Consumo de APIs RESTful (Métodos GET).

Manipulación de datos JSON (Parseo con Gson).

Orientación a Objetos (Records, Clases, Interfaces).

📸 Demostración Visual

Así se ve la interacción con la aplicación en la terminal:

*************************************************
 Bienvenido/a al Conversor de Moneda =]
*************************************************

--- Elija una opción válida ---
1) Dólar (USD) => Peso Argentino (ARS)
2) Peso Argentino (ARS) => Dólar (USD)
3) Dólar (USD) => Real Brasileño (BRL)
4) Real Brasileño (BRL) => Dólar (USD)
...
9) Salir

>> Opción: 1
>> Ingrese el valor que desea convertir: 100

-------------------------------------------------
El valor 100.00 [USD] corresponde al valor final de =>>> 85000.00 [ARS]
-------------------------------------------------


✨ Características y Funcionalidades

Funcionalidad

Descripción

📡 Cliente HTTP

Implementación de HttpClient para conectar con la web.

🔄 Conversión de Pares

Lógica para convertir monedas base a monedas objetivo (Ej: USD -> COP).

🛡️ Manejo de Errores

Bloques try-catch para evitar cierres inesperados por entradas inválidas.

🕒 Historial (Extra)

Registro de las últimas conversiones realizadas con fecha y hora.

📂 Estructura del Proyecto

El código sigue una arquitectura limpia para facilitar el mantenimiento:

📦 conversor-monedas-java
 ├── 📜 Principal.java         # (UI) Punto de entrada. Contiene el menú y la interacción con el usuario.
 ├── 📜 ConsultarMoneda.java   # (Servicio) Clase encargada de realizar la petición HTTP a la API.
 ├── 📜 Moneda.java            # (Modelo) Record de Java para mapear el JSON de la API a un objeto.
 └── 📜 README.md              # Documentación del proyecto.


🚀 Cómo ejecutar el proyecto

Sigue estos pasos para probar la aplicación en tu entorno local:

1. Prerrequisitos

Tener instalado Java JDK 17 o superior.

Un IDE como IntelliJ IDEA, Eclipse o VS Code.

Descargar la librería Gson (o agregarla vía Maven/Gradle).

2. Obtener API Key

El proyecto requiere una llave de acceso para consultar los valores de las monedas:

Regístrate gratis en ExchangeRate-API.

Copia tu API Key.

Pégala en el archivo ConsultarMoneda.java:

private static final String API_KEY = "TU_CLAVE_AQUI";


3. Ejecución

Compila y ejecuta la clase Principal.java desde tu IDE o terminal.

🛠️ Tecnologías Utilizadas

Java 17: Lenguaje base del proyecto.

Gson: Librería de Google para deserialización de JSON.

ExchangeRate-API: Proveedor de datos de tasas de cambio.

👤 Autor

<div align="center">
<p><strong>Desarrollado por [Tu Nombre]</strong></p>

<a href="https://www.google.com/search?q=https://linkedin.com/in/abian-felipe-cifuentes" target="_blank">
<img src="https://www.google.com/search?q=https://img.shields.io/badge/LinkedIn-0077B5%3Fstyle%3Dfor-the-badge%26logo%3Dlinkedin%26logoColor%3Dwhite" alt="LinkedIn"/>
</a>
<a href="https://www.google.com/search?q=https://github.com/fabianbrr18" target="_blank">
<img src="https://www.google.com/search?q=https://img.shields.io/badge/GitHub-100000%3Fstyle%3Dfor-the-badge%26logo%3Dgithub%26logoColor%3Dwhite" alt="GitHub"/>
</a>
</div>