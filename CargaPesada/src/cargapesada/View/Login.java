package cargapesada.View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField pwdSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usuário:");
		lblUsurio.setBounds(112, 93, 66, 15);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(112, 120, 66, 15);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(176, 91, 127, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		pwdSenha = new JPasswordField();
		pwdSenha.setBounds(176, 120, 127, 19);
		contentPane.add(pwdSenha);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(176, 152, 127, 25);
		contentPane.add(btnLogin);
	}
}
