# Sesión 3: Tipos de Pruebas con JMeter

## :dart: Objetivos

- Preparar escenarios para los diferentes tipos de prueba.
- Construir una prueba de carga y ejecutarla.
- Producir una sobrecarga en la aplicación mediante prueba de estrés.
- Demostrar la estabilidad de la aplicación mediante estas pruebas.
- Emplear una prueba de carga hecha para prueba de recuperación.


## Desarrollo

Vamos a crear 2 escenarios de prueba donde incorporamos los 4 tipos de pruebas que vimos en esta sesión.


**Asegúrate de comprender:**

La diferencia entre los distintos tipos de prueba.
Limpiar los listeners antes de cada ejecución.

**Indicaciones Generales**

Crear un TestPlan con sus elementos de prueba, grabación y resultados.

*Grabar primer escenario de prueba*
- Configurar el Thread Group con usuarios para pruebas de carga.
- ![carga1_1](https://user-images.githubusercontent.com/23124413/170367190-15461229-b75a-4ae0-b09a-ae3529dcebd9.PNG)
- Ejecutar prueba.
- ![carga1_2](https://user-images.githubusercontent.com/23124413/170367248-34f036b6-b449-41db-ae1e-6669d2a27c3b.PNG)
- Revisar elementos de resultados.
- ![carga1_3](https://user-images.githubusercontent.com/23124413/170367290-9cd6f45e-c03b-44cd-b648-0a2c864ca6a7.PNG)
- ![carga1_4](https://user-images.githubusercontent.com/23124413/170367307-ff8f3c40-9f01-42d8-ba34-656c04d228e4.PNG)

- Configurar el Thread Group con usuarios para pruebas de estrés.
- ![estres1_1](https://user-images.githubusercontent.com/23124413/170367613-24057f4a-222b-4f1c-8449-76cf3bdc2612.PNG)
- Ejecutar prueba.
- ![estres1_2](https://user-images.githubusercontent.com/23124413/170367633-51ed00d9-4d7d-47d6-8238-f41727f01af3.PNG)
- Revisar elementos de resultados.
- ![estres1_3](https://user-images.githubusercontent.com/23124413/170367656-5017b3f0-4cf9-4bd8-982e-333aa83143b5.PNG)
- ![estres1_4](https://user-images.githubusercontent.com/23124413/170367665-1a331a2c-0cc7-47b0-81e1-68871c0efd60.PNG)

- Configurar el Thread Group con usuarios para pruebas de estabilidad.
- ![estabilidad1_1](https://user-images.githubusercontent.com/23124413/170367873-0edc5736-c60f-47a1-8e8b-fc28c7202bd9.PNG)
- Ejecutar prueba.
- ![estabilidad1_2](https://user-images.githubusercontent.com/23124413/170367893-874c52ce-d4b4-43d0-8e1d-40d91966ac21.PNG)
- Revisar elementos de resultados.
- ![estabilidad1_3](https://user-images.githubusercontent.com/23124413/170367924-fa69b565-1c10-4bad-a53c-cb9a54ced42c.PNG)
- ![estabilidad1_4](https://user-images.githubusercontent.com/23124413/170367928-da8edb74-ac41-43a7-a44a-687dd6ca0d2e.PNG)


- Configurar el Thread Group con usuarios para pruebas de recuperación.
- Ejecutar prueba.
- Revisar elementos de resultados.

*Grabar segundo escenario de prueba*
- Configurar el Thread Group con usuarios para pruebas de carga.
- Ejecutar prueba.
- Revisar elementos de resultados.

- Configurar el Thread Group con usuarios para pruebas de estrés.
- Ejecutar prueba.
- Revisar elementos de resultados.

- Configurar el Thread Group con usuarios para pruebas de estabilidad.
- Ejecutar prueba.
- Revisar elementos de resultados.

- Configurar el Thread Group con usuarios para pruebas de recuperación.
- Ejecutar prueba.
- Revisar elementos de resultados.
