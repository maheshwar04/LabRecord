package todoList;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class todo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					todo frame = new todo();
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

	public todo() {
		con = (Connection) DB.dbconnect();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 552);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(27, 219, 228));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("My to-Do List");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 22));
		lblNewLabel.setBounds(282, 10, 142, 48);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Important Task");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(51, 51, 51));
		lblNewLabel_1.setBounds(39, 98, 174, 31);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Not Imp");
		lblNewLabel_1_1.setForeground(new Color(51, 51, 51));
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(39, 170, 174, 31);
		contentPane.add(lblNewLabel_1_1);

		textField = new JTextField();
		textField.setBounds(201, 101, 223, 28);
		contentPane.add(textField);
		textField.setColumns(10);

		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBounds(201, 172, 223, 238);
		contentPane.add(textArea);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton.setForeground(new Color(0, 128, 255));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String imp = textField.getText();
					String other = textArea.getText();
					PreparedStatement pst = (PreparedStatement) con.prepareStatement("insert into todo(important, other)values(?, ?)");
					pst.setString(1, imp);
					pst.setString(2, other);

					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "task added");
					textField.setText("");
					textArea.setText("");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(39, 444, 110, 40);
		contentPane.add(btnNewButton);

		JButton btnEdit = new JButton("Edit");
		btnEdit.setForeground(new Color(0, 128, 255));
		btnEdit.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnEdit.setBackground(Color.WHITE);
		btnEdit.setBounds(184, 444, 103, 40);
		contentPane.add(btnEdit);

		JButton btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnDone.setForeground(new Color(0, 128, 255));
		btnDone.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnDone.setBackground(Color.WHITE);
		btnDone.setBounds(322, 444, 103, 40);
		contentPane.add(btnDone);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(481, 105, 347, 301);
		contentPane.add(scrollPane);

		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Important ", "Not Imp" }));

	}
}