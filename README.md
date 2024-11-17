# Only Parking [![Logo](https://www.shutterstock.com/image-vector/vector-sets-parking-lots-letter-260nw-2275662011.jpg "Logo")](https://www.shutterstock.com/image-vector/vector-sets-parking-lots-letter-260nw-2275662011.jpg "Logo")

 ###  Sistema  de Monitoreo en Tiempo Real para la Gestión, Disponibilidad y Seguridad de Espacios de Estacionamiento en universidades

[![Only parking](https://www.shutterstock.com/image-vector/automatic-rising-barrier-system-gate-260nw-2266367425.jpg "Only parking")](https://www.shutterstock.com/image-vector/automatic-rising-barrier-system-gate-260nw-2266367425.jpg "Only parking")

# Guía para la Realización del Proyecto 

---

<!-- @import "[TOC]" {cmd="toc" depthFrom=1 depthTo=6 orderedList=false} -->
<!-- code_chunk_output -->

 - [Guía para la Realización del Proyecto](#guía-para-la-realización-del-proyecto)
   - [1. Introduccion](#1-Introduccion)
   - [2. Objetivo Principal](#2-Objetivo-Principal)
   - [3. Objetivos Especificos](#3-Objetivos-Especificos)
   - [4. Pregunta Problematica](#4-Pregunta-Problematica)
   - [5. Planteamiento](#5-Planteamiento)
   - [6. Justificacion](#6-Justificacion)
   - [7. Requerimientos de la solucion al problema](#7-Requerimientos-de-la-solucion-al-problema)
   - [8 .Conclusion](#8-Conclusion)
   - [9. Referencias](#9-Referencias)
   - [Fase 2 del proyecto](#Fase-2-del-proyecto)
   - [1. Interfaz](#1-Interfaz)

<!-- /code_chunk_output -->

---
# 1. Introduccion
- En el contexto actual de la universidad, la seguridad y la eficiencia en la gestión del acceso de vehículos son aspectos clave, aun no se ha implementado un sistema con el objetivo de optimizar el control de entrada y salida de carros, motos, bicicletas y patinetas eléctricas dentro de las instalaciones, lo que ayudaría a minimizar los tiempos de espera y reduciendo el riesgo de robos. Para lograrlo, se integra una tecnología de escaneo de documentos que permita identificar al conductor de manera rápida y precisa cada vez que este se aproxima a la portería, lo que asegura que solo personas autorizadas puedan acceder al campus.
   Esta información se almacena en una base de datos que registra los detalles de ingreso, el tipo del vehículo y el tiempo que permanecerá dentro de las instalaciones, generando un historial que facilita el monitoreo en tiempo real, mejorando significativamente el control de seguridad, además, el uso de este sistema no solo optimiza procesos, sino que también ofrece mayor tranquilidad a los estudiantes, docentes e invitados al reducir las posibilidades de incidentes de robo o ingreso no autorizado de vehículos. También permite que el personal de seguridad se enfoque en tareas más críticas, ya que el sistema automatiza gran parte del proceso que se maneja actualmente, con esta solución la universidad garantiza la mayor protección y eficiencia en sus espacios de movilidad.

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

# 5. Planteamiento
- En la ciudad de Bogotá, específicamente en el barrio Tintal, se encuentra ubicada la universidad Pública de Kennedy, que cuenta con convenios entre diferentes instituciones de educación superior, entre ellas se encuentra la Escuela Tecnológica Instituto Técnico Central. Gracias a estos acuerdos el campus brinda un espacio adicional para estudiantes, profesores y demás personal, lo que permite un alto flujo para todos lo usuarios que cuentan con vehículo, ya sea moto, carro, bicicletas, entre otros.

  sin embargo, debido al aumento de manera exponencial en las diferentes facultades. La universidad presenta un problema que resalta a simple vista, y es la gestión al momento del ingreso y salida de los vehículos a el estacionamiento, en especial en la jornada nocturna que presenta alta demanda, a pesar de que cuenta con vigilantes el trabajo es manual lo que hace que el registro y control de los diferentes medios de transporte que aparcan diariamente en la facultad no sea eficiente. Esto hace que los Como tampoco la regulación del cupo máximo de los estacionamientos estimados para todos los usuarios que asisten a los diferentes programas, generando deficiencia en la seguridad, permitiendo robos dentro de las mismas instalaciones.

Los cambios semestre a semestre dan muestra del incremento y de las dificulatades que presenta las instalaciones como por ejemplo:
- Ineficiencia en el control.
- Falta de control en los cupos del parqueadero
- problemas de seguridad.

# 6. Justificación
- La implementación de un sistema que escanee el documento de identidad del usuario para controlar el acceso al estacionamiento en la universidad es fundamental para mejorar la seguridad y eficiencia en la gestión de los espacios de estacionamiento. Este sistema ofrece un control riguroso sobre quién puede acceder a las áreas de estacionamiento, utilizando la tecnología de escaneo para verificar y registrar cada entrada y salida. La integración de una base de datos robusta permite almacenar y gestionar de manera segura la información de identidad de los usuarios, así como los registros de acceso, lo cual facilita la vigilancia y el monitoreo continuo. Este enfoque no solo reduce la posibilidad de accesos no autorizados y potenciales actos vandálicos, sino que también permite al personal de seguridad y administración auditar y analizar los datos para mejorar la gestión y respuesta ante incidentes.

  Además, el conteo en tiempo real de los espacios disponibles, respaldado por la base de datos del sistema, optimiza la gestión del estacionamiento al proporcionar información actualizada y precisa sobre la disponibilidad de espacios. Esta funcionalidad reduce significativamente el tiempo que los usuarios deben invertir en buscar un lugar para estacionar, aliviando la congestión en el campus y mejorando el flujo de tráfico. La combinación de un sistema de escaneo de identidad y el conteo en tiempo real contribuye a una experiencia más eficiente y segura para estudiantes, profesores y personal, asegurando una administración más eficaz de los recursos de estacionamiento y fomentando un entorno universitario más ordenado y protegido.

# 7. Requerimientos de la solucion al problema
- Para mejorar la seguridad y gestión del estacionamiento en la universidad, el sistema debe incluir varias funcionalidades esenciales. Primero, se requiere un módulo de escaneo de documentos de identidad al ingreso y salida de vehículos, motos, bicicletas y patinetas eléctricas. Este módulo debe verificar la validez de los documentos en tiempo real contra una base de datos centralizada, asegurando que solo los usuarios autorizados tengan acceso al estacionamiento. se puede implementar un dispositivo para lectura de códigos QR, que se pueden utilizar en las barreras de entrada y salida o en otros dispositivos de control para facilitar un acceso rápido y seguro. Los códigos QR deben estar vinculados a la información del usuario en la base de datos, lo que permitirá un proceso de acceso más ágil y eficiente.
  
- En cuanto a la gestión del espacio, el sistema debe incorporar sensores de ocupación y con ayuda del escaneo del QR proporcionan un conteo en tiempo real de los espacios disponibles en el estacionamiento. Estos sensores deben enviar datos continuamente a la base de datos, la cual debe ser robusta y segura, almacenando información sobre la disponibilidad de espacios y los registros de acceso. Los usuarios podrán consultar la disponibilidad de espacios a través de una aplicación móvil o portal web o inclusive una pantalla con los datos en tiempo real de la cantidad de espacios de estacionamiento disponibles. La base de datos debe estar protegida con medidas de seguridad como cifrado para garantizar la privacidad de la información, mientras que el manejo de códigos QR debe facilitar una interacción fluida con el sistema, mejorando la eficiencia y seguridad general del estacionamiento en el campus universitario.

# 8. Conclusion
- El Sistema de Monitoreo en Tiempo Real para la Gestión, Disponibilidad y Seguridad de Espacios de Estacionamiento en la universidad representa una solución integral que optimiza el uso del espacio de estacionamiento dentro de las instituciones educativas. Al proporcionar datos actualizados y precisos sobre la disponibilidad de los espacios, el sistema facilita una asignación más eficiente de los mismos, reduciendo el tiempo de búsqueda y mejorando la experiencia de estudiantes, profesores y personal. Además, al incorporar mecanismos de seguridad avanzados, el sistema contribuye a la protección de los vehículos y a la prevención de incidentes. En conjunto, este enfoque no solo mejora la gestión y accesibilidad del estacionamiento, sino que también refuerza la seguridad en el campus, promoviendo un entorno universitario más organizado y seguro.

# 9. Referencias
- Universidad Politécnica Salesiana de guayaquil https://dspace.ups.edu.ec/bitstream/123456789/2401/19/UPS-GT000130.pdf
- Thanks to https://www.shutterstock.com/es/images we include some pictures of the theme.
- Markdown Extras by https://pandao.github.io/editor.md/en.html.
- Thanks to [ChatGPT by OpenAI](https://www.openai.com/chatgpt) for assistance with writing and content optimization.
- Documento de otro proyecto que tenemos en la universidad y se relaciona el tema.

![Java](https://img.shields.io/badge/Java-100%25-ff5733?style=for-the-badge)  ![github](https://img.shields.io/badge/github-100%25-ff5733?style=for-the-badge) ![markdown](https://img.shields.io/badge/markdown-100%25-ff5733?style=for-the-badge)

# Fase 2 del Proyecto.

# Codigo API OnlyParking

Este proyecto permite consultar placas de vehículos (motos y carros) en parqueaderos, utilizando una API externa que genera placas aleatorias junto con colores para cada vehículo. A continuación se explican los dos componentes principales del proyecto.

En este proceso, hemos utilizado el método POST para interactuar con la API de LMStudio (o un servicio similar). Primero, generamos un prompt y lo enviamos al servidor en formato JSON. Luego, recibimos la respuesta procesada y la mostramos al usuario. La conexión entre VSCode y LMStudio se hace a través de una serie de solicitudes HTTP, configuradas adecuadamente para trabajar con las API de LMStudio.

Este tipo de integración permite desarrollar aplicaciones que aprovechan el poder de los modelos de IA alojados en servidores remotos, sin necesidad de tener el modelo corriendo localmente en tu máquina, lo que hace que la implementación sea más eficiente y escalable.

## Utilización de POST para Interactuar con la API de LMStudio

Una solicitud **POST** es un tipo de solicitud HTTP que se utiliza para enviar datos al servidor. A diferencia de la solicitud **GET** (que se usa generalmente para obtener datos), el método **POST** es utilizado cuando queremos enviar información para que el servidor realice alguna acción, como guardar datos o realizar cálculos.

### ¿Por qué utilizar POST?

En el caso de una API que proporciona modelos de IA como LMStudio, generalmente usaremos **POST** para enviar un **prompt** (un mensaje o una solicitud de tarea) al modelo y obtener una respuesta. El método **POST** es ideal para enviar grandes cantidades de datos, como **JSON**, que contienen el prompt, parámetros de configuración, o incluso archivos.

### ¿Qué es un **Prompt**?

Un **prompt** es simplemente una instrucción o pregunta que le damos a un modelo de inteligencia artificial (IA) para que realice una tarea o genere una respuesta. En el caso de modelos como los de LMStudio o GPT, un prompt es el texto o la información que se envía al modelo para obtener un resultado.

Por ejemplo, si queremos que un modelo genere un texto sobre un tema específico, el prompt podría ser algo como:

**"Escribe un ensayo sobre los efectos del cambio climático."**

En resumen, el **prompt** es la entrada que el modelo usa para procesar y generar una salida basada en esa información.

---

## Código 1: `almacenar.java`

Este código interactúa con el usuario a través de la consola, capturando su input y realizando una consulta a la API para obtener placas de vehículos.

```java
package com.onlyparking;

import java.util.Scanner;

public class almacenar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Se crea un objeto Scanner para leer la entrada del usuario.
        String input;

        System.out.println("¡Hola! ¿Deseas ver las placas de los vehículos? ");  // Se muestra un mensaje inicial.

        while (true) {  // Bucle infinito para seguir solicitando entradas hasta que el usuario decida salir.
            input = scanner.nextLine();  // Lee lo que el usuario ingresa.

            // Si el usuario escribe "salir", el programa termina.
            if (input.equalsIgnoreCase("salir")) {
                System.out.println("¡Hasta luego!");  // Mensaje de despedida.
                break;  // Rompe el bucle, lo que hace que el programa termine.
            } else {
                System.out.println("Buscando placas...");  // Muestra un mensaje informando que se está buscando información.

                // Llama a la API pasando un mensaje que solicita información sobre las placas de vehículos y colores.
                String respuestaAPI = api.placas(
                        "Inventa números de placas de moto y carro en Colombia, que sean mínimo 5, también dame un color diferente para cada vehículo: "
                                + input);

                // Muestra la respuesta que devuelve la API.
                System.out.println("Respuesta de la API: " + respuestaAPI);
            }

            // Pide al usuario que escriba 'salir' para terminar o continúe interactuando.
            System.out.println("\n(escribe 'salir' para terminar)");
        }

        scanner.close();  // Cierra el scanner una vez que el programa ha terminado.
    }
}
```
![image](https://github.com/user-attachments/assets/9ac3fc7a-faa3-4bd9-a5e4-3a207dc86e17)


## Código 2: `api.java`

```java
package com.onlyparking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public class api {
    public static String placas(String mensaje) {
        String response = "";  // Variable para almacenar la respuesta de la API.
        try {
            // Se especifica la URL del servidor al que se realizará la solicitud.
            URL url = new URL("http://192.168.80.40:1234/v1/chat/completions");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();  // Se abre la conexión HTTP.
            conn.setRequestMethod("POST");  // Se establece el método HTTP POST.
            conn.setRequestProperty("Authorization", "Bearer ");  // Se agrega un token de autorización (vacío en este caso).
            conn.setRequestProperty("Content-Type", "application/json");  // Se define el tipo de contenido como JSON.
            conn.setDoOutput(true);  // Permite enviar datos en la solicitud.

            // Se crea el cuerpo de la solicitud en formato JSON.
            String jsonInputString = """
                    {
                        "model": "llama-3.2-1b-instruct",
                        "messages": [
                            {"role": "system", "content": "Eres una persona que sabe de placas de motos y carros en Colombia, también sabes de colores de vehículos. Recomiéndame según lo que te pida." },
                            {"role": "user", "content": "%s" }
                        ]
                    }
                    """.formatted(mensaje);

            // Se envía la solicitud a la API utilizando un OutputStream.
            try (OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");  // Se convierte el string JSON a bytes.
                os.write(input, 0, input.length);  // Se escribe la solicitud en la conexión.
            }

            // Se lee la respuesta de la API utilizando un BufferedReader.
            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                StringBuilder responseBuilder = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {  // Se lee cada línea de la respuesta.
                    responseBuilder.append(responseLine.trim());  // Se acumula la respuesta.
                }
                response = responseBuilder.toString();  // Se guarda la respuesta completa.
            }

            // Se procesa la respuesta JSON recibida.
            JSONObject jsonResponse = new JSONObject(response);  // Se convierte la respuesta a un objeto JSON.
            JSONArray choices = jsonResponse.getJSONArray("choices");  // Se extrae el array de "choices".
            JSONObject choice = choices.getJSONObject(0);  // Se toma el primer objeto de "choices".
            JSONObject message = choice.getJSONObject("message");  // Se obtiene el mensaje de la respuesta.

            String contenido = message.optString("content", "No disponible");  // Se obtiene el contenido del mensaje, con un valor por defecto.

            return "\n Respuesta : " + contenido;  // Se devuelve la respuesta procesada.

        } catch (Exception e) {
            e.printStackTrace();  // Si ocurre algún error, se imprime la traza del error.
        }

        return response;  // Si ocurre algún error, se devuelve la respuesta vacía.
    }
}
```
![image](https://github.com/user-attachments/assets/c9c43267-5ec2-4e36-8f17-06096b0a4ab4)

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

![image](https://github.com/user-attachments/assets/c7bfa972-8289-4804-9942-d919595928f6)    ![image](https://github.com/user-attachments/assets/a55dd87b-57f3-4da1-9926-0f1acf2ecc9b)


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

![image](https://github.com/user-attachments/assets/0669fa90-e45e-4e1a-abe6-55b0828faa18)

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



