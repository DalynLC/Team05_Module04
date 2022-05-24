# Sesión 2: Grabando Test Scripts

## :dart: Objetivos

* Grabar escenarios de prueba con una de las herramientas externas.
* Crear las solicitudes (acciones) del navegador a la aplicación web.
* Ejecutar las pruebas de rendimiento a partir de los script grabados.

## Instrucciones

En esta sesión hemos visto que existen herramientas de grabación externas a JMeter pero que se integran con esta para la ejecución de pruebas de rendimiento, 2 de estas son BlazeMeter y BadBoy.

**Iniciemos:**

* Selecciona una de estas dos herramientas (con la que te sientas más cómodo) para grabación y ejecución de acciones en el navegador.
* Descarga la herramienta.
* Identifica una página web a la que desees hacerle la grabación de pasos y acciones.
* Inicia la grabación desde tu herramienta seleccionada.
* Intégrala a JMeter.
* Realiza las siguientes pruebas en tu estructura del proyecto de JMeter.
    - Ejecutar con 20 hilos (usuarios) la transacción con intervalos de 2 segundos la petición.
        Revisamos árbol de resultados y comparamos cantidad de pasos exitosos vs. fallidos.

    - Ejecutar con 30 hilos (usuarios) la transacción con intervalos de 1 segundos la petición.
        Revisamos árbol de resultados y comparamos cantidad de pasos exitosos vs. fallidos.

    - Ejecutar con 100 hilos (usuarios) la transacción con intervalos de 2 segundos la petición.
        Revisamos árbol de resultados y comparamos cantidad de pasos exitosos vs. fallidos.

**Recuerda que:**

* Debes haber configurado el proxy de tu navegador para la comunicación con JMeter.
* Debes haber descargado la herramienta que elegiste para tu prueba.
* Debes integrar la grabación que hiciste con tu herramienta seleccionada con JMeter para la ejecución de los casos.

## Desarrollo
- Selección de la página: 
    
    Link: blazedemo.com/index
    
    Página de reservación de vuelos.
    
- Flujo de la prueba: 

https://user-images.githubusercontent.com/77414220/170132505-6dc5f1b0-240f-4305-b9c2-e18493a1b367.mp4

- Ejecución de la prueba con 20 usuarios con intervalo de 2 segundos.

![thread20](https://user-images.githubusercontent.com/77414220/170131683-2c751a88-53d5-40ce-9b3b-faf6ab7613ef.PNG)

![graph20](https://user-images.githubusercontent.com/77414220/170131716-b556ceeb-f9d8-4a6e-8641-fe32bb2dcab4.PNG)

- Ejecución de la prueba con 30 usuarios con intervalo de 1 segundo.

![thread30](https://user-images.githubusercontent.com/77414220/170132019-133f8c77-7b03-4bb4-8f48-217a79745c93.PNG)

![graph30](https://user-images.githubusercontent.com/77414220/170132038-47f8101a-65c9-4c1e-abe6-8e370a5be89a.PNG)

- Ejecución de la prueba con 100 usuarios con intervalo de 2 segundos.
- 
