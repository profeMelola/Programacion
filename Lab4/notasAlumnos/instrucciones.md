# Actividad para practicar con arrays

## Versión 1: sin arrays

#### Desarrolla un programa que gestione 5 notas de un alumno (notas con decimales) y calcule la media de esas cinco notas

- Utiliza variables primitivas (todavía no sabemos utilizar los arrays)
- Puedes inicializar esas variables con notas fijas o pedirlas que las introduzca el usuario
- Crea un método estático o función para calcular la media de las notas
- Muestra la media por pantalla

## Versión 2: con arrays

#### Desarrolla un programa que haga lo mismo que en la versión 1, pero con el uso de arrays

- El array debe ser inicializado de tamaño 5
- Debes modificar la lógica del programa para acceder a las notas introducidas en el array
- Modifica a función para calcular la media de las notas
- Muestra la media por pantalla

## Versión 3: el tamaño del array lo especifica el usuario (tamaño variable)

#### Desarrolla un programa que gestione las notas de un alumno y calcule la media de esas notas

- El tamaño del array no será 5, sino el tamaño que intruzca el usuario por consola
- Las notas las irá introduciendo el usuario por consola, de forma que si decide gestionar 10 notas, el programa deberá pedir que el usuario introduzca por consola 10 notas que servirán para inicializar el array
- Haz los cambios pertinentes a la lógica del programa
- Muestra la media por pantalla

**¿Ves la diferencia y el beneficio de trabajar con arrays como contenedor o colección de elementos del mismo tipo?**

## Versión 4: para practicar más con arrays

Debes mostrar por pantalla un mensaje de texto en base a la nota media obtenida.

- Crea un array de String con los siguientes mensajes:

1 = Debes estudiar mucho mucho más

2 = Debes estudiar mucho más

3 = Debes practicar

4 = Casi apruebas

5 = Aprobado

6 = Bien

7 = Muy bien

8 = Notable

9 = Sobresaliente

10 = Perfecto

- La nota media obtenida debes redondearla a un entero (recuerda que es un decimal). Al convertir un double a un entero se hará automáticamente ese redondeo.

- En base a la nota media debes acceder al array a la posición concreta. Por ejemplo, si la nota media es 4.6 (en decimal) la posición del array será la cuarta ( 4 redondeado) y en dicha posición estará el mensaje "Casi apruebas". Ten en cuenta que las posiciones de los arrays empiezan en el 0. Por tanto la frase "Casi apruebas" estará en la posición cuarta que es el índice 3 del array
