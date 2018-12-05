import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JProgressBar;
public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame res=new JFrame();
		res.setVisible(true);
		res.setSize(1080,720);
		res.getContentPane().setLayout(null);
		
		JLabel lblBjp = new JLabel("BJP");
		lblBjp.setFont(new Font("Dialog", Font.BOLD, 20));
		lblBjp.setBounds(156, 165, 38, 26);
		res.getContentPane().add(lblBjp);
		
		JLabel label = new JLabel("Congress");
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		label.setBounds(299, 165, 91, 26);
		res.getContentPane().add(label);
		
		JLabel lblBjp_1 = new JLabel("BJP");
		lblBjp_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblBjp_1.setBounds(464, 165, 38, 26);
		res.getContentPane().add(lblBjp_1);
		
		JLabel label_2 = new JLabel("BJP");
		label_2.setFont(new Font("Dialog", Font.BOLD, 20));
		label_2.setBounds(657, 165, 38, 26);
		res.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("BJP");
		label_3.setFont(new Font("Dialog", Font.BOLD, 20));
		label_3.setBounds(826, 165, 38, 26);
		res.getContentPane().add(label_3);
		
		String data[][]={{"10","20","45","454","23","12"}}; 
		String column[]= {"BJP","CONGRESS","AAP","BSP","RJD","NOTA"};
		
	}
}
