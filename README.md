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

# Codigo API OnlyParking

Este proyecto permite consultar placas de vehículos (motos y carros) en parqueaderos, utilizando una API externa que genera placas aleatorias junto con colores para cada vehículo. A continuación se explican los dos componentes principales del proyecto.

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

![image](https://github.com/user-attachments/assets/7ba21fc3-d8ef-47ca-8697-3c2efb2c250e)

