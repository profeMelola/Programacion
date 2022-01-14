# Ejercicio POO con herencia (sin clases abstractas ni interfaces)

Codifica la siguiente jerarquía de clases java representada por este diagrama UML

![image](https://user-images.githubusercontent.com/91023374/148693304-5bf43e62-673f-4122-9793-b93c25e9a2ba.png)


## Clase Empleado

La clase base es la clase Empleado. Esta clase contiene:

- Un atributo privado nombre de tipo String que heredan el resto de clases. 
- Un constructor por defecto.
- Un constructor con parámetros que inicializa el nombre con el String que recibe.
- Método set y get para el atributo nombre.
- Un método toString() que devuelve el String: "Empleado " + nombre.

## Resto de clases
El resto de clases solo deben sobrescribir el método toString() en cada una de ellas y declarar el constructor adecuado de forma que cuando la ejecución de las siguientes instrucciones:

![image](https://user-images.githubusercontent.com/91023374/148693408-af97fa49-3837-471a-a5a5-9735795e592e.png)


Den el siguiente resultado:

![image](https://user-images.githubusercontent.com/91023374/148693415-fd3ffd53-dbf9-4cff-bac2-c6cae031a026.png)



