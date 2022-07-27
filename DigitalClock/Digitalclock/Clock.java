package Digitalclock;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Clock  extends JFrame{

private JLabel heading;
private JLabel clockLable;
private Font font=new Font("",Font.BOLD,35);


		
		Clock ()
		{
		super.setTitle("My Digital Clock");
		super.setSize(400,400);
		
		super.setLocation(300, 50);
		this.creteJUI();
		this.stratClock();
		super.setVisible(true);
		
		}
		public void creteJUI()
		{
			 heading=new JLabel("Digital_Clock");
			 clockLable=new JLabel("Clock");
			 heading.setFont(font);
			 
			 
			 
			 clockLable.setFont(font);
			 
			 
			 
			 this.setLayout(new GridLayout(2,1));
			 this.add(heading);
			 this.add(clockLable);
			 
		}
		
		public void stratClock()
		{                    //aanomanus class use
Timer tiempo = new Timer(1000,new ActionListener() 
	{ 
	 public void actionPerformed(ActionEvent e) 
					    {
	//	String dateTime=new Date().toString();
Date d = new Date();
SimpleDateFormat sfd= new SimpleDateFormat("hh-mm-ss  a");
				
	String dateTime	= sfd.format(d);
	clockLable.setText(dateTime);
			 }
					});
		 tiempo.start();
		 
				
		}
		
		 
		
		 }
