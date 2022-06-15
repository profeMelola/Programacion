Se pretende implementar un control de parkings públicos y privados de Alcalá.

Se definirá una clase Coche que guardará la marca, el modelo, la matrícula y si esElectrico (booleano).


Los parámetros definidos en el momento de crear el coche no podrán ser modificados.  Por tanto, si el coche se crea como esElectrico no podrá modificarse y viceversa.

Se redefinirá el método toString para imprimir las características del vehículo.


Las características comunes a todos los parkings estarán en una clase abstracta Parking, que contendrá un identificador del parking, su nombre, dirección, capacidad, cantidadGanada y una  colección con los coches aparcados.

Todos los parking deben ser capaces de mostrar su porcentaje de ocupación, respecto al total de plazas del propio parking  y la ocupación total de los parking de Alcalá (número de total de plazas ocupadas/ número total de plazas disponibles) .

El identificador de parking será un valor numérico que se obtendrá automáticamente. Para ello puede utilizarse una variable estática que se incrementará cada vez que se cree un parking. Ej: el primer parking tendrá id =1, el segundo id = 2…

Tendrá un constructor que recibirá únicamente el nombre, dirección y la capacidad (que es el número de coches que pueden aparcar dentro).  Cualquiera de estos parámetros podrá modificarse una vez creado el parking.

La tarifa del parking es que cada coche paga 5 €, los coches eléctricos aparcan gratis.  Por lo tanto la cantidadGanada es el número de coches aparcados multiplicado por  la tarifa.

**El array de coches y el número de coches se actualizarán a través de los siguientes métodos, que simularán el comportamiento del parking:

-       [void/boolean] addCoche(Coche): Si el parking no está completo podrá aparcar y se incrementará el número de coches aparcados. En el caso de que el parking esté completo, el método lanzará una excepción del tipo Exception con el nombre del parking y el número de plazas ocupadas.

Se debe guardar la excepción en una colección, de forma que se puedan consultar en cualquier momento.  

-       [void/boolean] deleteCoche(int ): Se eliminará un coche por la posición que ocupa en el parking (es la posición en la colección de datos).

-       int getNumero_Coches(): Obtener el número de coches aparcado.

-       String mostrarCoches(): Mostrar todos los coches aparcados.

o    Coche{marca=Audi, modelo=A4, matricula=0728KGT}

o    Coche{marca=Seat, modelo=León, matricula=2345DRT}

o    Coche{marca=Kía, modelo=Sorento, matricula=1234CSS}

-       String mostrarCochesElectricos(): Mostrar los coches aparcados eléctricos.

o    Coche{marca=Audi, modelo=A4, matricula=0728KGT}

o    Coche{marca=Kía, modelo=Sorento, matricula=1234CSS}

 

 

-       int motrarPorcentajeOcupacionLocal();

-       int motrarPorcentajeOcupacionTotal();

-       método abstracto  double mostrarGananciasTotales () que se implementará en las clases derivadas ParkingPublico y ParkingPrivado, que comparten todas las características descritas hasta ahora.

-       Sobreescribir el método toString para que muestre la siguiente información:

El parking con id XX y XX, situado en XX cuenta con una capacidad de XX Coches.

Ahora están aparcados XX Coches. El porcentaje de ocupación es del XX %.

En Alcalá hay XX plazas disponibles. El porcentaje de ocupación es del : XX %

 

Estos son los coches:

XX (coches)

Solo son eléctricos:

XX(coches eléctricos)

 

 

 

Un ParkingPublico recibe  financiación por tener una serie de numTrabajadoresDiscapacitados.  Esta información se recibe a través del constructor. Se deberá sobreescribir el método toString, añadiendo las nuevas características.

Para calcular las mostrarGananciasTotales, se aplica la siguiente fórmula: :

cantidadGanada +  (numTrabajadoresDiscapacitados * 250)

 

 

Un ParkingPrivado tiene un número de numSocios que se repartirán la cantidadGanada. Esta información la recibe por el constructor y se puede modificar en el futuro Se deberá sobreescribir el método toString  con la nueva característica.

El método  mostrarGananciasTotales devuelve la lo ganado por cada socio.


 

 

Para probar el funcionamiento del código:

Se creará una clase Prueba donde se creará un parking privado y otro público y se aparcarán una serie de coches (IMPRESCINDIBLE UTILIZAR estos 6 modelos, no otros).

1. Parking privado: Parking Plaza Cervantes, C/ Plaza Cervantes s/n, capacidad 20 coches. Número de socios.

Coche{marca=Seat, modelo=León, matricula=2345DRT}

y los siguientes coches eléctricos:

Coche{marca=Audi, modelo=A4, matricula=0728KGT}

Coche{marca=Kía, modelo=Sorento, matricula=1234CSS}

 

2. Parking público:  Huerto Obispo, C/  Palacio Arzobispal s/n, capacidad  10 Coches. Número de trabajadores discapacitados 4.

 

Coche{marca=Toyota, modelo=Auris, matricula=9642JTW}

Coche{marca=Renault, modelo=Clio, matricula=2678DSS}

y los siguientes coches eléctricos::

Coche{marca=Citroen, modelo=c3, matricula=9360FRP}
