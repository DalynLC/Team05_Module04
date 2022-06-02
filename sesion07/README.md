# Sesión # 7 - Integración con Selenium: 

## :dart: Objetivos

- Configurar Selenium para pruebas con JMeter
- Desarrollar un proyecto en JMeter integrando Selenium Web Driver con diseño orientado a objetos y anotaciones en el framework de automatización.
- Emplear JUnit como marco de trabajo en el proyecto de JMeter


## Desarrollo

En esta sesión crearemos un proyecto en JMeter donde integraremos con Selenium y JUnit.


**Indicaciones Generales**

* Crear un proyecto en JMeter
  - Crear el plan de pruebas

* Crear los elementos del proyecto en JMeter.
  - Elementos básicos de grabación
  - Configuración de datos
  - Árbol de resultados
  - Reporte resumen
  - Gráfico de resultados

![thread](https://user-images.githubusercontent.com/77414220/171693467-d814b76d-ff0b-4be4-af73-ed14bd798078.PNG)


* Estructura el proyecto en Selenium con POM (Page Object Model).
  - Apertura de Eclipse
  - Creación de módulos / transacciones
  - Creación de paquetes de vistas y objetos por separados

* Grabar los escenarios de prueba en Selenium
  - Reconocimiento de objetos

* Organizar objetos y acciones en clases diferentes.
  - Los objetos que se reconocieron en la grabación se incluyen en el paquete de objetos
  - Las acciones a realizar en cada uno de los objetos se debe incluir por tipo de transacción y en el paquete java de acciones

* Integrar Driver de selenium con JMeter.
  - Incluir el elemento jp@gc - Chrome Driver Config

![5](https://user-images.githubusercontent.com/77414220/171693092-7d649ba3-6b0f-4746-8da9-88fc13870c00.PNG)


* Incorporar JUnit al proyecto.
  - Incluir el elemento JUnit Request del Sampler

![1](https://user-images.githubusercontent.com/77414220/171692904-3e682ddf-7bb9-4112-9fad-c1139a2dd1ce.PNG)

* Ejecutar proyecto.

* Verificar los resultados.
  - Revisar y analizar los resultados de los elemento del plan de pruebas (Arbol, resumen y gráficos)

![2](https://user-images.githubusercontent.com/77414220/171693401-a1bfdf2f-2fd4-425a-a15e-9aa38d0d258b.PNG)
![3](https://user-images.githubusercontent.com/77414220/171693394-aaee66e5-1626-4770-9066-355dedaffd50.PNG)
![4](https://user-images.githubusercontent.com/77414220/171693398-ac9ee7f8-0761-4555-9176-6b60743a39bf.PNG)
