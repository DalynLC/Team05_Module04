# Sesión # 8 - Pruebas de API 

## :dart: Objetivos

- Desarrollar un proyecto en JMeter integrando el consumo de una API
- Configurar elemento en JMeter para manejo de datos desde  archivo CSV 
- Emplear JSON Extractor como elemento para extraer datos del response de prueba


## Desarrollo

En esta sesión crearemos un proyecto en JMeter donde consumamos una API y utilicemos datos de prueba desde un archivo CSV


**Indicaciones Generales**

- Obtener API de prueba
- ![API](https://user-images.githubusercontent.com/23124413/171502292-0ddac447-207c-46d5-8df4-67e6876607ed.PNG)
- Crear proyecto en JMeter con los elementos para pruebas de carga y estrés
- ![plan Test](https://user-images.githubusercontent.com/23124413/171502405-0e055ffb-f405-4a2d-b78d-941f2d4f990e.PNG)
- Crear la solicitud HTTP para el consumo de la API
- ![estres_2](https://user-images.githubusercontent.com/23124413/171503263-4d3eea50-eee5-42cd-aa17-d0f1de6d874f.PNG)
- Incorporar archivo CSV
- ![estres_4](https://user-images.githubusercontent.com/23124413/171503323-d8e431f9-eb78-4335-82df-8ff5455b3d71.PNG)
- Agregar el formato de respuesta JSON
- ![estres_5](https://user-images.githubusercontent.com/23124413/171504337-4cc47026-6797-4327-8634-cc840f5c0c3d.PNG)
- Indicar método (GET-POST) para inicio de la prueba
- POST
- ![estres_6](https://user-images.githubusercontent.com/23124413/171504409-c1c58619-5f5d-4807-bc4b-598ae747cf84.PNG)
- GET
- ![estres_3](https://user-images.githubusercontent.com/23124413/171504500-e018122b-d923-4095-9610-4301dd216ef2.PNG)
- Agregar JSON Extractor e indicar la expresión que se desea extraer
- ![estres_5](https://user-images.githubusercontent.com/23124413/171504542-9ebdc0cb-860d-46f9-926a-e40986a7b853.PNG)
- Preparar la prueba indicando 10 usuarios simulados
- ![carga_1](https://user-images.githubusercontent.com/23124413/171504759-c4d28917-3407-49b7-ab6c-e7771b5e9876.PNG)
- Ejecutar el proyecto
- Presentar resultado Sampler
- Presentar request
- Presentar response
![carga_8](https://user-images.githubusercontent.com/23124413/171505001-d9db8eef-fc05-418d-a57c-2a2c342c2872.PNG)
![carga_9](https://user-images.githubusercontent.com/23124413/171505010-f931759e-8191-44c6-85ec-395ef498be16.PNG)
![carga_10](https://user-images.githubusercontent.com/23124413/171505017-5062f5c7-0d3e-48e6-8d8d-5128a55a870c.PNG)
![carga_11](https://user-images.githubusercontent.com/23124413/171505021-e9f7e9b8-fcea-4a07-8ba3-2a2a8464e32b.PNG)
![carga_12](https://user-images.githubusercontent.com/23124413/171505029-3bc965d7-8762-4900-90f1-31b2c703b263.PNG)
![carga_13](https://user-images.githubusercontent.com/23124413/171505031-f5d6f1fc-d064-467b-8682-f87de6f4b002.PNG)
![carga_14](https://user-images.githubusercontent.com/23124413/171505037-298260b2-690c-40eb-97f1-5b05acb33288.PNG)

* Realizar el mismo proceso con 50 usuarios simulados
* Realizar el mismo proceso con 100 usuarios simulados

