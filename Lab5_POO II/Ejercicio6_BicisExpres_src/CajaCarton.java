package aplicacion8.pkg13;
/*
 * Una caja de cartón no es más que una caja, con algunas características, como:
 * -Las cajas de cartón utilizan como unidad de medida estándar el cm
 * -Es necesario controlar guardar el area de la superficie de la caja
 * -Y tenemos que acumular, para todas las cajas de cartón, el caron total utilizado
*/
public class CajaCarton extends Caja {
   //añadimos nuevos atributos
   static double cartonTotal = 0; //cartón utilizado(cm2) para construir todas las cajas
   protected double area; //area de la superficie de la caja de cartón, en cm2

   //oculto el atributo etiqueta (que en la superclase es una cadena) con un entero
   int etiqueta; //ahora la etiqueta de la caja es un número
   
   CajaCarton(double ancho, double alto, double fondo) {
      super(ancho, alto, fondo, CajaCarton.Unidad.CM); //reutilizamos constructor
      area = 2 * (ancho * alto + ancho * fondo + alto * fondo); //calculamos el área
      cartonTotal += area; //acumulamos el área total de cartón utilizado en las
      //contrucción de todas las cajas
   }

   double getArea() {
      return area; //devolvemos el área
   }

   @Override //sustituimos el método de la superclase
   public double getVolumen() {
      //Aunque el volumen de una caja de cartón coincida con el volumen de una caja, 
      //en la práctica, para evitar roturas, se calcula el volumen "práctico" como un
      // 80% del volumen real:
      return volumen * 0.8; //devolvemos el 80% del volumen
   }
   
   @Override
   public String toString() {
      String result = "Cartón total " + cartonTotal + "cm2\n";
      result += "Área: " + area + "cm2\n";
      result += super.toString(); //aprovechamos el método de la superclase
      return result;
   }
}
