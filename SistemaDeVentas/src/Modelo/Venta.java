package Modelo;

public class Venta {
    
    //ATRIBUTOS DE VENTA
    private int id;
    private String cliente;
    private String vendedor;
    private double total;
    private String fecha;

    //CONSTRUCTOR VACIO
    public Venta() {
    }

    //CONSTRUCTOR PARAMETRIZADO
    public Venta(int id, String cliente, String vendedor, double total, String fecha) {
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.total = total;
        this.fecha = fecha;
    }

    //GETTERS & SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
