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

### Prueba de carga

### Prueba de estrés

### Prueba de estabilidad

### Métricas de rendimiento

### Actividades y entregables de pruebas de rendimiento

## DATOS DE PRUEBA
Como datos de prueba se utilizaron:
- 20 usuarios concurrentes con 1 segundo entre peticiones.
- 100 usuarios concurrentes con 1 segundo entre peticiones.
- 20 usuarios concurrentes con 1 segundo entre peticiones en un loop infinito.

Los datos empleados para el llenado de los campos se obtuvieron del archivo postworkData.csv con los siguientes valores:



## CRITERIOS DE ENTRADA Y SALIDA

## GESTIÓN DE DEFECTOS

## HERRAMIENTAS Y TÉCNICAS DE PRUEBA

## CRITERIOS DE SUSPENSIÓN Y REANUDACIÓN

## ENTREGABLES DE PRUEBA

## FUNCIONES Y RESPONSABILIDADES

| ROL | Responsabilidades |
| ------------- | ------------- |
| Contenido de la celda  | Contenido de la celda  |
| Contenido de la celda  | Contenido de la celda  |

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



