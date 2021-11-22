# Enunciado

La clase Alumno tiene como atributos: 

- nombre
- apellido1
- apellido2
- matriz de notas: array bidimensional con 6 filas (6 módulos) y 4 columnas (4 notas cada módulo: 1 ev, 2 ev, 3 ev, final)

Es obligatorio indicar el nombre y primer apellido. El segundo apellido es opcional.

La matriz de notas se inicializará por su correspondiente método set. La nota final de cada módulo se calculará con un método correspondiente. Este método sumará las 3 notas de las 3 evaluaciones y calculará la nota media guardando ese valor en la última posición del vector.

**Métodos a implementar**

- *Constructores* acordes al enunciado.
- *Setting & gettings* correspondientes.
- *toString()* sobreescrito.
- *mostrarNotas():* muestra la matriz de notas (notas de todos los alumnos)
- *mostrarNotasModulo(int modulo):* muestra el array con las notas del módulo especificado.
- *mostrarNotasOrdenadas(int modulo):* muestra notas ordenadas de un módulo concreto.
- *calcularNotaFinal(int modulo):* calcula la nota final en base a la nota de las 3 evaluaciones y la carga en la posición última de cada fila.
- *calcularNotaFinal():* calcula la nota final de todos los módulos


