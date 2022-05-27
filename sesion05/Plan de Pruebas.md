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

![confGen1](https://user-images.githubusercontent.com/77414220/170794594-504f441e-aa75-4af6-b29c-958a011184f1.PNG)

![confGen2](https://user-images.githubusercontent.com/77414220/170794595-419c4f6b-376f-40c6-ad43-f574a18d4ad0.PNG)

![confGen3](https://user-images.githubusercontent.com/77414220/170794596-2035dff1-5b90-426a-87f5-d5e3142a3323.PNG)

![confGen4](https://user-images.githubusercontent.com/77414220/170794592-60501336-2da0-413e-8c33-2d4dfba90edf.PNG)

### Prueba de carga

![carga1](https://user-images.githubusercontent.com/77414220/170794627-f630f548-db5f-4f43-b788-d96958dc58d8.PNG)

![carga - tree](https://user-images.githubusercontent.com/77414220/170794679-9e5e9797-806c-4f1c-b920-8bf176ac8db9.PNG)

![carga - summary](https://user-images.githubusercontent.com/77414220/170794681-b5cceb98-9d73-4a24-9513-1d69681ba2e4.PNG)

![carga - graph](https://user-images.githubusercontent.com/77414220/170794680-262cc6d0-ab03-4deb-ab87-2600438ffc67.PNG)

<img width="1110" alt="Aggregate Graph - carga" src="https://user-images.githubusercontent.com/77414220/170794720-c9fdf7c2-2178-4893-8f1e-f0f1f395b83d.png">


### Prueba de estrés

![estres1](https://user-images.githubusercontent.com/77414220/170794750-976d4947-05c2-4ad1-8294-66de022740da.PNG)

![estres - tree](https://user-images.githubusercontent.com/77414220/170794761-1b7f6a6e-0d9e-462c-908f-cef47653537e.PNG)

![estres - summary](https://user-images.githubusercontent.com/77414220/170794765-fc455b82-d283-4f45-b824-ee1200e9a63f.PNG)

![estres - graph](https://user-images.githubusercontent.com/77414220/170794771-eb3e2e5a-bc94-427c-8ad3-7bb8ada3bf57.PNG)

<img width="991" alt="Aggregate Graph - estres" src="https://user-images.githubusercontent.com/77414220/170794785-71467d0a-fc78-4ecf-9fdd-8eeff4a8aeab.png">


### Prueba de estabilidad

![estabilidad1](https://user-images.githubusercontent.com/77414220/170794825-58fb1ac5-58f0-42b3-9f73-a785406dd72e.PNG)

![estabilidad - tree](https://user-images.githubusercontent.com/77414220/170794832-8b4df175-6cd8-43da-9b20-b36506399d82.PNG)

![estabilidad - summary](https://user-images.githubusercontent.com/77414220/170794835-f887041e-e86b-46f7-8312-60fc222157e4.PNG)

![estabilidad - graph](https://user-images.githubusercontent.com/77414220/170794841-4e52e483-27d4-45b0-91de-01eba39d5333.PNG)

<img width="991" alt="Aggregate Graph - estabilidad" src="https://user-images.githubusercontent.com/77414220/170794844-e986a8f6-a4b6-41f7-b14e-851d94803d01.png">


### Métricas de rendimiento

Los parámetros utilizados como base para la realización del análisis de los resultados y métricas de rendimiento son el promedio, mínimo, máximo y porcentaje de error obtenidos de cada prueba, tal como se muestra en las siguientes imágenes.

### Actividades y entregables de pruebas de rendimiento


## DATOS DE PRUEBA
Como datos de prueba se utilizaron:
- 20 usuarios concurrentes con 1 segundo entre peticiones.
- 100 usuarios concurrentes con 1 segundo entre peticiones.
- 20 usuarios concurrentes con 1 segundo entre peticiones en un loop infinito.

Los datos empleados para el llenado de los campos se obtuvieron del archivo postworkData.csv con los siguientes valores:



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

## ABREVIATURAS

| Abreviatura | Descripción | 
| ------------- | ------------- |
| DB  | Base de datos |
|  Http | Protocolo de transferencia de hipertexto |
|  JDBC | Conectividad de base de datos java |
| QA  | Control de calidad |
| SLA  | Acuerdo de nivel de servicio |
|  SME | Experto en la materia |
| UAT  | Pruebas de aceptación del usuario |



