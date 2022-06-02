# Sesión # 6 - Reportes e integraciones con JMeter

## :dart: Objetivos

- Emplear proyecto para pruebas de performance en JMeter
- Incorporar proyecto jmx en github
- Configurar job de jenkins para comunicación con github


## Instrucciones

En esta sesión crearemos un proyecto en JMeter donde integremos con Github y llamemos desde el job de Jenkins


**Indicaciones Generales**

* Crear un proyecto en JMeter
  - Crear el plan de pruebas

* Crear los elementos del proyecto en JMeter.
  - Elementos básicos de grabación
  - Configuración de datos
  - Árbol de resultados
  - Reporte resumen
  - Gráfico de resultados

* Subir el proyecto a GitHub.
  - Obtenemos el link del repositorio Git donde se aloja el proyecto

* Abrir la aplicación de Jenkins.

* Configurar Git.
  - En la parte de Source Code Management incluir el link del repositorio GIT

* Indicar las credenciales con el branch de construcción
  - Configuración de Jenkins
  - Configurar comando shell.
  - Dentro de Build indicar esta instrucción
    pwd; ls -ltrh; java -version; curl http://mirror.cc.columbia.edu/pub/sof... -o apache-jmeter-5.3.tgz; tar -xvzf apache-jmeter-5.3.tgz; cd apache-jmeter-5.3/bin; sh jmeter.sh -n -t ../../jmeterGitJenkins/jmeter/jmeterGitJenkinsTestplan.jmx -l result.jtl -

* Ejecutar proyecto validando consola output.
  - En Build Now

* Finalizar ejecución.

* Verificar archivo .jtl para ver los resultados.
  - Al final del resultado aparece “Finished:” Satisfactorio o Fallido

## Desarrollo

![conf generales](https://user-images.githubusercontent.com/77414220/171694625-3d25fd49-5084-44f3-8e1a-fa2dada2a971.PNG)
![csv conf](https://user-images.githubusercontent.com/77414220/171694630-c7a0a1a8-0b1f-402d-afd1-5819af3c5ff8.PNG)
![datawriter](https://user-images.githubusercontent.com/77414220/171694631-fe65d604-9ef6-40ac-89eb-31b4d0db4ad6.PNG)
![thread1](https://user-images.githubusercontent.com/77414220/171694632-856393d8-5906-4d47-9b15-0c98e73b1701.PNG)
![thread2](https://user-images.githubusercontent.com/77414220/171694634-1d760d91-36a8-4a46-bed8-92e67a4c83f4.PNG)
![thread3](https://user-images.githubusercontent.com/77414220/171694635-e343ec61-6081-4b1a-9aca-1f02c21cebdd.PNG)

![Captura de pantalla (32)](https://user-images.githubusercontent.com/77414220/171695129-e62d9d14-1966-4d73-bcb1-660dcc8d4aec.png)

### KPI en BlazeMeter![kpi5](https://user-images.githubusercontent.com/77414220/171703251-36382b56-20d6-45c1-b2a8-28ed7e5f9329.PNG)

![kpi1](https://user-images.githubusercontent.com/77414220/171703244-79d35b21-1b57-4b60-948b-c9933e271223.PNG)

![kpi2](https://user-images.githubusercontent.com/77414220/171703247-8931a103-0b4d-48e4-80a6-9d462222f05f.PNG)

![kpi3](https://user-images.githubusercontent.com/77414220/171703248-7e0b851f-6a6b-4d90-9bca-a05d0525c363.PNG)

![kpi4](https://user-images.githubusercontent.com/77414220/171703249-4c4becc9-fb5e-4c1f-af65-a8f63dc70b9b.PNG)

![kpi5](https://user-images.githubusercontent.com/77414220/171703335-eb0decfe-95c7-440a-87f9-4ac0c97f904e.PNG)

![kpi6](https://user-images.githubusercontent.com/77414220/171703254-23242033-7a17-40f3-af13-5875947784f2.PNG)

![kpi7](https://user-images.githubusercontent.com/77414220/171703255-c58a20ba-cf56-4d0a-ac87-24c3a32a324b.PNG)

![kpi8](https://user-images.githubusercontent.com/77414220/171703260-a55238c3-ca22-438f-b2c2-0a4c200e93fe.PNG)
