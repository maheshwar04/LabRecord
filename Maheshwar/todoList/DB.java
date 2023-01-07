

package todoList;

import javax.swing.*;
import java.awt.EventQueue;

import java.sql.*;

import com.mysql.*;
import com.mysql.cj.jdbc.Driver;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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
import java.sql.DriverManager;
import java.awt.event.ActionEvent;

public class DB {
	Connection con = null;
	java.sql.PreparedStatement pst;

	public static Connection dbconnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/todolist", "root",""); 
			return conn;
		} catch (Exception e2) {
			System.out.println(e2);
			return null;
		}
	}

}