package cuentasbancarias;

/*
 * De cada CLIENTE de la entidad, deben almacenar su nombre, apellidos, 
 * su DNI (es el identificador de cada persona), su direcci�n y su tel�fono.

 */
public class Titular {

    String nombre;
    String apellidos;
    String DNI;
    String direccion;
    String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Titular(String nombre, String apellidos, String dNI, String direccion, String telefono) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        DNI = dNI;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    
}
