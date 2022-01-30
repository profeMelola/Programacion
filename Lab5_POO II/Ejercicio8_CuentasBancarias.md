# Entidad bancaria

Una pequeña entidad bancaria, de ámbito local y familiar, nos ha pedido digitalizar su operativa de trabajo, diseñando un programa que le permita realizar intercambios de dinero entre sus clientes.

Esta entidad tiene dos tipos de cuentas bancarias: 

**- CuenteCorriente.**

**- CuentaDeposito.**

## Ambos tipos tienen las siguientes características y funcionalidades:

Una **Cuenta** pertenece a un único **CLIENTE** (solamente un titular), dispone de un identificador de cuenta y una cantidad de dinero disponible en la cuenta (saldo) y una lista de movimientos (en esta lista solo se guardan las cantidades).

Cuando se crea una cuenta se creará el identificador  y es obligatorio que tenga  titular (que no podrán cambiar nunca)  y el banco. 

El saldo será de 0 euros y la cuenta no tendrá movimientos asociados.


La información que almacenamos del **BANCO** es su nombre , su numero de entidad (4 digitos), número de oficina(4 digitos), dirección de la oficina  (entidad + oficina son 8  dígitos, que se corresponden con los 8  primeros dígitos del id de la cuenta).

Por ejemplo, si mi número de cuenta podría ser: 0049 1111 222233334444, el código de banco sería el 0049., oficina 1111.  


**El saldo solo puede variar cuando se produce un ingreso (entra dinero en la cuenta) o una retirada (sale dinero de la cuenta).**

En ambos casos se deberá registrar la operación en los movimientos. Los ingresos y retiradas solo pueden ser de valores superiores a cero.

### Cuenta Corriente

El saldo de una **CuentaCorriente** nunca podrá ser inferior a -50 euros. 

Si se produce un movimiento que deje la cuenta con un saldo negativo (no inferior a -50) habrá que mostrar el mensaje “AVISO: Saldo negativo”. 

Si se produce un movimiento superior a 3.000 euros se mostrará el mensaje “AVISO: Movimientos superiores a 3000”.

### Cuenta depósito

En el momento de crear la **CuentaDeposito** es necesario definir los importes que se pueden  aportar/retirar en cada movimiento ( p.e si se define 3000 solamente se podrán hacer retiradas de este importe o aportaciones al depósito por ese importe).

El saldo de una CuentaDeposito nunca podrá ser inferior a  0 euros.   

Si se produce un movimiento superior a 3.000 euros se mostrará el mensaje “AVISO: Movimientos superiores a 3000”.


### Cliente

De cada **Cliente de la entidad**, deben almacenar su nombre, apellidos, su DNI (es el identificador de cada persona), su dirección y su teléfono.


## Esta entidad, tiene tres tipos de operaciones que se pueden realizar entre dos cuentas:

**TRANSFERENCIA:** Se considera transferencia el intercambio de dinero de una CuentaCorriente (origen) a otra CuentaCorriente (destino) de diferente banco o a otro titular que tenga cuenta en el mismo banco.

Por ejemplo, un usuario envía 50€ de su cuenta a otra cuenta de un amigo con distinto identificador bancario (de La Caixa al Santander).

El segundo ejemplo sería enviar 50€ a un amigo que tiene la cuenta en el mismo banco que tú, por lo que tendría el mismo identificador bancario.

No haría falta indicarlo, pero el usuario que envía los 50€, se le extraerían del dinero disponible de su cuenta, y al usuario que se le envía, se les añadiría.

En el momento de hacer la transferencia es necesario indicar cuenta de origen, cuenta destino, importe y titular de la cuenta destino)

Además, antes de hacer la transferencia, se comprueba que el titular de la cuenta destino, coindice con el titular del número de cuenta facilitado.

**TRASPASO:** Se considera traspaso el intercambio de dinero de una CuentaCorriente (origen) a otra CuentaCorriente (destino), del mismo CLIENTE y del mismo BANCO en los dos casos.

Por ejemplo, un usuario se envía 50€ a otra cuenta de su propiedad, que tiene en este mismo banco.

**MOVIMIENTO DEPÓSITO:** Se considera movimiento de depósito el  realizar un traspaso de dinero de una CuentaCorriente a una CuentaDeposito del mismo CLIENTE y del mismo BANCO, o el traspaso de una CuentaDeposito  a una CuentaCorriente del mismo CLIENTE y del mismo BANCO.

En caso de que todo vaya bien, el resultado de una TRANSFERENCIA o TRASPASO o MOVIMIENTO, será un valor booleano que nos indique si la operación se ha realizado con éxito (true) o no se ha podido realizar (false).


## Otras acciones
Además es posible actuar sobre una Cuenta  con las siguientes acciones:

**MotrarDatos:** Mostrará el número de cuenta, titular y el saldo.

**Mostrar cuenta:** Mostrará el número de cuenta.

**Saldo:** Mostrará el saldo disponible.

**Ingreso:** Pedirá la cantidad a ingresar y realizará el ingreso si es posible.

**Retirada:** Pedirá la cantidad a retirar y realizar la retirada si es posible.

**Movimientos:** Mostrará una lista con el historial de movimientos.

**Importe aportación/retirada:** Para la CuentaDeposito mostrará el importe establecido para aportaciones y retiradas.

Necesitaremos además poder  **mostrar todas las Cuentas (Corriente y Depósito)** que tiene creadas el banco.

**Calcular el saldoTotal disponible  en el banco** (sumatorio del saldo de todas las cuentas).

El importe en depósitos.

Y el importe en las cuentas corrientes.
