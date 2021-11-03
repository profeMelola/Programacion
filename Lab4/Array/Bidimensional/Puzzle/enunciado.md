# PUZZLE - Juego de palabras

Nuestro objetivo es crear una aplicación que genere un  puzzle de letras partiendo de una lista de palabras. 

La condición es que todas las palabras de la lista tengan el mismo número de letras en forma de una tabla (como aparece en la figura) 

![image](https://user-images.githubusercontent.com/91023374/138914319-ee9cf0d9-675a-46bf-8502-226334b13f69.png)

En este caso tenemos 5 palabras, cada una de 5 caracteres.

Cada  caracter de cada palabra está representado por una imagen, tal y como lo puedes observar en la primera tabla.

Debes desarrollar un programa que:

- primero construya el puzzle de letras (primera tabla) y lo muestre al usuario.
- después realice el cambio de caracteres. Dicho cambio consiste en intercambiar dos posiciones de forma aleatoria en cada una de las columnas de la tabla (puzzle)
Por tanto se intercambia de cada columna dos filas de forma aleatoria.

La segunda tabla de la ilustración muestra un ejemplo de dicho intercambio aleatorio.

- el programa mostrará la nueva tabla con los caracteres intercambiados.

El usuario deberá indicar al programa que posiciones de la tabla hay que intercambiar para obtener las palabras correctas.

Para ello el programa pedirá al usuario que indique la posición inicial y posición final a intercambiar por cada columna.

Finalmente mostrará la tabla resultado obtenida según lo especificado por el usuario y le dirá si ha acertado.


**Recopilando, la aplicación deberá:**

- "desordenar" algunas letras de la siguiente forma Para cada una de las columnas de la matriz que es nuestro puzzle intercambiará dos posiciones (solo 2) de forma aleatoria.

-  Después daremos al usuario la oportunidad de volver a colocar el puzzle para que acierte las palabras originales, de forma que le preguntaremos la columna sobre la que va a realizar el intercambio y las dos posiciones que quiere intercambiar en esa columna. 

- Cada vez que el usuario haga un cambio, la apliación comprobará si la solución es correcta.

- El número de oportunidades que le damos al usuario es infinito. Hasta que encuentre la solución
