# Ejercicio sobre empresa de mensajería

La empresa de mensajería BiciExpress, que reparte en bicicleta, para disminuir el peso que trasportan sus empleados solo utiliza cajas de cartón.

El volumen de estas se calcula como el 80% del volumen real, con el fin de evitar que se deformen y se rompan.

Otra característica de las cajas de cartón es que sus medidas siempre están en centímetros.

Por último, la empresa, para controlar costes, necesita saber cuál es la superficie total de cartón utilizado para construir todas las cajas.

**Escribe la clase CajaCarton heredando de la clase Caja.**

## Notas

Las cajas una vez creadas no se pueden modificar sus dimensiones, lo único que se puede cambiar es el texto de la etiqueta que lleva pegada. 

Siempre guardaremos las dimensiones en metros.


Una caja de cartón no es más que una caja, con algunas características, como:
- Las cajas de cartón utilizan como unidad de medida estándar el cm.
- Es necesario controlar guardar el area de la superficie de la caja.
- Y tenemos que acumular, para todas las cajas de cartón, el cartón total utilizado

Aunque el volumen de una caja de cartón coincida con el volumen de una caja, en la práctica, para evitar roturas, se calcula el volumen "práctico" como un 80% del volumen real:

El volumen de una caja sería: ancho * alto * fondo

![image](https://user-images.githubusercontent.com/91023374/150564138-e30227f1-6c2c-405e-84c2-d8f29db2b593.png)
