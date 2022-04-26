# Gestión de una tienda dedicada al alquiler de libros y discos

Debemos realizar parte del software de gestión de una pequeña tienda que se dedica al alquiler de libros y discos antiguos.

Partiendo de la clase **Ejemplar** que se facilita (fuentesInicialesEjercicioTienda.zip), complétala y crea las clases necesarias que permitan las siguientes funcionalidades.

El idEjemplar será un número entero consecutivo, que se le asigna en el momento de incluir el ejemplar en la colección.

El IVA para libros es 4% y para discos es 10%.

El precioAlquiler tanto para libros como para discos es específico del ejemplar (solo hay un ejemplar de cada título (libro o disco).

El alquiler se realiza por el título del ejemplar.

**ALQUILER:** 

Cuando se alquila un libro o un disco será necesario guardar la idCliente en el ejemplar alquilado. 

Si se intenta alquilar un ejemplar que ya está alquilado el método lanzará una excepción ErrorDevolucion  (se define más adelante), con el codigoError 01.

**DEVOLUCIÓN:** 

El método que permite realizar la devolución devolverá el importe a pagar:

En el caso de un libro se calcula aplicando el precioAlquiler * días de alquiler + IVA (correspondiente).

En el caso de un disco el precio es fijo (precioAlquiler), solo se permite el alquiler por un día.

Se aplicará un incremento de 20 euros x día de retraso en la devolución + IVA correspondiente.

En ambos casos, si el cliente que devuelve la cinta es distinto al que la tenía alquilada el método lanzará una excepción ErrorDevolucion, con el códigoError 02.

Si se intenta devolver un ejemplar que no esté alquilado, devolverá una excepción ErrorDevolucion, con el códigoError 03.

La excepción ErrorDevolucion será una extensión de Exception, con dos atributos codigoError y mensaje.

El mensaje lo devolverá según la siguiente tabla:

![image](https://user-images.githubusercontent.com/91023374/165309925-f810e1bc-9e4e-4e4d-a1cf-ab14b6df1dcf.png)

Para realizar las pruebas deberás completar el código de la clase TestMain que se proporciona: (las partes donde falta código están comentadas). 

Usa el DAO que se proporciona.

![image](https://user-images.githubusercontent.com/91023374/165310145-831b1d12-479f-401d-9c74-c84a7d0cbdc0.png)

![image](https://user-images.githubusercontent.com/91023374/165310319-13d6491b-f4f0-4885-9461-562c314b16b4.png)

