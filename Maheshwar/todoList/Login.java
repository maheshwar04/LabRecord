package todoList;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	Connection con = null;

	public Login() {
		con = (Connection) DB.dbconnect();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 662, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Login");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(102, 102, 102));
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 36));
		lblNewLabel_3.setBounds(311, 30, 296, 44);
		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setForeground(new Color(51, 51, 51));
		lblUserId.setFont(new Font("Calibri", Font.ITALIC, 14));
		lblUserId.setBounds(348, 153, 144, 18);
		frame.getContentPane().add(lblUserId);

		textField = new JTextField();
		textField.setForeground(new Color(51, 51, 51));
		textField.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(51, 51, 51)));
		textField.setBounds(348, 177, 259, 29);
		frame.getContentPane().add(textField);

		passwordField = new JPasswordField();
		passwordField.setBorder(new LineBorder(new Color(51, 51, 51)));
		passwordField.setBounds(348, 248, 259, 21);
		frame.getContentPane().add(passwordField);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(51, 51, 51));
		lblPassword.setFont(new Font("Calibri", Font.ITALIC, 14));
		lblPassword.setBounds(348, 224, 144, 18);
		frame.getContentPane().add(lblPassword);

		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(0, 128, 255));
		contentPane_1.setBounds(10, 10, 264, 411);
		frame.getContentPane().add(contentPane_1);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\akash\\OneDrive\\Desktop\\Universal (37)hfhjfj.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblNewLabel_2 = new JLabel("Todolist Login");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 14));
		GroupLayout gl_contentPane_1 = new GroupLayout(contentPane_1);
		gl_contentPane_1.setHorizontalGroup(gl_contentPane_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane_1.createSequentialGroup().addGap(21)
						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE).addGap(38))
				.addGroup(gl_contentPane_1.createSequentialGroup().addGap(54)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(57, Short.MAX_VALUE)));
		gl_contentPane_1.setVerticalGroup(gl_contentPane_1.createParallelGroup(Alignment.LEADING).addGroup(
				Alignment.TRAILING, gl_contentPane_1.createSequentialGroup().addContainerGap(100, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1).addGap(18).addComponent(lblNewLabel_2).addGap(115)));
		contentPane_1.setLayout(gl_contentPane_1);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String user = textField.getText();
					String pwd = String.valueOf(passwordField.getPassword());
					PreparedStatement pst = con.prepareStatement("select * from signup where userid=? and password=?");
					pst.setString(1, user);
					pst.setString(2, pwd);
					ResultSet r=pst.executeQuery();
//					if(r.next()) {
//						successpage s=new successpage();
//						s.setVisible(true);
//					}
//					else {
//						JOptionPane.showMessageDialog(null, "incorrect id or pwd");
//					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnLogin.setForeground(new Color(0, 128, 255));
		btnLogin.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnLogin.setBorder(null);
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setBounds(428, 358, 95, 33);
		frame.getContentPane().add(btnLogin);
	}

}