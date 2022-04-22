/**
 * LA CODIFICACIÓN CÉSAR ES AQUELLA QUE TRANSFORMA UN MENSAJE, CAMBIANDO CADA LETRA
 * POR AQUELLA QUE OCUPA 3 POSICIONES DESPUÉS EN EL ABECEDARIO.
 * ESTE PROGRAMA IMPLEMENTA DICHA CODIFICACIÓN, TRANSFORMANDO UN FICHERO DE TEXTO.
 * ES UN ALGORITMO DE ENCRIPTACIÓN SIMÉTRICO
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SolucionCodificadorCesar {

    static final int OFFSET = 3; //desplazamiento

    /**
     * @param args
     */
    public static void main(String[] args) {

        Path path_mensaje = Paths.get("mensaje.txt");
        Path path_mensaje_cifrado = Paths.get("mensaje_cifrado.txt");
        Path path_mensaje_descifrado = Paths.get("mensaje_descifrado.txt");

        try {
            codificar(path_mensaje, path_mensaje_cifrado);
            descodificar(path_mensaje_cifrado, path_mensaje_descifrado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * codificar
     *
     * @param path_mensaje
     * @param path_mensaje_cifrado
     * @throws IOException
     */
    public static void codificar(Path path_mensaje, Path path_mensaje_cifrado) throws IOException {

        
        //if (Files.notExists(path_mensaje)) {
            //Files.createFile(path_mensaje);
            
            // VAMOS A ESCRIBIR EN EL FICHERO DEL MENSAJE ORIGINAL DE TRES FORMAS DISTINTAS...
            
            //1. Con StreamBuffer
            //escribirTextoFalso(path_mensaje); //No hace falta que esté creado previamente el fichero.
            
            //2. Con PrintWriter
            //escribirTextoFalso(path_mensaje.toString(),"UTF-8"); //No hace falta que esté creado previamente el fichero.
            
            //3. Con java.nio (Files.write) 
            String texto = "MI TEXTO DE PRUEBA Y CON FILES.WRITE";
            //Files.write(path_mensaje, texto.getBytes()); //No hace falta que esté creado previamente el fichero.
            
            
            Files.write(path_mensaje, texto.getBytes(StandardCharsets.UTF_8),StandardOpenOption.APPEND);
            
           
            // https://mkyong.com/java/how-to-append-content-to-file-in-java/
            
        //}

        try ( BufferedReader br = Files.newBufferedReader(path_mensaje);  BufferedWriter bw = Files.newBufferedWriter(path_mensaje_cifrado, Charset.forName("UTF-8"))) {

            //br = new BufferedReader(new FileReader("mensaje.txt"));
            //bw = new BufferedWriter(new FileWriter("mensaje_cifrado.txt"));
            String linea = null;

            while ((linea = br.readLine()) != null) { //devuelve la cadena de caracteres (línea) y cuando no quedan más datos devuelve null
                StringBuilder sb = new StringBuilder(linea.length());
                //Recorremos la línea en mayúsuclas carácter a carácter
                for (char c : linea.toUpperCase().toCharArray()) {
                    char result;
                    if (Character.isLetter(c)) {
                        int intValue = (int) c - 'A'; //cogemos como referencia el valor entero de la letra A y restamos nuestro carácter sobre la A
                        // A - A = 0; B - A = 1
                        int intResult = (intValue + OFFSET) % 26; //últimas tres letras del abecedario tienen que ser correspondidas con la A, B y C consecutivamente
                        // Si intValue+offset fuera 27, el módulo 26 sería 1 y le correspondería ..
                        // ej: la Y es 89 - 65 (A) = 24 + 3 = 27 % 26 = 1
                        // ej: la X es 88 - 65 = 23 + 3 = 26 % 26 = 0
                        // ej: la Z es 90 - 65 = 25 + 3 = 28 % 26 = 2
                        result = (char) ('A' + intResult);
                    } else {
                        //si no es una letra lo dejamos como está
                        result = c;
                    }
                    sb.append(result);
                }
                bw.write(sb.toString());
                bw.newLine();

            }
            System.out.println("El mensaje ha sido cifrado correctamente");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        /*finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/

    }

    /**
     * descodificar
     *
     * @param path_mensaje_cifrado
     * @param path_mensaje_descifrado
     * @throws IOException
     */
    public static void descodificar(Path path_mensaje_cifrado, Path path_mensaje_descifrado) throws IOException {

        try ( BufferedReader br = Files.newBufferedReader(path_mensaje_cifrado);  BufferedWriter bw = Files.newBufferedWriter(path_mensaje_descifrado, Charset.forName("UTF-8"))) {

            String linea = null;

            while ((linea = br.readLine()) != null) { //devuelve la cadena de caracteres (línea) y cuando no quedan más datos devuelve null
                StringBuilder sb = new StringBuilder(linea.length());
                //Recorremos la línea en mayúsuclas carácter a carácter
                for (char c : linea.toUpperCase().toCharArray()) {
                    char result;
                    if (Character.isLetter(c)) {

                        int intValue = (int) c - 'A'; //cogemos como referencia el valor entero de la letra A y restamos nuestro carácter sobre la A
                        int intResult = (intValue - OFFSET);
                        intResult = intResult % 26; //últimas tres letras del abecedario tienen que ser correspondidas con la A, B y C consecutivamente

                        if (intResult >= 0) {
                            result = (char) ('A' + intResult);
                        } else {
                            result = (char) ('Z' + (intResult + 1));
                        }

                    } else {
                        //si no es una letra lo dejamos como está
                        result = c;
                    }
                    sb.append(result);
                }
                bw.write(sb.toString());
                bw.newLine();

            }
            System.out.println("El mensaje ha sido descifrado correctamente");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Escribe texto falso con BufferedWriter
     * BufferWriter, donde usamos el método write que te permite escribir cadenas o arreglos de caracteres
     * @param path
     * @throws IOException
     */
    public static void escribirTextoFalso(Path path) throws IOException {
        // Podemos indicar opciones a la hora de abrir el fichero
        //try ( BufferedWriter br = Files.newBufferedWriter(path,
        //        Charset.defaultCharset(), StandardOpenOption.CREATE)) {
        try ( BufferedWriter br = Files.newBufferedWriter(path,Charset.defaultCharset() )) {
            br.write("ESTE ES MI TEXTO DE PRUEBA Y CHIMPUN");
            br.newLine();
        }
    }

    /**
     * Escribe texto falso con PrintWriter
     * Te permite hacer más o menos lo mismo, pero de una forma más resumida y con la posibilidad de escribir otros tipos de datos sobre el archivo.
     * El trabajo de escritura se hace con el método println, que permite escribir otros tipos de datos como enteros, de punto flotante, booleanos y caracteres
     * @param fileName
     * @param encoding
     * @throws IOException 
     */
    public static void escribirTextoFalso(String fileName, String encoding) throws IOException{
        try (PrintWriter writer = new PrintWriter(fileName, encoding)) {
            writer.println("CON PRINTWRITER MI TEXTO DE PRUEBA Y CHIMPUN");
        }
    }

}
