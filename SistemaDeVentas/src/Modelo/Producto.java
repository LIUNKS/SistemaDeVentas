package Modelo;

public class Producto {
    
    //ATRIBUTOS DEL PRODUCTO
    private int id;
    private String codigo;
    private String nombre;
    private String proveedor;
    private int stock;
    private double precio;

    //CONSTRUCTOR VACIO
    public Producto() {
    }

    //CONSTRUCTOR PARAMETRIZADO
    public Producto(int id, String codigo, String nombre, String proveedor, int stock, double precio) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.stock = stock;
        this.precio = precio;
    }
   
    

    //GETTERS & SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
      
}
