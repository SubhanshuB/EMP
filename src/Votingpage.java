import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
//import pack.Marquee;
import java.sql.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Component;
public class Votingpage {
	private JTable table;

	public static void run() {

		JFrame frame =new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(25, 40, 301, 298);
		frame.getContentPane().add(panel);
		
		
		JLabel BJP = new JLabel("",new ImageIcon("C:\\Users\\Subhanshu\\Documents\\GitHub\\EVM\\src\\Images\\bjp.png"),JLabel.CENTER);
		panel.add(BJP);
		BJP.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JButton bjp = new JButton("VOTE");
		bjp.setForeground(Color.DARK_GRAY);
		bjp.setBackground(new Color(255, 204, 0));
		bjp.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		panel.add(bjp);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(723, 40, 301, 298);
		frame.getContentPane().add(panel_2);
		
		JLabel label_1 = new JLabel("", new ImageIcon("C:\\Users\\Subhanshu\\Documents\\GitHub\\EVM\\src\\Images\\aap.png"), SwingConstants.CENTER);
		panel_2.add(label_1);
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JButton aap = new JButton("VOTE");
		panel_2.add(aap);
		aap.setForeground(Color.DARK_GRAY);
		aap.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		aap.setBackground(new Color(255, 204, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(25, 348, 301, 298);
		frame.getContentPane().add(panel_3);
		
		JLabel label_3 = new JLabel("", new ImageIcon("C:\\Users\\Subhanshu\\Documents\\GitHub\\EVM\\src\\Images\\bsp1.png"), SwingConstants.CENTER);
		label_3.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_3.add(label_3);
		
		JButton bsp = new JButton("VOTE");
		panel_3.add(bsp);
		bsp.setForeground(Color.DARK_GRAY);
		bsp.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		bsp.setBackground(new Color(255, 204, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(376, 348, 301, 298);
		frame.getContentPane().add(panel_4);
		
		JLabel label_4 = new JLabel("", new ImageIcon("C:\\Users\\Subhanshu\\Documents\\GitHub\\EVM\\src\\Images\\rjd.png"), SwingConstants.CENTER);
		label_4.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_4.add(label_4);
		
		JButton rjd = new JButton("VOTE");
		panel_4.add(rjd);
		rjd.setForeground(Color.DARK_GRAY);
		rjd.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		rjd.setBackground(new Color(255, 204, 0));
		
		JLabel label_2 = new JLabel("", (Icon) null, SwingConstants.CENTER);
		panel_4.add(label_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(723, 348, 301, 298);
		frame.getContentPane().add(panel_5);
		
		JLabel label = new JLabel("", new ImageIcon("C:\\Users\\Subhanshu\\Documents\\GitHub\\EVM\\src\\Images\\nota.png"), SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_5.add(label);
		
		JButton nota = new JButton("VOTE");
		panel_5.add(nota);
		nota.setForeground(Color.DARK_GRAY);
		nota.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		nota.setBackground(new Color(255, 204, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(376, 40, 301, 298);
		frame.getContentPane().add(panel_1);
		
		JLabel label_5 = new JLabel("", new ImageIcon("C:\\Users\\Subhanshu\\Documents\\GitHub\\EVM\\src\\Images\\congress.png"), SwingConstants.CENTER);
		label_5.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_1.add(label_5);

		JButton congress = new JButton("VOTE");
		panel_1.add(congress);
		
		bjp.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent e)
			 {
				 int output = JOptionPane.showConfirmDialog(frame
			               , "Are you sure you want to vote BJP?"
			               ,"Confirm"
			               ,JOptionPane.YES_NO_OPTION);

			            if(output == JOptionPane.YES_OPTION)
			            {
			            	
			            	frame.dispose();
			            } 
			            else if(output == JOptionPane.NO_OPTION)
			            {
			            	
			            }
			         	 
			 }  
				  
		});
		
		congress.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent e)
			 {
				 int output = JOptionPane.showConfirmDialog(frame
			               , "Are you sure you want to vote Congress?"
			               ,"Confirm"
			               ,JOptionPane.YES_NO_OPTION);

			            if(output == JOptionPane.YES_OPTION)
			            {
			            	frame.dispose();
			            } 
			            else if(output == JOptionPane.NO_OPTION)
			            {
			            	
			            }			 
			 }  
				  
		});
		
		aap.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent e)
			 {
				 int output = JOptionPane.showConfirmDialog(frame
			               , "Are you sure you want to vote AAP?"
			               ,"Confirm"
			               ,JOptionPane.YES_NO_OPTION);

			            if(output == JOptionPane.YES_OPTION)
			            {
			            	frame.dispose();
			            } 
			            else if(output == JOptionPane.NO_OPTION)
			            {
			            	
			            }				 
			 }  
				  
		});
		
		bsp.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent e)
			 {
				 int output = JOptionPane.showConfirmDialog(frame
			               , "Are you sure you want to vote BSP?"
			               ,"Confirm"
			               ,JOptionPane.YES_NO_OPTION);

			            if(output == JOptionPane.YES_OPTION)
			            {
			            	frame.dispose();
			            } 
			            else if(output == JOptionPane.NO_OPTION)
			            {
			            	
			            }				 
			 }  
				  
		});
		
		rjd.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent e)
			 {
				 int output = JOptionPane.showConfirmDialog(frame
			               , "Are you sure you want to vote RJD?"
			               ,"Confirm"
			               ,JOptionPane.YES_NO_OPTION);

			            if(output == JOptionPane.YES_OPTION)
			            {
			            	frame.dispose();
			            } 
			            else if(output == JOptionPane.NO_OPTION)
			            {
			            	
			            }			 
			 }  
				  
		});
		
		nota.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent e)
			 {
				 int output = JOptionPane.showConfirmDialog(frame
			               , "Are you sure you want to vote NOTA?"
			               ,"Confirm"
			               ,JOptionPane.YES_NO_OPTION);

			            if(output == JOptionPane.YES_OPTION)
			            {
			            	frame.dispose();
			            } 
			            else if(output == JOptionPane.NO_OPTION)
			            {
			            	
			            }			 
			 }  
				  
		});
		
		
		congress.setForeground(Color.DARK_GRAY);
		congress.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		congress.setBackground(new Color(255, 204, 0));
		frame.setSize(1080,720);

	}
}
