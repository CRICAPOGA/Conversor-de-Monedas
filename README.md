# 🌎 Conversor de Monedas 💱

## 📖 Descripción

Este proyecto es un **Conversor de Monedas** desarrollado en **Java** como parte de la iniciativa **ONE (Oracle Next Education)** en colaboración con **Alura Latam**. Utiliza la API de tipos de cambio [Exchange Rate API](https://github.com/fawazahmed0/exchange-api) para obtener tasas de conversión actualizadas entre diferentes monedas.

---

## 📄 Características

- 🔄 Conversión de monedas de manera precisa utilizando datos actualizados desde la API.
- 🌐 Soporte para múltiples monedas internacionales.
- 🖥️ Interfaz simple en consola.
- ⚙️ Implementación modular y escalable.
- 🚨 Manejo de errores en caso de problemas con la conexión a la API o datos inválidos.

---

## 💻 Tecnologías

- **Lenguaje**: Java
- **Dependencias**:
  - `HttpClient` para consumir la API.
  - Manejo de JSON con la biblioteca `Gson`.
- **API utilizada**: [Exchange Rate API](https://github.com/fawazahmed0/exchange-api)

---

## ☕ Requisitos Previos

Para ejecutar este proyecto necesitas:

1. Java Development Kit (JDK) 11 o superior instalado.
2. Un IDE o editor de código como **IntelliJ IDEA**, **Eclipse** o **VS Code**.
3. Acceso a Internet para consumir la API de tipos de cambio.

---

## ⚙️ Instalación y Ejecución

1. **Clonar el repositorio**:

   ```bash
   git clone https://github.com/tu_usuario/conversor-monedas.git
   cd conversor-monedas
   ```
2. **Configurar las dependencias**:Si usas Maven o Gradle, incluye las dependencias necesarias en el archivo `pom.xml` o `build.gradle`.
3. **Ejecutar la aplicación**:
   Compila y ejecuta el proyecto desde tu IDE o mediante la terminal:

   ```bash
   javac -d bin src/*.java
   java -cp bin Main
   ```

---

## 🛠️ Uso

1. Inicia la aplicación.
2. Selecciona las monedas de origen y destino.
3. Ingresa la cantidad a convertir.
4. Obtendrás el resultado basado en las tasas actuales proporcionadas por la API.

---

## 📂 Estructura del Proyecto

```plaintext
CONVERSOR-DE-MONEDAS/
│
├── conversor/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   ├── principal/
│   │   │   │   │   ├── ExchangeRates.java    # Clase para manejar tasas de cambio
│   │   │   │   │   ├── Main.java             # Archivo principal
│   │   │   ├── resources/                    # Recursos del proyecto
│   │   ├── test/
│   │       ├── java/                         # Clases de prueba
│   │
│   ├── target/
│       ├── classes/                          # Clases compiladas
│       ├── test-classes/                     # Clases de prueba compiladas
│
├── pom.xml                                   # Configuración de Maven
├── README.md                                 # Documentación

```

---

## 🌐 API: Exchange Rate API

Este proyecto utiliza [Exchange Rate API](https://github.com/fawazahmed0/exchange-api), una API gratuita y de código abierto para obtener tasas de cambio de monedas. Consulta la documentación oficial para más detalles sobre los endpoints.

### 🔗 Ejemplo de Endpoint

Obtener las tasas de cambio para dólares:
[https://latest.currency-api.pages.dev/v1/currencies/usd.json](https://latest.currency-api.pages.dev/v1/currencies/usd.json)

---

## 🤝 Contribuciones

¡Contribuciones son bienvenidas! Sigue estos pasos:

1. Haz un **fork** del repositorio.
2. Crea una nueva rama:
   ```bash
   git checkout -b mi-nueva-funcionalidad
   ```
3. Realiza tus cambios y haz un **commit**:
   ```bash
   git commit -m "Agregar nueva funcionalidad"
   ```
4. Envía tus cambios a tu repositorio remoto:
   ```bash
   git push origin mi-nueva-funcionalidad
   ```
5. Crea un **Pull Request** desde GitHub.

---

## 📬 Contacto

¡No dudes en contactarme si tienes dudas o sugerencias!

<a href="mailto:camilochoposada2@gmail.com" title="Correo">
<img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" alt="Correo"/></a>  
<a href="https://www.linkedin.com/in/cricapoga" title="LinkedIn">
<img src="https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn"/></a>

---

<p align="center">Realizado por: <b>© Cristian Posada</b></p>
