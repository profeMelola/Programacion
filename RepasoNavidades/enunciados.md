# Ejercicio 1

## Enunciado

**Debes desarrollar un programa para la gestión de facturas.**

Al iniciar el programa se debe poder introducir el número de facturas que se van a gestionar. 

Después, por cada factura debemos introducir el número de gastos que están incluidos en cada factura y el importe de cada uno de ellos (puede ser decimal). Pregunta al usuario y almacena esa información en la estructura de datos que consideres adecuada 

Hay que tener en cuenta que cada factura puede tener un número diferente de gastos.

Una vez introducidos los gastos de cada factura, el programa debe mostrar un MENÚ con diferentes opciones:

- INFORME COMPLETO: Obtener informe con los gastos de cada factura, el importe final de la factura y el importe total de todas las facturas.
- INFORME FACTURA: Obtener información de todos los gastos de una factura en concreto (que especificará el usuario por número), ordenados de mayor a menor, indicando el número de gastos totales y el importe total.
- BUSCAR GASTO: Obtener información de la factura o facturas donde se encuentra el importe de un gasto en concreto que especificará el usuario

**Especificaciones del menú:**
- El formato del menú y las preguntas/respuestas es libre, pero debes incluir en el menú las 3 opciones, antes descritas, y la opción de salir.
- El menú debe mostrarse al usuario hasta que elija la opción de salir. En ese caso el programa se cerrará.
- En el caso de introducir una opción incorrecta debe avisar y no salir.

# Objetivos
- Practicar con arrays, concretamente array de arrays.
- Saber leer por consola.
- Hacer y gestionar menús.
- Dominar bucles, sentencias condicionales, tipos primitivos de datos, métodos estáticos.
- Uso de la clase Arrays
- ....

**Deberías poder realizar este ejercicio en 1h 30 minutos**

# Ejercicio similar: gestión de notas de alumnos

https://github.com/profeMelola/Programacion/blob/main/Lab4/Array/Bidimensional/notasAlumnos/instrucciones.md

https://github.com/profeMelola/Programacion/blob/main/Lab4/Array/Bidimensional/notasAlumnos/ArraydeArrays/enunciado.md

https://github.com/profeMelola/Programacion/blob/main/practicasEnClase/EjercicioArrayDeArrays/enunciado.md


# Ejercicio 2: POO

## Enunciado

Debes desarrollar un programa para crear cuentas de usuario. 

Para ello implementa dos clases, una llamada User y otra llamada Password,  que cumplan los siguientes requisitos:

### Clase Password

Estará compuesta por:

- longitud: todas las password tendrán una longitud mínima de 6 caracteres.
- contraseña: cadena de texto.

Se podrán crear objetos Password de dos formas:

- Por defecto sin indicar la contraseña. En este caso el programa generará automáticamente  la contraseña.
- Indicando la contraseña. En este caso habrá que validar que dicha contraseña es fuerte. Si no es fuerte el usuario recibirá un aviso  y el programa terminará.

No podrá modificarse la contraseña una vez creado el objeto.

En base a lo descrito, la clase por tanto tendrá además dos métodos:

**esFuerte:** método para comprobar que la contraseña introducida es fuerte. Para que sea fuerte  la contraseña se deben cumplir las siguiente condiciones: 
- empezar con una vocal en mayúsculas
- acabar con uno de estos tres carácteres $  &  * 
- contener exactamente el texto  DAW en cualquier parte de la contraseña.
- como mínimo una longitud de 6

Cuando no se cumpla alguna condición se mostrará un mensaje por consola indicando al usuario las condiciones que no se cumplen en su contraseña. 

**generarPassword:**  método que genera una contraseña automáticamente y de forma aleatoria. Lógicamente la contraseña generada automáticamente cumplirá las condiciones para que sea fuerte. 


## Clase User

Estará compuesta por:

- login: cade de texto.
- pwd: objeto tipo Password.

Se podrán crear objetos Login especificando el login, siendo pwd opcional. En este caso, si no se especifica pw se creará una por defecto.

No podrá modificarse ni el login ni el pwd.

## Clase principal ejecutable

Debes programar el menú para que el usuario pueda introducir los datos con los que se crearán los correspondientes objetos Password y User. 

Al ejecutar el programa debe mostrarse dicho menú y una vez creada la cuenta debe cerrarse el programa.

Crea objetos en base a los diferentes casos de prueba:

- No se indica contraseña por tanto se crea una por defecto. 
- Se indica la contraseña y cumple con los requisitos de contraseña fuerte.
- Se indica la contraseña y no cumple con algunos o todos los requisitos de contraseña fuerte. Se avisa al usuario de las condiciones que no cumple su contraseña.


**Deberías poder realizar este ejercicio en 1h 15 minutos**


# Ejercicio 3

## Juego de azar (ORIENTACIÓN A OBJETOS)
Un juego de azar tiene  3  bolas . El funcionamiento de las bolas es el siguiente, al lanzarlas cada bola puede devolver un valor entre 0 y nueve y además en cada tirada  cada bola tiene un valor de la puntuación o premio que puede ser desde 0 a 100 puntos. 

Se  lanzan las  tres bolas, anotando el resultado de la suma de las puntuaciones cada una, y además  y  se comprobará :

Si sale dos veces la misma bola  (por ejemplo tirada = 4 4 0 )  multiplica el valor de premio  x 2.  

Ejemplo: bola 1: número 4, puntuación 15.

                 bola2: número 4, puntuación 26,

                 bola3: número 0, puntuación 100.

Puntuación  (15+26+100) *2.

 

Si sale tres veces la misma bola (por ejemplo tirada = 4 4 4)  anota el valor del premio x3.

Ejemplo: bola 1: número 4, puntuación 15.

                 bola2: número 4, puntuación 26,

                 bola3: número 4, puntuación 100.

Puntuación  (15+26+100) *3.

 

En una ronda se hacen3 tiradas (cada una de tres bolas).

Calcula la puntuación de la ronda.

**Calificación del ejercicio:**

Se valorará para conseguir la puntuación máxima de cada apartado (orientación a objetos, encapsulado de variables y métodos, comentarios en el código)

### Completar el ejercicio, de forma que nos muestre por pantalla el resultado  de la primera tirada.

RESULTADO DE LA TIRADA: 1

Tirada: 4 4 7

Puntuación: 67 88 18

El premio es 173

 

Completar el ejercicio de forma que nos muestre por pantalla el resultado de las tres rondas: (2 puntos)



RESULTADO DE LA TIRADA: 1

Tirada: 4 4 7

Puntuación: 67 88 18

El premio es 173

 Premio acumulado tras la ronda:  1: 173

RESULTADO DE LA TIRADA: 2

Tirada: 6 2 6

Puntuación: 90 9 84

El premio es doble 

El premio es 366

 Premio acumulado tras la ronda:  2: 539

RESULTADO DE LA TIRADA: 3

Tirada: 0 3 7

Puntuación: 31 85 73

El premio es 189

 Premio acumulado tras la ronda:  3: 728
