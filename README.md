# Only Parking [![Logo](https://www.shutterstock.com/image-vector/vector-sets-parking-lots-letter-260nw-2275662011.jpg "Logo")](https://www.shutterstock.com/image-vector/vector-sets-parking-lots-letter-260nw-2275662011.jpg "Logo")

 ###  Sistema  de Monitoreo en Tiempo Real para la Gestión, Disponibilidad y Seguridad de Espacios de Estacionamiento en universidades

[![Only parking](https://www.inpronet.ec/wp-content/uploads/2019/10/5530dfc70a139.jpg)

# Guía para la Realización del Proyecto 

---

<!-- @import "[TOC]" {cmd="toc" depthFrom=1 depthTo=6 orderedList=false} -->
<!-- code_chunk_output -->

 - [Guía para la Realización del Proyecto](#guía-para-la-realización-del-proyecto)
   - [1. Introduccion](#1-Introduccion)
   - [2. Objetivo Principal](#2-Objetivo-Principal)
   - [3. Objetivos Especificos](#3-Objetivos-Especificos)
   - [4. Diseño de Pagina Web](#4-Diseño-de-pagina-Web)
   - [5. Pruebas del Prototipo](#5-Pruebas-del-Prototipo)
   - [6. Interfaz](#6-Interfaz)
   - [7. Referencias](#7-Referencias)
   - [8. Documentacion Final](#8-Documentacion-Final)

<!-- /code_chunk_output -->

---
# 1. Introduccion
- Actualmente, la universidad carece de un sistema eficiente para gestionar el acceso de vehículos, lo que aumenta los tiempos de espera y el riesgo de robos. La solución propuesta es integrar una tecnología de escaneo de documentos que identifique rápidamente a los conductores al llegar, garantizando el acceso solo a personas autorizadas. La información se almacena en una base de datos que registra los detalles de ingreso, tipo de vehículo y tiempo de permanencia, facilitando el monitoreo en tiempo real. Este sistema optimiza procesos, mejora la seguridad, reduce incidentes y permite que el personal de seguridad se concentre en tareas más críticas, asegurando mayor protección y eficiencia en el campus.

# 2. Objetivo Principal
- Aumentar la seguridad del parqueadero de motos, carros, bicicletas, patinetas eléctricas, entre otros, a la universidad mediante un programa que escanee el documento de identidad del usuario al ingreso y salida, incluyendo el conteo en tiempo real de los espacios disponibles en el estacionamiento.

# 3. Objetivos Específicos
- Implementar un programa que facilite a los guardas de seguridad dar ingreso, salida y que reduzca las filas del parqueadero.
- Aumentar la seguridad de los vehículos  dentro del parqueadero para evitar robos.
- Mediante el programa realizar el conteo de los vehículos que ingresan y salen del parqueadero.
- Mediante una base de datos almacenar la información de los usuarios.
- Al escanear el documento aparezcan los datos del usuario y del vehículos para mayor seguridad.

[![PARQUEDEROS](https://st4.depositphotos.com/23611030/29463/v/450/depositphotos_294632308-stock-illustration-collection-parking-thin-line-icons.jpg "PARQUEDEROS")](https://st4.depositphotos.com/23611030/29463/v/450/depositphotos_294632308-stock-illustration-collection-parking-thin-line-icons.jpg "PARQUEDEROS")

# 4. Pregunta Problematica
- ¿Cómo influye el software de Only Parking en la reducción del tiempo que los usuarios dedican a buscar y esperar por un lugar de estacionamiento disponible, y qué medidas de seguridad se implementan para proteger tanto la información personal de los usuarios como la seguridad de los vehículos estacionados?

# 7. Referencias
- Universidad Politécnica Salesiana de guayaquil https://dspace.ups.edu.ec/bitstream/123456789/2401/19/UPS-GT000130.pdf
- Thanks to https://www.shutterstock.com/es/images we include some pictures of the theme.
- Markdown Extras by https://pandao.github.io/editor.md/en.html.
- Thanks to [ChatGPT by OpenAI](https://www.openai.com/chatgpt) for assistance with writing and content optimization.
- Documento de otro proyecto que tenemos en la universidad y se relaciona el tema.

![Java](https://img.shields.io/badge/Java-100%25-ff5733?style=for-the-badge)  ![github](https://img.shields.io/badge/github-100%25-ff5733?style=for-the-badge) ![markdown](https://img.shields.io/badge/markdown-100%25-ff5733?style=for-the-badge)
<img src="https://img.shields.io/badge/javafx-%23FF0000.svg?style=for-the-badge&logo=javafx&logoColor=white"> 


## Requisitos del Proyecto

El proyecto tiene como objetivo gestionar un sistema de estacionamiento, permitiendo:

- Registrar vehículos en espacios de estacionamiento.
- Ver los vehículos que están actualmente estacionados.
- Gestionar los datos en una base de datos MySQL.

### El sistema permite manejar los siguientes campos para cada vehículo:

- `id`: Identificador único (clave primaria).
- `placa`: La placa del vehículo. (Ej. ABC123, BNG26G, XHL82D).
- `tipo_vehiculo`: El tipo de vehículo (Ej. Carro, Moto, Bicicleta).
- `estado`: Estado del vehículo (Ej. Estacionado, En Movimiento).
- `color`: El color del vehículo. (Ej. Verde, Rojo y Gris).
- `espacio`: Número del espacio de estacionamiento.

## Creación de Base de Datos Only_Parking en Visual Studio Code.

En este proyecto, hemos creado un sistema de monitoreo de estacionamiento llamado **OnlyParking** utilizando **Java** y **MySQL**. Primero, creamos una base de datos llamada **only_parking** y dentro de ella una tabla **parking_spaces**, que almacena la información de los vehículos estacionados, como el `id`, `placa`, `tipo_vehiculo`, `estado`, `color` y `espacio` de estacionamiento. Usamos Java para desarrollar varias clases que gestionan la interacción con la base de datos: **CreateTable** para crear la tabla, **DatabaseConnection** para establecer la conexión con MySQL, **InsertValue** para insertar nuevos vehículos, **SelectTable** para mostrar los vehículos actuales, y **Main** para ofrecer un menú interactivo al usuario. Cada clase tiene una función específica que facilita la inserción y consulta de los datos, mientras que la clase **ParkingSpace** sirve como un modelo de datos para representar cada vehículo. La base de datos se conecta a través de **JDBC**, y la aplicación maneja errores y asegura que la base de datos se mantenga consistente.

### Clases de la Base de Datos.
- `CreateTable.java`
- `DatabaseConnection.java`
- `InsertValue.java`
- `Main.java`
- `ParkingSpace.java`
- `SelectTable.java`

Cada clase tiene una responsabilidad específica en el sistema.

![image](https://github.com/user-attachments/assets/60b510cd-8fd3-42a9-b151-33f4f2cf9b23)

![image](https://github.com/user-attachments/assets/648cecec-e84c-481f-b9f8-f9a78151cc2c)

# Interfaz (JAVAFX).
JavaFX es una biblioteca, también se le llama framework gráfico, de Java que permite desarrollar aplicaciones de interfaz gráfica de usuario (GUI) modernas y visualmente atractivas. Se utiliza para crear aplicaciones de escritorio y proporciona un conjunto de herramientas para construir interfaces visuales interactivas. JavaFX es parte de Java desde JDK 8 y es la alternativa recomendada a la biblioteca Swing.

# IMAGEN 1

![image](https://github.com/Estebaniza/PROYECTO-PROGRAMACION-2/blob/main/image.png?raw=true)



## Análisis de la Imagen:

Aunque la interfaz no se muestra en su totalidad, es posible inferir varios elementos clave y sus funcionalidades a partir de la imagen proporcionada:

1. **Placa de vehículo:**  
   La imagen principal muestra la matrícula "COZ 92E" acompañada de la palabra "COLOMBIA", lo que sugiere que la aplicación está orientada al registro y monitoreo de vehículos.

2. **Información temporal:**  
   Se indica la hora exacta de ingreso del vehículo (13:14:48.866660300) y se señala que la hora de salida aún está pendiente. Esto revela que el sistema realiza un seguimiento preciso de la duración de la estancia de cada vehículo, permitiendo gestionar el tiempo de ocupación del espacio de forma eficiente.

3. **Placa registrada:**  
   La visualización de la matrícula "GIT70G" como vehículo registrado confirma que la aplicación permite el registro y seguimiento de vehículos de forma detallada, lo que facilita la gestión de entradas y salidas dentro del sistema.

4. **Botón "Regresar":**  
   La presencia de este botón sugiere que la aplicación tiene una interfaz estructurada en múltiples pantallas, lo que permite a los usuarios navegar entre diferentes secciones. Al pulsar el botón, el usuario regresaría a una pantalla previa, facilitando la navegación y mejorando la experiencia de uso.

# IMAGEN 2

![image](https://github.com/CCESPINOSA/Programacion2/blob/main/image.png?raw=true)                      ![image](https://github.com/Estebaniza/PROYECTO-PROGRAMACION-2/blob/main/imagen2.png?raw=true)

## Análisis de la Imagen:

Podemos identificar los siguientes elementos clave de la interfaz de usuario, que parece estar desarrollada con **JavaFX**:

1. **Logo:**  
   El logo circular con el texto "Only Parking" es un elemento gráfico que sirve como identificador visual de la aplicación. Su diseño simple y llamativo permite que los usuarios reconozcan rápidamente la aplicación y asocien el logo con la funcionalidad que ofrece.

2. **Barra de búsqueda:**  
   La barra alargada con el texto "Consultar" indica que la interfaz permite realizar búsquedas de manera eficiente. Este tipo de barra es común en aplicaciones que requieren la búsqueda de información específica, como la consulta de matrículas o registros de vehículos en este caso.

3. **Botón "Consultar":**  
   El botón "Consultar" aparece activo cuando se introduce un número de placa para realizar la búsqueda. Este tipo de interacción es esencial para la funcionalidad de la aplicación, ya que permite a los usuarios acceder rápidamente a la información relacionada con los vehículos registrados.

4. **Diseño minimalista:**  
   La interfaz presenta un diseño limpio y sencillo, con pocos elementos visuales. Este estilo minimalista es típico de las aplicaciones modernas, ya que no solo mejora la estética de la interfaz, sino que también facilita la navegación y mejora la experiencia del usuario al reducir el desorden visual.



