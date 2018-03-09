import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AI界面 extends JFrame{
	public static final int WIDTH=600;
	public static final int HEIGHT=400;
	JFrame mainFrame;
	JMenu fileMenu;
	JMenu intnetMenu;
	JMenuItem openItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	JMenuItem netItem;
	JMenuItem buleItem;
	JLabel m1,m2,m3;
	TextField name;
	CheckboxGroup g;
	Checkbox c1,c2,c3,c4,c5;
//	dfsasd(){};
	
	public void showPaint(){
		mainFrame=new JFrame();
		mainFrame.setTitle("AI机器人");
		mainFrame.setSize(WIDTH,HEIGHT);
		mainFrame.setResizable(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		mainFrame.setVisible(true);
		
        JMenuBar menuBar=new JMenuBar();
        mainFrame.setJMenuBar(menuBar);
        fileMenu=new JMenu("文件");
        intnetMenu=new JMenu("联网");        
        openItem=new JMenuItem("打开（O）",'O');
        saveItem=new JMenuItem("保存（S）",'O');
        exitItem=new JMenuItem("退出（X）",'X');       
        netItem =new JMenuItem("无线网（W）",'W');
        buleItem=new JMenuItem("蓝牙（L）",'L');
        menuBar.add(fileMenu);
        menuBar.add(intnetMenu);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        intnetMenu.add(netItem);
        intnetMenu.add(buleItem);
        
        JOptionPane.showMessageDialog(mainFrame,"欢迎来到AI的世界！","提示",JOptionPane.INFORMATION_MESSAGE);
        
		ButtonGroup bg=new ButtonGroup();
		JRadioButton b1=new JRadioButton(" 1 ",true);
		JRadioButton b2=new JRadioButton(" 2 ");
		JRadioButton b3=new JRadioButton(" 3 ");
		JRadioButton b4=new JRadioButton(" 4 ");
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		bg.add(b4);
		mainFrame.show();			
		JButton clearAI=new JButton("清洁机器人");
		JButton  singAI=new JButton("唱歌机器人");
		JButton otherAI=new JButton("自定义机器人");	
		Container contentPane=mainFrame.getContentPane();
		JPanel panel=new JPanel();
		
		panel.setSize(WIDTH/5,HEIGHT/5*3);
		panel.setBorder(BorderFactory.createTitledBorder("设置线宽"));
		
		contentPane.add(panel);
		panel.add(singAI);
		panel.add(otherAI);
		panel.add(clearAI);
		panel.setLayout(new GridLayout(6,1));
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		
		m1=new JLabel("姓名：");
		m2=new JLabel("性别：");
		m3=new JLabel("学号：");
		name=new TextField(20);
		g=new CheckboxGroup();
		c1=new Checkbox("男",true,g);
		c2=new Checkbox("女",false,g);
		c3=new Checkbox("大一");
		c4=new Checkbox("大二");
		c5=new Checkbox("大三");
		setLayout(new FlowLayout());
		panel.add(m1);panel.add(name);
		panel.add(m2,BorderLayout.EAST);panel.add(c1,BorderLayout.EAST);panel.add(c2,BorderLayout.EAST);
		panel.add(m3,BorderLayout.WEST);
		panel.add(c3,BorderLayout.WEST);panel.add(c4,BorderLayout.WEST);panel.add(c5,BorderLayout.WEST);
		mainFrame.setVisible(true);	

	}
public static void main(String args[]){
     AI界面 testPaint=new AI界面();
     testPaint.showPaint();
}
}
