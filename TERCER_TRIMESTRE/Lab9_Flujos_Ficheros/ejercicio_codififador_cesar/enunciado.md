# Ejercicio para practicar con los paquetes java.io y java.nio

## Codificación César

LA CODIFICACIÓN CÉSAR ES AQUELLA QUE TRANSFORMA UN MENSAJE, CAMBIANDO CADA LETRA POR AQUELLA QUE OCUPA 3 POSICIONES DESPUÉS EN EL ABECEDARIO.

ESTE PROGRAMA IMPLEMENTA DICHA CODIFICACIÓN, TRANSFORMANDO UN FICHERO DE TEXTO.

ES UN ALGORITMO DE CIFRADO SIMÉTRICO.

![image](https://user-images.githubusercontent.com/91023374/161616397-f83febf2-0200-4e2e-9c9b-73481721bbee.png)


## Instrucciones

1. Se proporciona un zip con la clase CodificadorCesar.
2. Tal y como hemos visto en clase, a partir de un fichero mensaje.txt con el mesaje a cifrar, se genera un mensaje_cifrado.txt
3. Ejecútalo y comprueba que funciona correctamente.
4. Debes realizar los siguientes cambios al código fuente:
  - Modificar la forma de creación del BufferedReader y BufferedWriter utilizando la clase Files y la interface Paths y objetos Paths que consideres necesario (son del paquete java.nio)
  - El algoritmo de cifrado debes de mantenerlo, no es necesario modificarlo pero crea un método separado para tener el código más legible. Recuerda que solo se desplaza el carácter tres posicicione si es una letra.
  - Cambia el try... catch... finally clásico por un try... catch con recursos (donde no es necesario cerrar los búfferes).
  
  Ejemplo de try... catch con varios recursos:
  ```
          try(BufferedInputStream bin = new BufferedInputStream(new FileInputStream("image.jpg"));
                BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("image_copy.jpg"));){
                ....
                }
  ```

  
  - Implementa el algoritmo de descifrado en un método separado, de forma que pasando el fichero mensaje_cifrado.txt se obtenga el mensaje original.
  
  
