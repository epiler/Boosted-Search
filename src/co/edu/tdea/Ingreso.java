// Paquetes y librerias
package co.edu.tdea;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
// Clase 
public class Ingreso extends JFrame {
	// Atributos
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTable table;
    private DefaultTableModel tablemodel;

    // Metodo main
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    Ingreso frame = new Ingreso();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Constructor
    public Ingreso() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(245, 245, 245)); // Color de fondo claro
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));

        setContentPane(contentPane);

        JLabel lblTitle = new JLabel("Ingreso de Productos");
        lblTitle.setForeground(new Color(0, 0, 0)); // Color negro
        lblTitle.setFont(new Font("Arial Black", Font.BOLD, 20));
        
        tablemodel = new DefaultTableModel();
        tablemodel.addColumn("Producto");
        tablemodel.addColumn("Cantidad");
        tablemodel.addColumn("Fecha de solicitud");
        tablemodel.addColumn("Codigo");
        tablemodel.addColumn("Proveedor");
        
        table = new JTable(tablemodel); 
        JScrollPane scrollPane = new JScrollPane (table);

        JLabel lblProducto = new JLabel("Producto:");
        lblProducto.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JLabel lblFecha = new JLabel("Fecha de solicitud:");
        lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JLabel lblProveedor = new JLabel("Proveedor:");
        lblProveedor.setFont(new Font("Tahoma", Font.PLAIN, 13));

        textField = new JTextField();
        textField.setColumns(10);

        textField_5 = new JTextField();
        textField_5.setColumns(10);

        textField_6 = new JTextField();
        textField_6.setColumns(10);

        textField_7 = new JTextField();
        textField_7.setColumns(10);

        textField_8 = new JTextField();
        textField_8.setColumns(10);
        
        // Creacion de los botones
        JButton btnIngresar = new JButton("Ingresar");
        btnIngresar.setBackground(new Color(0, 153, 76)); // Color verde
        btnIngresar.setForeground(Color.black);
        
        btnIngresar.addActionListener(e->{
        	 String producto = textField.getText();
             String cantidad = textField_5.getText();
             String fecha = textField_6.getText();
             String codigo = textField_7.getText();
             String proveedor = textField_8.getText();
             
             tablemodel.addRow(new Object[]{producto, cantidad, fecha, codigo, proveedor});
             
             //Mensaje de confirmacion de que el producto fue guardado
        	JOptionPane.showMessageDialog(this,"Producto ingresado", "Confirmacion", JOptionPane.INFORMATION_MESSAGE );
        });
        JButton btnMostrarDatos = new JButton("Informacón");  // Boton adiciional para ver lo que se guardo
        btnMostrarDatos.setBackground(new Color(51, 153, 255)); // Color azul
        btnMostrarDatos.setForeground(Color.black);
        
        btnMostrarDatos.addActionListener(e -> {
            StringBuilder datos = new StringBuilder();
            for (int i = 0; i < tablemodel.getRowCount(); i++) {
                for (int j = 0; j < tablemodel.getColumnCount(); j++) {
                    datos.append(tablemodel.getValueAt(i, j)).append(" | ");
                }
                datos.append("\n");
            }  // Se muestra la tabla con los datos almacenados
            JOptionPane.showMessageDialog(this, datos.toString(), "Datos de la Tabla", JOptionPane.INFORMATION_MESSAGE);
        });
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBackground(new Color (204, 0,0));
        btnCancelar.setForeground(Color.black);
        
        btnCancelar.addActionListener(e ->{
        	this.dispose();
        });
        // Organizacion de la informacion en el panel 
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
            gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                            .addGap(150)
                            .addComponent(lblTitle))
                        .addGroup(gl_contentPane.createSequentialGroup()
                            .addGap(30)
                            .addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
                                .addComponent(lblProducto)
                                .addComponent(lblCantidad)
                                .addComponent(lblFecha)
                                .addComponent(lblCodigo)
                                .addComponent(lblProveedor))
                            .addGap(18)
                            .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
                                .addComponent(textField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(textField_5)
                                .addComponent(textField_6)
                                .addComponent(textField_7)
                                .addComponent(textField_8))))
                    .addContainerGap(85, Short.MAX_VALUE))
                .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                    .addContainerGap(150, Short.MAX_VALUE)
                    .addComponent(btnIngresar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addGap(20) 
                    .addComponent(btnMostrarDatos, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addGap(20) 
                    .addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addGap(85))
        );

        gl_contentPane.setVerticalGroup(
            gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTitle)
                    .addGap(20)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblProducto)
                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblCantidad)
                        .addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblFecha)
                        .addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblCodigo)
                        .addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblProveedor)
                        .addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(30)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(btnIngresar)
                        .addComponent(btnMostrarDatos)
                        .addComponent(btnCancelar))
                    .addContainerGap(30, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
     contentPane.setLayout(gl_contentPane);
	}
}
