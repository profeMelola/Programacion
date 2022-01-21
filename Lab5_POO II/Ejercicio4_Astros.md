# Enunciado

Define una jerarquía de clases que permita almacenar datos sobre los planetas y satélites (lunas) que forman parte del sistema solar. 

Algunos atributos que necesitaremos almacenar son: 

- Radio

- Rotación del eje

- Masa del cuerpo. 

- Temperatura media

- Gravedad

En el caso de los **planetas** es necesario almacenar:

- Distancia al sol

- Órbita al sol

- tiene satélites (y si los tiene su lista máximo 10)

En el caso de los **satélites** es necesario almacenar:

- Distancia al planeta 

- Órbita al planeta planeta al que pertenece



**Define las clases necesarias conteniendo:**

• Constructores. 

• Métodos para recuperar y almacenas atributos. 

• Método para mostrar la información del objeto. 


Define un método, que dado un objeto del sistema solar (planeta o satélite), imprima toda la información que se dispone sobre el mismo (además de su lista de satélites si los tuviera).

![Captura de pantalla de 2022-01-14 18-55-49](https://user-images.githubusercontent.com/91023374/149562533-f583c5b3-2c44-4b25-8155-ecba6e193b6d.png)


## Ejemplo de salida del programa

Con un menú para elegir los diferentes astros

![image](https://user-images.githubusercontent.com/91023374/150559891-356a2327-f297-4029-a81a-8f5ca6f3ec82.png)

## Valores de ejemplo para planetas y satélites

![image](https://user-images.githubusercontent.com/91023374/150560070-00b054cf-e32d-47df-84dc-dbb2997d3d6a.png)


## Ampliación

En vez de utilizar un arraybidimensional, modificar el código para utilizar un ArrayList
