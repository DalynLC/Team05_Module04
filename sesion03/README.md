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

https://user-images.githubusercontent.com/77414220/170371806-0a5f6b69-e076-4389-b57e-3f1b1ec2c8fd.mp4

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

https://user-images.githubusercontent.com/77414220/170372371-56d37278-9f5c-414b-aa12-2f489bee2e2b.mp4

*Grabar segundo escenario de prueba*
![prueba2](https://user-images.githubusercontent.com/23124413/170371126-5f77cc55-6c22-4d74-950c-e87a9e455639.PNG)
- Configurar el Thread Group con usuarios para pruebas de carga.
- ![carga2_1](https://user-images.githubusercontent.com/23124413/170371161-098ec8ec-a0ce-498e-becb-f74cb58c6949.PNG)
- Ejecutar prueba.
- ![carga2_2](https://user-images.githubusercontent.com/23124413/170371206-4b0d0b99-f70a-4d18-be19-4ebca50e28b0.PNG)
- Revisar elementos de resultados.
- ![carga2_3](https://user-images.githubusercontent.com/23124413/170371223-53da53e3-87d2-4903-8450-4e1799d1549b.PNG)
  ![carga2_4](https://user-images.githubusercontent.com/23124413/170371228-94406a62-9b4f-402d-b368-cbbb1daba06e.PNG)


- Configurar el Thread Group con usuarios para pruebas de estrés.
- ![estres2_1](https://user-images.githubusercontent.com/23124413/170371250-97c0724d-47cc-4c3e-9311-ab380a255c47.PNG)
- Ejecutar prueba.
- ![estres2_2](https://user-images.githubusercontent.com/23124413/170371275-efa6a894-9ce0-4946-b101-010cc9d3c58e.PNG)
- Revisar elementos de resultados.
- ![estres2_3](https://user-images.githubusercontent.com/23124413/170371291-534b799c-7bff-41db-9d17-a4b750265d3b.PNG)
  ![estres2_4](https://user-images.githubusercontent.com/23124413/170371292-bd6a02a8-dbea-4ffd-a583-37a3885074d6.PNG)


- Configurar el Thread Group con usuarios para pruebas de estabilidad.
- ![estabilidad1_1](https://user-images.githubusercontent.com/23124413/170371311-d9e85fa8-9bbd-4748-a370-1b62f79e62f8.PNG)
- Ejecutar prueba.
- ![estabilidad1_2](https://user-images.githubusercontent.com/23124413/170371332-f21a687b-1a48-409b-8d52-e52b8c570010.PNG)
- Revisar elementos de resultados.
- ![estabilidad1_4](https://user-images.githubusercontent.com/23124413/170371358-db1ac0ed-ebcd-4ffb-bca9-0eb022a97601.PNG)
![estabilidad1_3](https://user-images.githubusercontent.com/23124413/170371339-eb292a1a-56f7-4ac3-8a00-4a9a91bba462.PNG)

- Configurar el Thread Group con usuarios para pruebas de recuperación.
- ![recuperacion2_1](https://user-images.githubusercontent.com/23124413/170371400-c90b3596-df6f-4371-9230-a1fef31ced96.PNG)
- Ejecutar prueba.
- ![recuperacion2_2](https://user-images.githubusercontent.com/23124413/170371419-992beae0-5ff5-44fe-88ae-826876230e4b.PNG)
- Revisar elementos de resultados.
- ![recuperacion2_3](https://user-images.githubusercontent.com/23124413/170371441-b023ca07-acd4-4c8f-b1a9-8b2c63920fb9.PNG)
![recuperacion2_4](https://user-images.githubusercontent.com/23124413/170371449-dfa3f2dc-73bd-4114-994e-603eee7a50dd.PNG)

