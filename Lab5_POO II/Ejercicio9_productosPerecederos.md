
# Nos piden hacer que gestionemos una serie de productos.

Los productos tienen los siguientes atributos:

- Nombre
- Precio

Tenemos dos tipos de productos:

- *Perecedero:* tiene un atributo llamado días a caducar
- *No perecedero:* tiene un atributo llamado tipo con valores ("Sin devolución", "Permite devolución");

Crea sus constructores, getters, setters y toString.

## Función calcular
Tendremos una función llamada *calcular*, que según cada clase hará una cosa u otra, a esta función le pasaremos un numero siendo la cantidad de productos.

En **Producto**, simplemente seria multiplicar el precio por la cantidad de productos pasados.

En **Perecedero**, aparte de lo que hace producto, el precio se reducirá según los días a caducar:

- Si le queda 1 día para caducar, se reducirá 4 veces el precio final.
- Si le quedan 2 días para caducar, se reducirá 3 veces el precio final.
- Si le quedan 3 días para caducar, se reducirá a la mitad de su precio final.

En **NoPerecedero**, hace lo mismo que en producto.

Crea una clase ejecutable y crea un array de productos y muestra el precio total de vender 5  productos de cada uno. Crea tú mismo los elementos del array.

## Pregunta: ¿Utilizarías una clase abstracta? Razona la respuesta

# NUEVOS REQUISITOS

## REQUISITO 1
Debemos ampliar el programa anterior de tal forma que TODOS los productos deben poder devolverse al proveedor.

- Si son **perecederos** solo pueden devolverse cuando le queda más de 5 días para caducar.
- Si **no son perecederos** solo pueden devolverse en el caso de que el tipo sea "Permite devolución".

### Pregunta: ¿Utilizarías una clase abstracta? ¿Qué método sería abstracto? Razona la respuesta

## REQUISITO 2
Todos los productos, al igual que todos los clientes y proveedores (producto, cliente y proveedor son clases del programa de gestión de la tienda) deben poder exportarse a formato XML.

Para ello existe una clase con un método estático llamado **ConvertObjectToXML** que necesita recibir el objeto a convertir a XML y que invocará al método **convertir2XML**.

Este método devuelve un String con el formato del xml de cada objeto (tipo plantilla).

El xml en el que se convierten los productos, clientes y proveedores son diferentes.

### Ejemplos de String devuelto por cada clase:

#### XML de productos

&lt;producto&gt;&lt;producto&gt;
  
#### XML de clientes
&lt;cliente&gt;&lt;cliente&gt;
  
#### XML de proveedores
&lt;proveedor&gt;&lt;proveedor&gt;

### Pregunta: ¿Utilizarías una interface? Razona tu respuesta

No se pide programar las clases Cliente, Proveedor, pero sí la interface y su implementación en la clase Producto.
