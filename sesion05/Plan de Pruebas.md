# PLAN DE PRUEBAS

## INTRODUCCIÓN

Tenemos una aplicación web de e-comerce que permite a los usuarios comprar tickets para vuelos, por lo cual se debe analizar cuántos usuarios en simultáneo soporta la aplicación realizando este proceso, para lo cual, se realizaran pruebas de carga, de estrés y estabilidad.

## OBJETIVOS

- Realizar pruebas de carga, de estres y de estabilidad a la aplicación web durante las transacciones involucradas para la compra de tickets de vuelo.
- Garantizar el rendimiento de la aplicación, la disponibilidad del servicio y la estabilidad de la aplicación.
- Verificar que los tiempos de respuesta de las transacciones se mantienen dentro de la tolerancia aceptable sobre el perfil de carga creciente.

## ALCANCE

El presente proyecto tiene como alcance lo siguiente:

- Comprender la funcionalidad del proceso de compra del tickets.
- Grabación del escenario de compra de tickets desde la aplicación web.
- Iteración de datos para las pruebas de carga.
- Pruebas de estrés.
- Pruebas de estabilidad.
- Validación del entorno y ambiente de pruebas.
- Publicación de los resultados de las pruebas de rendimiento.

### A nivel del proyecto en JMeter.

- Generación de los datos de prueba.
- Análisis de los resultados de la prueba de estrés.
- Análisis de los resultados de la prueba de carga.
- Análisis de los resultados de la prueba de estabilidad.

## ENFOQUE

- Escenario 1:
Validar el acceso del flujo "selección de destino y origen > selección de vuelo > introducción de datos > reservación de vuelo" de la aplicación web con 20 usuarios en un periodo de 1 segundo.

- Escenario 2:
Validar el acceso del flujo "selección de destino y origen > selección de vuelo > introducción de datos > reservación de vuelo" de la aplicación web con 100 usuarios en un periodo de 1 segundo.

- Escenario 3:
Validar el acceso del flujo "selección de destino y origen > selección de vuelo > introducción de datos > reservación de vuelo" de la aplicación web con 20 usuarios en un periodo de 1 segundo en un loop infinito.

### Configuración general de la prueba

- Durante esta prueba, se visita la página que permite seleccionar la ciudad de origen y una ciudad de destino, misma que solicita dos valores.

