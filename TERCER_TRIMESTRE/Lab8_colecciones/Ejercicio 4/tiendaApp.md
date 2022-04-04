# Enunciado (BORRADOR.... PENDIENTE COMPLETAR ESPECIFICACIONES....)

Queremos hacer la aplicación de una tienda.

La tienda estará compuesta por un listado de clientes.

## Lista de clientes

Lista de clientes utilizando su número de teléfono como clave para almacenar cada uno de los cliente. 

## Cliente

Atributos: DNI, nombre, apellidos, teléfono, una colección con los tickets que tiene (es decir) las compras que ha hecho.  

Y se van a almacenar como número de ticket y ticket.


## Ticket

- Tiene número de ticket

- Fecha de compra

- Total (que será un número calculado dependiendo de las líneas que tenga). 

El ticket tiene un número indeterminado de líneas (lo vamos a implementar como objeto). 

Cada línea tendrá la cantidad, el producto (objeto que definiremos más adelante), importe.

Se pueden repetir líneas. 

## Producto

Producto almacenará la categoría (ej. alimentación, droguería..), nombre, marca, precio sin iva, tipoIva y su abreviatura, codigoBarras.. 


