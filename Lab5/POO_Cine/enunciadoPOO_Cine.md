# Enunciado ejercicio

**Nos piden hacer un programa orientado a objetos sobre un cine (solo de una sala).**

Esa **sala** tiene un conjunto de asientos (8 filas por 9 columnas, por ejemplo).

Del **cine** nos interesa conocer la película que se está reproduciendo y el precio de la entrada en el cine.

De las **películas** nos interesa saber el título, duración, edad mínima y director.

Del **espectador**, nos interesa saber su nombre, edad y el dinero que tiene.

Los **asientos** son etiquetados por una letra (columna) y un número (fila), la fila 1 empieza al final de la matriz como se muestra en la tabla. 

![image](https://user-images.githubusercontent.com/91023374/145814769-1b1c51d1-db20-47d4-ab2c-41bf664010cc.png)


También deberemos saber si está ocupado o no el asiento.


**Realizaremos una pequeña simulación, en el que generaremos muchos espectadores y los sentaremos aleatoriamente (no podemos donde ya este ocupado).**

En esta versión sentaremos a los espectadores de uno en uno.

Solo se podrá sentar si:

- tienen el suficiente dinero
- hay espacio libre
- tiene edad para ver la película
 
En caso de que el asiento este ocupado le buscamos uno libre.

Los datos del espectador y la película pueden ser totalmente aleatorios.
