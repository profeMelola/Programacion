# Ejercicio: Descubre la palabra secreta

## Objetivos
- Revisar la clase String y nuevos métodos.
- Repasar Arrays.

## Enunciado
Desarrolla un programa que en base a 4 palabras, genere una palabra secreta.

Para ello va a coger la primera posición de cada palabra y las va a juntar creando una palabra nueva.

Las palabras van a ser: "jamón" "anchoas" "vino" "aceitunas" (nos vamos de tapas!!! :-)

Dicho programa va a pedir al usuario que introduzca la palabra secreta y en caso de que no acierte no va a dejar de preguntar.


## Ejemplo de resultado mostrado por consola:

![image](https://user-images.githubusercontent.com/91023374/138494260-34e86b9a-fc73-4d78-be4d-fad47bca791b.png)

## Ampliación

Modifica el programa anterior para que haga la comparación de las dos palabras (la secreta y la introducida por el usuario) se haga a través de un 
array de chars.

Por tanto convierte ambas palabras a un array de chars (revisa el apartado de teoría de este ejercicio).

Programa el método necesario para que haga esa comparación de arrays.

## Repaso de teoría

**valueOf:** Convierte valores que no son de cadena a forma de cadena.

String numero = String.valueOf(1234); // Convierte el número int 1234 en el String “1234

**ToCharArray:**  Consigue un array de caracteres a partir de una cadena. De esa forma podemos
utilizar las características de los arrays para manipular el texto, lo cual puede ser interesante para
manipulaciones complicadas.

String s="texto de prueba";

char c[]=s.toCharArray();

