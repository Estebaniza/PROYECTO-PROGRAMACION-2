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

## Requisitos del Proyecto

El proyecto tiene como objetivo gestionar un sistema de estacionamiento, permitiendo:

1. Registro de vehículos:
El sistema debe permitir que los usuarios ingresen los datos de su vehículo (placa, tipo y propietario) para generar un ticket de ingreso.

2. Gestión de disponibilidad:
El sistema debe mostrar en tiempo real la cantidad de espacios ocupados y disponibles para cada tipo de vehículo (carros, motos, bicicletas).

3. Generación de tickets digitales:
El sistema debe generar un ticket con los datos del vehículo, zona asignada y tarifa, incluyendo un código QR que podrá usarse para la validación a la salida.

---
# 1. Introduccion
- El proyecto Only Parking busca ofrecer una solución innovadora para la gestión de parqueaderos universitarios. A través de esta plataforma, los usuarios podrán registrar su vehículo, consultar la disponibilidad de espacios, revisar las tarifas y generar un ticket digital con código QR. El objetivo principal es optimizar el uso de los espacios de estacionamiento, reducir tiempos de espera y brindar una experiencia más ágil y segura dentro de la comunidad universitaria.

# 2. Objetivo Principal
- Aumentar la seguridad del parqueadero de motos, carros, bicicletas, patinetas eléctricas, entre otros, a la universidad mediante un programa que escanee el documento de identidad del usuario al ingreso y salida, incluyendo el conteo en tiempo real de los espacios disponibles en el estacionamiento.

# 3. Objetivos Específicos
- Implementar un programa que facilite a los guardas de seguridad dar ingreso, salida y que reduzca las filas del parqueadero.
- Aumentar la seguridad de los vehículos  dentro del parqueadero para evitar robos.
- Mediante el programa realizar el conteo de los vehículos que ingresan y salen del parqueadero.
- Mediante una base de datos almacenar la información de los usuarios.
- Al escanear el documento aparezcan los datos del usuario y del vehículos para mayor seguridad.

[![PARQUEDEROS](https://st4.depositphotos.com/23611030/29463/v/450/depositphotos_294632308-stock-illustration-collection-parking-thin-line-icons.jpg "PARQUEDEROS")](https://st4.depositphotos.com/23611030/29463/v/450/depositphotos_294632308-stock-illustration-collection-parking-thin-line-icons.jpg "PARQUEDEROS")

# 4. Diseño de Pagina Web
- El diseño de la página está enfocado en ofrecer una interfaz moderna, intuitiva y adaptable.


![PaginaW](https://github.com/Estebaniza/PROYECTO-PROGRAMACION-2/blob/main/PaginaW.png?raw=true) 

![Tarifas](https://github.com/Estebaniza/PROYECTO-PROGRAMACION-2/blob/main/Tarifas.png?raw=true) 


# 5. Pruebas del Prototipo





# 6. Interfaz
La interfaz de Only Parking es una aplicación web que permite gestionar el ingreso y salida de vehículos en un parqueadero. Presenta botones para elegir la acción, un formulario para validar la placa y genera un ticket digital con número, fecha, hora y código QR en caso de ingreso. Además, ofrece opciones de impresión y mensajes de confirmación o error, todo en una interfaz clara y sencilla.

# IMAGEN 1

![Interfaz](https://github.com/Estebaniza/PROYECTO-PROGRAMACION-2/blob/main/Interfaz.png?raw=true)



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

# 7. Referencias
- Universidad Politécnica Salesiana de guayaquil https://dspace.ups.edu.ec/bitstream/123456789/2401/19/UPS-GT000130.pdf
- Thanks to https://www.shutterstock.com/es/images we include some pictures of the theme.
- Markdown Extras by https://pandao.github.io/editor.md/en.html.
- Thanks to [ChatGPT by OpenAI](https://www.openai.com/chatgpt) for assistance with writing and content optimization.
- Documento de otro proyecto que tenemos en la universidad y se relaciona el tema.

![Java](https://img.shields.io/badge/Java-100%25-ff5733?style=for-the-badge)  ![github](https://img.shields.io/badge/github-100%25-ff5733?style=for-the-badge) ![markdown](https://img.shields.io/badge/markdown-100%25-ff5733?style=for-the-badge)
<img src="https://img.shields.io/badge/javafx-%23FF0000.svg?style=for-the-badge&logo=javafx&logoColor=white"> 

# 8. Documentacion Final


