import java.util.Scanner;
class numbers extends Exception{
	  numbers(String str){
		super(str);
	}
}
class publicAI{
    Scanner in=new Scanner(System.in);
    private int number;
     void needme() throws numbers{
       System.out.println("�Ƿ��wifi��GPS: (yes or no)\n");
       String YN=in.nextLine();cls();
        if(YN.equals("Y")||YN.equals("yes")||YN.equals("Yes")||YN.equals("YEs")){
           System.out.println("������"); 
           gettop();
           }
        else
          {
           System.out.println("���ź�.....");
           }
       }
     void gettop() throws numbers{
     }
     int getwork() throws numbers{ 
    	 return 0;
      }
     int putnumber()throws numbers{
    	 String num=null;
	     num=in.nextLine();
    	     for(int i=0;i<num.length();i++){
    	   	  if(!Character.isDigit(num.charAt(i)))
    	   		  throw new numbers("�����쳣����������ݲ������֣�");
    	     }
    	     number=Integer.parseInt(num); 
             if(number<0) throw new numbers("��������������⣬����Ϊ����");    
             cls();
    	    return number;
     }
     public void cls(){
         for(int j=0;j<40;j++)
          System.out.println();
         }
}
class clearAI extends publicAI{ 
	private static int mg=1,stat=100;
	private static String name="����Ԫ��ר��";
	 void ClsManu() throws numbers{
	   System.out.println("����С��AIΪ�����");
	    for(int i=0;i<4;i++){
		if(i>0){
			System.out.println("\n��ӭ����������Ҫʲô������");
		  }
		 System.out.println("+++++clear�������++++++");
		 System.out.println("1--------�鿴������״̬--------");
		 System.out.println("2-----�޸����������ƺ�����-------");
		 System.out.println("3--------��Ҫ������-----------");
		 System.out.println("�����������ַ�����һ��˵���");
		 System.out.println("============================");
         System.out.println("��������Ҫʹ�õĹ��ܣ�\n");
         if(getwork()>3)
         	break;
		 }
	 }
      int getwork() throws numbers{
    	int number=putnumber();
      switch(number){
          case 1:BoxStat();break;
          case 2:ReName();break;
          case 3:needme();break;
      }
	return number;
	 }
	 private void ReName() throws numbers {
		 System.out.println("������������������֣�");
		 name=in.nextLine();cls();
		 System.out.println("�޸ĳɹ�");
		 System.out.println("���������������������");
		 stat=putnumber();
		 System.out.println("�޸ĳɹ�����л������ϣ���");
	}
	private void BoxStat() {
		System.out.println("���������ƣ�"+name+"��������������"+stat+"mg");
		System.out.println("����������Ϊ��"+mg+"��ռ�����ٷֱȣ�"+(double)(mg*100)/stat+"%");				
	}
	void gettop() throws numbers{
		System.out.println("����������������������С��");
		    mg+=putnumber();
        if(mg>=100)
        {
          System.out.println("�������10Ȧ");
          System.out.println("���ǰ��3Ȧ��ת��");
          System.out.println("��ת����Ͱ��������");
          System.out.println("�ȴ�2��󣬷�ת��ԭ����Ͱ");
          System.out.println("ԭ·����");
         }
      else
       System.out.println("�����仹δ����ʱ��׼����Ϊ���˷���!");
      }

}
class singAI  extends publicAI{
    String[][] songs=new String[20][2];
    int couple=2;
    void singAImanu() throws numbers{
	System.out.println("��������AIΪ�����");
	 for(int i=0;i<4;i++){
	    if(i>0){
		  System.out.println("��ӭ����������Ҫʲô������\n");
		 }	
	System.out.println("+++++AI���ֽ���++++++");
	System.out.println("1------��������--------");
	System.out.println("2------������Ÿ���-----");
	System.out.println("3------������ظ���-----");
	System.out.println("4------��Ӹ���������----");
	System.out.println("�����������ַ�����һ��˵���");
	System.out.println("=====================");
    System.out.println("\n��������Ҫʹ�õĹ��ܣ�");
    if(getwork()>4)
    	break;
	 }
}
    int getwork() throws numbers{
    	int number=putnumber();
	     switch(number){
	         case 1:needme();break;
	         case 2:ScanSong();break;
	         case 3:localSong();break;
	         case 4:addSong();break;
	     }
	     return number;
    }
     private void addSong() throws numbers {
    	int i=couple;
	  System.out.println("������������ƣ�");
	  songs[i][0]=in.nextLine();cls();
	  System.out.println("������������ƣ�");
	  songs[i][1]=in.nextLine();cls();
	  System.out.println("��ӳɹ���лл��ϣ���");
	  couple++;
}
     private void localSong() {
	  songs[0][0]="���������";songs[0][1]="�ܴ���";
	  songs[1][0]="������"   ;songs[1][1]="������";
	  System.out.println(" @��������@        @����@");	  
	  for(int i=0;i<couple;i++){
		  System.out.printf("��%6s�� %12s\n",songs[i][0],songs[i][1]);
	  }
		  System.out.println("=====================");
}
     private void ScanSong() throws numbers {
	  System.out.println("����У����Ժ�.....");
	  int i=(int)(Math.random()*couple);
	     Song(songs[i][0]);
}
     void gettop() throws numbers{
	  System.out.println("��������������ƣ�\n");
      String song=in.nextLine();
      String www=song;
      System.out.println("���������У����Ժ�.....%87\n");
      if(song.equals(www)){
          Song(www);
     }
     else
       System.out.println("ʱ��׼����Ϊ���˷���!");
   }
     void Song(String www) throws numbers{
         System.out.println("�ҵ�������"+www+".AVI");
         System.out.println("������");
         System.out.println(www+"----*---------");
         System.out.println("    >      =      <");
         System.out.println("���ã�����ѭ��");    	 
     }
}
class manu extends publicAI{
     void mainmanu() throws numbers{
          System.out.println("********���ܽ���*********");
	      System.out.println("1-------��������-------");
          System.out.println("2-------���������-------");
          System.out.println("=======================");
          System.out.println("\n��������Ҫʹ�õĹ��ܣ�");
     	  getwork();
     }
     int getwork() throws numbers{
    	 clearAI AA=new clearAI();
    	 singAI TT=new singAI();
    	 int number=putnumber();
            switch(number){
                   case 1: AA.ClsManu();break;
                   case 2: TT.singAImanu();break;
                   default:;
                  }
            return 0;
            }
}
public class AI {
	public static void main(String args[]){
	   System.out.println("��ӭ����AI֮��,��ʲô��Ҫ�Ұ�������?");
	   for(int i=0;i<4;i++){
		if(i>0){
			System.out.println("��ӭ����������Ҫʲô������\n");
		}
		   try{
			 manu manus=new manu();
	          manus.mainmanu();
	          }catch(numbers e){
	        	  System.out.println(e.toString());
	          }
		   System.out.println("Ctrl+Z��������");
			  
	  }
   }
}