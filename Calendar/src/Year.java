import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Year {
	LocalDateTime now = LocalDateTime.now();
    
	private  int kilkist=0; 
	JLabel lblMonth;Month month;
	JButton btnBack; JButton btnNext;
	private int lichn =0,lichb=0,year=0,k=0,g=0,r=0,m=0,firstday=0,lastday=0,prev=0,nex=0,firstdate=3;
	boolean b;
	final int matrix = 42;
	private JFrame frame;
	private static JTextField txtMonth, txtDay1,txtDay2,txtDay3,txtDay4,txtDay5,txtDay6,txtDay7,txtDay8,txtDay9,txtDay10,
	txtDay11,txtDay12,txtDay13,txtDay14,txtDay15,txtDay16,txtDay17,txtDay18,txtDay19,txtDay20,txtDay21,txtDay22,
	txtDay23,txtDay24,txtDay25,txtDay26,txtDay27,txtDay28,txtDay29,txtDay30,txtDay31,txtDay32,txtDay33,txtDay34,
	txtDay35,txtDay36,txtDay37,txtDay38,txtDay39,txtDay40,txtDay41,txtDay42;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Year window = new Year();
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
	public Year() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("ÊÀËÅÍÄÀÐ");
		frame.setBounds(100, 100, 529, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
				
		Label lblMn = new Label("Ïí");
		lblMn.setFont(new Font("Dialog", Font.BOLD, 16));
		lblMn.setBounds(20, 90, 30, 20);
		frame.getContentPane().add(lblMn);
		
		Label lblTu = new Label("Âò");
		lblTu.setFont(new Font("Dialog", Font.BOLD, 16));
		lblTu.setBounds(20, 120, 30, 20);
		frame.getContentPane().add(lblTu);
		
		Label lblWe = new Label("Ñð");
		lblWe.setFont(new Font("Dialog", Font.BOLD, 16));
		lblWe.setBounds(20, 150, 30, 20);
		frame.getContentPane().add(lblWe);
		
		Label lblTh = new Label("×ò");
		lblTh.setFont(new Font("Dialog", Font.BOLD, 16));
		lblTh.setBounds(20, 180, 30, 20);
		frame.getContentPane().add(lblTh);
		
		Label lblFr = new Label("Ïò");
		lblFr.setFont(new Font("Dialog", Font.BOLD, 16));
		lblFr.setBounds(20, 210, 30, 20);
		frame.getContentPane().add(lblFr);
		
		Label lblSa = new Label("Ñá");
		lblSa.setForeground(Color.RED);
		lblSa.setFont(new Font("Dialog", Font.BOLD, 16));
		lblSa.setBounds(20, 240, 30, 20);
		frame.getContentPane().add(lblSa);
		
		Label lblSu = new Label("Íä");
		lblSu.setForeground(Color.RED);
		lblSu.setFont(new Font("Dialog", Font.BOLD, 16));
		lblSu.setBounds(20, 270, 30, 20);
		frame.getContentPane().add(lblSu);
		
		
		do { b=true;
		kilkist = now.getMonthValue();		
		year = now.getYear();	
		}while(b!=true);
		if(Month.Vusokosnuj(year)==true) 
		{	g=year;	}
		 
	
		txtMonth = new JTextField(month.NowMonth(kilkist,kilkist).toString()+" "+year);
		txtMonth.setHorizontalAlignment(SwingConstants.CENTER);
		txtMonth.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtMonth.setBounds(183, 36, 152, 41);
		frame.getContentPane().add(txtMonth);
		txtMonth.setColumns(10);
		
		JButton btnBack = new JButton("<");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.setBounds(105, 44, 45, 23);
		frame.getContentPane().add(btnBack); 
		obrobnykPodij op = new obrobnykPodij();
		btnBack.addActionListener(op);
		
		
		JButton btnNext = new JButton(">");
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNext.setBounds(370, 44, 45, 23);
		frame.getContentPane().add(btnNext);
		obrobnyk opb = new obrobnyk();
		btnNext.addActionListener(opb);
		
		
		
		
		txtDay1 = new JTextField();
		txtDay1.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay1.setFont(new Font("Arial", Font.BOLD, 18));
		String n1 = String.valueOf("txtDay1");
		txtDay1.setText(Day.Days(n1,kilkist,year,firstdate)); 
		txtDay1.setForeground(thisDate(txtDay1.getText(),kilkist));
		txtDay1.setBounds(120, 90, 30, 20);
		frame.getContentPane().add(txtDay1);
		txtDay1.setColumns(10);
		
		txtDay2 = new JTextField();
		txtDay2.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay2.setFont(new Font("Arial", Font.BOLD, 18));
		String n2 = String.valueOf("txtDay2");
		txtDay2.setText(Day.Days(n2,kilkist,year,firstdate));
		txtDay2.setForeground(thisDate(txtDay2.getText(),kilkist));
		txtDay2.setBounds(120, 120, 30, 20);
		frame.getContentPane().add(txtDay2);
		txtDay2.setColumns(10);
		
		txtDay3 = new JTextField();
		txtDay3.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay3.setFont(new Font("Arial", Font.BOLD, 18));
		String n3 = String.valueOf("txtDay3");
		txtDay3.setText(Day.Days(n3,kilkist,year,firstdate));
		txtDay3.setForeground(thisDate(txtDay3.getText(),kilkist));
		txtDay3.setBounds(120, 150, 30, 20);
		frame.getContentPane().add(txtDay3);
		txtDay3.setColumns(10);
		
		txtDay4 = new JTextField();
		txtDay4.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay4.setFont(new Font("Arial", Font.BOLD, 18));
		String n4 = String.valueOf("txtDay4");
		txtDay4.setText(Day.Days(n4,kilkist,year,firstdate));
		txtDay4.setForeground(thisDate(txtDay4.getText(),kilkist));
		txtDay4.setBounds(120, 180, 30, 20);
		frame.getContentPane().add(txtDay4);
		txtDay4.setColumns(10);
		
		txtDay5 = new JTextField();
		txtDay5.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay5.setFont(new Font("Arial", Font.BOLD, 18));
		String n5 = String.valueOf("txtDay5");
		txtDay5.setText(Day.Days(n5,kilkist,year,firstdate));
		txtDay5.setForeground(thisDate(txtDay5.getText(),kilkist));
		txtDay5.setBounds(120, 210, 30, 20);
		frame.getContentPane().add(txtDay5);
		txtDay5.setColumns(10);
		
		txtDay6 = new JTextField();
		txtDay6.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay6.setFont(new Font("Arial", Font.BOLD, 18));
		String n6 = String.valueOf("txtDay6");
		txtDay6.setText(Day.Days(n6,kilkist,year,firstdate));		
		txtDay6.setForeground(thisDate(txtDay6.getText(),kilkist));
		txtDay6.setBounds(120, 240, 30, 20);
		frame.getContentPane().add(txtDay6);
		txtDay6.setColumns(10);
		
		txtDay7 = new JTextField();
		txtDay7.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay7.setFont(new Font("Arial", Font.BOLD, 18));
		String n7 = String.valueOf("txtDay7");
		txtDay7.setText(Day.Days(n7,kilkist,year,firstdate));		
		txtDay7.setForeground(thisDate(txtDay7.getText(),kilkist));
		txtDay7.setBounds(120, 270, 30, 20);
		frame.getContentPane().add(txtDay7);
		txtDay7.setColumns(10);
		
		
		
		txtDay8 = new JTextField();
		txtDay8.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay8.setFont(new Font("Arial", Font.BOLD, 18));
		String n8 = String.valueOf("txtDay8");
		txtDay8.setText(Day.Days(n8,kilkist,year,firstdate));		
		txtDay8.setForeground(thisDate(txtDay8.getText(),kilkist));
		txtDay8.setBounds(170, 90, 30, 20);
		frame.getContentPane().add(txtDay8);
		txtDay8.setColumns(10);
		
		txtDay9 = new JTextField();
		txtDay9.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay9.setFont(new Font("Arial", Font.BOLD, 18));
		String n9 = String.valueOf("txtDay9");
		txtDay9.setText(Day.Days(n9,kilkist,year,firstdate));		
		txtDay9.setForeground(thisDate(txtDay9.getText(),kilkist));
		txtDay9.setBounds(170, 120, 30, 20);
		frame.getContentPane().add(txtDay9);
		txtDay9.setColumns(10);
		
		txtDay10 = new JTextField();
		txtDay10.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay10.setFont(new Font("Arial", Font.BOLD, 18));
		String n10 = String.valueOf("txtDay10");
		txtDay10.setText(Day.Days(n10,kilkist,year,firstdate));
		txtDay10.setForeground(thisDate(txtDay10.getText(),kilkist));
		txtDay10.setBounds(170, 150, 30, 20);
		frame.getContentPane().add(txtDay10);
		txtDay10.setColumns(10);
		
		txtDay11 = new JTextField();
		txtDay11.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay11.setFont(new Font("Arial", Font.BOLD, 18));
		String n11 = String.valueOf("txtDay11");
		txtDay11.setText(Day.Days(n11,kilkist,year,firstdate));
		txtDay11.setForeground(thisDate(txtDay11.getText(),kilkist));
		txtDay11.setBounds(170, 180, 30, 20);
		frame.getContentPane().add(txtDay11);
		txtDay11.setColumns(10);
		
		txtDay12 = new JTextField();
		txtDay12.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay12.setFont(new Font("Arial", Font.BOLD, 18));
		String n12 = String.valueOf("txtDay12");
		txtDay12.setText(Day.Days(n12,kilkist,year,firstdate));
		txtDay12.setForeground(thisDate(txtDay12.getText(),kilkist));
		txtDay12.setBounds(170, 210, 30, 20);
		frame.getContentPane().add(txtDay12);
		txtDay12.setColumns(10);
		
		txtDay13 = new JTextField();
		txtDay13.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay13.setFont(new Font("Arial", Font.BOLD, 18));
		String n13 = String.valueOf("txtDay13");
		txtDay13.setText(Day.Days(n13,kilkist,year,firstdate));
		txtDay13.setForeground(thisDate(txtDay13.getText(),kilkist));
		txtDay13.setBounds(170, 240, 30, 20);
		frame.getContentPane().add(txtDay13);
		txtDay13.setColumns(10);
		
		txtDay14 = new JTextField();
		txtDay14.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay14.setFont(new Font("Arial", Font.BOLD, 18));
		String n14 = String.valueOf("txtDay14");
		txtDay14.setText(Day.Days(n14,kilkist,year,firstdate));
		txtDay14.setForeground(thisDate(txtDay14.getText(),kilkist));
		txtDay14.setBounds(170, 270, 30, 20);
		frame.getContentPane().add(txtDay14);
		txtDay14.setColumns(10);
		
		
		
		txtDay15 = new JTextField();
		txtDay15.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay15.setFont(new Font("Arial", Font.BOLD, 18));
		String n15 = String.valueOf("txtDay15");
		txtDay15.setText(Day.Days(n15,kilkist,year,firstdate));
		txtDay15.setForeground(thisDate(txtDay15.getText(),kilkist));
		txtDay15.setBounds(220, 90, 30, 20);
		frame.getContentPane().add(txtDay15);
		txtDay15.setColumns(10);
		
		txtDay16 = new JTextField();
		txtDay16.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay16.setFont(new Font("Arial", Font.BOLD, 18));
		String n16 = String.valueOf("txtDay16");
		txtDay16.setText(Day.Days(n16,kilkist,year,firstdate));
		txtDay16.setForeground(thisDate(txtDay16.getText(),kilkist));
		txtDay16.setBounds(220, 120, 30, 20);
		frame.getContentPane().add(txtDay16);
		txtDay16.setColumns(10);
		
		txtDay17 = new JTextField();
		txtDay17.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay17.setFont(new Font("Arial", Font.BOLD, 18));
		String n17 = String.valueOf("txtDay17");
		txtDay17.setText(Day.Days(n17,kilkist,year,firstdate));
		txtDay17.setForeground(thisDate(txtDay17.getText(),kilkist));
		txtDay17.setBounds(220, 150, 30, 20);
		frame.getContentPane().add(txtDay17);
		txtDay17.setColumns(10);
		
		txtDay18 = new JTextField();
		txtDay18.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay18.setFont(new Font("Arial", Font.BOLD, 18));
		String n18 = String.valueOf("txtDay18");
		txtDay18.setText(Day.Days(n18,kilkist,year,firstdate));
		txtDay18.setForeground(thisDate(txtDay18.getText(),kilkist));
		txtDay18.setBounds(220, 180, 30, 20);
		frame.getContentPane().add(txtDay18);
		txtDay18.setColumns(10);
		
		txtDay19 = new JTextField();
		txtDay19.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay19.setFont(new Font("Arial", Font.BOLD, 18));
		String n19 = String.valueOf("txtDay19");
		txtDay19.setText(Day.Days(n19,kilkist,year,firstdate));
		txtDay19.setForeground(thisDate(txtDay19.getText(),kilkist));
		txtDay19.setBounds(220, 210, 30, 20);
		frame.getContentPane().add(txtDay19);
		txtDay19.setColumns(10);
		
		txtDay20 = new JTextField();
		txtDay20.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay20.setFont(new Font("Arial", Font.BOLD, 18));
		String n20 = String.valueOf("txtDay20");
		txtDay20.setText(Day.Days(n20,kilkist,year,firstdate));
		txtDay20.setForeground(thisDate(txtDay20.getText(),kilkist));
		txtDay20.setBounds(220, 240, 30, 20);
		frame.getContentPane().add(txtDay20);
		txtDay20.setColumns(10);
		
		txtDay21 = new JTextField();
		txtDay21.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay21.setFont(new Font("Arial", Font.BOLD, 18));
		String n21 = String.valueOf("txtDay21");
		txtDay21.setText(Day.Days(n21,kilkist,year,firstdate));
		txtDay21.setForeground(thisDate(txtDay21.getText(),kilkist));
		txtDay21.setBounds(220, 270, 30, 20);
		frame.getContentPane().add(txtDay21);
		txtDay21.setColumns(10);
		
		
		
		txtDay22 = new JTextField();
		txtDay22.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay22.setFont(new Font("Arial", Font.BOLD, 18));
		String n22 = String.valueOf("txtDay22");
		txtDay22.setText(Day.Days(n22,kilkist,year,firstdate));
		txtDay22.setForeground(thisDate(txtDay22.getText(),kilkist));
		txtDay22.setBounds(270, 90, 30, 20);
		frame.getContentPane().add(txtDay22);
		txtDay22.setColumns(10);
		
		txtDay23 = new JTextField();
		txtDay23.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay23.setFont(new Font("Arial", Font.BOLD, 18));
		String n23 = String.valueOf("txtDay23");
		txtDay23.setText(Day.Days(n23,kilkist,year,firstdate));
		txtDay23.setForeground(thisDate(txtDay23.getText(),kilkist));
		txtDay23.setBounds(270, 120, 30, 20);
		frame.getContentPane().add(txtDay23);
		txtDay23.setColumns(10);
		
		txtDay24 = new JTextField();
		txtDay24.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay24.setFont(new Font("Arial", Font.BOLD, 18));
		String n24 = String.valueOf("txtDay24");
		txtDay24.setText(Day.Days(n24,kilkist,year,firstdate));
		txtDay24.setForeground(thisDate(txtDay24.getText(),kilkist));
		txtDay24.setBounds(270, 150, 30, 20);
		frame.getContentPane().add(txtDay24);
		txtDay24.setColumns(10);
		
		txtDay25 = new JTextField();
		txtDay25.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay25.setFont(new Font("Arial", Font.BOLD, 18));
		String n25 = String.valueOf("txtDay25");
		txtDay25.setText(Day.Days(n25,kilkist,year,firstdate));
		txtDay25.setForeground(thisDate(txtDay25.getText(),kilkist));
		txtDay25.setBounds(270, 180, 30, 20);
		frame.getContentPane().add(txtDay25);
		txtDay25.setColumns(10);
		
		txtDay26 = new JTextField();
		txtDay26.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay26.setFont(new Font("Arial", Font.BOLD, 18));
		String n26 = String.valueOf("txtDay26");
		txtDay26.setText(Day.Days(n26,kilkist,year,firstdate));
		txtDay26.setForeground(thisDate(txtDay26.getText(),kilkist));
		txtDay26.setBounds(270, 210, 30, 20);
		frame.getContentPane().add(txtDay26);
		txtDay26.setColumns(10);
		
		txtDay27 = new JTextField();
		txtDay27.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay27.setFont(new Font("Arial", Font.BOLD, 18));
		String n27 = String.valueOf("txtDay27");
		txtDay27.setText(Day.Days(n27,kilkist,year,firstdate));
		txtDay27.setForeground(thisDate(txtDay27.getText(),kilkist));
		txtDay27.setBounds(270, 240, 30, 20);
		frame.getContentPane().add(txtDay27);
		txtDay27.setColumns(10);
		
		txtDay28 = new JTextField();
		txtDay28.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay28.setFont(new Font("Arial", Font.BOLD, 18));
		String n28 = String.valueOf("txtDay28");
		txtDay28.setText(Day.Days(n28,kilkist,year,firstdate));
		txtDay28.setForeground(thisDate(txtDay28.getText(),kilkist));
		txtDay28.setBounds(270, 270, 30, 20);
		frame.getContentPane().add(txtDay28);
		txtDay28.setColumns(10);
		
		
		
		txtDay29 = new JTextField();
		txtDay29.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay29.setFont(new Font("Arial", Font.BOLD, 18));
		String n29 = String.valueOf("txtDay29");
		txtDay29.setText(Day.Days(n29,kilkist,year,firstdate));
		txtDay29.setForeground(thisDate(txtDay29.getText(),kilkist));
		txtDay29.setBounds(320, 90, 30, 20);
		frame.getContentPane().add(txtDay29);
		txtDay29.setColumns(10);
		
		txtDay30 = new JTextField();
		txtDay30.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay30.setFont(new Font("Arial", Font.BOLD, 18));
		String n30 = String.valueOf("txtDay30");
		txtDay30.setText(Day.Days(n30,kilkist,year,firstdate));
		txtDay30.setForeground(thisDate(txtDay30.getText(),kilkist));
		txtDay30.setBounds(320, 120, 30, 20);
		frame.getContentPane().add(txtDay30);
		txtDay30.setColumns(10);
		
		txtDay31 = new JTextField();
		txtDay31.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay31.setFont(new Font("Arial", Font.BOLD, 18));
		String n31 = String.valueOf("txtDay31");
		txtDay31.setText(Day.Days(n31,kilkist,year,firstdate));
		txtDay31.setForeground(thisDate(txtDay31.getText(),kilkist));
		txtDay31.setBounds(320, 150, 30, 20);
		frame.getContentPane().add(txtDay31);
		txtDay31.setColumns(10);
		
		txtDay32 = new JTextField();
		txtDay32.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay32.setFont(new Font("Arial", Font.BOLD, 18));
		String n32 = String.valueOf("txtDay32");
		txtDay32.setText(Day.Days(n32,kilkist,year,firstdate));
		txtDay32.setForeground(thisDate(txtDay32.getText(),kilkist));
		txtDay32.setBounds(320, 180, 30, 20);
		frame.getContentPane().add(txtDay32);
		txtDay32.setColumns(10);
		
		txtDay33 = new JTextField();
		txtDay33.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay33.setFont(new Font("Arial", Font.BOLD, 18));
		String n33 = String.valueOf("txtDay33");
		txtDay33.setText(Day.Days(n33,kilkist,year,firstdate));
		txtDay33.setForeground(thisDate(txtDay33.getText(),kilkist));
		txtDay33.setBounds(320, 210, 30, 20);
		frame.getContentPane().add(txtDay33);
		txtDay33.setColumns(10);
		
		txtDay34 = new JTextField();
		txtDay34.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay34.setFont(new Font("Arial", Font.BOLD, 18));
		String n34 = String.valueOf("txtDay34");
		txtDay34.setText(Day.Days(n34,kilkist,year,firstdate));
		txtDay34.setForeground(thisDate(txtDay34.getText(),kilkist));
		txtDay34.setBounds(320, 240, 30, 20);
		frame.getContentPane().add(txtDay34);
		txtDay34.setColumns(10);
		
		txtDay35 = new JTextField();
		txtDay35.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay35.setFont(new Font("Arial", Font.BOLD, 18));
		String n35 = String.valueOf("txtDay35");
		txtDay35.setText(Day.Days(n35,kilkist,year,firstdate));
		txtDay35.setForeground(thisDate(txtDay35.getText(),kilkist));
		txtDay35.setBounds(320, 270, 30, 20);
		frame.getContentPane().add(txtDay35);
		txtDay35.setColumns(10);
		
		
		txtDay36 = new JTextField();
		txtDay36.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay36.setFont(new Font("Arial", Font.BOLD, 18));
		String n36 = String.valueOf("txtDay36");
		txtDay36.setText(Day.Days(n36,kilkist,year,firstdate));
		txtDay36.setForeground(thisDate(txtDay36.getText(),kilkist));
		txtDay36.setBounds(370, 90, 30, 20);
		frame.getContentPane().add(txtDay36);
		txtDay36.setColumns(10);
		
		txtDay37 = new JTextField();
		txtDay37.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay37.setFont(new Font("Arial", Font.BOLD, 18));
		String n37 = String.valueOf("txtDay37");
		txtDay37.setText(Day.Days(n37,kilkist,year,firstdate));
		txtDay37.setForeground(thisDate(txtDay37.getText(),kilkist));
		txtDay37.setBounds(370, 120, 30, 20);
		frame.getContentPane().add(txtDay37);
		txtDay37.setColumns(10);
		
		txtDay38 = new JTextField();
		txtDay38.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay38.setFont(new Font("Arial", Font.BOLD, 18));
		String n38 = String.valueOf("txtDay38");
		txtDay38.setText(Day.Days(n38,kilkist,year,firstdate));
		txtDay38.setForeground(thisDate(txtDay38.getText(),kilkist));
		txtDay38.setBounds(370, 150, 30, 20);
		frame.getContentPane().add(txtDay38);
		txtDay38.setColumns(10);
		
		txtDay39 = new JTextField();
		txtDay39.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay39.setFont(new Font("Arial", Font.BOLD, 18));
		txtDay39.setBounds(370, 180, 30, 20);
		frame.getContentPane().add(txtDay39);
		txtDay39.setColumns(10);
		
		txtDay40 = new JTextField();
		txtDay40.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay40.setFont(new Font("Arial", Font.BOLD, 18));
		txtDay40.setBounds(370, 210, 30, 20);
		frame.getContentPane().add(txtDay40);
		txtDay40.setColumns(10);
		
		txtDay41 = new JTextField();
		txtDay41.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay41.setFont(new Font("Arial", Font.BOLD, 18));
		txtDay41.setBounds(370, 240, 30, 20);
		frame.getContentPane().add(txtDay41);
		txtDay41.setColumns(10);
		
		txtDay42 = new JTextField();
		txtDay42.setHorizontalAlignment(SwingConstants.CENTER);
		txtDay42.setFont(new Font("Arial", Font.BOLD, 18));
		txtDay42.setBounds(370, 270, 30, 20);
		frame.getContentPane().add(txtDay42);
		txtDay42.setColumns(10);
	
		
	
	}
	
public  class obrobnykPodij implements ActionListener{
	public void actionPerformed(ActionEvent p) {
			
		if(kilkist<1) 
		{
			
			ArrayList<Integer> listAllM = new ArrayList<Integer>();
			listAllM.add(31);listAllM.add(29);listAllM.add(31);listAllM.add(30);listAllM.add(31);listAllM.add(30);
			listAllM.add(31);listAllM.add(31);listAllM.add(30);listAllM.add(31);listAllM.add(30);listAllM.add(31);
			if(Month.Vusokosnuj(year)==false ) {listAllM.set(1,28);}
						
			if(Month.Vusokosnuj(year)==true && year==2020 )
			{lastday=(firstdate+matrix)-listAllM.get(11);
			firstdate=FirstDay.NewM(0,lastday, prev, nex);}
			if(Month.Vusokosnuj(year)==false) 
			{lastday=((firstdate+matrix)-listAllM.get(0))-1;
			firstday=FirstDay.NewM(0,lastday, prev, nex);						
			lastday=((firstday+matrix)-listAllM.get(11))-1; 
			firstdate=FirstDay.NewM(0,lastday, prev, nex);
			}
			
			
			if(Month.Vusokosnuj(year)==true && year==YearVus(year) && year!=2020) 
			{					
			lastday=((firstday+matrix)-listAllM.get(11))-3; 
			firstdate=FirstDay.NewM(0,lastday, prev, nex);			          
			}

			kilkist=12;	
			 year -= 1;
		}  
		
		
		String n1 = String.valueOf("txtDay1");
		txtDay1.setText(Day.Days(n1, kilkist,year,firstdate));
		String n2 = String.valueOf("txtDay2");
		txtDay2.setText(Day.Days(n2, kilkist,year,firstdate));
		String n3 = String.valueOf("txtDay3");
		txtDay3.setText(Day.Days(n3, kilkist,year,firstdate));
		String n4 = String.valueOf("txtDay4");
		txtDay4.setText(Day.Days(n4, kilkist,year,firstdate));
		String n5 = String.valueOf("txtDay5");
		txtDay5.setText(Day.Days(n5, kilkist,year,firstdate));
		String n6 = String.valueOf("txtDay6");
		txtDay6.setText(Day.Days(n6, kilkist,year,firstdate));
		String n7 = String.valueOf("txtDay7");
		txtDay7.setText(Day.Days(n7, kilkist,year,firstdate));
		
		
		String n8 = String.valueOf("txtDay8");
		txtDay8.setText(Day.Days(n8, kilkist,year,firstdate));
		String n9 = String.valueOf("txtDay9");
		txtDay9.setText(Day.Days(n9, kilkist,year,firstdate));
		String n10 = String.valueOf("txtDay10");
		txtDay10.setText(Day.Days(n10, kilkist,year,firstdate));
		String n11 = String.valueOf("txtDay11");
		txtDay11.setText(Day.Days(n11, kilkist,year,firstdate));
		String n12 = String.valueOf("txtDay12");
		txtDay12.setText(Day.Days(n12, kilkist,year,firstdate));
		String n13 = String.valueOf("txtDay13");
		txtDay13.setText(Day.Days(n13, kilkist,year,firstdate));
		String n14 = String.valueOf("txtDay14");
		txtDay14.setText(Day.Days(n14, kilkist,year,firstdate));

		String n15 = String.valueOf("txtDay15");
		txtDay15.setText(Day.Days(n15, kilkist,year,firstdate));
		String n16 = String.valueOf("txtDay16");
		txtDay16.setText(Day.Days(n16, kilkist,year,firstdate));
		String n17 = String.valueOf("txtDay17");
		txtDay17.setText(Day.Days(n17, kilkist,year,firstdate));
		String n18 = String.valueOf("txtDay18");
		txtDay18.setText(Day.Days(n18, kilkist,year,firstdate));
		String n19 = String.valueOf("txtDay19");
		txtDay19.setText(Day.Days(n19, kilkist,year,firstdate));
		String n20 = String.valueOf("txtDay20");
		txtDay20.setText(Day.Days(n20, kilkist,year,firstdate));
		String n21 = String.valueOf("txtDay21");
		txtDay21.setText(Day.Days(n21, kilkist,year,firstdate));
		
		String n22 = String.valueOf("txtDay22");
		txtDay22.setText(Day.Days(n22, kilkist,year,firstdate));
		String n23 = String.valueOf("txtDay23");
		txtDay23.setText(Day.Days(n23, kilkist,year,firstdate));
		String n24 = String.valueOf("txtDay24");
		txtDay24.setText(Day.Days(n24, kilkist,year,firstdate));
		String n25 = String.valueOf("txtDay25");
		txtDay25.setText(Day.Days(n25, kilkist,year,firstdate));
		String n26 = String.valueOf("txtDay26");
		txtDay26.setText(Day.Days(n26, kilkist,year,firstdate));
		String n27 = String.valueOf("txtDay27");
		txtDay27.setText(Day.Days(n27, kilkist,year,firstdate));
		String n28 = String.valueOf("txtDay28");
		txtDay28.setText(Day.Days(n28, kilkist,year,firstdate));
		
		String n29 = String.valueOf("txtDay29");
		txtDay29.setText(Day.Days(n29, kilkist,year,firstdate));
		String n30 = String.valueOf("txtDay30");
		txtDay30.setText(Day.Days(n30, kilkist,year,firstdate));
		String n31 = String.valueOf("txtDay31");
		txtDay31.setText(Day.Days(n31, kilkist,year,firstdate));
		String n32 = String.valueOf("txtDay32");
		txtDay32.setText(Day.Days(n32, kilkist,year,firstdate));
		String n33 = String.valueOf("txtDay33");
		txtDay33.setText(Day.Days(n33, kilkist,year,firstdate));
		String n34 = String.valueOf("txtDay34");
		txtDay34.setText(Day.Days(n34, kilkist,year,firstdate));
		String n35 = String.valueOf("txtDay35");
		txtDay35.setText(Day.Days(n35, kilkist,year,firstdate));
		
		String n36 = String.valueOf("txtDay36");
		txtDay36.setText(Day.Days(n36, kilkist,year,firstdate));
		String n37 = String.valueOf("txtDay37");
		txtDay37.setText(Day.Days(n37, kilkist,year,firstdate));
		String n38 = String.valueOf("txtDay38");
		txtDay38.setText(Day.Days(n38, kilkist,year,firstdate));
		
	
	 		                                       
			if(p.getSource()!=btnNext) 
			{  	
				if(k<=1) 
				{  
					m = now.getMonthValue();
				if(lichn == m) 
					{ 
					kilkist=m-1;
					k++; 
					}
				} 
			}
			
			
						
				txtMonth = new JTextField(month.NowMonth(0,kilkist).toString()+" "+year);
				txtMonth.setHorizontalAlignment(SwingConstants.CENTER);
				txtMonth.setFont(new Font("Times New Roman", Font.BOLD, 16));
				txtMonth.setBounds(183, 36, 152, 41);
				frame.getContentPane().add(txtMonth);
				txtMonth.setColumns(10);
				kilkist--;
			
				
			
		}		
	}

	public  class obrobnyk implements ActionListener{
		public void actionPerformed(ActionEvent p) {
			
			kilkist++;
			if(p.getSource()!=btnBack) 
			{
			if(r<=1) 
				{ 
				m = now.getMonthValue();
				if(lichb== m) 
					{ 
					kilkist=m+1;
					r++;
					}
				} 
			}
			
			if(kilkist>12) 
			{
							
				ArrayList<Integer> listAllM = new ArrayList<Integer>();
				listAllM.add(31);listAllM.add(29);listAllM.add(31);listAllM.add(30);listAllM.add(31);listAllM.add(30);
				listAllM.add(31);listAllM.add(31);listAllM.add(30);listAllM.add(31);listAllM.add(30);listAllM.add(31);
				if(Month.Vusokosnuj(year)==false ) {listAllM.set(1,28);}
				
				lastday=firstdate+listAllM.get(0);
				firstday=FirstDay.NewM(0,lastday, prev, nex);
				lastday=firstday+listAllM.get(1); 
				firstday=FirstDay.NewM(0,lastday, prev, nex);
				lastday=firstday+listAllM.get(2); 
				firstday=FirstDay.NewM(0,lastday, prev, nex);
				lastday=firstday+listAllM.get(3); 
				firstday=FirstDay.NewM(0,lastday, prev, nex);
				lastday=firstday+listAllM.get(4); 
				firstday=FirstDay.NewM(0,lastday, prev, nex);
				lastday=firstday+listAllM.get(5); 
				firstday=FirstDay.NewM(0,lastday, prev, nex);
				lastday=firstday+listAllM.get(6); 
				firstday=FirstDay.NewM(0,lastday, prev, nex);
				lastday=firstday+listAllM.get(7); 
				firstday=FirstDay.NewM(0,lastday, prev, nex);
				lastday=firstday+listAllM.get(8); 
				firstday=FirstDay.NewM(0,lastday, prev, nex);
				lastday=firstday+listAllM.get(9); 
				firstday=FirstDay.NewM(0,lastday, prev, nex);
				lastday=firstday+listAllM.get(10); 
				firstday=FirstDay.NewM(0,lastday, prev, nex);
			    if( Month.Vusokosnuj(year)==false) {
				lastday=(firstday+listAllM.get(11)); 
				firstdate=FirstDay.NewM(0,lastday, prev, nex);}
			    if(Month.Vusokosnuj(year)==true) 
				{lastday=(firstday+listAllM.get(11)); 
				firstdate=FirstDay.NewM(0,lastday, prev, nex);}                                  
			
			    kilkist = 1;
				year+=1;				                                             
			}                                               
			 
			txtMonth = new JTextField(month.NowMonth(0,kilkist).toString()+" "+year);
			txtMonth.setHorizontalAlignment(SwingConstants.CENTER);
			txtMonth.setFont(new Font("Times New Roman", Font.BOLD, 16));
			txtMonth.setBounds(183, 36, 152, 41);
			frame.getContentPane().add(txtMonth);
			txtMonth.setColumns(10);
			
			
			String n1 = String.valueOf("txtDay1");
			txtDay1.setText(Day.Days(n1, kilkist,year,firstdate));
			String n2 = String.valueOf("txtDay2");
			txtDay2.setText(Day.Days(n2, kilkist,year,firstdate));
			String n3 = String.valueOf("txtDay3");
			txtDay3.setText(Day.Days(n3, kilkist,year,firstdate));
			String n4 = String.valueOf("txtDay4");
			txtDay4.setText(Day.Days(n4, kilkist,year,firstdate));
			String n5 = String.valueOf("txtDay5");
			txtDay5.setText(Day.Days(n5, kilkist,year,firstdate));
			String n6 = String.valueOf("txtDay6");
			txtDay6.setText(Day.Days(n6, kilkist,year,firstdate));
			String n7 = String.valueOf("txtDay7");
			txtDay7.setText(Day.Days(n7, kilkist,year,firstdate));
			
			
			String n8 = String.valueOf("txtDay8");
			txtDay8.setText(Day.Days(n8, kilkist,year,firstdate));
			String n9 = String.valueOf("txtDay9");
			txtDay9.setText(Day.Days(n9, kilkist,year,firstdate));
			String n10 = String.valueOf("txtDay10");
			txtDay10.setText(Day.Days(n10, kilkist,year,firstdate));
			String n11 = String.valueOf("txtDay11");
			txtDay11.setText(Day.Days(n11, kilkist,year,firstdate));
			String n12 = String.valueOf("txtDay12");
			txtDay12.setText(Day.Days(n12, kilkist,year,firstdate));
			String n13 = String.valueOf("txtDay13");
			txtDay13.setText(Day.Days(n13, kilkist,year,firstdate));
			String n14 = String.valueOf("txtDay14");
			txtDay14.setText(Day.Days(n14, kilkist,year,firstdate));

			String n15 = String.valueOf("txtDay15");
			txtDay15.setText(Day.Days(n15, kilkist,year,firstdate));
			String n16 = String.valueOf("txtDay16");
			txtDay16.setText(Day.Days(n16, kilkist,year,firstdate));
			String n17 = String.valueOf("txtDay17");
			txtDay17.setText(Day.Days(n17, kilkist,year,firstdate));
			String n18 = String.valueOf("txtDay18");
			txtDay18.setText(Day.Days(n18, kilkist,year,firstdate));
			String n19 = String.valueOf("txtDay19");
			txtDay19.setText(Day.Days(n19, kilkist,year,firstdate));
			String n20 = String.valueOf("txtDay20");
			txtDay20.setText(Day.Days(n20, kilkist,year,firstdate));
			String n21 = String.valueOf("txtDay21");
			txtDay21.setText(Day.Days(n21, kilkist,year,firstdate));
			
			String n22 = String.valueOf("txtDay22");
			txtDay22.setText(Day.Days(n22, kilkist,year,firstdate));
			String n23 = String.valueOf("txtDay23");
			txtDay23.setText(Day.Days(n23, kilkist,year,firstdate));
			String n24 = String.valueOf("txtDay24");
			txtDay24.setText(Day.Days(n24, kilkist,year,firstdate));
			String n25 = String.valueOf("txtDay25");
			txtDay25.setText(Day.Days(n25, kilkist,year,firstdate));
			String n26 = String.valueOf("txtDay26");
			txtDay26.setText(Day.Days(n26, kilkist,year,firstdate));
			String n27 = String.valueOf("txtDay27");
			txtDay27.setText(Day.Days(n27, kilkist,year,firstdate));
			String n28 = String.valueOf("txtDay28");
			txtDay28.setText(Day.Days(n28, kilkist,year,firstdate));
			
			String n29 = String.valueOf("txtDay29");
			txtDay29.setText(Day.Days(n29, kilkist,year,firstdate));
			String n30 = String.valueOf("txtDay30");
			txtDay30.setText(Day.Days(n30, kilkist,year,firstdate));
			String n31 = String.valueOf("txtDay31");
			txtDay31.setText(Day.Days(n31, kilkist,year,firstdate));
			String n32 = String.valueOf("txtDay32");
			txtDay32.setText(Day.Days(n32, kilkist,year,firstdate));
			String n33 = String.valueOf("txtDay33");
			txtDay33.setText(Day.Days(n33, kilkist,year,firstdate));
			String n34 = String.valueOf("txtDay34");
			txtDay34.setText(Day.Days(n34, kilkist,year,firstdate));
			String n35 = String.valueOf("txtDay35");
			txtDay35.setText(Day.Days(n35, kilkist,year,firstdate));
			
			String n36 = String.valueOf("txtDay36");
			txtDay36.setText(Day.Days(n36, kilkist,year,firstdate));
			String n37 = String.valueOf("txtDay37");
			txtDay37.setText(Day.Days(n37, kilkist,year,firstdate));
			String n38 = String.valueOf("txtDay38");
			txtDay38.setText(Day.Days(n38, kilkist,year,firstdate));
			
		}
		}	
	
	public static int YearVus(int n) {
		int z=2020;
		if(n!=2020 && Month.Vusokosnuj(n)==true) {
		for(int i=4;z-i==n;i+=4)
		{n=z-i;	}}
		return n;
	}

	
    	public static Color thisDate(String n,int m) {
    		Color k = null; int t=0,w=0;                
    		LocalDateTime now = LocalDateTime.now();
    		w= now.getMonthValue();    		             						
    		if(n.isEmpty())
    		{k=null;} 
    		else {int y =Integer.parseInt(n);                
    		if( y==(t=now.getDayOfMonth()) ) {k= Color.RED;}}     		
    		return k;
    	} 
}
