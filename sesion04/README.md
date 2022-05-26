# Sesión 4: Parametrización de datos en JMeter

## :dart: Objetivos

- Demostrar los conceptos aprendidos a través de la elaboración de un proyecto en JMeter con iteraciones de datos.
- Emplear un archivo .csv en la parametrización de datos.
- Construir un proyecto con JMeter para incluir set de datos desde bases de datos.


## Desarrollo

Vamos a construir un proyecto en JMeter con 3 escenarios de prueba cada uno con una iteración de datos por archivo, base de datos y controlador.

**Indicaciones Generales**

Crear un TestPlan con sus elementos de prueba, grabación y resultados.

*Flujo de la prueba*


https://user-images.githubusercontent.com/59595382/170577296-2d5d0473-754e-414b-9911-794a6b73431f.mp4


*Primer escenario de prueba con CSV*
- Definición del Thread Group
 
 ![csv_1](https://user-images.githubusercontent.com/59595382/170576432-3c105e06-796c-478c-ad64-a77342506856.PNG)

- Configuración de los HTTP REQUEST
 ![csv_2](https://user-images.githubusercontent.com/59595382/170576606-acb480a9-aedb-4087-863a-adb54ccbaab2.PNG)
 
 ![csv_3](https://user-images.githubusercontent.com/59595382/170576618-4b07cec9-684a-496f-bc6e-d62a81ac16e6.PNG)
 
 ![csv_4](https://user-images.githubusercontent.com/59595382/170576644-c3a92c6a-3b8b-4859-9b67-3ed44df954dc.PNG)
 
 - CSV Data Set Config
 
 ![csv_5](https://user-images.githubusercontent.com/59595382/170576711-9d4dcfea-4263-4b04-84bb-a6fef0a049a8.PNG)
 
 - Resultados
 
 ![csv_6](https://user-images.githubusercontent.com/59595382/170576716-37da4501-c596-482e-ab9d-8e75a83cb61e.PNG)
 
 ![csv_7](https://user-images.githubusercontent.com/59595382/170576731-a287db1f-932b-4375-a6e1-e1a2a470fe4e.PNG)
 
 ![csv_8](https://user-images.githubusercontent.com/59595382/170576746-a80097e8-5a28-4eb4-9b91-f0b54cefe063.PNG)
 
 ![csv_9](https://user-images.githubusercontent.com/59595382/170576757-b7a71c54-d2cf-45af-b446-b9dfb806dc45.PNG)



*Segundo escenario de prueba con BD*

- Definición del Thread Group

![db_1](https://user-images.githubusercontent.com/59595382/170576927-0815221b-2a41-4bc2-9672-6608cee77a07.PNG)

- Configuración de los HTTP REQUEST

![db_2](https://user-images.githubusercontent.com/77414220/170586965-19347f64-1e5b-419d-93e1-a90ab2b58d57.PNG)

![db_3](https://user-images.githubusercontent.com/77414220/170586980-90f7d7c2-bfa0-4ff4-84ca-a804c426ecc9.PNG)

![db_4](https://user-images.githubusercontent.com/59595382/170576957-d6ab7bee-f2a1-4b5b-ba8f-e51177e43295.PNG)

- Configuración de los parámetros

![db_5](https://user-images.githubusercontent.com/59595382/170576965-fdcf0f8c-c48a-4f2c-8745-3b306fec77ac.PNG)

![db_6](https://user-images.githubusercontent.com/59595382/170576975-45668aa7-dfd9-4013-badb-d90b7a811dea.PNG)

![db_7](https://user-images.githubusercontent.com/59595382/170576991-fabcc03d-9f4e-42c6-9d9f-9e7624be517c.PNG)

-Resultados

![db_8](https://user-images.githubusercontent.com/59595382/170576998-a3616734-f04c-4c9f-a51d-0efbd5c77581.PNG)
![db_9](https://user-images.githubusercontent.com/59595382/170577008-fe37366f-4c5e-4fd3-ac48-ba5553e43a80.PNG)
![db_10](https://user-images.githubusercontent.com/59595382/170586036-0e28caa1-0e2b-4b8c-9077-a7575bd49064.PNG)
![db_11](https://user-images.githubusercontent.com/59595382/170586044-9d276179-8af4-4fef-b185-b691a62b80a7.PNG)
![db_12](https://user-images.githubusercontent.com/59595382/170586054-15b84a93-f819-492d-9054-396cf60ff65d.PNG)


.

*Tercer escenario de prueba PARAMETRIZADO*

- Definición del Thread Group

![controller_1](https://user-images.githubusercontent.com/59595382/170581470-91fee62c-e1a5-463b-ba42-110ae822f88e.PNG)

- Configuración de los HTTP REQUEST

![db_2](https://user-images.githubusercontent.com/77414220/170586965-19347f64-1e5b-419d-93e1-a90ab2b58d57.PNG)

![db_3](https://user-images.githubusercontent.com/77414220/170586980-90f7d7c2-bfa0-4ff4-84ca-a804c426ecc9.PNG)

![controller_4](https://user-images.githubusercontent.com/59595382/170581737-7045432c-20b0-48c5-b87a-a5c2c7e1e5a8.PNG)

- Configuración de los parámetros

![controller_5](https://user-images.githubusercontent.com/59595382/170581748-be1d4e45-f83c-4378-b1d1-249485fcdc6d.PNG)

![controller_6](https://user-images.githubusercontent.com/59595382/170582062-a8dcec07-faa3-4f61-b8cb-82bfcf401b8b.PNG)

- Resultados

![controller_7](https://user-images.githubusercontent.com/59595382/170582251-4a18dcc1-4f5e-4f8d-80e8-c800196e5e4c.PNG)

![controller_8](https://user-images.githubusercontent.com/59595382/170582269-2f1c4de5-8852-48db-a6ce-5f5e0c81d9c2.PNG)

![controller_9](https://user-images.githubusercontent.com/59595382/170582294-f0c0a4eb-691d-41c5-bac8-30ddbe57904e.PNG)


