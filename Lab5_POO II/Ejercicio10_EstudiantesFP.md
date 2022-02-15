Vamos a realizar una aplicación que es capaz de gestionar los estudiantes de Grados de Formación Profesional. 

En nuestro caso concreto haremos las pruebas con el Grado de DAW. Los Grados tienen dos cursos con sus correspondientes asignaturas. 

Cada Asignatura tiene las siguientes características: código numérico de la asignatura, nombre, curso (número) al que pertenece, grado al que pertenece, horas y nota (que puede tener decimales). 

Creamos el correspondiente objeto, teniendo en cuenta que en el momento de crear la asignatura no conocemos la nota. 

Redefiniremos el método toString() para que muestre los parámetros del objeto. 

Para definir los estudiantes nos fijamos en que cualquier perfil de estudiante (sea de primero o de segundo), tiene las siguientes características y métodos. NombreyApellidos, grado que estudia, DNI, el número máximo de asignaturas que puede matricularse (aunque éste varía dependiendo si cursa primero o segundo), las asignaturas en las que está matriculado (que como requisito será un array de Asignatura), el curso en el que está matriculado, y la nota media. 

El número de matrícula será una variable que se va incrementando según se van creando estudiantes en el programa. 

Implementa los siguientes métodos: 

public double getNotaAsignatura(int codigoAsignatura); Recibe como parámetro el código de la asignatura. 

public void ponerNotaAsignatura(int codigoAsignatura, double nota); Recibe como parámetro el código de la asignatura y la nota. 

public String mostrarAsignaturasMatriculadas(); 

Redefine el método toString para mostrar la siguiente información: 

Estudiante Nombre y Apellidos=XXXX, grado=XXX, DNI=XXXX, numMat=XX Número máximo de asignaturas para matricular =XX Asignaturas Matriculadas xxxx (utilizará el método mostrarAsignaturasMatriculadas()) 

Implementará de forma abstracta los siguientes métodos:

abstract boolean matricularAsignatura(int codAsignatura); 

 abstract double calcularNotaMediaCurso(); 

Un alumno de primero, es un estudiante que implementa los métodos abstractos de la siguiente forma: 

Tiene un array con el catálogo de las asignaturas de primero, que se inicializa en el momento de la instancia (simulando una conexión a una base de datos que es AsignaturasSimulaBBDD) 

matricularAsignatura(int codAsignatura).

 Recibe por parámetros el código de la asignatura. Busca en el catálogo de las asignaturas de primero la asignatura y la añade al array de asignaturas), siempre que no haya llegado al límite de asignaturas en las que se puede matricular. 

calcularNotaMediaCurso(); Calcula la nota media de todas las asignaturas en las que está matriculado . 

*******

Un alumno de segundo , es un estudiante que implementa los métodos abstractos de la siguiente forma: Tiene un array con el catálogo de las asignaturas de primero, que se inicializa en el momento de la instancia (simulando una conexión a una base de datos que es AsignaturasSimulaBBDD), y un array con las asignaturas de segundo, que se instancia de la misma forma que el anterior. 

matricularAsignatura(int codAsignatura) Recibe por parámetros el código de la asignatura, en este caso puede matricularse tanto de asignaturas de primero como de segundo, por tanto, busca en el catálogo de las asignaturas de primero y de segundo la asignatura y la añade al array de asignaturas), siempre que no haya llegado al límite de asignaturas en las que se puede matricular. 

calcularNotaMediaCurso(); Calcula la nota media de todas las asignaturas en las que está matriculado de segundo. Las asignaturas de primero como son pendientes no cuentan para la nota media del curso. 

En ambos casos, estudiante de primero y estudiante de segundo, redefinen los métodos toString para mostrar 

Estudiante Nombre y Apellidso=XXXX, grado=XXX, DNI=XXXX, numMat=XX Número máximo de asignaturas para matricular =XX Asignaturas Matriculadas xxxx (utilizará el método mostrarAsignaturasMatriculadas()) Número total de asignaturas matriculadas = xx Nota media del curso: 

Para probar el funcionamiento del código, se realizará una instancia de EstudiantePrimero y una Instancia de EstudianteSegundo. Les matricularemos de dos asignaturas a cada uno. Les pondremos las notas de las asignaturas en las que les hemos matriculado, y después llamaremos al método toString de ambos para comprobar el resultado.
