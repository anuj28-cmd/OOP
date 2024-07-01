package OOP.Lab_Exp;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Lab_exp6 {
	
	final String url = "jdbc:mysql://localhost:3306/Lab6";
	final String name = "root";
	final String password = "Look@me1";
	
	JTextField studentName;
	JTextField rollNumber;
	JTextField studentClass;
	JFrame f;
	
	Lab_exp6() {
		f = new JFrame();
		f.setBounds(150, 150, 640, 360);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		
		JLabel sName = new JLabel("Name");
		sName.setFont(new Font("Tahoma", Font.BOLD, 16));
		sName.setBounds(50, 60, 100, 50);
		f.getContentPane().add(sName);
		JLabel sNumber = new JLabel("Roll No.");
		sNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		sNumber.setBounds(50, 110, 100, 50);
		f.getContentPane().add(sNumber);
		JLabel sClass = new JLabel("Class");
		sClass.setFont(new Font("Tahoma", Font.BOLD, 16));
		sClass.setBounds(50, 160, 100, 50);
		f.getContentPane().add(sClass);
		
		studentName = new JTextField();
		studentName.setBounds(200, 75, 150, 20);
		f.getContentPane().add(studentName);
		
		rollNumber = new JTextField();
		rollNumber.setBounds(200, 125, 150, 20);
		f.getContentPane().add(rollNumber);
		
		studentClass = new JTextField();
		studentClass.setBounds(200, 175, 150, 20);
		f.getContentPane().add(studentClass);
		
		JButton addButton = new JButton("ADD");
		addButton.setBounds(400, 40, 120, 30);
		addButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		f.getContentPane().add(addButton);
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = DriverManager.getConnection(url, name, password);
					Statement st = con.createStatement();
					String q = "INSERT INTO student VALUES(\"" + studentName.getText().trim() + 
							"\", " + Integer.parseInt(rollNumber.getText().trim()) + ", \"" + studentClass.getText().trim() + "\");";
					st.executeUpdate(q);
					con.close();
					studentName.setText("");
					rollNumber.setText("");
					studentClass.setText("");
					JOptionPane.showMessageDialog(null, "Succesfully updated Table");
				}
				catch(SQLException ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		
		JButton upButton = new JButton("UPDATE");
		upButton.setBounds(400, 90, 120, 30);
		upButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		f.getContentPane().add(upButton);
		upButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = DriverManager.getConnection(url, name, password);
					Statement st = con.createStatement();
					String q = "UPDATE student SET Name = \"" + studentName.getText().trim() + "\", class = \"" + 
					studentClass.getText().trim() + "\" WHERE roll_no = " + Integer.parseInt(rollNumber.getText().trim()) + ";";
					st.executeUpdate(q);
					con.close();
					studentName.setText("");
					rollNumber.setText("");
					studentClass.setText("");
					JOptionPane.showMessageDialog(null, "Succesfully updated Table");
				}
				catch(SQLException ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		
		JButton delButton = new JButton("DELETE");
		delButton.setBounds(400, 140, 120, 30);
		delButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		f.getContentPane().add(delButton);
		delButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = DriverManager.getConnection(url, name, password);
					Statement st  =con.createStatement();
					String q = "DELETE FROM student WHERE roll_no = " + Integer.parseInt(rollNumber.getText().trim()) + ";";
					st.executeUpdate(q);
					JOptionPane.showMessageDialog(null, "Succesfully updated Table");
					con.close();
				}
				catch(SQLException ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		
		JButton dispButton = new JButton("DISPLAY");
		dispButton.setBounds(400, 190, 120, 30);
		dispButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		f.getContentPane().add(dispButton);
		dispButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame tframe = new JFrame("Table");
				JTable table;
				String[] columns = {"Name", "Roll No", "Class"};
				DefaultTableModel model = new DefaultTableModel();
				model.setColumnIdentifiers(columns);
				table = new JTable();
				table.setModel(model);
				table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				table.setFillsViewportHeight(true);
				JScrollPane pane = new JScrollPane(table);
				pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
				try {
					Connection con = DriverManager.getConnection(url, name, password);
					Statement st = con.createStatement();
					String q = "SELECT * FROM student";
					ResultSet rs = st.executeQuery(q);
					int i = 0;
					while(rs.next()) {
						i = 1;
						String name = rs.getString(1);
						int roll = rs.getInt(2);
						String c = rs.getString(3);
						model.addRow(new Object[] {name, roll, c});
					}
					if(i == 0)
						JOptionPane.showMessageDialog(null, "No Records");
				}
				catch(SQLException ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
				
				tframe.add(pane);
				tframe.setSize(400, 300);
				tframe.setVisible(true);
			}
		});
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Lab_exp6();
	}
}