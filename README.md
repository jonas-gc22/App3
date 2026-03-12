# 📱 App3 – Gestión de Estudiantes (Clase Toast)

Aplicación Android desarrollada en **Kotlin** que permite registrar y visualizar estudiantes junto con su carrera universitaria.  
La app implementa una interfaz moderna utilizando **ListView personalizado, formularios con validación, animaciones y componentes interactivos**.

Esta aplicación representa una mejora respecto a versiones anteriores al integrar **más recursos de interfaz, validación de datos y animaciones**, ofreciendo una experiencia más completa al usuario.

---

# 🎯 Objetivo de la Aplicación

Permitir al usuario:

- Registrar estudiantes mediante un formulario.
- Seleccionar la carrera del estudiante.
- Visualizar los estudiantes registrados en una lista.
- Mostrar notificaciones al interactuar con la aplicación.
- Validar que los datos ingresados sean correctos.

---

# ⚙️ Tecnologías Utilizadas

- **Kotlin**
- **Android Studio**
- **XML para diseño de interfaces**
- **AlertDialog**
- **ListView personalizado**
- **ArrayAdapter**
- **Spinner**
- **Animaciones Android**

---

# 🧩 Componentes Utilizados

La aplicación utiliza diversos componentes de Android para crear una interfaz funcional y moderna.

### 📋 ListView
Permite mostrar la lista de estudiantes registrados.

### 🧾 EditText
Campo de texto para ingresar el nombre del estudiante.

### 🔽 Spinner
Permite seleccionar la carrera del estudiante.

### 🔘 AlertDialog
Se utiliza para mostrar el formulario donde se registra un nuevo estudiante.

### 🔔 Toast
Se usa para mostrar notificaciones cuando se selecciona o agrega un estudiante.

### 🎬 Animaciones
Se utiliza una animación para mejorar la experiencia visual cuando se agrega un estudiante a la lista.

---

# 🧠 Funcionalidades Implementadas

## 1️⃣ Agregar estudiante

El usuario puede agregar un estudiante mediante un formulario emergente.

El formulario solicita:

- Nombre del estudiante
- Carrera

---

## 2️⃣ Validación del formulario

El sistema valida que el campo **nombre no esté vacío**.

Si el usuario intenta agregar un estudiante sin nombre:

- Se muestra un **mensaje de error en el campo**
- El formulario **no se cierra**
- No se agrega ningún estudiante

Esto mejora la experiencia de usuario y evita registros incorrectos.

---

## 3️⃣ Selección de carrera

El usuario selecciona una carrera desde un **Spinner** que contiene las siguientes opciones:

- Ingeniería de Software
- Administración
- Contabilidad
- Derecho

---

## 4️⃣ Lista de estudiantes

Los estudiantes se muestran en un **ListView con diseño personalizado**, mostrando:

Nombre del estudiante - Carrera

Ejemplo:

Juan Pérez - Ingeniería de Software
María Gómez - Administración

---

## 5️⃣ Animación al agregar estudiante

Cada vez que se registra un nuevo estudiante, la lista ejecuta una **animación suave**, mejorando la experiencia visual de la aplicación.

---

## 6️⃣ Selección de estudiante

Al seleccionar un estudiante de la lista se muestra un **Toast informativo** indicando cuál fue seleccionado.

---

# 🎨 Diseño de Interfaz

La aplicación utiliza:

- **ConstraintLayout** para la estructura principal
- **LinearLayout** para organización de elementos
- **Cards personalizadas en la lista**
- **Botón personalizado para agregar estudiantes**
- **Footer con información de los desarrolladores**

Esto permite una interfaz **ordenada, moderna y fácil de usar**.

---

# 📁 Estructura del Proyecto

app
┣ java/com/example/app3
┃ ┗ MainActivity.kt
┣ res
┃ ┣ layout
┃ ┃ ┣ activity_main.xml
┃ ┃ ┣ dialog_agregar_estudiante.xml
┃ ┃ ┗ item_estudiante.xml
┃ ┣ anim
┃ ┃ ┗ anim_item_lista.xml
┃ ┣ drawable
┃ ┃ ┗ recursos gráficos
┃ ┗ values
┃   ┗ strings.xml

---

# 👨‍💻 Desarrolladores

- **Jonás García Corniel – 1-18-4259**
- **Adonis Rodríguez – 117-4399**
- **Euris Joel Acosta – 1-19-3584**
- **Gabriel Hernández Galván – 2-21-3988**
- **Erik Miguel Gil Cruz – 1-22-5249**

---

---

## 🚀 Cómo Ejecutar el Proyecto

1. Clonar el repositorio

https://github.com/jonas-gc22/App3.git

2. Abrir **Android Studio**

3. Seleccionar **Open Project**

4. Buscar la carpeta del proyecto clonado

5. Esperar la sincronización de **Gradle**

6. Ejecutar la aplicación en:

- Un **emulador de Android**
- O un **dispositivo físico**

---

# 📌 Conclusión

La **App3** representa una mejora significativa en comparación con versiones anteriores al incorporar:

- Formularios interactivos
- Validación de datos
- Animaciones en la interfaz
- Uso de múltiples componentes de Android

Esto permite crear una aplicación **más completa, funcional y con mejor experiencia de usuario**.