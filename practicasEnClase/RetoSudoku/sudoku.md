# RETO: Implementa un sudoku con Java

![image](https://user-images.githubusercontent.com/91023374/146168358-c31a9f0f-9413-455d-8a80-641add94fe99.png)

## Instrucciones

Vamos a montar equipos según nos diga la profe.

De forma consesuada, cada equipo eligirá al portavoz y al jefe de proyecto.

**Problema que debemos resolver**

Implementar un sudoku clásico 9x9 en java:

- Se debe mostrar al usuario el sudoku.
- El usuario debe ir diciendo la casilla y el número que quiere rellenar.
- Debemos indicar al usuario si ha acertado con la solución.

![image](https://user-images.githubusercontent.com/91023374/146061101-1154dd26-808a-47f3-8784-82c14ffa9ee1.png)

## Requisitos

Puedes utilizar todos los recursos Java vistos en clase este trimestre, única y exclusivamente (Clases, objetos, arrays... nada de colecciones dinámicas!!!!! )

Podéis buscar por internet toda la información que consideréis necesaria, pero todos los miembros del equipo deben saber lo que se va a implementar.

El trabajo debe estar repartido. Todos debéis participar.

Tenéis total libertad para diseñar el Sudoku y sus reglas de juego (si se va resolviendo según el usuario va introduciendo números, si se resuelve una vez completado, si le damos más de una oportunidad etc...)

**Antes de empezar, tengamos claro qué es un Sudoku**

https://aprendiendomatematicas.com/sudokus-descargables-para-ninos/


## Pistas

El profesor irá publicando pistas para ayudar a aquellos bloqueados en diferentes fases del programa... 

**La próxima pista el viernes 15 de diciembre!!!**

![image](https://user-images.githubusercontent.com/91023374/146194724-942f3b84-3bfc-423e-921c-34a55faa7c0b.png)


### Primera pista: algoritmo para generar aleatoriamente un tablero de sudoku

![image](https://user-images.githubusercontent.com/91023374/146333140-faab5f14-2c63-4759-b14d-9587a779077f.png)

### Segunda pista: algoritmo para borrar celdas (nivel medio)

![image](https://user-images.githubusercontent.com/91023374/146376460-78485609-121c-435c-a6e3-01b7f5b5da75.png)

- Borrar las diagonales del tablero completo. Esto afecta a 5 sectores, borrando 3 celdas en cada sector.
- En los cuatro sectores restantes borrar solo 1 celda.
- Todo hace un total de 5 * 3 + 4 * 1 = 19 celdas borradas


## Comodín de ayuda
![image](https://user-images.githubusercontent.com/91023374/146194926-050c287f-022d-4d23-9cb0-3ce825c31c64.png)

Cada grupo podrá usar un comodín de ayuda a otro grupo para comparar soluciones, intercambiar información, ideas... trabajo colaborativo!!!!!





## Entrega voluntaria

El programa podrá entregarse en el aula virtual (los fuentes y el jar).

Dicha entrega puede ser individual (porque hayas avanzado solo), por parejas, por el grupo original u otro grupo que hayáis creado....

Quienes como reto personal (individual o grupal) hayan terminado esta actividad pueden entregarla y a la vuelta de vacaciones iremos ejecutando los diferentes Sudokus para jugar en clase.

No es una actividad evaluable. Es una cuestión personal el haber superado el reto.

La entrega está en la sección principal del curso en el aula virtual:


![image](https://user-images.githubusercontent.com/91023374/146826786-7b55f128-791e-4125-b78a-aafce4c15080.png)

