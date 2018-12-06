import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void run() {
		// TODO Auto-generated method stub
		JFrame res=new JFrame();
		res.getContentPane().setBackground(new Color(255, 255, 255));
		//int vbjp = 10;
		res.setVisible(true);
		res.setSize(1080,720);
		res.getContentPane().setLayout(null);
		
		//int vbjp=rs.getInt("BJP");
		
		JLabel lblNewLabel = new JLabel("RESULTS");
		 lblNewLabel.setForeground(new Color(34, 139, 34));
		 lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 69));
		 lblNewLabel.setBounds(340, 42, 323, 88);
		 res.getContentPane().add(lblNewLabel);
		 
		 JLabel label_4 = new JLabel("----------------------------------------------------------------------------");
		 label_4.setBounds(347, 114, 304, 16);
		 res.getContentPane().add(label_4);
		
		JLabel lblBjp = new JLabel("BJP");
		lblBjp.setForeground(new Color(30, 144, 255));
		lblBjp.setFont(new Font("Dialog", Font.BOLD, 20));
		lblBjp.setBounds(100, 220, 38, 26);
		res.getContentPane().add(lblBjp);
		
		JLabel label = new JLabel("Congress");
		label.setForeground(new Color(30, 144, 255));
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		label.setBounds(259, 220, 91, 26);
		res.getContentPane().add(label);
		
		JLabel lblBjp_1 = new JLabel("AAP");
		lblBjp_1.setForeground(new Color(30, 144, 255));
		lblBjp_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblBjp_1.setBounds(453, 220, 39, 26);
		res.getContentPane().add(lblBjp_1);
		
		JLabel label_2 = new JLabel("BSP\r\n\r\n");
		label_2.setForeground(new Color(30, 144, 255));
		label_2.setFont(new Font("Dialog", Font.BOLD, 20));
		label_2.setBounds(604, 220, 40, 26);
		res.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("RJD");
		label_3.setForeground(new Color(30, 144, 255));
		label_3.setFont(new Font("Dialog", Font.BOLD, 20));
		label_3.setBounds(740, 220, 39, 26);
		res.getContentPane().add(label_3);
		
		JLabel label_1 = new JLabel("NOTA\r\n");
		label_1.setForeground(new Color(30, 144, 255));
		label_1.setFont(new Font("Dialog", Font.BOLD, 20));
		label_1.setBounds(890, 220, 56, 26);
		res.getContentPane().add(label_1);
		
		
		JLabel bjp = new JLabel("");
		bjp.setFont(new Font("Dialog", Font.BOLD, 66));
		bjp.setBounds(95, 320, 139, 148);
		res.getContentPane().add(bjp);
		
		JLabel congress = new JLabel("");
		 congress.setFont(new Font("Dialog", Font.BOLD, 66));
		 congress.setBounds(259, 320, 139, 148);
		 res.getContentPane().add(congress);
		 
		 JLabel aap = new JLabel("");
		 aap.setFont(new Font("Dialog", Font.BOLD, 66));
		 aap.setBounds(453, 320, 139, 148);
		 res.getContentPane().add(aap);
		 
		 JLabel bsp = new JLabel("");
		 bsp.setFont(new Font("Dialog", Font.BOLD, 66));
		 bsp.setBounds(604, 320, 139, 148);
		 res.getContentPane().add(bsp);
		 
		 JLabel rjd = new JLabel("");
		 rjd.setFont(new Font("Dialog", Font.BOLD, 66));
		 rjd.setBounds(740, 320, 151, 148);
		 res.getContentPane().add(rjd);
		 
		 JLabel nota = new JLabel("");
		 nota.setFont(new Font("Dialog", Font.BOLD, 66));
		 nota.setBounds(890, 320, 139, 148);
		 res.getContentPane().add(nota);
		 
		 JLabel win = new JLabel("");
		 win.setBounds(102, 498, 846, 77);
		 res.getContentPane().add(win);
		 
		
		try     
		 {  
		 Class.forName("com.mysql.jdbc.Driver");  
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","");  
		 //here sonoo is database name, root is username and password  
		 Statement stmt=con.createStatement();  
		 ResultSet rs=stmt.executeQuery("select * from votes"); 
		 rs.next();
		 bjp.setText(Integer.toString(rs.getInt("BJP")));
		 congress.setText(Integer.toString(rs.getInt("CONGRESS")));
		 aap.setText(Integer.toString(rs.getInt("AAP")));
		 bsp.setText(Integer.toString(rs.getInt("BSP")));
		 rjd.setText(Integer.toString(rs.getInt("RJP")));
		 nota.setText(Integer.toString(rs.getInt("NOTA")));
		 
		 
		 
		 //con.close();  
		 }
		 catch(Exception eq)
		 { 
			 System.out.println(eq);
		 }  
		
		String data[][]={{"10","20","45","454","23","12"}}; 
		String column[]= {"BJP","CONGRESS","AAP","BSP","RJD","NOTA"};
		
	}
}
