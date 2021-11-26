# Concesionarios de coches de segunda mano

Debemos desarrollar un programa para la gestión de coches de segunda mano de una multinacional que los tiene distribuidos en diferentes concesionarios.

![image](https://user-images.githubusercontent.com/91023374/143604182-a37ac9e9-896b-4dc8-91ee-e6fc2a8bbe21.png)


## Clase Concesionario
**ATRIBUTOS**
La información necesaria de cada concesionario es:

- Identificador: de tipo String.
- Nombre.
- Localidad.
- Teléfono.
- Nombre completo de la persona de contacto del concesionario.

**CONSTRUCTOR**

Obligatoriamente hay que especificar todos los datos antes descritos.

**GETTERS & SETTERS**

Debemos permitir con todos los datos se puedan modificar, salvo el identificador del concesionario.

**OVERRRIDE TOSTRING()**

Es necesario mostrar toda la información del concesionario en este método.

## Clase Coche

Por otro lado, cada uno de los coches de segunda mano pertenecerá a un concesionario.

**ATRIBUTOS**

Un coche estará compuesto de:

- Concesionario al que pertenece.
- Matricula
- Número de puertas
- Marca
- Kilómetros
- Precio

**CONSTRUCTOR**

Podemos dar de alta un coche de tres formas:

- Con todas sus propiedades o atributos.
- Con solo el concesionario, matrícula y precio.
- Con solo el concesionario y la matrícula: en este caso habrá que calcular el precio por defecto del coche en base a la matrícula.

**GETTERS & SETTERS**

Debemos permitir que se modifique todos los datos del coche excepto la matrícula.

**OTROS MÉTODOS**

Al precio de un coche se podrá aplicar un descuento.

**OVERRRIDE TOSTRING()**

Es necesario mostrar toda la información del coche.
