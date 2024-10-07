package co.edu.tdea;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PruebaSwing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ingreseUsuario;
	private JPasswordField contraseñaLogin;
	private Button botonLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaSwing frame = new PruebaSwing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PruebaSwing() {
		setResizable(false);
		setTitle("Boosted Search");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 345);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(99, 67, 148));
		panel.setBounds(0, 0, 202, 306);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel imagenLogin = new JLabel("New label");
		imagenLogin.setBounds(-159, 64, 316, 135);
		panel.add(imagenLogin);
		imagenLogin.setIcon(new ImageIcon("C:\\Users\\choju\\Downloads\\icono.png"));
		
		JLabel NombreEmpresa = new JLabel("Nombre empresa");
		NombreEmpresa.setForeground(new Color(0, 0, 0));
		NombreEmpresa.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		NombreEmpresa.setBounds(40, 210, 117, 24);
		panel.add(NombreEmpresa);
		
		JLabel tituloLogin = new JLabel("Login");
		tituloLogin.setFont(new Font("Yu Gothic", Font.BOLD, 21));
		tituloLogin.setBounds(314, 52, 58, 31);
		contentPane.add(tituloLogin);
		
		JLabel usuario = new JLabel("USUARIO");
		usuario.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		usuario.setBounds(316, 114, 51, 14);
		contentPane.add(usuario);
		
		ingreseUsuario = new JTextField();
		ingreseUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		ingreseUsuario.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		ingreseUsuario.setText("Ingrese su nombre de usuario");
		ingreseUsuario.setForeground(new Color(128, 128, 128));
		ingreseUsuario.setBounds(264, 139, 160, 20);
		contentPane.add(ingreseUsuario);
		ingreseUsuario.setColumns(10);
		
		JLabel contraseña = new JLabel("CONTRASEÑA");
		contraseña.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		contraseña.setBounds(305, 170, 79, 20);
		contentPane.add(contraseña);
		
		botonLogin = new Button("Entrar");
		botonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] contraseña = contraseñaLogin.getPassword();
				String clave = new String(contraseña);
				
				if(ingreseUsuario.getText().equals("aaa") && clave.equals("777")) {
				dispose();
				JOptionPane.showMessageDialog(null, "Bienvenido");
				
				
				
				}else {
				JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos");
			}
			
			
			}
			
		});
		botonLogin.setForeground(new Color(255, 255, 255));
		botonLogin.setBackground(new Color(99, 67, 148));
		botonLogin.setBounds(305, 244, 70, 22);
		contentPane.add(botonLogin);
		
		Button botonRegistro = new Button("Registrarse");
		botonRegistro.setForeground(Color.WHITE);
		botonRegistro.setBackground(new Color(99, 67, 148));
		botonRegistro.setBounds(305, 274, 70, 22);
		contentPane.add(botonRegistro);
		
		contraseñaLogin = new JPasswordField();
		contraseñaLogin.setBounds(264, 214, 160, 20);
		contentPane.add(contraseñaLogin);
		
		
		
		
		
	}
}
