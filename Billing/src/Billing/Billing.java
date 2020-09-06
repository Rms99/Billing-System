package Billing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.text.JTextComponent;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.PrintStream;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import javax.swing.DropMode;

public class Billing extends JFrame {

	private JPanel contentPane;
	private JTextField jtxtID;
	private JTextField jtxtf;
	private JTextField jtxtl;
	private JTextField jtxtadd;
	private JTextField jtxttoken;
	private JTextField jtxtdob;
	private JTextField jtxtmobile;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_15;
	private JTextField jtxtinst;
	private JTextField jtxtbeef;
	private JTextField jtxtbacon;
	private JTextField jtxtchicken;
	private JTextField jtxtpork;
	private JTextField jtxtkit;
	private JTextField jtxtoreo;
	private JTextField jtxtcoffee;
	private JTextField jtxtveg;
	private JTextField jtxtnut;
	private JTextField jtxttax;
	private JTextField jtxtsubtotal;
	private JTextField jtxttotal;
	private JFrame exit;
	private JTextField jtxtFinal;
	private JCheckBox chckbxpork;
	
	
	String total, subtotal, tax;
	double[] itemprice = new double[50];
	private JTextField jtxtFinal1;
	private JTextField jtxtFinal2;
	private JTextField jtxtFinal3;
	private JTextField jtxtFinal4;
	private JTextField jtxtFinal5;
	private JTextField jtxtFinal6;
	private JTextField jtxtFinal7;
	private JTextField jtxtFinal8;
	private JTextField jtxtFinal9;
	private JTextField jtxtFinal10;
	private JTextField jtxtFinal11;
	private JTextField jtxtFinal12;
	private JTextField jtxttotall;
	private JTextField jtxttaxx;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
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
	public Billing() {
		addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent arg0)
			{
				jtxtID.setText(null);
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
				   LocalDateTime now = LocalDateTime.now();
				   int id = 100 + (int)(Math.random()*1234);
				   String date = dtf.format(now);
				   String Cid = date + id ;
				   jtxtID.setText(Cid);
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1525, 757);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 128, 128));
		panel.setBackground(new Color(0, 255, 255));
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 128, 128)));
		panel.setBounds(10, 10, 1485, 700);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(51, 21, 403, 470);
		panel_1.setForeground(new Color(0, 128, 128));
		panel_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 128, 128)));
		panel_1.setBackground(Color.CYAN);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		jtxtID = new JTextField();
		jtxtID.setBounds(182, 29, 194, 29);
		panel_1.add(jtxtID);
		jtxtID.setColumns(10);
		
		jtxtf = new JTextField();
		jtxtf.setColumns(10);
		jtxtf.setBounds(182, 73, 194, 29);
		panel_1.add(jtxtf);
		
		jtxtl = new JTextField();
		jtxtl.setColumns(10);
		jtxtl.setBounds(182, 117, 194, 29);
		panel_1.add(jtxtl);
		
		jtxtadd = new JTextField();
		jtxtadd.setColumns(10);
		jtxtadd.setBounds(182, 156, 194, 29);
		panel_1.add(jtxtadd);
		
		jtxttoken = new JTextField();
		jtxttoken.setColumns(10);
		jtxttoken.setBounds(182, 322, 194, 29);
		panel_1.add(jtxttoken);
		
		jtxtdob = new JTextField();
		jtxtdob.setColumns(10);
		jtxtdob.setBounds(182, 283, 194, 29);
		panel_1.add(jtxtdob);
		
		jtxtmobile = new JTextField();
		jtxtmobile.setColumns(10);
		jtxtmobile.setBounds(182, 195, 194, 29);
		panel_1.add(jtxtmobile);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setForeground(new Color(0, 128, 128));
		panel_1_2.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 128, 128)));
		panel_1_2.setBackground(Color.CYAN);
		panel_1_2.setBounds(0, 0, 403, 470);
		panel_1.add(panel_1_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(182, 29, 127, 29);
		panel_1_2.add(textField_8);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cust. Fname\r\n");
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(23, 73, 149, 29);
		panel_1_2.add(lblNewLabel_1_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(182, 73, 127, 29);
		panel_1_2.add(textField_9);
		
		JLabel lblNewLabel_2_2 = new JLabel("Cust. Lname\r\n");
		lblNewLabel_2_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(23, 117, 149, 29);
		panel_1_2.add(lblNewLabel_2_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(182, 117, 127, 29);
		panel_1_2.add(textField_10);
		
		JLabel lblNewLabel_3_2 = new JLabel("Address\r\n\r\n");
		lblNewLabel_3_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(23, 156, 149, 29);
		panel_1_2.add(lblNewLabel_3_2);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(182, 156, 127, 29);
		panel_1_2.add(textField_11);
		
		JLabel lblNewLabel_4_1 = new JLabel("Mobile");
		lblNewLabel_4_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_4_1.setBounds(23, 195, 149, 29);
		panel_1_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Order Type ");
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(23, 239, 149, 29);
		panel_1_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("D.O.B");
		lblNewLabel_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(23, 283, 149, 29);
		panel_1_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Token No.");
		lblNewLabel_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(23, 322, 149, 29);
		panel_1_2.add(lblNewLabel_3_1_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(182, 322, 127, 29);
		panel_1_2.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(182, 283, 127, 29);
		panel_1_2.add(textField_13);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(182, 195, 127, 29);
		panel_1_2.add(textField_15);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Payment\r\n");
		lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBounds(23, 361, 149, 29);
		panel_1_2.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Special Inst.");
		lblNewLabel_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2_1_2.setBounds(23, 405, 149, 29);
		panel_1_2.add(lblNewLabel_2_1_2);
		
		jtxtinst = new JTextField();
		jtxtinst.setColumns(10);
		jtxtinst.setBounds(182, 405, 194, 29);
		panel_1_2.add(jtxtinst);
		
		JLabel lblNewLabel = new JLabel("Cust. ID");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(23, 29, 149, 29);
		panel_1_2.add(lblNewLabel);
		
		JComboBox comboBoxorder = new JComboBox();
		comboBoxorder.setModel(new DefaultComboBoxModel(new String[] {"DINE IN", "HOME DELV.", "DINE IN"}));
		comboBoxorder.setBackground(new Color(255, 255, 255));
		comboBoxorder.setFont(new Font("Arial Black", Font.BOLD, 18));
		comboBoxorder.setBounds(182, 239, 194, 29);
		panel_1_2.add(comboBoxorder);
		
		JComboBox comboBoxpayment = new JComboBox();
		comboBoxpayment.setModel(new DefaultComboBoxModel(new String[] {"CASH", "DEBIT", "CARD"}));
		comboBoxpayment.setFont(new Font("Arial Black", Font.BOLD, 18));
		comboBoxpayment.setBounds(182, 361, 194, 29);
		panel_1_2.add(comboBoxpayment);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(517, 21, 425, 470);
		panel_1_1.setForeground(new Color(0, 128, 128));
		panel_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 128, 128)));
		panel_1_1.setBackground(Color.CYAN);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JCheckBox chckbxbeef = new JCheckBox("Beef Burger");
		chckbxbeef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxbeef.isSelected())
				{
					jtxtbeef.setEnabled(true);
					jtxtbeef.setText("");
					jtxtbeef.requestFocus();
				}
				else
				{
					jtxtbeef.setEnabled(false);
					jtxtbeef.setText("0");
				}
			}
		});
		chckbxbeef.setBackground(new Color(0, 255, 255));
		chckbxbeef.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxbeef.setBounds(23, 75, 170, 29);
		panel_1_1.add(chckbxbeef);
		
		JLabel lblNewLabel_1 = new JLabel("Menu Items");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(23, 29, 149, 29);
		panel_1_1.add(lblNewLabel_1);
		
		jtxtbeef = new JTextField();
		jtxtbeef.setFont(new Font("Arial", Font.ITALIC, 18));
		jtxtbeef.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtbeef.setText("0");
		jtxtbeef.setBounds(213, 75, 170, 29);
		panel_1_1.add(jtxtbeef);
		jtxtbeef.setColumns(10);
		
		JCheckBox chckbxbacon = new JCheckBox("Bacon Burger");
		chckbxbacon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxbacon.isSelected())
				{
					jtxtbacon.setEnabled(true);
					jtxtbacon.setText("");
					jtxtbacon.requestFocus();
				}
				else
				{
					jtxtbacon.setEnabled(false);
					jtxtbacon.setText("0");
				}
			}
		});
		chckbxbacon.setBackground(new Color(0, 255, 255));
		chckbxbacon.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxbacon.setBounds(23, 118, 170, 29);
		panel_1_1.add(chckbxbacon);
		
		jtxtbacon = new JTextField();
		jtxtbacon.setFont(new Font("Arial", Font.ITALIC, 18));
		jtxtbacon.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtbacon.setText("0");
		jtxtbacon.setColumns(10);
		jtxtbacon.setBounds(213, 118, 170, 29);
		panel_1_1.add(jtxtbacon);
		
		JCheckBox chckbxchicken = new JCheckBox("Chicken Burger");
		chckbxchicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxchicken.isSelected())
				{
					jtxtchicken.setEnabled(true);
					jtxtchicken.setText("");
					jtxtchicken.requestFocus();
				}
				else
				{
					jtxtchicken.setEnabled(false);
					jtxtchicken.setText("0");
				}
			}
		});
		chckbxchicken.setBackground(new Color(0, 255, 255));
		chckbxchicken.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxchicken.setBounds(23, 200, 170, 29);
		panel_1_1.add(chckbxchicken);
		
		jtxtchicken = new JTextField();
		jtxtchicken.setFont(new Font("Arial", Font.ITALIC, 18));
		jtxtchicken.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtchicken.setText("0");
		jtxtchicken.setColumns(10);
		jtxtchicken.setBounds(213, 200, 170, 29);
		panel_1_1.add(jtxtchicken);
		
		chckbxpork = new JCheckBox("Pork Burger");
		chckbxpork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxpork.isSelected())
				{
					jtxtpork.setEnabled(true);
					jtxtpork.setText("");
					jtxtpork.requestFocus();
				}
				else
				{
					jtxtpork.setEnabled(false);
					jtxtpork.setText("0");
				}
			}
		});
		chckbxpork.setBackground(new Color(0, 255, 255));
		chckbxpork.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxpork.setBounds(23, 157, 170, 29);
		panel_1_1.add(chckbxpork);
		
		jtxtpork = new JTextField();
		jtxtpork.setFont(new Font("Arial", Font.ITALIC, 18));
		jtxtpork.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtpork.setText("0");
		jtxtpork.setColumns(10);
		jtxtpork.setBounds(213, 157, 170, 29);
		panel_1_1.add(jtxtpork);
		
		JCheckBox chckbxkit = new JCheckBox("Kitkat Shake");
		chckbxkit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxkit.isSelected())
				{
					jtxtkit.setEnabled(true);
					jtxtkit.setText("");
					jtxtkit.requestFocus();
				}
				else
				{
					jtxtkit.setEnabled(false);
					jtxtkit.setText("0");
				}
			}
		});
		chckbxkit.setBackground(new Color(0, 255, 255));
		chckbxkit.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxkit.setBounds(23, 364, 170, 29);
		panel_1_1.add(chckbxkit);
		
		jtxtkit = new JTextField();
		jtxtkit.setFont(new Font("Arial", Font.ITALIC, 18));
		jtxtkit.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtkit.setText("0");
		jtxtkit.setColumns(10);
		jtxtkit.setBounds(213, 364, 170, 29);
		panel_1_1.add(jtxtkit);
		
		JCheckBox chckbxoreo = new JCheckBox("Oreo Shake");
		chckbxoreo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxoreo.isSelected())
				{
					jtxtoreo.setEnabled(true);
					jtxtoreo.setText("");
					jtxtoreo.requestFocus();
				}
				else
				{
					jtxtoreo.setEnabled(false);
					jtxtoreo.setText("0");
				}
			}
		});
		chckbxoreo.setBackground(new Color(0, 255, 255));
		chckbxoreo.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxoreo.setBounds(23, 321, 170, 29);
		panel_1_1.add(chckbxoreo);
		
		jtxtoreo = new JTextField();
		jtxtoreo.setFont(new Font("Arial", Font.ITALIC, 18));
		jtxtoreo.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtoreo.setText("0");
		jtxtoreo.setColumns(10);
		jtxtoreo.setBounds(213, 321, 170, 29);
		panel_1_1.add(jtxtoreo);
		
		JCheckBox chckbxcoffee = new JCheckBox("Cold Coffee");
		chckbxcoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxcoffee.isSelected())
				{
					jtxtcoffee.setEnabled(true);
					jtxtcoffee.setText("");
					jtxtcoffee.requestFocus();
				}
				else
				{
					jtxtcoffee.setEnabled(false);
					jtxtcoffee.setText("0");
				}
			}
		});
		chckbxcoffee.setBackground(new Color(0, 255, 255));
		chckbxcoffee.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxcoffee.setBounds(23, 282, 170, 29);
		panel_1_1.add(chckbxcoffee);
		
		jtxtcoffee = new JTextField();
		jtxtcoffee.setFont(new Font("Arial", Font.ITALIC, 18));
		jtxtcoffee.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtcoffee.setText("0");
		jtxtcoffee.setColumns(10);
		jtxtcoffee.setBounds(213, 282, 170, 29);
		panel_1_1.add(jtxtcoffee);
		
		jtxtveg = new JTextField();
		jtxtveg.setFont(new Font("Arial", Font.ITALIC, 18));
		jtxtveg.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtveg.setText("0");
		jtxtveg.setColumns(10);
		jtxtveg.setBounds(213, 239, 170, 29);
		panel_1_1.add(jtxtveg);
		
		JCheckBox chckbxveg = new JCheckBox("Veggie Burger");
		chckbxveg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxveg.isSelected())
				{
					jtxtveg.setEnabled(true);
					jtxtveg.setText("");
					jtxtveg.requestFocus();
				}
				else
				{
					jtxtveg.setEnabled(false);
					jtxtveg.setText("0");
				}
			}
		});
		chckbxveg.setBackground(new Color(0, 255, 255));
		chckbxveg.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxveg.setBounds(23, 239, 170, 29);
		panel_1_1.add(chckbxveg);
		
		jtxtnut = new JTextField();
		jtxtnut.setFont(new Font("Arial", Font.ITALIC, 18));
		jtxtnut.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtnut.setText("0");
		jtxtnut.setColumns(10);
		jtxtnut.setBounds(213, 409, 170, 29);
		panel_1_1.add(jtxtnut);
		
		JCheckBox chckbxnut = new JCheckBox("Nutella Shake");
		chckbxnut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxnut.isSelected())
				{
					jtxtnut.setEnabled(true);
					jtxtnut.setText("");
					jtxtnut.requestFocus();
				}
				else
				{
					jtxtnut.setEnabled(false);
					jtxtnut.setText("0");
				}
			}
		});
		chckbxnut.setBackground(new Color(0, 255, 255));
		chckbxnut.setFont(new Font("Arial Black", Font.BOLD, 16));
		chckbxnut.setBounds(23, 409, 170, 29);
		panel_1_1.add(chckbxnut);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(1010, 21, 403, 470);
		panel_1_1_1.setForeground(new Color(0, 128, 128));
		panel_1_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 128, 128)));
		panel_1_1_1.setBackground(Color.WHITE);
		panel.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		jtxtFinal = new JTextField();
		jtxtFinal.setFont(new Font("Sitka Text", Font.BOLD, 15));
		jtxtFinal.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtFinal.setBackground(new Color(255, 255, 255));
		jtxtFinal.setEditable(false);
		jtxtFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jtxtFinal.setBounds(10, 10, 383, 31);
		panel_1_1_1.add(jtxtFinal);
		jtxtFinal.setColumns(10);
		
		jtxtFinal1 = new JTextField();
		jtxtFinal1.setBounds(10, 37, 383, 31);
		panel_1_1_1.add(jtxtFinal1);
		jtxtFinal1.setColumns(10);
		
		jtxtFinal2 = new JTextField();
		jtxtFinal2.setColumns(10);
		jtxtFinal2.setBounds(10, 67, 383, 31);
		panel_1_1_1.add(jtxtFinal2);
		
		jtxtFinal3 = new JTextField();
		jtxtFinal3.setFont(new Font("Tahoma", Font.BOLD, 12));
		jtxtFinal3.setColumns(10);
		jtxtFinal3.setBounds(10, 96, 383, 31);
		panel_1_1_1.add(jtxtFinal3);
		
		jtxtFinal4 = new JTextField();
		jtxtFinal4.setColumns(10);
		jtxtFinal4.setBounds(10, 124, 383, 31);
		panel_1_1_1.add(jtxtFinal4);
		
		jtxtFinal5 = new JTextField();
		jtxtFinal5.setHorizontalAlignment(SwingConstants.LEFT);
		jtxtFinal5.setEditable(false);
		jtxtFinal5.setColumns(10);
		jtxtFinal5.setBackground(Color.WHITE);
		jtxtFinal5.setBounds(10, 154, 382, 31);
		panel_1_1_1.add(jtxtFinal5);
		
		jtxtFinal6 = new JTextField();
		jtxtFinal6.setColumns(10);
		jtxtFinal6.setBounds(10, 181, 383, 31);
		panel_1_1_1.add(jtxtFinal6);
		
		jtxtFinal7 = new JTextField();
		jtxtFinal7.setColumns(10);
		jtxtFinal7.setBounds(10, 211, 383, 31);
		panel_1_1_1.add(jtxtFinal7);
		
		jtxtFinal8 = new JTextField();
		jtxtFinal8.setColumns(10);
		jtxtFinal8.setBounds(10, 240, 383, 31);
		panel_1_1_1.add(jtxtFinal8);
		
		jtxtFinal9 = new JTextField();
		jtxtFinal9.setColumns(10);
		jtxtFinal9.setBounds(10, 268, 383, 31);
		panel_1_1_1.add(jtxtFinal9);
		
		jtxtFinal10 = new JTextField();
		jtxtFinal10.setHorizontalAlignment(SwingConstants.LEFT);
		jtxtFinal10.setEditable(false);
		jtxtFinal10.setColumns(10);
		jtxtFinal10.setBackground(Color.WHITE);
		jtxtFinal10.setBounds(10, 299, 382, 31);
		panel_1_1_1.add(jtxtFinal10);
		
		jtxtFinal11 = new JTextField();
		jtxtFinal11.setColumns(10);
		jtxtFinal11.setBounds(10, 326, 383, 31);
		panel_1_1_1.add(jtxtFinal11);
		
		jtxtFinal12 = new JTextField();
		jtxtFinal12.setColumns(10);
		jtxtFinal12.setBounds(10, 356, 383, 31);
		panel_1_1_1.add(jtxtFinal12);
		
		jtxttotall = new JTextField();
		jtxttotall.setFont(new Font("Arial Black", Font.BOLD, 15));
		jtxttotall.setColumns(10);
		jtxttotall.setBounds(10, 413, 383, 47);
		panel_1_1_1.add(jtxttotall);
		
		jtxttaxx = new JTextField();
		jtxttaxx.setFont(new Font("Tahoma", Font.BOLD, 10));
		jtxttaxx.setColumns(10);
		jtxttaxx.setBounds(10, 383, 383, 31);
		panel_1_1_1.add(jtxttaxx);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBounds(1010, 512, 403, 155);
		panel.add(panel_1_1_1_1);
		panel_1_1_1_1.setForeground(new Color(0, 128, 128));
		panel_1_1_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 128, 128)));
		panel_1_1_1_1.setBackground(Color.CYAN);
		panel_1_1_1_1.setLayout(null);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
				   LocalDateTime now = LocalDateTime.now();
				   int id = 100 + (int)(Math.random()*1234);
				   String date = dtf.format(now);
				   String Cid = date + id ;
				   jtxtID.setText(Cid);
				// Customer Information Panel
				
				jtxtf.setText("");
				jtxtl.setText("");
				jtxtadd.setText("");
				jtxtmobile.setText("");
				jtxtinst.setText("");
				jtxtdob.setText("");
				jtxttoken.setText("");
				// customer dropboxes
				
				
				// menu panel
				    //jtxt boxes
					jtxtbeef.setText("0");
					jtxtbacon.setText("0");
					jtxtpork.setText("0");
					jtxtchicken.setText("0");
					jtxtveg.setText("0");
					jtxtnut.setText("0");
					jtxtkit.setText("0");
					jtxtoreo.setText("0");
					jtxtcoffee.setText("0");
				   //chckbx 
					chckbxbeef.setSelected(false);
					chckbxbacon.setSelected(false);
					chckbxpork.setSelected(false);
					chckbxchicken.setSelected(false);
					chckbxveg.setSelected(false);
					chckbxnut.setSelected(false);
					chckbxkit.setSelected(false);
					chckbxoreo.setSelected(false);
					chckbxcoffee.setSelected(false);
				// tax panel
					jtxttax.setText("");
					jtxtsubtotal.setText("");
					jtxttotal.setText("");
					
					//reciept
					jtxtFinal.setText("");
					jtxtFinal1.setText("");
					jtxtFinal2.setText("");		
					jtxtFinal3.setText("");
					jtxtFinal4.setText("");
					jtxtFinal5.setText("");
					jtxtFinal6.setText("");
					jtxtFinal7.setText("");
					jtxtFinal8.setText("");
					jtxtFinal9.setText("");
					jtxtFinal10.setText("");
					jtxtFinal11.setText("");
					jtxtFinal12.setText("");
					jtxttotall.setText("");
					jtxttaxx.setText("");
			}
		});
		btnReset.setFont(new Font("Stencil", Font.BOLD, 24));
		btnReset.setBounds(20, 35, 175, 82);
		panel_1_1_1_1.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exit = new JFrame();
				if(JOptionPane.showConfirmDialog(exit,"Do you want to exit ?", "Billing Interface", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
				
			}
		});
		btnExit.setFont(new Font("Stencil", Font.BOLD, 24));
		btnExit.setBounds(206, 35, 175, 82);
		panel_1_1_1_1.add(btnExit);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setForeground(new Color(0, 128, 128));
		panel_1_1_1_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 128, 128)));
		panel_1_1_1_1_1.setBackground(Color.CYAN);
		panel_1_1_1_1_1.setBounds(51, 512, 403, 155);
		panel.add(panel_1_1_1_1_1);
		panel_1_1_1_1_1.setLayout(null);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					jtxtFinal.print();
				}
				catch(Exception E)
				{
					System.out.println("Printing error");
				}
			}
		});
		btnPrint.setFont(new Font("Stencil", Font.BOLD, 24));
		btnPrint.setBounds(28, 33, 175, 82);
		panel_1_1_1_1_1.add(btnPrint);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					itemprice[0] = Double.parseDouble(jtxtbeef.getText())*4.00;
					itemprice[1] = Double.parseDouble(jtxtbacon.getText())*5.00;
					itemprice[2] = Double.parseDouble(jtxtchicken.getText())*9.00;
					itemprice[3] = Double.parseDouble(jtxtpork.getText())*6.00;
					itemprice[4] = Double.parseDouble(jtxtveg.getText())*3.00;
					itemprice[5] = Double.parseDouble(jtxtcoffee.getText())*2.50;
					itemprice[6] = Double.parseDouble(jtxtkit.getText())*3.50;
					itemprice[7] = Double.parseDouble(jtxtoreo.getText())*3.50;
					itemprice[8] = Double.parseDouble(jtxtnut.getText())*3.50;
					
					itemprice[9] = itemprice[0]+itemprice[1]+itemprice[3]+itemprice[4]+itemprice[5]+itemprice[6]+itemprice[7]+itemprice[8];
					
					subtotal=String.format("$ %.2f", itemprice[9]);
					jtxtsubtotal.setText(subtotal);
			
					tax=String.format("$ %.2f", itemprice[9]*0.05); 
			        jtxttax.setText(tax);
			
			        total= String.format("$ %.2f", itemprice[9]+(itemprice[9]*0.05));
			        jtxttotal.setText(total);
			        
			        //making the reciept
			        	jtxtFinal.setEnabled(true);
			        	String s ="The Indian Cafe"; 
			        	jtxtFinal.setText(s);
			        	String s1 = "Customer ID:" +"      " + jtxtID.getText();
			        	jtxtFinal1.setText(s1);
			        	String s2= "Token number" + "       " + jtxttoken.getText();
			        	jtxtFinal2.setText(s2);
			        	String x="Item        " + "        Quantity"; 
			        	jtxtFinal3.setText(x);
			        	String s3="Beef Burger" +"          " +jtxtbeef.getText();
			        	jtxtFinal4.setText(s3);
			        	String s4="Bacon Burger" +"       " +jtxtbacon.getText();
			        	jtxtFinal5.setText(s4);
			        	String sub = "\n Subtotal:" + jtxtsubtotal.getText(); 
			        	String s5="Pork Burger" + "          "+ jtxtpork.getText();
			        	jtxtFinal6.setText(s5);
			        	String s6="Chicken Burger" +"    "+ jtxtchicken.getText();
			        	jtxtFinal7.setText(s6);
			        	String s7="Veggie Burger" +"      " +jtxtveg.getText();
			        	jtxtFinal8.setText(s7);
			        	String s8="Cold Coffee" +"          " +jtxtcoffee.getText();
			        	jtxtFinal9.setText(s8);
			        	String s9="Oreo Shake" +"          " +jtxtoreo.getText();
			        	jtxtFinal10.setText(s9);
			        	String s10="Kitkat Shake" +"         " +jtxtkit.getText();
			        	jtxtFinal11.setText(s10);
			        	String s11="Nutella Shake" +"       " +jtxtnut.getText();
			        	jtxtFinal12.setText(s11);
			        	String tax= "Tax:     " +"                 " + jtxttax.getText();
			        	jtxttaxx.setText(tax);
			        	String total= "Total:" +"          " + jtxttotal.getText();
			        	jtxttotall.setText(total);
			        	
			        	
			        	
			        	
			        
			        
			}
		});
		btnTotal.setFont(new Font("Stencil", Font.BOLD, 24));
		btnTotal.setBounds(213, 33, 175, 82);
		panel_1_1_1_1_1.add(btnTotal);
		
		JPanel panel_1_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1_1.setForeground(new Color(0, 128, 128));
		panel_1_1_1_1_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 128, 128)));
		panel_1_1_1_1_1_1.setBackground(Color.CYAN);
		panel_1_1_1_1_1_1.setBounds(517, 512, 425, 155);
		panel.add(panel_1_1_1_1_1_1);
		panel_1_1_1_1_1_1.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblTax.setBounds(29, 20, 149, 29);
		panel_1_1_1_1_1_1.add(lblTax);
		
		jtxttax = new JTextField();
		jtxttax.setColumns(10);
		jtxttax.setBounds(188, 20, 194, 29);
		panel_1_1_1_1_1_1.add(jtxttax);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblSubtotal.setBounds(29, 62, 149, 29);
		panel_1_1_1_1_1_1.add(lblSubtotal);
		
		jtxtsubtotal = new JTextField();
		jtxtsubtotal.setColumns(10);
		jtxtsubtotal.setBounds(188, 62, 194, 29);
		panel_1_1_1_1_1_1.add(jtxtsubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblTotal.setBounds(29, 101, 149, 29);
		panel_1_1_1_1_1_1.add(lblTotal);
		
		jtxttotal = new JTextField();
		jtxttotal.setColumns(10);
		jtxttotal.setBounds(188, 101, 194, 29);
		panel_1_1_1_1_1_1.add(jtxttotal);
	}
}
