# Lectura y escritura de información **IO - NIO**

## **Flujos y archivos**

### **Flujo de Bytes**
___

Los flujos de bytes se usan con imagenes, videos, serialización de objetos en los que solo importa manejar el flujo de bytes y no presentarlo como texto.

Con los flujos byte a byte podemos leer y escribir un byte a la vez en archivos.

*Byte a byte*

- FileInputStream

- FileOutputStream

Con los flujos de bloque podemos leer y escribir por bloques de bytes en un archivo.

*Bloque de bytes*

- BufferedInputStream

- BufferedOutputStream

    ```java

        int numeroBytesLeidos;
        final int tamBuffer = 1024 * 100;
        byte[] buffer = new byte[tamBuffer];

        BufferedInputStream iS = new BufferedInputStream( 
            new FileInputStream("rutaArchivoOrigen") );

        BufferedOutputStream oS = new BufferedOutputStream( 
            new FileOutputStream("rutaArchivoDestino") );
        // new FileOutputStream("rutaArchivoDestino", true)
        // Abre el archivo en modo append.

        while( (numeroBytesLeidos = iS.read(buffer, 0, tamBuffer)) != -1 ) {
            oS.write(buffer, 0, numeroBytesLeidos); }

    ```

*Serializacion*

- ObjectInputStream

- ObjectOutputStream

    ```java

        Path file = Paths.get("lista.sz");

        ObjectInputStream serializerI;
        ObjectOutputStream serializerO;
        
        List<String> names;

        if( Files.notExists(file) ) {

            names = new ArrayList<>();
            names.add("Paco");
            names.add("Umberto");
            names.add("Soraya");
            names.add("Danilo");
            
            serializerO = new ObjectOutputStream( 
                new FileOutputStream(file.toString()) );

            serializerO.writeObject(names);
            serializerO.close();
        
        } else if( Files.exists(file) ) {

            names = new ArrayList<>();
            serializerI = new ObjectInputStream( 
                new FileInputStream(file.toString()) );
            
            names = (List<String>) serializerI.readObject();
            names.forEach( (name) -> { System.out.println(name); });
            serializerI.close();

        }

    ```

### **Flujo de Caracteres**
___

Con los flujos de caracteres individuales podemos leer y escribir un caracter a la vez en archivos.

*Caracter a caracter*
- FileReader
- FileWriter

Con los flujos de bloque de caracteres podemos escribir cadenas de caracteres tan amplias como necesitemos de forma directa en un archivo.

*Bloque de caracteres (Lineas)*
- BufferedReader
- BufferedWriter

    ```java

        BufferedReader bR = new BufferedReader( new FileReader("rutaArchivoOrigen") );
        BufferedWriter bW = new BufferedWriter( new FileWriter("rutaArchivoDestino") );
        // new FileWriter("rutaArchivoDestino", true)
        // Abre el archivo en modo append.

        while( (linea = bR.readLine()) != null ) {
        
            bW.write(linea);
            bW.newLine();
        
        }

    ```
___

## **Rutas (Paths)**

Se puede representar rutas en el sistema con Paths, estas rutas pueden o no existir, es obligación del programador validarlas. Estas rutas son independiente del sistema operativo y se crean con el formato del sistema operativo en el cual se ejecuta. En windows se crearan con `\` mientras que en linux con `/`.

Debe validarse siempre que el directorio o archivo existan, de no hacerlo saltara una excepcion al querer crearlo de nuevo, o al querer crear un archivo en un directorio que no existe.

```java

    Path ruta = Paths.get("ruta");
    
    ruta.toAbsolutePath();

```

Si utilizamos `Paths.get("nombreArchivo.extension")` se generará una ruta a `nombreArchivo.extension` con la ruta del directorio de trabajo.

```java

    Path ruta = Paths.get("datos.txt");
    System.out.println( ruta.toAbsolutePath() );
    
    // Imprimira c:\ruta\desde\donde\se\ejecuto\la\clase\o\jar\datos.txt en windows.

    // Imprimira /ruta/desde/donde/se/ejecuto/la/clase/o/jar/datos.txt en linux.

```

Podemos incluir varios subdirectorios al definir un mismo path.

```java

    Path ruta = Paths.get(
        System.getProperty("user.home"), "Desktop", "files", "cubito/data.txt");
    System.out.println( ruta.toAbsolutePath() );

    // Imprimira C:\Users\Home\Desktop\files\cubito\data.txt en windows.
    // Imprimira /home/userHome/Desktop/files/cubito/data.txt en linux.

