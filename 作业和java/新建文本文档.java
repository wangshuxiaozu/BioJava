package gfhfd;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class dfsasd{
	public static final int WIDTH=600;//�ߴ�ľ�̬��
	public static final int HEIGHT=400;//�ߴ�ľ�̬��
	JFrame mainFrame;
	JMenu fileMenu;//���ò˵���
	JMenuItem openItem;//�˵������ѡ��
	JMenuItem saveItem;//..
	JMenuItem exitItem;//..
	JLabel m1,m2,m3;//������̶���ʾ�����֣��Ա�ѧ��
	TextField name;//����������������
	CheckboxGroup g;//����ѡ�����ʽ��
	Checkbox c1,c2,c3,c4,c5;//����ѡ�����һ����ʽ
	
	public void showPaint(){
		mainFrame=new JFrame();
		mainFrame.setTitle("AI������");//���ý������ֵ�
		mainFrame.setSize(WIDTH,HEIGHT);//���ý���ߴ��
		mainFrame.setResizable(true);//�ɵ��������С����
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		mainFrame.setVisible(true);//����ʾ����߽��
		
        JMenuBar menuBar=new JMenuBar();
        mainFrame.setJMenuBar(menuBar);
        fileMenu=new JMenu("�ļ�");
        openItem=new JMenuItem("�򿪣�O��",'O');
        exitItem=new JMenuItem("�˳���X��",'X');       
        menuBar.add(fileMenu);
        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        
        JOptionPane.showMessageDialog(mainFrame,"��ӭ����AI�����磡","��ʾ",JOptionPane.INFORMATION_MESSAGE);
        
		ButtonGroup bg=new ButtonGroup();//������������������ѡ��1,2
		JRadioButton b1=new JRadioButton(" 1 ",true);
		JRadioButton b2=new JRadioButton(" 2 ");
		bg.add(b1);
		bg.add(b2);

		JButton clearAI=new JButton("��������");//������������������
		JButton  singAI=new JButton("���������");	
		Container contentPane=mainFrame.getContentPane();
		JPanel panel=new JPanel();		
		contentPane.add(panel);
		panel.setSize(WIDTH/5,HEIGHT/5*3);
		panel.setBorder(BorderFactory.createTitledBorder("�����߿�"));			
		panel.add(singAI);
		panel.add(clearAI);
		panel.setLayout(new GridLayout(6,1));
		panel.add(b1);
		panel.add(b2);
		
		m1=new JLabel("������");//������̶���ʾ�����֣��Ա�ѧ��
		m2=new JLabel("�Ա�");//..
		m3=new JLabel("ѧ�ţ�");//..
		name=new TextField(20);
		g=new CheckboxGroup();
		c1=new Checkbox("��",true,g);//����ѡ��
		c2=new Checkbox("Ů",false,g);//..
		c3=new Checkbox("��һ");//..
		c4=new Checkbox("���");//..
//		setLayout(new FlowLayout()); extends JFrame.��һ��д���������о�
		panel.add(m1);panel.add(name);
		panel.add(m2,BorderLayout.EAST);panel.add(c1,BorderLayout.EAST);panel.add(c2,BorderLayout.EAST);
		panel.add(m3,BorderLayout.WEST);panel.add(c3,BorderLayout.WEST);panel.add(c4,BorderLayout.WEST);
		
		mainFrame.setVisible(true);	//������ʾ�ڽ�����

	}
public static void main(String args[]){
     dfsasd testPaint=new dfsasd();
     testPaint.showPaint();
}
}
