import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AI���� extends JFrame{
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
		mainFrame.setTitle("AI������");
		mainFrame.setSize(WIDTH,HEIGHT);
		mainFrame.setResizable(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		mainFrame.setVisible(true);
		
        JMenuBar menuBar=new JMenuBar();
        mainFrame.setJMenuBar(menuBar);
        fileMenu=new JMenu("�ļ�");
        intnetMenu=new JMenu("����");        
        openItem=new JMenuItem("�򿪣�O��",'O');
        saveItem=new JMenuItem("���棨S��",'O');
        exitItem=new JMenuItem("�˳���X��",'X');       
        netItem =new JMenuItem("��������W��",'W');
        buleItem=new JMenuItem("������L��",'L');
        menuBar.add(fileMenu);
        menuBar.add(intnetMenu);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        intnetMenu.add(netItem);
        intnetMenu.add(buleItem);
        
        JOptionPane.showMessageDialog(mainFrame,"��ӭ����AI�����磡","��ʾ",JOptionPane.INFORMATION_MESSAGE);
        
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
		JButton clearAI=new JButton("��������");
		JButton  singAI=new JButton("���������");
		JButton otherAI=new JButton("�Զ��������");	
		Container contentPane=mainFrame.getContentPane();
		JPanel panel=new JPanel();
		
		panel.setSize(WIDTH/5,HEIGHT/5*3);
		panel.setBorder(BorderFactory.createTitledBorder("�����߿�"));
		
		contentPane.add(panel);
		panel.add(singAI);
		panel.add(otherAI);
		panel.add(clearAI);
		panel.setLayout(new GridLayout(6,1));
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		
		m1=new JLabel("������");
		m2=new JLabel("�Ա�");
		m3=new JLabel("ѧ�ţ�");
		name=new TextField(20);
		g=new CheckboxGroup();
		c1=new Checkbox("��",true,g);
		c2=new Checkbox("Ů",false,g);
		c3=new Checkbox("��һ");
		c4=new Checkbox("���");
		c5=new Checkbox("����");
		setLayout(new FlowLayout());
		panel.add(m1);panel.add(name);
		panel.add(m2,BorderLayout.EAST);panel.add(c1,BorderLayout.EAST);panel.add(c2,BorderLayout.EAST);
		panel.add(m3,BorderLayout.WEST);
		panel.add(c3,BorderLayout.WEST);panel.add(c4,BorderLayout.WEST);panel.add(c5,BorderLayout.WEST);
		mainFrame.setVisible(true);	

	}
public static void main(String args[]){
     AI���� testPaint=new AI����();
     testPaint.showPaint();
}
}