```

Debe recordarse que la ruta puede o no existir, se debe comprobar con ayuda de la clase `Files`.

Al definir una ruta podemos:

- Obtener información de un Path
    - Nombre del archivo
    - Directorio raiz
    - Directorio padre
    - Subdirectorios de la ruta (Porciones de la ruta)
    - Numero de directorios hasta el archivo, excluyendo al directorio raiz
    - Elemento de la lista de directorios del path (incluido el archivo y omitiendo el raiz)

    ```java

        path.getFileName();

        path.getRoot();

        path.getParent();

        path.subpath(0,2);

        path.getName(0);

        path.getNameCount();

    ```
    
    Al utilizar los métodos para obtener información de la ruta como `getParent` o `toAbsolutePath` recuerde que estos retornan un path si desea utilizarlos como argumentos de un `FileReader`, `FileInputStream`, etc, debera usar el método `toString()`;

    ```java

        Path file = Paths.get("file");

        BufferedReader br = new BufferedReader( 
            new FileReader(file.toString(), true) );

    ```

- Eliminar redundancias (Rutas relativas)

    Con `normalize()` eliminamos las rutas relativas de la ruta generada.

    ```java

        Path path = Paths.get(
            System.getProperty("user.home"), 
                "documents", "java", "..", "..", "temario.txt");
        // Mostrara la ruta: /home/usuario/documents/java/../../temario.txt
        
        Path normalized = path.normalize();
        // Mostrara la ruta: /home/usuario/documents/java/parentDir/parentDirParent/temario.txt

    ```

- Unir dos Paths

    ```java

        Path baseDir = Paths.get(System.getProperty("user.home"), "Desktop"),
            subDir = Paths.get("files"),
            file = Paths.get("file.txt"),
            complete = baseDir.resolve(subDir).resolve(file);
        // Mostrara la ruta: /home/usuario/Desktop/files/file.txt
        // Para la ruta 'complete'.

    ```

- Comparar dos paths

    Aun cuando dos rutas sean la misma, siendo una relativa y la otra absoluta, de no normalizarse serán distintas al compararse.

    ```java

    Path p1 = Paths.get(
        System.getProperty("user.home"), 
            "documents", "java", "..", "java","temario.txt");
    
    Path p2 = Paths.get(
        System.getProperty("user.home"), "documents", "java", "temario.txt";

    p1.equals(p2); // False
    p1.normalize().equals(p2); // True

    ```
___

## **Clase Files**

- Comprobaciones

    - Existencia
    - Acceso
    - Es el mismo fichero

    ```java

        Files.size(path);
        
        Files.exists(path);

        Files.notExists(path);

        Files.isRegularFile(path);

        Files.isDirectory(path);

        Files.isWritable(path);

        Files.isReadable(path);

        Files.isExecutable(path);

        Files.isSameFile(path1, path2);

    ```

- Copiar - Borrar - Mover

    ```java

        Files.delete(path);

        Files.deleteIfExists(path);

        Files.copy(pathOrigen, pathDestino, StandardCopyOption.REPLACE_EXISTING);

        Files.move(pathOrigen, pathDestino, StandardCopyOption.REPLACE_EXISTING);

    ```

- Crear - Leer - Escribir

    Para crear directorios o archivos temporales el path es la ruta del directorio donde se creara el temporal, no se pone el nombre de archivo.


    - Crear ficheros
    - Bufferes
    
    ```java

        Files.createFile(path);

        Files.createTempFile(pathDir, "PREFIJO", "SUFIJO");

        
        Files.createDirectory(path);

        Files.createDirectories(path);

        Files.createTempDirectory(path, "PREFIJO");


        Files.readAllLines(path);


        BufferedReader bR = Files.newBufferedReader(path);

        BufferedWriter bW = Files.newBufferedWriter(path);

        BufferedWriter bw = Files.newBufferedWriter(path, 
            Charset.forName("UTF-8"));

        BufferedWriter bW = Files.newBufferedWriter(path,
             StandardOpenOption.APPEND));
        
        DirectoryStream<Path> dS = Files.newDirectoryStream(path);

        dS.forEach( (d) -> { 
            System.out.println(d); });

    ```
___

## **Archivos de acceso aleatorio**

Utilizados para acceder a un fichero de forma aleatoria, mantienen un cursor que apunta a la posicion del byte en el que nos encontramos. Con los anteriores flujos (`bytes` o `caracteres`) el acceso al archivo es secuencial, si deseamos acceder a una parte especifica del archivo para leerlo o escribirlo no podriamos hacerlo sin pasar por las partes que le preceden, con un archivo de acceso aleatorio simplemente movemos el cursor a la posicion desde la que deseamos comenzar a leer o escribir.

```java

    // El segundo argumento del constructor puede ser "r" para read o "w" para write.
    RandomAccessFile rf = new RandomAccessFile(file.toString(), "rw");
    byte[] buffer = new byte[tamBuffer];
    
    rf.getFilePointer(); // Retorna la posición del cursor.

    rf.seek(); // Mueve el cursor de posicion.

    rf.read(buffer);
    // Guarda en buffer una cantidad de bytes igual al tamaño del buffer.
    // Retorna el numero de bytes leidos.

    rf.read(buffer, inicioBuffer, longitudLectura);
    // Parecida a la anterior, permite indicar desde donde comenzamos a escribir
    // en el buffer y la longitud de bytes que deseamos leer, debe tener en cuenta
    // no indicar una cantidad mayor a la disponible.
    // Con normalidad se usa:
    // rf.read(buffer, 0, tamBuffer);

    rf.readChar(); // Lee el byte y lo interpreta como char.
    // Existen reads para cada tipo de dato primitivo.

    rf.readLine(); 
    // Lee bytes hasta encontrar un salto de linea.
    // Retorna los bytes leidos.
    // No olvide que tambien mueve el cursor a la ultima posicion de lectura.

    rf.length(); // Retorna la longitud del archivo en bytes.

    rf.write(buffer); // Escribe lo contenido en un array de bytes.

    rf.writeBytes("cadena");  // Escribe una cadena de caracteres.

    rf.writeInt(numero); // Escribe un entero.
    // Existen writes para cada tipo de dato primitivo.

```

```java

    Path file = Paths.get("archivo.txt");
    RandomAccessFile rf = new RandomAccessFile(file.toString(), "rw");
    
    int numeroBytesLeidos;
    final int tamBuffer = 1024 * 1000; // 1Mb
    byte[] buffer = new byte[tamBuffer];

    rf.seek(tamBuffer); 
    // Omitimos el primer megabyte de información,
    // moviendo el cursor al byte (1024 * 1000).
    
    numeroBytesLeidos = rf.read(buffer, 0, tamBuffer);
    System.out.println( new String(buffer, Charset.forName("UTF-8")) );

```
___
