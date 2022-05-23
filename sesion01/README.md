# Sesión 1: Introducción a Performance Testing & JMeter 

## :dart: Objetivos

- Ejecutar escenario de prueba con otros datos.
- Emplear una transacción sencilla de una página web.


## Desarrollo

En esta sesión se harán variaciones a los datos que se envían en las peticiones con respecto a cantidad de usuarios vs tiempo de petición, tanto en la misma transacción como en una nueva.

**Asegúrate de comprender:**

- Cómo se estructura un test plan.
- Dónde se indican las variables de prueba (hilos y tiempos).

**Indicaciones Generales**

Con lo trabajado en el work, ya hemos hecho la grabación y ejecución de un escenario de prueba, en este paso vamos a interactuar con los datos enviados para las peticiones de prueba con las siguientes indicaciones:

* Ejecutar con **20 hilos** (usuarios) la transacción con intervalos de 2 segundos la petición.

Luego de la ejecución de la prueba de carga con 20 usuarios simultáneos revisamos el árbol de resultados donde vemos la cantidad de pasos exitosos vs. fallidos que resultaron, si no hay fallidos el sistema está soportando satisfactoriamente la cantidad de usuarios.

* Ejecutar con **30 hilos** (usuarios) la transacción con intervalos de 1 segundos la petición.

Luego de la ejecución de la prueba de carga con 30 usuarios simultáneos revisamos el árbol de resultados donde vemos la cantidad de pasos exitosos vs. fallidos que resultaron, si no hay fallidos el sistema está soportando satisfactoriamente la cantidad de usuarios, de lo contrario vamos revisando cuantos pasos fallidos resultaron y vamos comparando qué cantidad soporta el sistema.

* Ejecutar con **100 hilos** (usuarios) la transacción con intervalos de 2 segundos la petición.

Luego de la ejecución de la prueba de carga con 100 usuarios simultáneos revisamos el árbol de resultados donde vemos la cantidad de pasos exitosos vs fallidos que resultaron, si no hay fallidos el sistema está soportando satisfactoriamente la cantidad de usuarios, de lo contrario vamos revisando cuantos pasos fallidos resultaron y vamos comparando qué cantidad soporta el sistema. Ahora, si en alguno de los 2 pasos anteriores hubo muchos pasos fallidos este va a ser muy probable que ocurra con mayor cantidad.

## Evidencias
- Ejecución con 20 hilos con intervalos de 2 segundos.

![TG3](https://user-images.githubusercontent.com/77414220/169911721-c0a64e2c-48fa-4f0b-94e4-f97291ab58b6.PNG)

- Ejecución con 30 hilos con intervalos de 1 segundo.

![TG1](https://user-images.githubusercontent.com/77414220/169911771-5210f3cf-e1a1-419b-8457-6e5608a7ef57.PNG)

- Ejecución con 100 hilos con intervalos de 2 segundos.

![TG2](https://user-images.githubusercontent.com/77414220/169911745-b4eaeec2-2d51-49b3-b281-fa73af7c97ce.PNG)

-Resultados finales

![Results](https://user-images.githubusercontent.com/77414220/169911807-a9ed8a6a-75fb-4697-95c0-de725a95e3bd.PNG)
