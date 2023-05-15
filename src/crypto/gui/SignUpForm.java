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

public class SignUpForm {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpForm window = new SignUpForm();
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
	public SignUpForm() {
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
		lblNewLabel.setIcon(new ImageIcon(SignUpForm.class.getResource("/images/download.jpg")));
		lblNewLabel.setBounds(10, 28, 313, 377);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Visualization Tool");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(90, 355, 233, 50);
		panel.add(lblNewLabel_1);
		
		Button button = new Button("Sign Up");
		button.setBackground(Color.GRAY);
		button.setForeground(Color.BLACK);
		button.setBounds(489, 401, 127, 32);
		frame.getContentPane().add(button);
		
		textField = new JTextField();
		textField.setBounds(412, 90, 288, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(412, 122, 288, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setBounds(412, 62, 140, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(412, 173, 288, 32);
		frame.getContentPane().add(textField_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(412, 148, 140, 14);
		frame.getContentPane().add(lblPassword);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(412, 254, 288, 32);
		frame.getContentPane().add(textField_2);
		
		JLabel lblRetypePassword = new JLabel("Retype Password");
		lblRetypePassword.setBounds(412, 229, 140, 14);
		frame.getContentPane().add(lblRetypePassword);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(412, 333, 288, 32);
		frame.getContentPane().add(textField_3);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(412, 308, 140, 14);
		frame.getContentPane().add(lblEmail);
	}
}
