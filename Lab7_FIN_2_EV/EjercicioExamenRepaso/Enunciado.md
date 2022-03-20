Es necesario gestionar al **personal fijo** y al **personal temporal** de la empresa. 

Deberás implementar las clases que consideres necesarias y la jerarquía entre ellas. Partes de una clase llamada **Empleado.java** que debes de completar.

Revisa la clase de **Utilidades.java** proporcionada para el examen. Tiene dos métodos que te serán de utilidad.

- Para tener control del número de empleados dados de alta en el sistema, debes utilizar un contador que se pueda consultar en cualquier momento.

- Sobreescribe adecuadamente los métodos heredados de Object (toString, hashCode, equals).

- Los empleados podrán ordenarse de forma natural por el DNI.

## Particularidades entre tipos de empleados

- El empleado con contrato fijo, además tiene un plan de pensiones que es un importe de dinero que se le va acumulando para su jubilación (atributo importePlanPensiones de tipo double). Este valor se podrá modificar en un futuro.
- El empleado temporal no tiene dicho plan de pensiones pero sí una fecha que indica el fin de contrato (fechaFinContrato). La fecha será de tipo String con el formato YYYY-MM-DD. Esta fecha no podrá modificarse en un futuro.

Sobreescribe el método toString para que se muestre toda la información de cada tipo de empleado. Utiliza la clase StringBuilder para montar la cadena de texto resultante.

Todos los empleados reciben una paga extra, pero la forma en calcular su importe es totalmente diferente:

- En el caso del empleado temporal es necesario obtener el número de días de contratación, que son los días entre la fecha de inicio de contrato y la fecha fin de contrato.
- En el caso del empleado fijo es necesario obtener un valor entero, siendo:
  - valor 3, para empleados fijos con categoría DIRECTIVO.
  - valor 2, para empleados fijos con categoría SENIOR.
  - valor 1, para empleados fijos con categoría JUNIOR.

Desarrolla según corresponda el método **calcularFactorPagaExtra**, común a todos los empleados, que devuelve un entero pero con una lógica diferente según el tipo de empleado.

## Dar de alta a un empleado

Para dar de alta a un empleado consideramos que todos los campos se introducen correctamente, no hay que validarlos, salvo del DNI.

Antes de dar de alta a un empleado hay que comprobar previamente que el DNI esté compuesto por 8 dígitos y una letra en mayúsculas al final. 

La clase Empleado tendrá un método estático llamado **checkDNI** que realizará dicha comprobación: *static [void] checkDNI(String dni)*

En el caso de que el DNI no sea correcto el método propagará una excepción **FormatoDNIException** y no se procederá a crear al empleado en el sistema. 

Dicha excepción tiene un atributo correspondiente al DNI incorrecto. El mensaje devuelto por el método getMessage será:

*“El DNI  XXXXXXXX tiene un formato incorrecto. Debe empezar por 8 dígitos y acabar con una letra en mayúsculas”*

Crea un único empleado en la clase Examen2ev y haz las pruebas oportunas.


## Manejando la lista de empleados

Para la realización del ejercicio se te proporciona una **clase DAO**. 

En la clase principal ejecutable Examen2ev debes obtener los empleados y crear tu propio ArrayList para:

- **Mostrar todos los empleados según la ordenación natural pero en orden descendente.** Por cada empleado debe mostrarse también la información devuelta por el método calcularFactorPagaExtra

- **Mostrar los empleados ordenados por apellido1, apellido2 y nombre.**

- **Eliminar de la lista de empleados aquellos que sean temporales y cuya fechaFinContrato sea “2022-04-01”.** Volver a mostrar la lista de empleados actualizada.





