# Ejercicio: Descubre la palabra secreta

## Objetivos
- Revisar la clase String y nuevos métodos.
- Repasar Arrays.

## Enunciado
Desarrolla un programa que en base a 4 palabras, genere una palabra secreta.

Para ello va a coger la primera posición de cada palabra y las va a juntar creando una palabra nueva.

Las palabras van a ser: "jamón" "anchoas" "vino" "aceitunas" (nos vamos de tapas!!! :-)

Dicho programa va a pedir al usuario que introduzca la palabra secreta y en caso de que no acierte no va a dejar de preguntar.

## Repaso teoría

*valueOf :* Convierte valores que no son de cadena a forma de cadena.

String numero = String.valueOf(1234); // Convierte el número int 1234 en el String “1234

*ToCharArray  :*  Consigue un array de caracteres a partir de una cadena. De esa forma podemos
utilizar las características de los arrays para manipular el texto, lo cual puede ser interesante para
manipulaciones complicadas.

String s="texto de prueba";
char c[]=s.toCharArray();

