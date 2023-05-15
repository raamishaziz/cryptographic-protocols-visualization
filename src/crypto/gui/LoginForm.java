package crypto.gui;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class LoginForm {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 791, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setForeground(Color.GRAY);
		panel.setBounds(0, 0, 333, 461);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setIcon(new ImageIcon(LoginForm.class.getResource("/images/download.jpg")));
		lblNewLabel.setBounds(10, 28, 313, 377);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Visualization Tool");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(90, 355, 233, 50);
		panel.add(lblNewLabel_1);
		
		Button button = new Button("Login");
		button.setBackground(Color.GRAY);
		button.setForeground(Color.BLACK);
		button.setBounds(490, 339, 127, 32);
		frame.getContentPane().add(button);
		
		textField = new JTextField();
		textField.setBounds(412, 127, 288, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(412, 158, 288, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setBounds(412, 90, 140, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(412, 219, 288, 32);
		frame.getContentPane().add(textField_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(412, 181, 140, 14);
		frame.getContentPane().add(lblPassword);
		
		Button button_1 = new Button("SignUp");
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(Color.GRAY);
		button_1.setBounds(490, 399, 127, 32);
		frame.getContentPane().add(button_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(412, 249, 288, 2);
		frame.getContentPane().add(separator_1);
	}
}
