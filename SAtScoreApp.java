package Practice;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class SAtScoreApp extends JFrame {

	protected DefaultTableModel model;
	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf8;
	private JTextField tf10;
	private JTable table;
	private JTextField tf11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SAtScoreApp frame = new SAtScoreApp();
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
	public SAtScoreApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1218, 752);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setForeground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel NAME_6 = new JLabel("NAME");
		NAME_6.setHorizontalAlignment(SwingConstants.CENTER);
		NAME_6.setForeground(Color.BLACK);
		NAME_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		NAME_6.setBounds(98, 496, 112, 33);
		contentPane.add(NAME_6);

		JLabel NAME_7 = new JLabel("NAME");
		NAME_7.setHorizontalAlignment(SwingConstants.CENTER);
		NAME_7.setForeground(Color.BLACK);
		NAME_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		NAME_7.setBounds(98, 545, 112, 33);
		contentPane.add(NAME_7);

		JLabel NAME_8 = new JLabel("NAME");
		NAME_8.setHorizontalAlignment(SwingConstants.CENTER);
		NAME_8.setForeground(Color.BLACK);
		NAME_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		NAME_8.setBounds(98, 649, 112, 33);
		contentPane.add(NAME_8);

		JLabel lblScore = new JLabel("SCORE");
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setForeground(Color.BLACK);
		lblScore.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblScore.setBounds(98, 600, 112, 33);
		contentPane.add(lblScore);

		tf7 = new JTextField();
		tf7.setColumns(10);
		tf7.setBounds(233, 503, 137, 24);
		contentPane.add(tf7);

		tf8 = new JTextField();
		tf8.setColumns(10);
		tf8.setBounds(233, 552, 137, 24);
		contentPane.add(tf8);

		tf10 = new JTextField();

		tf10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*JTable table = new JTable();
				JTextField tf = new JTextField();
				String txt = tf10.getText().trim();
				for(int i= 0; i< table.getRowCount();i++) {
					String tt = table.getValueAt(i, 0).toString();
					if(tt.equals(txt)) {
						((DefaultTableModel)table.getModel()).removeRow(i);
						break;
					}
			}*/

			}
		});
		tf10.setColumns(10);
		tf10.setBounds(233, 656, 137, 24);
		contentPane.add(tf10);

		JTextField tf9 = new JTextField();
		tf9.setColumns(10);
		tf9.setBounds(233, 607, 137, 24);
		contentPane.add(tf9);

		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				String searchText = tf10.getText();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				int columnNumber = -1;
				for (int i = 0; i < model.getRowCount(); i++) {
					String columnName = model.getColumnName(i);
					if (columnName.equals(searchText)) {
						columnNumber = i;
						break;
					}

				}
				if (columnNumber != -1) {
					// loop through the rows to find the matching cell and remove the row if found
					for (int i = 0; i < model.getRowCount(); i++) {
						if (model.getValueAt(i, columnNumber).equals(searchText)) {
							model.removeRow(i);
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "Column not found.");
				}
				//DefaultTableModel model =(DefaultTableModel)table.getModel();
				//String txt = tf10.getText();


				/*int columnIndex = table.getColumnModel().getColumnIndex(tf.getName());
				for(int i= 0; i< table.getRowCount();i++) {
					Object CellValue = table.getValueAt(i, columnIndex);

					if(CellValue != null && CellValue.toString().equals(tf.getText())) {
						((DefaultTableModel)table.getModel()).removeRow(i);
						i--;
					}
				}*/
				/*String dlt = tf10.getText();
				DefaultTableModel model =(DefaultTableModel)table.getModel();
				//int rowCount = model.getRowCount();
				for(int i= 0; i < model.getRowCount();i++) {
					String name = model.getValueAt(i, 0).toString();
					if(name.equals(tf10)) {
						model.removeRow(i);
						break;
					}
					//JTextField tf = (JTextField)model.getValueAt(i, ); 	
				}*/
			}
		});
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnDelete.setBackground(Color.RED);
		btnDelete.setBounds(404, 649, 123, 33);
		contentPane.add(btnDelete);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				//DefaultTableModel model =(DefaultTableModel)table.getModel();

			}
		});
		scrollPane.setBounds(624, 44, 452, 426);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"NAME", "ADDRESS", "CITY", "COUNTRY", "PIN CODE","SAT SCORE","RESULT"
				}
				));

		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnDisplay.setForeground(Color.BLACK);
		btnDisplay.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnDisplay.setBackground(Color.RED);
		btnDisplay.setBounds(812, 529, 123, 33);
		contentPane.add(btnDisplay);

		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnExit.setBackground(Color.RED);
		btnExit.setBounds(812, 600, 123, 33);
		contentPane.add(btnExit);

		JPanel panel = new JPanel();
		panel.setBounds(58, 44, 536, 661);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel NAME = new JLabel("NAME");
		NAME.setBounds(10, 20, 112, 33);
		panel.add(NAME);
		NAME.setForeground(new Color(0, 0, 0));
		NAME.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		NAME.setHorizontalAlignment(SwingConstants.CENTER);

		tf1 = new JTextField();
		tf1.setBounds(120, 27, 137, 24);
		panel.add(tf1);
		tf1.setColumns(10);

		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setBounds(10, 82, 112, 33);
		panel.add(lblAddress);
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setForeground(Color.BLACK);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));

		tf2 = new JTextField();
		tf2.setBounds(120, 89, 137, 24);
		panel.add(tf2);
		tf2.setColumns(10);

		JLabel lblCity = new JLabel("CITY");
		lblCity.setBounds(10, 139, 112, 33);
		panel.add(lblCity);
		lblCity.setHorizontalAlignment(SwingConstants.CENTER);
		lblCity.setForeground(Color.BLACK);
		lblCity.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));

		tf3 = new JTextField();
		tf3.setBounds(120, 146, 137, 24);
		panel.add(tf3);
		tf3.setColumns(10);

		JLabel lblCountry = new JLabel("COUNTRY");
		lblCountry.setBounds(10, 199, 112, 33);
		panel.add(lblCountry);
		lblCountry.setHorizontalAlignment(SwingConstants.CENTER);
		lblCountry.setForeground(Color.BLACK);
		lblCountry.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));

		tf4 = new JTextField();
		tf4.setBounds(120, 206, 137, 24);
		panel.add(tf4);
		tf4.setColumns(10);

		JLabel lblPincode = new JLabel("PINCODE");
		lblPincode.setBounds(10, 248, 112, 33);
		panel.add(lblPincode);
		lblPincode.setHorizontalAlignment(SwingConstants.CENTER);
		lblPincode.setForeground(Color.BLACK);
		lblPincode.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));

		tf5 = new JTextField();
		tf5.setBounds(120, 255, 137, 24);
		panel.add(tf5);
		tf5.setColumns(10);

		tf6 = new JTextField();
		tf6.setBounds(120, 305, 137, 24);
		panel.add(tf6);
		tf6.setColumns(10);

		JLabel lblSatScore = new JLabel("SAT SCORE");
		lblSatScore.setBounds(-2, 298, 112, 33);
		panel.add(lblSatScore);
		lblSatScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblSatScore.setForeground(Color.BLACK);
		lblSatScore.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));

		JButton btnGetRank = new JButton("INSERT ");
		btnGetRank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tf1.getText();
				String add = tf2.getText();
				String city = tf3.getText();
				String country = tf4.getText();
				String pin = tf5.getText();
				String scr = tf6.getText();
				//try {
					int sr = Integer.parseInt(scr);
					if(sr>= 30) {
						tf11.setText("Pass");
						//System.exit(0);
					}
					else {
						tf11.setText("Fail");
					}
				//}catch(NumberFormatException e1) {
					
				//}
				String rank = tf11.getText();
				DefaultTableModel model =(DefaultTableModel)table.getModel();
				//model = new DefaultTableModel();
				Object[] rowData = {name,add,city,country,pin,scr,rank};
				model.addRow(rowData);

				tf1.setText(" ");
				tf2.setText(" ");
				tf3.setText(" ");
				tf4.setText(" ");
				tf6.setText(" ");
				tf5.setText(" ");
				tf11.setText(" ");

			}
		});
		btnGetRank.setBounds(120, 374, 123, 33);
		panel.add(btnGetRank);
		btnGetRank.setForeground(Color.BLACK);
		btnGetRank.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnGetRank.setBackground(Color.RED);

		JButton btnUpdateScore = new JButton("UPDATE SCORE");
		btnUpdateScore.setBounds(341, 520, 172, 33);
		panel.add(btnUpdateScore);
		btnUpdateScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


			}
		});
		btnUpdateScore.setForeground(Color.BLACK);
		btnUpdateScore.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnUpdateScore.setBackground(Color.RED);

		JButton btnGetRank_2 = new JButton("GET RANK");
		//JTextField nameField = new JTextField(20);
		btnGetRank_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnGetRank_2.setForeground(Color.BLACK);
		btnGetRank_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnGetRank_2.setBackground(Color.RED);
		btnGetRank_2.setBounds(356, 452, 123, 33);
		panel.add(btnGetRank_2);

		JLabel lblResult = new JLabel("Result");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setForeground(Color.BLACK);
		lblResult.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblResult.setBounds(273, 298, 112, 33);
		panel.add(lblResult);

		tf11 = new JTextField();
		tf11.setColumns(10);
		tf11.setBounds(395, 307, 137, 24);
		panel.add(tf11);

		
		
	}
}
