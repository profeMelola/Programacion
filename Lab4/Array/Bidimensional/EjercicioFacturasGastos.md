# Modificación del ejercicio de Facturas y Gastos (doble bucle anidado) para practicar con Arrays
## Instrucciones
1. Lee atentamente el enunciado del ejercicio https://github.com/profeMelola/Programacion/blob/main/Lab2/bucleAnidado/FacturasGastos/Facturas%20y%20Gastos.md
2. Manteniendo el enunciado del programa, debes modificar la lógica del mismo para trabajar con un array bidimensional (matriz)
3. Para ello ten en cuenta que :
- Necesitas crear un array de N filas (donde N es el número de facturas) y M columnas (donde M es el número de gastos por factura).
- Recuerda que el número de facturas (N) las indicará el usuario y que el número de gastos por factura es variable (M) y también lo introducirá el usuario 

4. Métodos nuevos que debes implementar:

**imprimeFacturas**

Este método debe mostrar por pantalla el contenido del array bidimensional


**obtenerImporteTotalGastosFactura**
Este método debe devolver el importe total de gastos de una factura concreta

**obtenerImporteTotalFacturas**
Este método debe devolver el importe total de gastos de todas las facturas

## Ejemplo de salida por consola tras la ejecución del programa

![image](https://user-images.githubusercontent.com/91023374/137726338-07b443a4-0d3d-4a28-adea-093e46aa3d4a.png)



## Ayuda teórica. Repaso de conceptos

![image](https://user-images.githubusercontent.com/91023374/137719700-dabd81f2-f023-4302-b5d5-00d2602ecb81.png)


**PISTAS: Declaración de un array bidimensional**

// Cuando se sepa el número de facturas. Declaración del array bidimensiona

float[][] facturas = new float[numFacturas][];

// Todavía no se sabe el  número de gastos por factura

float[] gastos = null;

// Cuando se sepa el número de gastos por factura

gastos = new float[numGastos];

facturas[indice] = gastos; //inicializando cada posición del array de facturas con otro array.

