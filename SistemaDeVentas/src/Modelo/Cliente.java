package Modelo;

public class Cliente {
    
    //ATRIBUTOS DEL CLIENTE
    private int idCliente;
    private int dni;
    private String nombre;
    private int telefono;
    private String direccion;
    private String razonSocial;

    //CONSTRUCTOR VACIO
    public Cliente() {
    }

    //CONSTRUCTOR PARAMETRIZADO
    public Cliente(int idCliente, int dni, String nombre, int telefono, String direccion, String razonSocial) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.razonSocial = razonSocial;
    }
    
    //GETTERS & SETTERS
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
}
