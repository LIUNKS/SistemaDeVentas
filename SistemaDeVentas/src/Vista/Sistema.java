package Vista;

import Modelo.Cliente;
import Controlador.ClienteDAO;
import Controlador.ProveedorDAO;
import Modelo.Proveedor;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Sistema extends javax.swing.JFrame {

    //VARIABLES DEL MOUSE
    int xMouse, yMouse;

    //INSTANCIAS NECESARIAS
    Cliente cliente = new Cliente();
    ClienteDAO clientedao = new ClienteDAO();
    Proveedor proveedor = new Proveedor();
    ProveedorDAO proveedordao = new ProveedorDAO();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Sistema() {
        initComponents();
        //CENTRALIZA LA VENTANA DEL PROGRAMA
        this.setLocationRelativeTo(null);
        //OCULTAR EL CAMPO DONDE SALE EL VALOR DEL ID
        idClienteTXT.setVisible(false);
    }

    public void ListarCliente() {
        //INSERTA LOS DATOS INGRESADOS EN EL FORMULARIO A LA TABLA CLIENTE
        List<Cliente> listarClientes = clientedao.listarCliente();
        modelo = (DefaultTableModel) tabla_2.getModel();
        Object[] objeto = new Object[6];
        for (int i = 0; i < listarClientes.size(); i++) {
            objeto[0] = listarClientes.get(i).getIdCliente();
            objeto[1] = listarClientes.get(i).getDni();
            objeto[2] = listarClientes.get(i).getNombre();
            objeto[3] = listarClientes.get(i).getTelefono();
            objeto[4] = listarClientes.get(i).getDireccion();
            objeto[5] = listarClientes.get(i).getRazonSocial();
            modelo.addRow(objeto);
        }

        tabla_2.setModel(modelo);
    }

    public void LimpiarTabla() {
        //METODO PARA LIMPIAR LA TABLA AL SELECCIONAR EL BOTON DE CLIENTE
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonExit = new javax.swing.JPanel();
        botonExitLabel = new javax.swing.JLabel();
        navBar = new javax.swing.JPanel();
        logoEmpresa = new javax.swing.JLabel();
        botonNuevaVenta = new javax.swing.JButton();
        botonClientes = new javax.swing.JButton();
        botonProveedor = new javax.swing.JButton();
        botonProductos = new javax.swing.JButton();
        botonVentas = new javax.swing.JButton();
        botonConfig = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        body = new javax.swing.JTabbedPane();
        panel_1 = new javax.swing.JPanel();
        codigo = new javax.swing.JLabel();
        codigoTXT = new javax.swing.JTextField();
        descripcion = new javax.swing.JLabel();
        descripcionTXT = new javax.swing.JTextField();
        cantidad = new javax.swing.JLabel();
        cantidadTXT = new javax.swing.JTextField();
        precio = new javax.swing.JLabel();
        precioTXT = new javax.swing.JTextField();
        stock = new javax.swing.JLabel();
        stockTXT = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        tabla_nuevaVenta = new javax.swing.JScrollPane();
        tabla_1 = new javax.swing.JTable();
        dni = new javax.swing.JLabel();
        dniTXT = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        nombreTXT = new javax.swing.JTextField();
        imprimir = new javax.swing.JButton();
        total = new javax.swing.JLabel();
        total_precio = new javax.swing.JLabel();
        telefonoCV_TXT = new javax.swing.JTextField();
        direccionCV_TXT = new javax.swing.JTextField();
        razonCV_TXT = new javax.swing.JTextField();
        idProductoNV_TXT = new javax.swing.JTextField();
        panel_2 = new javax.swing.JPanel();
        dni_panel_2 = new javax.swing.JLabel();
        dniTXT_2 = new javax.swing.JTextField();
        nombre_panel_2 = new javax.swing.JLabel();
        nombreTXT_2 = new javax.swing.JTextField();
        telefono_panel_2 = new javax.swing.JLabel();
        telefonoTXT_2 = new javax.swing.JTextField();
        direccion_panel_2 = new javax.swing.JLabel();
        direccionTXT_2 = new javax.swing.JTextField();
        rSocial_panel_2 = new javax.swing.JLabel();
        rSocialTXT_2 = new javax.swing.JTextField();
        tabla_clientes = new javax.swing.JScrollPane();
        tabla_2 = new javax.swing.JTable();
        botonGuardar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonNuevo = new javax.swing.JButton();
        idClienteTXT = new javax.swing.JTextField();
        panel_3 = new javax.swing.JPanel();
        ruc_panel_3 = new javax.swing.JLabel();
        rucTXT_3 = new javax.swing.JTextField();
        nombre_panel_3 = new javax.swing.JLabel();
        nombreTXT_3 = new javax.swing.JTextField();
        telefono_panel_3 = new javax.swing.JLabel();
        telefonoTXT_3 = new javax.swing.JTextField();
        direccion_panel_3 = new javax.swing.JLabel();
        direccionTXT_3 = new javax.swing.JTextField();
        rSocial_panel_3 = new javax.swing.JLabel();
        rSocialTXT_3 = new javax.swing.JTextField();
        tabla_proveedor = new javax.swing.JScrollPane();
        tabla_3 = new javax.swing.JTable();
        botonGuardar_3 = new javax.swing.JButton();
        botonActualizar_3 = new javax.swing.JButton();
        botonEliminar_3 = new javax.swing.JButton();
        botonNuevo_3 = new javax.swing.JButton();
        idProveedorTXT = new javax.swing.JTextField();
        panel_4 = new javax.swing.JPanel();
        codigo_panel_4 = new javax.swing.JLabel();
        codigoTXT_4 = new javax.swing.JTextField();
        descripcion_panel_4 = new javax.swing.JLabel();
        descripcionTXT_4 = new javax.swing.JTextField();
        cantidad_panel_4 = new javax.swing.JLabel();
        cantidadTXT_4 = new javax.swing.JTextField();
        precio_panel_4 = new javax.swing.JLabel();
        precioTXT_4 = new javax.swing.JTextField();
        proveedor_4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        tabla_productos = new javax.swing.JScrollPane();
        tabla_4 = new javax.swing.JTable();
        botonGuardar_4 = new javax.swing.JButton();
        botonActualizar_4 = new javax.swing.JButton();
        botonEliminar_4 = new javax.swing.JButton();
        botonNuevo_4 = new javax.swing.JButton();
        botonExcel_4 = new javax.swing.JButton();
        idProductoTXT = new javax.swing.JTextField();
        panel_5 = new javax.swing.JPanel();
        tabla_ventas = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonPDF = new javax.swing.JButton();
        idVentasTXT = new javax.swing.JTextField();
        panel_6 = new javax.swing.JPanel();
        titulo_tabla_6 = new javax.swing.JLabel();
        ruc_panel_6 = new javax.swing.JLabel();
        rucTXT_6 = new javax.swing.JTextField();
        nombre_panel_6 = new javax.swing.JLabel();
        nombreTXT_6 = new javax.swing.JTextField();
        telefono_panel_6 = new javax.swing.JLabel();
        telefonoTXT_6 = new javax.swing.JTextField();
        direccion_panel_6 = new javax.swing.JLabel();
        direccionTXT_6 = new javax.swing.JTextField();
        rSocial_panel_6 = new javax.swing.JLabel();
        rSocialTXT_6 = new javax.swing.JTextField();
        actualizar_panel_6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(255, 102, 0));
        panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelMouseDragged(evt);
            }
        });
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMousePressed(evt);
            }
        });

        botonExit.setBackground(new java.awt.Color(255, 102, 0));
        botonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonExitMouseExited(evt);
            }
        });

        botonExitLabel.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        botonExitLabel.setForeground(new java.awt.Color(0, 0, 0));
        botonExitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonExitLabel.setText("X");

        javax.swing.GroupLayout botonExitLayout = new javax.swing.GroupLayout(botonExit);
        botonExit.setLayout(botonExitLayout);
        botonExitLayout.setHorizontalGroup(
            botonExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonExitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        botonExitLayout.setVerticalGroup(
            botonExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonExitLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(1045, Short.MAX_VALUE)
                .addComponent(botonExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 50));

        navBar.setBackground(new java.awt.Color(255, 102, 0));

        logoEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoFerreteria.png"))); // NOI18N

        botonNuevaVenta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        botonNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nventa.png"))); // NOI18N
        botonNuevaVenta.setText("Nueva Venta");
        botonNuevaVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonClientes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        botonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clientes.png"))); // NOI18N
        botonClientes.setText("Clientes");
        botonClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClientesActionPerformed(evt);
            }
        });

        botonProveedor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        botonProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedor.png"))); // NOI18N
        botonProveedor.setText("Porveedor");
        botonProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonProductos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        botonProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compras.png"))); // NOI18N
        botonProductos.setText("Ventas");
        botonProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonVentas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        botonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/config.png"))); // NOI18N
        botonVentas.setText("Config");
        botonVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonConfig.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        botonConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/producto.png"))); // NOI18N
        botonConfig.setText("Productos");
        botonConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout navBarLayout = new javax.swing.GroupLayout(navBar);
        navBar.setLayout(navBarLayout);
        navBarLayout.setHorizontalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addComponent(logoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(navBarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navBarLayout.setVerticalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(logoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(botonNuevaVenta)
                .addGap(30, 30, 30)
                .addComponent(botonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botonProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botonConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(botonVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        getContentPane().add(navBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 700));

        header.setBackground(new java.awt.Color(255, 102, 0));

        titulo.setFont(new java.awt.Font("Roboto Medium", 1, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("PUNTO DE VENTA");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 900, 110));

        codigo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        codigo.setText("Código");

        codigoTXT.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        descripcion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        descripcion.setText("Descripción");

        descripcionTXT.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        cantidad.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cantidad.setText("Cantidad");

        cantidadTXT.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        precio.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        precio.setText("Precio");

        precioTXT.setEditable(false);
        precioTXT.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        stock.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        stock.setText("Stock Disponible");

        stockTXT.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabla_1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tabla_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        tabla_nuevaVenta.setViewportView(tabla_1);
        if (tabla_1.getColumnModel().getColumnCount() > 0) {
            tabla_1.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabla_1.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabla_1.getColumnModel().getColumn(2).setPreferredWidth(30);
            tabla_1.getColumnModel().getColumn(3).setPreferredWidth(30);
            tabla_1.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        dni.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        dni.setText("DNI / RUC");

        dniTXT.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        nombre.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nombre.setText("NOMBRE");

        nombreTXT.setEditable(false);
        nombreTXT.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/print.png"))); // NOI18N
        imprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        total.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        total.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/money.png"))); // NOI18N
        total.setText("TOTAL A PAGAR");

        total_precio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        total_precio.setText("-----");

        javax.swing.GroupLayout panel_1Layout = new javax.swing.GroupLayout(panel_1);
        panel_1.setLayout(panel_1Layout);
        panel_1Layout.setHorizontalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigo)
                    .addComponent(codigoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cantidad)
                    .addComponent(cantidadTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precio)
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addComponent(precioTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(idProductoNV_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stockTXT))
                .addGap(47, 47, 47)
                .addComponent(eliminar)
                .addGap(19, 19, 19))
            .addComponent(tabla_nuevaVenta)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dni)
                    .addComponent(dniTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addComponent(nombreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(telefonoCV_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(direccionCV_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(razonCV_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(total)
                .addGap(42, 42, 42)
                .addComponent(total_precio)
                .addGap(37, 37, 37))
        );
        panel_1Layout.setVerticalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigo)
                            .addComponent(stock)
                            .addComponent(precio)
                            .addComponent(cantidad)
                            .addComponent(descripcion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(stockTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(precioTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cantidadTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idProductoNV_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(codigoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(descripcionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(eliminar)))
                .addGap(18, 18, 18)
                .addComponent(tabla_nuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_1Layout.createSequentialGroup()
                                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dni)
                                    .addComponent(nombre))
                                .addGap(4, 4, 4)
                                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dniTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefonoCV_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(direccionCV_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(razonCV_TXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(imprimir)))
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total)
                            .addComponent(total_precio))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        body.addTab("tab1", panel_1);

        dni_panel_2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        dni_panel_2.setText("DNI / RUC:");

        nombre_panel_2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nombre_panel_2.setText("NOMBRE: ");

        telefono_panel_2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        telefono_panel_2.setText("TELEFONO:");

        direccion_panel_2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        direccion_panel_2.setText("DIRECCION:");

        rSocial_panel_2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        rSocial_panel_2.setText("RAZON SOCIAL:");

        tabla_2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tabla_2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI/RUC", "NOMBRE", "TELEFONO", "DIRECCION", "RAZON SOCIAL"
            }
        ));
        tabla_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_2MouseClicked(evt);
            }
        });
        tabla_clientes.setViewportView(tabla_2);
        if (tabla_2.getColumnModel().getColumnCount() > 0) {
            tabla_2.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabla_2.getColumnModel().getColumn(1).setPreferredWidth(50);
            tabla_2.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabla_2.getColumnModel().getColumn(3).setPreferredWidth(50);
            tabla_2.getColumnModel().getColumn(4).setPreferredWidth(80);
            tabla_2.getColumnModel().getColumn(5).setPreferredWidth(80);
        }

        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        botonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar (2).png"))); // NOI18N
        botonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        botonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        botonNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_2Layout.createSequentialGroup()
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dni_panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rSocial_panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefono_panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre_panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(direccion_panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dniTXT_2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(nombreTXT_2)
                            .addComponent(telefonoTXT_2)
                            .addComponent(direccionTXT_2)
                            .addComponent(rSocialTXT_2)))
                    .addGroup(panel_2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabla_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(idClienteTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(idClienteTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_2Layout.createSequentialGroup()
                        .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dni_panel_2)
                            .addComponent(dniTXT_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre_panel_2)
                            .addComponent(nombreTXT_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefono_panel_2)
                            .addComponent(telefonoTXT_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccion_panel_2)
                            .addComponent(direccionTXT_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rSocial_panel_2)
                            .addComponent(rSocialTXT_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tabla_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        body.addTab("tab2", panel_2);

        ruc_panel_3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        ruc_panel_3.setText("RUC:");

        nombre_panel_3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nombre_panel_3.setText("NOMBRE: ");

        telefono_panel_3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        telefono_panel_3.setText("TELEFONO:");

        direccion_panel_3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        direccion_panel_3.setText("DIRECCION:");

        rSocial_panel_3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        rSocial_panel_3.setText("RAZON SOCIAL:");

        tabla_3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUC", "NOMBRE", "TELEFONO", "DIRECCION", "RAZON SOCIAL"
            }
        ));
        tabla_proveedor.setViewportView(tabla_3);
        if (tabla_3.getColumnModel().getColumnCount() > 0) {
            tabla_3.getColumnModel().getColumn(0).setPreferredWidth(100);
            tabla_3.getColumnModel().getColumn(1).setPreferredWidth(40);
            tabla_3.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabla_3.getColumnModel().getColumn(3).setPreferredWidth(50);
            tabla_3.getColumnModel().getColumn(4).setPreferredWidth(80);
            tabla_3.getColumnModel().getColumn(5).setPreferredWidth(70);
        }

        botonGuardar_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        botonGuardar_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardar_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardar_3ActionPerformed(evt);
            }
        });

        botonActualizar_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar (2).png"))); // NOI18N
        botonActualizar_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonEliminar_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        botonEliminar_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonNuevo_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        botonNuevo_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_3Layout = new javax.swing.GroupLayout(panel_3);
        panel_3.setLayout(panel_3Layout);
        panel_3Layout.setHorizontalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ruc_panel_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rSocial_panel_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telefono_panel_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre_panel_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(direccion_panel_3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rucTXT_3)
                            .addComponent(nombreTXT_3)
                            .addComponent(telefonoTXT_3)
                            .addComponent(direccionTXT_3)
                            .addComponent(rSocialTXT_3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonGuardar_3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminar_3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonActualizar_3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonNuevo_3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabla_proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                    .addGroup(panel_3Layout.createSequentialGroup()
                        .addComponent(idProveedorTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panel_3Layout.setVerticalGroup(
            panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(idProveedorTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tabla_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_3Layout.createSequentialGroup()
                        .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ruc_panel_3)
                            .addComponent(rucTXT_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre_panel_3)
                            .addComponent(nombreTXT_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefono_panel_3)
                            .addComponent(telefonoTXT_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccion_panel_3)
                            .addComponent(direccionTXT_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rSocial_panel_3)
                            .addComponent(rSocialTXT_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonGuardar_3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonActualizar_3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(botonEliminar_3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonNuevo_3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        body.addTab("tab3", panel_3);

        codigo_panel_4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        codigo_panel_4.setText("CODIGO:");

        descripcion_panel_4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        descripcion_panel_4.setText("DESCRIPCION:");

        cantidad_panel_4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cantidad_panel_4.setText("CANTIDAD");

        precio_panel_4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        precio_panel_4.setText("PRECIO:");

        proveedor_4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        proveedor_4.setText("PROVEEDOR:");

        jComboBox1.setEditable(true);

        tabla_4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD", "PRECIO", "PROVEEDOR"
            }
        ));
        tabla_productos.setViewportView(tabla_4);
        if (tabla_4.getColumnModel().getColumnCount() > 0) {
            tabla_4.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabla_4.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabla_4.getColumnModel().getColumn(2).setPreferredWidth(40);
            tabla_4.getColumnModel().getColumn(3).setPreferredWidth(50);
            tabla_4.getColumnModel().getColumn(4).setPreferredWidth(60);
        }

        botonGuardar_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        botonGuardar_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonActualizar_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar (2).png"))); // NOI18N
        botonActualizar_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonEliminar_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        botonEliminar_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonNuevo_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        botonNuevo_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botonExcel_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/excel.png"))); // NOI18N
        botonExcel_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_4Layout = new javax.swing.GroupLayout(panel_4);
        panel_4.setLayout(panel_4Layout);
        panel_4Layout.setHorizontalGroup(
            panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_4Layout.createSequentialGroup()
                .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codigo_panel_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(proveedor_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantidad_panel_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(descripcion_panel_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(precio_panel_4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(botonEliminar_4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addComponent(botonExcel_4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_4Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(botonGuardar_4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonActualizar_4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(codigoTXT_4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(descripcionTXT_4)
                        .addComponent(cantidadTXT_4)
                        .addComponent(precioTXT_4)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_4Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(botonNuevo_4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabla_productos, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                    .addGroup(panel_4Layout.createSequentialGroup()
                        .addComponent(idProductoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panel_4Layout.setVerticalGroup(
            panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(idProductoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_4Layout.createSequentialGroup()
                        .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigo_panel_4)
                            .addComponent(codigoTXT_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descripcion_panel_4)
                            .addComponent(descripcionTXT_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidad_panel_4)
                            .addComponent(cantidadTXT_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precio_panel_4)
                            .addComponent(precioTXT_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proveedor_4)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_4Layout.createSequentialGroup()
                                .addComponent(botonGuardar_4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(panel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonEliminar_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonExcel_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonNuevo_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(botonActualizar_4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tabla_productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        body.addTab("tab4", panel_4);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "CLIENTE", "VENDEDOR", "TOTAL"
            }
        ));
        tabla_ventas.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(60);
        }

        botonPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf.png"))); // NOI18N

        javax.swing.GroupLayout panel_5Layout = new javax.swing.GroupLayout(panel_5);
        panel_5.setLayout(panel_5Layout);
        panel_5Layout.setHorizontalGroup(
            panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_5Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_5Layout.createSequentialGroup()
                        .addComponent(botonPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(idVentasTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabla_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel_5Layout.setVerticalGroup(
            panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonPDF, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(idVentasTXT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(tabla_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        body.addTab("tab5", panel_5);

        titulo_tabla_6.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        titulo_tabla_6.setForeground(new java.awt.Color(0, 0, 0));
        titulo_tabla_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_tabla_6.setText("DATOS DE LA EMPRESA");

        ruc_panel_6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        ruc_panel_6.setText("RUC:");

        nombre_panel_6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nombre_panel_6.setText("NOMBRE: ");

        telefono_panel_6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        telefono_panel_6.setText("TELEFONO:");

        direccion_panel_6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        direccion_panel_6.setText("DIRECCION:");

        rSocial_panel_6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        rSocial_panel_6.setText("RAZON SOCIAL:");

        actualizar_panel_6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        actualizar_panel_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar (2).png"))); // NOI18N
        actualizar_panel_6.setText("ACTUALIZAR");

        javax.swing.GroupLayout panel_6Layout = new javax.swing.GroupLayout(panel_6);
        panel_6.setLayout(panel_6Layout);
        panel_6Layout.setHorizontalGroup(
            panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_6Layout.createSequentialGroup()
                .addComponent(titulo_tabla_6, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panel_6Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ruc_panel_6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion_panel_6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionTXT_6)
                    .addComponent(rucTXT_6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSocialTXT_6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSocial_panel_6)
                    .addGroup(panel_6Layout.createSequentialGroup()
                        .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombre_panel_6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreTXT_6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefono_panel_6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonoTXT_6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(actualizar_panel_6)
                .addGap(377, 377, 377))
        );
        panel_6Layout.setVerticalGroup(
            panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titulo_tabla_6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruc_panel_6)
                    .addComponent(nombre_panel_6)
                    .addComponent(telefono_panel_6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rucTXT_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTXT_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoTXT_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_6Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(direccion_panel_6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSocial_panel_6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSocialTXT_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionTXT_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(actualizar_panel_6)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        body.addTab("tab6", panel_6);

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 900, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMousePressed
        //MOVIMIENTO DE LA VENTANA DEL PROGRAMA
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelMousePressed

    private void panelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseDragged
        //MOVIMIENTO DE LA VENTANA DEL PROGRAMA
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelMouseDragged

    private void botonExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonExitMouseEntered
        //HOVER DEL BOTON DE CERRAR
        botonExit.setBackground(Color.red);
        botonExitLabel.setForeground(Color.white);
    }//GEN-LAST:event_botonExitMouseEntered

    private void botonExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonExitMouseExited
        //HOVER DEL BOTON DE CERRAR
        botonExit.setBackground(new Color(255, 102, 0));
        botonExitLabel.setForeground(Color.black);
    }//GEN-LAST:event_botonExitMouseExited

    private void botonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonExitMouseClicked
        //CERRAR EL PROGRAMA
        System.exit(0);
    }//GEN-LAST:event_botonExitMouseClicked

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        //VALIDAR EL INGRESO DE DATOS EN LA TABLA DE CLIENTE
        if (!"".equals(dniTXT_2.getText())
                && !"".equals(nombreTXT_2.getText())
                && !"".equals(telefonoTXT_2.getText())
                && !"".equals(direccionTXT_2.getText())) {
            cliente.setDni(Integer.parseInt(dniTXT_2.getText()));
            cliente.setNombre((nombreTXT_2.getText()));
            cliente.setTelefono(Integer.parseInt(telefonoTXT_2.getText()));
            cliente.setDireccion((direccionTXT_2.getText()));
            cliente.setRazonSocial((rSocialTXT_2.getText()));
            clientedao.RegistrarCliente(cliente);
            LimpiarTabla();
            LimpiarCliente();
            ListarCliente();
            JOptionPane.showMessageDialog(null, "Cliente registrado");
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClientesActionPerformed
        //METODOS
        LimpiarTabla();
        ListarCliente();
        //SELECCIONA LA TABLA 2 AL PRESIONAR EL BOTON CLIENTES
        body.setSelectedIndex(1);
    }//GEN-LAST:event_botonClientesActionPerformed

    private void tabla_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_2MouseClicked
        //ASIGNA LOS DATOS DE LA TABLA AL FORMULARIO PARA QUE SEAN EDITADOS
        int fila = tabla_2.rowAtPoint(evt.getPoint());
        idClienteTXT.setText(tabla_2.getValueAt(fila, 0).toString());
        dniTXT_2.setText(tabla_2.getValueAt(fila, 1).toString());
        nombreTXT_2.setText(tabla_2.getValueAt(fila, 2).toString());
        telefonoTXT_2.setText(tabla_2.getValueAt(fila, 3).toString());
        direccionTXT_2.setText(tabla_2.getValueAt(fila, 4).toString());
        rSocialTXT_2.setText(tabla_2.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_tabla_2MouseClicked

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if (!"".equals(idClienteTXT.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar?");
            if (pregunta == 0) {
                int id = Integer.parseInt(idClienteTXT.getText());
                clientedao.eliminarCliente(id);
                LimpiarTabla();
                ListarCliente();
                LimpiarCliente();
            }
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        if ("".equals(idClienteTXT.getText())) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        } else {
            if (!"".equals(dniTXT_2.getText())
                    && !"".equals(nombreTXT_2.getText())
                    && !"".equals(telefonoTXT_2.getText())
                    && !"".equals(direccionTXT_2.getText())) {
                cliente.setDni(Integer.parseInt(dniTXT_2.getText()));
                cliente.setNombre((nombreTXT_2.getText()));
                cliente.setTelefono(Integer.parseInt(telefonoTXT_2.getText()));
                cliente.setDireccion((direccionTXT_2.getText()));
                cliente.setRazonSocial((rSocialTXT_2.getText()));
                cliente.setIdCliente(Integer.parseInt(idClienteTXT.getText()));
                clientedao.modificarClientes(cliente);
                LimpiarTabla();
                LimpiarCliente();
                ListarCliente();
            } else {
                JOptionPane.showMessageDialog(null, "Los campos estan vacios");
            }
        }
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        LimpiarCliente();
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonGuardar_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardar_3ActionPerformed
        //VALIDAR EL INGRESO DE DATOS EN LA TABLA DE CLIENTE
        if (!"".equals(rucTXT_3.getText())
                && !"".equals(nombreTXT_3.getText())
                && !"".equals(telefonoTXT_3.getText())
                && !"".equals(direccionTXT_3.getText())) {
            proveedor.setRuc(Integer.parseInt(rucTXT_3.getText()));
            proveedor.setNombre((nombreTXT_3.getText()));
            proveedor.setTelefono(Integer.parseInt(telefonoTXT_3.getText()));
            proveedor.setDireccion((direccionTXT_3.getText()));
            proveedor.setRazonSocial((rSocialTXT_3.getText()));
            proveedordao.RegistrarProveedor(proveedor);
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_botonGuardar_3ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar_panel_6;
    private javax.swing.JTabbedPane body;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonActualizar_3;
    private javax.swing.JButton botonActualizar_4;
    private javax.swing.JButton botonClientes;
    private javax.swing.JButton botonConfig;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonEliminar_3;
    private javax.swing.JButton botonEliminar_4;
    private javax.swing.JButton botonExcel_4;
    private javax.swing.JPanel botonExit;
    private javax.swing.JLabel botonExitLabel;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonGuardar_3;
    private javax.swing.JButton botonGuardar_4;
    private javax.swing.JButton botonNuevaVenta;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonNuevo_3;
    private javax.swing.JButton botonNuevo_4;
    private javax.swing.JButton botonPDF;
    private javax.swing.JButton botonProductos;
    private javax.swing.JButton botonProveedor;
    private javax.swing.JButton botonVentas;
    private javax.swing.JLabel cantidad;
    private javax.swing.JTextField cantidadTXT;
    private javax.swing.JTextField cantidadTXT_4;
    private javax.swing.JLabel cantidad_panel_4;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField codigoTXT;
    private javax.swing.JTextField codigoTXT_4;
    private javax.swing.JLabel codigo_panel_4;
    private javax.swing.JLabel descripcion;
    private javax.swing.JTextField descripcionTXT;
    private javax.swing.JTextField descripcionTXT_4;
    private javax.swing.JLabel descripcion_panel_4;
    private javax.swing.JTextField direccionCV_TXT;
    private javax.swing.JTextField direccionTXT_2;
    private javax.swing.JTextField direccionTXT_3;
    private javax.swing.JTextField direccionTXT_6;
    private javax.swing.JLabel direccion_panel_2;
    private javax.swing.JLabel direccion_panel_3;
    private javax.swing.JLabel direccion_panel_6;
    private javax.swing.JLabel dni;
    private javax.swing.JTextField dniTXT;
    private javax.swing.JTextField dniTXT_2;
    private javax.swing.JLabel dni_panel_2;
    private javax.swing.JButton eliminar;
    private javax.swing.JPanel header;
    private javax.swing.JTextField idClienteTXT;
    private javax.swing.JTextField idProductoNV_TXT;
    private javax.swing.JTextField idProductoTXT;
    private javax.swing.JTextField idProveedorTXT;
    private javax.swing.JTextField idVentasTXT;
    private javax.swing.JButton imprimir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logoEmpresa;
    private javax.swing.JPanel navBar;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreTXT;
    private javax.swing.JTextField nombreTXT_2;
    private javax.swing.JTextField nombreTXT_3;
    private javax.swing.JTextField nombreTXT_6;
    private javax.swing.JLabel nombre_panel_2;
    private javax.swing.JLabel nombre_panel_3;
    private javax.swing.JLabel nombre_panel_6;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel_1;
    private javax.swing.JPanel panel_2;
    private javax.swing.JPanel panel_3;
    private javax.swing.JPanel panel_4;
    private javax.swing.JPanel panel_5;
    private javax.swing.JPanel panel_6;
    private javax.swing.JLabel precio;
    private javax.swing.JTextField precioTXT;
    private javax.swing.JTextField precioTXT_4;
    private javax.swing.JLabel precio_panel_4;
    private javax.swing.JLabel proveedor_4;
    private javax.swing.JTextField rSocialTXT_2;
    private javax.swing.JTextField rSocialTXT_3;
    private javax.swing.JTextField rSocialTXT_6;
    private javax.swing.JLabel rSocial_panel_2;
    private javax.swing.JLabel rSocial_panel_3;
    private javax.swing.JLabel rSocial_panel_6;
    private javax.swing.JTextField razonCV_TXT;
    private javax.swing.JTextField rucTXT_3;
    private javax.swing.JTextField rucTXT_6;
    private javax.swing.JLabel ruc_panel_3;
    private javax.swing.JLabel ruc_panel_6;
    private javax.swing.JLabel stock;
    private javax.swing.JTextField stockTXT;
    private javax.swing.JTable tabla_1;
    private javax.swing.JTable tabla_2;
    private javax.swing.JTable tabla_3;
    private javax.swing.JTable tabla_4;
    private javax.swing.JScrollPane tabla_clientes;
    private javax.swing.JScrollPane tabla_nuevaVenta;
    private javax.swing.JScrollPane tabla_productos;
    private javax.swing.JScrollPane tabla_proveedor;
    private javax.swing.JScrollPane tabla_ventas;
    private javax.swing.JTextField telefonoCV_TXT;
    private javax.swing.JTextField telefonoTXT_2;
    private javax.swing.JTextField telefonoTXT_3;
    private javax.swing.JTextField telefonoTXT_6;
    private javax.swing.JLabel telefono_panel_2;
    private javax.swing.JLabel telefono_panel_3;
    private javax.swing.JLabel telefono_panel_6;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo_tabla_6;
    private javax.swing.JLabel total;
    private javax.swing.JLabel total_precio;
    // End of variables declaration//GEN-END:variables
    private void LimpiarCliente() {
        idClienteTXT.setText("");
        dniTXT_2.setText("");
        nombreTXT_2.setText("");
        telefonoTXT_2.setText("");
        direccionTXT_2.setText("");
        rSocialTXT_2.setText("");
    }

}
