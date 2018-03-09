package gfhfd;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class dfsasd{
	public static final int WIDTH=600;//尺寸的静态量
	public static final int HEIGHT=400;//尺寸的静态量
	JFrame mainFrame;
	JMenu fileMenu;//设置菜单的
	JMenuItem openItem;//菜单下面的选项
	JMenuItem saveItem;//..
	JMenuItem exitItem;//..
	JLabel m1,m2,m3;//界面里固定显示的文字：性别、学号
	TextField name;//界面里设置输入框的
	CheckboxGroup g;//单项选择的样式，
	Checkbox c1,c2,c3,c4,c5;//单项选择的另一种样式
	
	public void showPaint(){
		mainFrame=new JFrame();
		mainFrame.setTitle("AI机器人");//设置界面名字的
		mainFrame.setSize(WIDTH,HEIGHT);//设置界面尺寸的
		mainFrame.setResizable(true);//可调整界面大小化的
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		mainFrame.setVisible(true);//课显示界面边界的
		
        JMenuBar menuBar=new JMenuBar();
        mainFrame.setJMenuBar(menuBar);
        fileMenu=new JMenu("文件");
        openItem=new JMenuItem("打开（O）",'O');
        exitItem=new JMenuItem("退出（X）",'X');       
        menuBar.add(fileMenu);
        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        
        JOptionPane.showMessageDialog(mainFrame,"欢迎来到AI的世界！","提示",JOptionPane.INFORMATION_MESSAGE);
        
		ButtonGroup bg=new ButtonGroup();//界面中设置两个单项选择1,2
		JRadioButton b1=new JRadioButton(" 1 ",true);
		JRadioButton b2=new JRadioButton(" 2 ");
		bg.add(b1);
		bg.add(b2);

		JButton clearAI=new JButton("清洁机器人");//界面中设置两个按键
		JButton  singAI=new JButton("唱歌机器人");	
		Container contentPane=mainFrame.getContentPane();
		JPanel panel=new JPanel();		
		contentPane.add(panel);
		panel.setSize(WIDTH/5,HEIGHT/5*3);
		panel.setBorder(BorderFactory.createTitledBorder("设置线宽"));			
		panel.add(singAI);
		panel.add(clearAI);
		panel.setLayout(new GridLayout(6,1));
		panel.add(b1);
		panel.add(b2);
		
		m1=new JLabel("姓名：");//界面里固定显示的文字：性别、学号
		m2=new JLabel("性别：");//..
		m3=new JLabel("学号：");//..
		name=new TextField(20);
		g=new CheckboxGroup();
		c1=new Checkbox("男",true,g);//设置选项
		c2=new Checkbox("女",false,g);//..
		c3=new Checkbox("大一");//..
		c4=new Checkbox("大二");//..
//		setLayout(new FlowLayout()); extends JFrame.另一种写法，明天研究
		panel.add(m1);panel.add(name);
		panel.add(m2,BorderLayout.EAST);panel.add(c1,BorderLayout.EAST);panel.add(c2,BorderLayout.EAST);
		panel.add(m3,BorderLayout.WEST);panel.add(c3,BorderLayout.WEST);panel.add(c4,BorderLayout.WEST);
		
		mainFrame.setVisible(true);	//所有显示在界面中

	}
public static void main(String args[]){
     dfsasd testPaint=new dfsasd();
     testPaint.showPaint();
}
}
