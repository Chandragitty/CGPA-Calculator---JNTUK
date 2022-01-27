//Eclipse source code of the project
package gpa;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cgpa {

	private JFrame frame;
	private JTextField grade1;
	private JTextField grade2;
	private JTextField grade3;
	private JTextField grade4;
	private JTextField grade5;
	private JTextField grade6;
	private JTextField grade7;
	private JTextField grade8;
	private JTextField credit1;
	private JTextField credit2;
	private JTextField credit3;
	private JTextField credit4;
	private JTextField credit5;
	private JTextField credit6;
	private JTextField credit7;
	private JTextField credit8;
	private JTextField Scgpa;
	private JLabel lblSgpa;
	private JLabel lblPercentage;
	private JTextField percentage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cgpa window = new cgpa();
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
	public cgpa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 738, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sem 1");
		lblNewLabel.setBounds(35, 30, 61, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sem 2");
		lblNewLabel_1.setBounds(35, 60, 61, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sem 3");
		lblNewLabel_1_1.setBounds(35, 90, 61, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Sem 4");
		lblNewLabel_1_2.setBounds(35, 120, 61, 15);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Sem 5");
		lblNewLabel_1_3.setBounds(35, 150, 61, 15);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Sem 6");
		lblNewLabel_1_3_1.setBounds(35, 180, 61, 15);
		frame.getContentPane().add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Sem 7");
		lblNewLabel_1_3_2.setBounds(35, 212, 61, 13);
		frame.getContentPane().add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Sem 8");
		lblNewLabel_1_3_3.setBounds(35, 240, 61, 19);
		frame.getContentPane().add(lblNewLabel_1_3_3);
		
		JLabel lblNewLabel_1_3_4 = new JLabel("      SGPA");
		lblNewLabel_1_3_4.setBounds(141, 4, 74, 13);
		frame.getContentPane().add(lblNewLabel_1_3_4);
		
		JLabel lblNewLabel_1_3_4_1 = new JLabel("Total Credits");
		lblNewLabel_1_3_4_1.setBounds(289, 4, 78, 13);
		frame.getContentPane().add(lblNewLabel_1_3_4_1);
		
		grade1 = new JTextField();
		grade1.setBounds(131, 30, 96, 19);
		frame.getContentPane().add(grade1);
		grade1.setColumns(10);
		
		grade2 = new JTextField();
		grade2.setColumns(10);
		grade2.setBounds(131, 60, 96, 19);
		frame.getContentPane().add(grade2);
		
		grade3 = new JTextField();
		grade3.setColumns(10);
		grade3.setBounds(131, 90, 96, 19);
		frame.getContentPane().add(grade3);
		
		grade4 = new JTextField();
		grade4.setColumns(10);
		grade4.setBounds(131, 120, 96, 19);
		frame.getContentPane().add(grade4);
		
		grade5 = new JTextField();
		grade5.setColumns(10);
		grade5.setBounds(131, 150, 96, 19);
		frame.getContentPane().add(grade5);
		
		grade6 = new JTextField();
		grade6.setColumns(10);
		grade6.setBounds(131, 180, 96, 19);
		frame.getContentPane().add(grade6);
		
		grade7 = new JTextField();
		grade7.setColumns(10);
		grade7.setBounds(131, 210, 96, 19);
		frame.getContentPane().add(grade7);
		
		grade8 = new JTextField();
		grade8.setColumns(10);
		grade8.setBounds(131, 240, 96, 19);
		frame.getContentPane().add(grade8);
		
		credit1 = new JTextField();
		credit1.setColumns(10);
		credit1.setBounds(279, 30, 96, 19);
		frame.getContentPane().add(credit1);
		
		credit2 = new JTextField();
		credit2.setColumns(10);
		credit2.setBounds(279, 60, 96, 19);
		frame.getContentPane().add(credit2);
		
		credit3 = new JTextField();
		credit3.setColumns(10);
		credit3.setBounds(279, 90, 96, 19);
		frame.getContentPane().add(credit3);
		
		credit4 = new JTextField();
		credit4.setColumns(10);
		credit4.setBounds(279, 120, 96, 19);
		frame.getContentPane().add(credit4);
		
		credit5 = new JTextField();
		credit5.setColumns(10);
		credit5.setBounds(279, 150, 96, 19);
		frame.getContentPane().add(credit5);
		
		credit6 = new JTextField();
		credit6.setColumns(10);
		credit6.setBounds(279, 180, 96, 19);
		frame.getContentPane().add(credit6);
		
		credit7 = new JTextField();
		credit7.setColumns(10);
		credit7.setBounds(279, 210, 96, 19);
		frame.getContentPane().add(credit7);
		
		credit8 = new JTextField();
		credit8.setColumns(10);
		credit8.setBounds(279, 240, 96, 19);
		frame.getContentPane().add(credit8);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setToolTipText("Click to calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//***************************************Gradepoints*************************************************************
				String G1=grade1.getText();
				double g1=Double.parseDouble(G1);
				
				String G2=grade2.getText();
				double g2=Double.parseDouble(G2);

				String G3=grade3.getText();
				double g3=Double.parseDouble(G3);

				String G4=grade4.getText();
				double g4=Double.parseDouble(G4);

				String G5=grade5.getText();
				double g5=Double.parseDouble(G5);

				String G6=grade6.getText();
				double g6=Double.parseDouble(G6);

				String G7=grade7.getText();
				double g7=Double.parseDouble(G7);

				String G8=grade8.getText();
				double g8=Double.parseDouble(G8);
//*******************************************************************************************************************
				String C1=credit1.getText();
				double c1=Double.parseDouble(C1);
				
				String C2=credit2.getText();
				double c2=Double.parseDouble(C2);
				
				String C3=credit3.getText();
				double c3=Double.parseDouble(C3);
				
				String C4=credit4.getText();
				double c4=Double.parseDouble(C4);
				
				String C5=credit5.getText();
				double c5=Double.parseDouble(C5);
				
				String C6=credit6.getText();
				double c6=Double.parseDouble(C6);
				
				String C7=credit7.getText();
				double c7=Double.parseDouble(C7);
				
				String C8=credit8.getText();
				double c8=Double.parseDouble(C8);
				
				double mul1 = g1 * c1;
			    double mul2 = g2 * c2;
			    double mul3 = g3 * c3;
			    double mul4 = g4 * c4;
			    double mul5 = g5 * c5;
			    double mul6 = g6 * c6;
			    double mul7 = g7 * c7;
			    double mul8 = g8 * c8;
			    double num = mul1 + mul2 + mul3 + mul4 + mul5 + mul6 + mul7 + mul8; // Numerator
			    double sumc = c1+c2+c3+c4+c5+c6+c7+c8;//denominator
			    double cgpa1 = Math.round((num / sumc) * 100.0) / 100.0;//cgpa-to be converted in to String and set that vaue to Scgpa field
			    double PERCENT = (Math.round(((cgpa1-0.75)*10) * 100.0) / 100.0);/*Percent-to be converted in to String and set that vaue to 
			    																percent field*/
			    String sgpa=String.valueOf(cgpa1);
			    String percent=String.valueOf(PERCENT);
			    Scgpa.setText(sgpa);
			    percentage.setText(percent);
		
			}
		});
		btnNewButton.setBounds(592, 260, 87, 21);
		frame.getContentPane().add(btnNewButton);
		
		Scgpa = new JTextField();
		Scgpa.setColumns(10);
		Scgpa.setBounds(572, 180, 96, 19);
		frame.getContentPane().add(Scgpa);
		
		lblSgpa = new JLabel("CGPA");
		lblSgpa.setBounds(497, 181, 61, 15);
		frame.getContentPane().add(lblSgpa);
		
		lblPercentage = new JLabel("PERCENTAGE");
		lblPercentage.setBounds(471, 212, 87, 15);
		frame.getContentPane().add(lblPercentage);
		
		percentage = new JTextField();
		percentage.setColumns(10);
		percentage.setBounds(572, 209, 96, 19);
		frame.getContentPane().add(percentage);
	}
}