![confGen1](https://user-images.githubusercontent.com/77414220/170794594-504f441e-aa75-4af6-b29c-958a011184f1.PNG)

- La selección del vuelo se realiza en la página siguiente, enviando la información de ciudad origen, ciudad destino, aerolínea, precio del vuelo e id del vuelo.

![confGen2](https://user-images.githubusercontent.com/77414220/170794595-419c4f6b-376f-40c6-ad43-f574a18d4ad0.PNG)

- Finalmente se realiza un llenado con los datos personales del usuario y de pago.

![confGen3](https://user-images.githubusercontent.com/77414220/170794596-2035dff1-5b90-426a-87f5-d5e3142a3323.PNG)

- Los datos para el llenado y las selecciones se obtendrán del archivo postworkData.csv, mismo que se encuentra configurado de la siguiente forma.

![confGen4](https://user-images.githubusercontent.com/77414220/170794592-60501336-2da0-413e-8c33-2d4dfba90edf.PNG)

### Prueba de carga

- La prueba de carga se realiza con 20 threads (usuarios) configurados con un periodo de 1 segundo.

![carga1](https://user-images.githubusercontent.com/77414220/170794627-f630f548-db5f-4f43-b788-d96958dc58d8.PNG)

- Como se aprecia en el árbol de resultados, se realizan las peticiones GET y POST de cada una de las páginas involucradas en el proceso de compra de tickets, y en esta prueba no se obtiene ningún error.

![carga - tree](https://user-images.githubusercontent.com/77414220/170794679-9e5e9797-806c-4f1c-b920-8bf176ac8db9.PNG)

- El siguiente gráfico muestra los tiempos mínimos, máximos, y promedio de las transacciones.

![carga - graph](https://user-images.githubusercontent.com/77414220/170794680-262cc6d0-ab03-4deb-ab87-2600438ffc67.PNG)

- Finalmente, se puede observar que la sección de selección de ciudad de origen-destino es la transacción que más tiempo le llevó al test, presentando un tiempo mínimo, máximo y promedio superior al que se presenta en las páginas siguientes. 

<img width="1110" alt="Aggregate Graph - carga" src="https://user-images.githubusercontent.com/77414220/170794720-c9fdf7c2-2178-4893-8f1e-f0f1f395b83d.png">


### Prueba de estrés

- La prueba de estrés se realizó con un total de 100 threads (usuarios) con un intervalo de 1 segundo, unicamente una vez.

![estres1](https://user-images.githubusercontent.com/77414220/170794750-976d4947-05c2-4ad1-8294-66de022740da.PNG)

- Como se aprecia en el árbol de resultados, se realizan las peticiones GET y POST de cada una de las páginas involucradas en el proceso de compra de tickets, sin embargo, esta vez se generaron diversos errores entre transacciones.

![estres - tree](https://user-images.githubusercontent.com/77414220/170794761-1b7f6a6e-0d9e-462c-908f-cef47653537e.PNG)

- El siguiente gráfico muestra los tiempos mínimos, máximos, y promedio de las transacciones.

![estres - graph](https://user-images.githubusercontent.com/77414220/170794771-eb3e2e5a-bc94-427c-8ad3-7bb8ada3bf57.PNG)

- En el siguiente gráfico se observa que el proceso de selección de ciudad destino-origen y la selección de vuelo fueron las transacciones que más tiempo llevaron, a comparación del llenado de datos personales y que por esto mismo, la ejecución completa de los test no se completó.

<img width="991" alt="Aggregate Graph - estres" src="https://user-images.githubusercontent.com/77414220/170794785-71467d0a-fc78-4ecf-9fdd-8eeff4a8aeab.png">


### Prueba de estabilidad

- La prueba de estrés se realizó con un total de 20 threads (usuarios) con un intervalo de 1 segundo, en un loop infinito. Durante esta prueba se realizó la ejecución del test durante seis minutos.

![estabilidad1](https://user-images.githubusercontent.com/77414220/170794825-58fb1ac5-58f0-42b3-9f73-a785406dd72e.PNG)

- Como se aprecia en el árbol de resultados, se realizan las peticiones GET y POST de cada una de las páginas involucradas en el proceso de compra de tickets, no obteniendo ningún error durante el proceso.

![estabilidad - tree](https://user-images.githubusercontent.com/77414220/170794832-8b4df175-6cd8-43da-9b20-b36506399d82.PNG)

- El siguiente gráfico muestra los tiempos mínimos, máximos, y promedio de las transacciones.

![estabilidad - graph](https://user-images.githubusercontent.com/77414220/170794841-4e52e483-27d4-45b0-91de-01eba39d5333.PNG)

- Para esta prueba se observa que la transacción que más tiempo tardo en realizarse fue la selección del vuelo, seguido por la selección de ciudad origen-destino.

<img width="991" alt="Aggregate Graph - estabilidad" src="https://user-images.githubusercontent.com/77414220/170794844-e986a8f6-a4b6-41f7-b14e-851d94803d01.png">


### Métricas de rendimiento

Los parámetros utilizados como base para la realización del análisis de los resultados y métricas de rendimiento son el promedio, mínimo, máximo y porcentaje de error obtenidos de cada prueba, tal como se muestra en las siguientes imágenes.

- Reporte de la prueba de carga.

![carga - summary](https://user-images.githubusercontent.com/77414220/170796239-a900fb7c-7d9e-4039-ad5a-bb7f17777b6c.PNG)

- Reporte de la prueba de estabilidad.
 
![estabilidad - summary](https://user-images.githubusercontent.com/77414220/170796248-9c894ca1-b33f-4133-ae2b-891903adaec6.PNG)

- Reporte de la prueba de estrés.

![estres - summary](https://user-images.githubusercontent.com/77414220/170796257-176b26e7-a985-410f-a5af-dfdd113438a2.PNG)


## DATOS DE PRUEBA
Como datos de prueba se utilizaron:
- 20 usuarios concurrentes con 1 segundo entre peticiones.
- 100 usuarios concurrentes con 1 segundo entre peticiones.
- 20 usuarios concurrentes con 1 segundo entre peticiones en un loop infinito.

Los datos empleados para el llenado de los campos se obtuvieron del archivo postworkData.csv con los siguientes valores:

Mexico City,New York,12,765.32,Virgin America,Jane Doe,123 Main St,Anytown,State,12345,Jane Doe,1111111111111111,Visa,11,2017
Mexico City,New York,12,765.32,Virgin America,John Doe,123 Main St,Anytown,State,12345,John Doe,1111111111111111,Visa,11,2017
Mexico City,New York,12,765.32,Virgin America,Mary Sue,123 Main St,Anytown,State,12345,Mary Sue,1111111111111111,Visa,11,2017

## CRITERIOS DE ENTRADA Y SALIDA
### Criterios de entrada

- Acceso a todas las aplicaciones del entorno.
- Preparación del entorno completo.
- Preparación de los datos de prueba.

### Criterios de salida

- Informe de resultados tomando en cuenta los resultados obtenidos en el summary.
- Gráfico de resultados.
- Arból de resultados con request y response.
- Métricas de resultados. 


## HERRAMIENTAS Y TÉCNICAS DE PRUEBA

### Herramientas

- JMeter

## CRITERIOS DE SUSPENSIÓN Y REANUDACIÓN

Se vuelve un tema que causa suspensión cuando:

- El ambiente no esta configurado.
- La aplicación esta inestable o no disponible.
- No hay datos de prueba disponibles.

## ENTREGABLES DE PRUEBA

- Resultados de la prueba de carga, estrés y estabilidad.

## RIESGOS POTENCIALES Y PLAN DE MITIGACIÓN

| # | Riesgo | Probabilidad | Impacto | Plan de mitigación | Responsable |
| ------------- | ------------- | ------------- | ------------- | ------------- | ------------- |
| 1  | Contenido de la celda | | | | |
| 2  | Contenido de la celda  | | | | |



