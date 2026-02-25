<h1 align="center">
  <br>
  <img src="https://raw.githubusercontent.com/abian-felipe-cifuentes/abian-felipe-cifuentes/main/currency.gif" alt="Currency GIF" width="120">
  <br>
  💱 Conversor de Monedas
  <br>
</h1>

<h4 align="center">Challenge Alura - Oracle Next Education (ONE)</h4>

<p align="center">
  <a href="https://www.oracle.com/education/oracle-next-education/">
    <img src="https://img.shields.io/badge/Programa-ONE-orange?style=for-the-badge&logo=oracle" alt="Oracle ONE">
  </a>
  <a href="https://www.alura.com.br/">
    <img src="https://img.shields.io/badge/Formaci%C3%B3n-Alura-blue?style=for-the-badge" alt="Alura">
  </a>
  <img src="https://img.shields.io/badge/Java-17-red?style=for-the-badge&logo=java&logoColor=white" alt="Java 17">
  <img src="https://img.shields.io/badge/Status-Completado-brightgreen?style=for-the-badge" alt="Status">
</p>

<p align="center">
  <a href="#-descripción">Descripción</a> •
  <a href="#-características">Características</a> •
  <a href="#%EF%B8%8F-tecnologías">Tecnologías</a> •
  <a href="#-instalación-y-ejecución">Instalación</a> •
  <a href="#-autor">Autor</a>
</p>

---

## 📖 Descripción

Este proyecto es un **Conversor de Monedas** robusto y eficiente desarrollado en **Java 17**. La aplicación interactúa con la **ExchangeRate-API** para proporcionar tasas de cambio en tiempo real, ofreciendo una experiencia de usuario fluida a través de una interfaz de línea de comandos (CLI).

> Este desafío es parte de la formación **Back-End Java** de Alura, enfocándose en el consumo de APIs, manejo de JSON y principios de Programación Orientada a Objetos.

---

## ✨ Características

| Funcionalidad | Descripción | Status |
| :--- | :--- | :---: |
| **Consumo de API** | Conexión en tiempo real con `ExchangeRate-API`. | ✅ |
| **Manejo de JSON** | Deserialización precisa usando la librería `Gson`. | ✅ |
| **Menú Dinámico** | Interfaz amigable e interactiva en consola. | ✅ |
| **Historial** | Registro local de las últimas conversiones con timestamp. | ✅ |
| **Robustez** | Gestión avanzada de errores y excepciones. | ✅ |

---

## �️ Tecnologías

*   **Java 17** (LTS) - Lenguaje principal.
*   **Gson 2.11.0** - Para el procesamiento de datos JSON.
*   **HttpClient** - Para realizar peticiones HTTP eficientes.
*   **ExchangeRate-API** - Fuente confiable de datos financieros.

---

## 📸 Demostración

```text
*************************************************
 Bienvenido/a al convertidor de Moneda =)
*************************************************

--- Elija una opción válida ---
1) Dólar (USD) => Peso Argentino (ARS)
2) Peso Argentino (ARS) => Dólar (USD)
3) Dólar (USD) => Real Brasileño (BRL)
...
8) Ver Historial de Conversiones
9) Salir

Elija una opción: 1
Ingrese el valor que desea convertir: 100
El valor 100.00 [USD] corresponde al valor final de =>>> 85000.00 [ARS]
```

---

## 📂 Estructura del Código

El código sigue una arquitectura limpia (Service-Model-Client):

*   `Principal.java`: Gestiona la interacción con el usuario y el flujo principal.
*   `ConsultarMoneda.java`: Servicio encargado del cliente HTTP y la lógica de la API.
*   `Moneda.java`: Modelo de datos (Java Record) para la representación de divisas.
*   `pom.xml`: Configuración de Maven y dependencias.

---

## 🚀 Instalación y Ejecución

1.  **Clonar el repositorio:**
    ```bash
    git clone https://github.com/fabianbrr18/ConversorMonedas.git
    ```
2.  **Obtener tu API Key:**
    *   Regístrate en [ExchangeRate-API](https://www.exchangerate-api.com/).
    *   Inserta tu llave en `ConsultarMoneda.java`:
    ```java
    private static final String API_KEY = "TU_LLAVE_AQUI";
    ```
3.  **Compilar y Ejecutar:**
    *   **IntelliJ:** Haz clic derecho en `pom.xml` > `Add as Maven Project`, luego ejecuta `Principal`.
    *   **Maven:** `mvn clean compile exec:java -Dexec.mainClass="Principal"`

---

## 👤 Autor

<div align="center">
  <img src="https://github.com/fabianbrr18.png" width="100" style="border-radius: 50%;">
  <br>
  <strong>Fabian Felipe Cifuentes</strong>
  <br>
  <br>
  <a href="https://linkedin.com/in/fabian-felipe-cifuentes">
    <img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn">
  </a>
  <a href="https://github.com/fabianbrr18">
    <img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="GitHub">
  </a>
</div>

<p align="center">
  Desarrollado con ❤️ para el Challenge Alura
</p>