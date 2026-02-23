# 📚 2- App Catálogo de Estudiantes – UTESA

Aplicación desarrollada en Android como parte del proyecto práctico de Interfaz Gráfica de Usuario.

Esta app permite registrar estudiantes, mostrar sus datos en pantalla y visualizar una imagen representativa según la carrera seleccionada.

---

## 🎯 Objetivo del Proyecto

Desarrollar una aplicación en Android que implemente componentes de interfaz gráfica como:

- EditText
- TextView
- Spinner
- Button
- ListView
- ImageView
- CardView

La aplicación captura datos del usuario, los muestra en pantalla y visualiza imágenes relacionadas con la información ingresada.

---

## 🛠 Tecnologías Utilizadas

- Kotlin
- Android Studio
- XML para diseño de interfaces
- Componentes de Android (View, Activity, Adapter)
- CardView
- Gradle

---

## 📱 Funcionalidades

- ✔ Registro de estudiante (Nombre y Matrícula)
- ✔ Selección de carrera mediante Spinner
- ✔ Visualización dinámica de imagen según carrera
- ✔ Animación fade al cambiar la imagen
- ✔ CardView personalizada para mostrar resultados
- ✔ Diseño moderno y centrado
- ✔ Footer con información del equipo desarrollador

---

## 🎓 Carreras Disponibles

- Ingeniería
- Medicina
- Derecho

Cada carrera muestra una imagen representativa al momento de registrar el estudiante.

---

## 🧠 Funcionamiento

1. El usuario introduce:
    - Nombre
    - Matrícula
2. Selecciona una carrera.
3. Presiona el botón **Registrar Estudiante**.
4. La aplicación:
    - Muestra los datos en un CardView.
    - Cambia la imagen según la carrera seleccionada.
    - Aplica una animación suave de transición.

---

## 📂 Estructura del Proyecto

```
app/
 ├── java/com/example/appcatalogodeestudiantes/
 │    └── MainActivity.kt
 │
 ├── res/
 │    ├── layout/
 │    │    ├── activity_main.xml
 │    │    └── item_estudiante.xml
 │    │
 │    ├── drawable/
 │    │    ├── ingenieria.png
 │    │    ├── medicina.png
 │    │    └── derecho.png
```

---

## 🚀 Cómo Clonar y Ejecutar el Proyecto

### 1️⃣ Clonar el repositorio

Abre una terminal y ejecuta:

```bash
git clone https://github.com/jonas-gc22/app-catalogo-de-estudinates.git
```

### 2️⃣ Abrir el proyecto en Android Studio

1. Abre **Android Studio**
2. Selecciona **Open**
3. Busca la carpeta clonada
4. Haz clic en **OK**

### 3️⃣ Sincronizar dependencias

Android Studio descargará automáticamente las dependencias de Gradle.  
Si no lo hace, presiona:

```
Sync Project with Gradle Files
```

### 4️⃣ Ejecutar la aplicación

1. Conecta un dispositivo Android o inicia un emulador.
2. Presiona el botón ▶ (Run).
3. Selecciona el dispositivo.
4. La aplicación se instalará y ejecutará automáticamente.

---

## 🔗 Repositorio Oficial

Puedes acceder al código fuente desde:

👉 https://github.com/jonas-gc22/app-catalogo-de-estudinates.git

---

## 👨‍💻 Equipo de Desarrollo

- Jonás García Corniel – 1-18-4259
- Adonis Rodríguez – 117-4399
- Euris Joel Acosta – 1-19-3584
- Gabriel Hernández Galván – 2-21-3988
- Erik Miguel Gil Cruz – 1-22-5249

---

## 📌 Conclusión

Este proyecto demuestra el uso correcto de los componentes visuales en Android, la manipulación dinámica de vistas mediante Kotlin y la implementación de buenas prácticas en diseño de interfaz gráfica.