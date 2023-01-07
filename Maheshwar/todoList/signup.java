//Steps to make a signup page and collect data in mysql
//Create a project
//jframe and designing
//create db and table
// mysql connector
// DB.java or data connection
// connection db.java to jframe file
// 

package todoList;

//This code is written by akash dev on 5th December 2022
import java.awt.EventQueue;
import com.mysql.cj.jdbc.Driver;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		Layout of the application
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup frame = new signup();
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
	Connection con = null;

	public signup() {// this file is connected to our database now
		con = DB.dbconnect();

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBackground(new Color(0, 128, 255));
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\akash\\OneDrive\\Desktop\\Universal (37)hfhjfj.png"));

		JLabel lblNewLabel_2 = new JLabel("ToDo list SignUp");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 14));
		GroupLayout gl_contentPane_1 = new GroupLayout(contentPane_1);
		gl_contentPane_1
				.setHorizontalGroup(gl_contentPane_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane_1.createSequentialGroup().addGap(49)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 143,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(62, Short.MAX_VALUE))
						.addGroup(gl_contentPane_1.createSequentialGroup().addContainerGap()
								.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
								.addGap(49)));
		gl_contentPane_1.setVerticalGroup(gl_contentPane_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane_1.createSequentialGroup().addGap(108).addComponent(lblNewLabel_1)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblNewLabel_2)
						.addContainerGap(115, Short.MAX_VALUE)));
		contentPane_1.setLayout(gl_contentPane_1);

		JLabel lblNewLabel_3 = new JLabel("Sign Up");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(102, 102, 102));
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 36));

		// text field for name
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(51, 51, 51)));
		textField.setForeground(new Color(51, 51, 51));
		textField.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField.setColumns(10);

		// text field for user id
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(51, 51, 51));
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(new Color(51, 51, 51)));

		// text field for email id
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(51, 51, 51));
		textField_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(new Color(51, 51, 51)));

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(new Color(51, 51, 51));
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 14));

		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setForeground(new Color(51, 51, 51));
		lblUserId.setFont(new Font("Calibri", Font.ITALIC, 14));

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(51, 51, 51));
		lblPassword.setFont(new Font("Calibri", Font.ITALIC, 14));

		JLabel lblEmailId = new JLabel("email ID");
		lblEmailId.setForeground(new Color(51, 51, 51));
		lblEmailId.setFont(new Font("Calibri", Font.PLAIN, 14));

		passwordField = new JPasswordField();
		passwordField.setBorder(new LineBorder(new Color(51, 51, 51)));

		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Store all the information in a string variables.
				try {
					String first = textField.getText();
					String user = textField_1.getText();
					String password = passwordField.getText();
					String email = textField_2.getText();

					PreparedStatement pst = con.prepareStatement("insert into signup(name, userid, password, emailid)values(?, ?, ?, ?)");
					pst.setString(1, first);
					pst.setString(2, user);
					pst.setString(3, password);
					pst.setString(4, email);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "sign in successful");
					textField.setText("");

					textField_1.setText("");

					passwordField.setText("");

					textField_2.setText("");

				} catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(0, 128, 255));
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnNewButton.setBackground(new Color(255, 255, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addComponent(contentPane_1, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
						.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 144,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 259,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 259,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblUserId, GroupLayout.PREFERRED_SIZE, 144,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 144,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblEmailId, GroupLayout.PREFERRED_SIZE, 144,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 259,
												Short.MAX_VALUE)
										.addComponent(passwordField)))
						.addGap(33))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(121)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
								.addContainerGap()))));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(contentPane_1, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(lblNewLabel_3)
						.addGap(26)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(lblUserId, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(lblEmailId, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)));
		contentPane.setLayout(gl_contentPane);
	}
}
Footer
