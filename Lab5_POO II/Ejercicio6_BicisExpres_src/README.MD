# NOTAS
La solución propuesta es algo diferente a las pautas explicadas en clase.

- El atributo etiqueta de la clase caja está declarado como público en vez de estar como privado y tener su correspondiente método setter. Es más correcto encapsular los miembros como private, tal y como hacemos en clase.

- Los atributos de la clase Caja están como protected y son accesibles por las clases que hereden o extiendan de Caja. Es correcto o mejor usar los getters correspondientes, aunque entre herencia podemos usar protected y evitar el uso de getters.

- Utiliza tipo enumerado Unidad y debido a que no contiene constructor propio y no es una clase "compleja" se ha creado directamente en la clase Caja así:

public enum Unidad {CM, M}

Es totalmente correcto. No es necesario crear una archivo .java separado
