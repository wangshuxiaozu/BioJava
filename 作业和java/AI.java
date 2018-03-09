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
       System.out.println("是否打开wifi和GPS: (yes or no)\n");
       String YN=in.nextLine();cls();
        if(YN.equals("Y")||YN.equals("yes")||YN.equals("Yes")||YN.equals("YEs")){
           System.out.println("启动！"); 
           gettop();
           }
        else
          {
           System.out.println("无信号.....");
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
    	   		  throw new numbers("输入异常，输入的内容不是数字！");
    	     }
    	     number=Integer.parseInt(num); 
             if(number<0) throw new numbers("输入的数字有问题，不能为负！");    
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
	private static String name="王金元的专属";
	 void ClsManu() throws numbers{
	   System.out.println("勤劳小妹AI为你服务！");
	    for(int i=0;i<4;i++){
		if(i>0){
			System.out.println("\n欢迎回来，还需要什么帮助？");
		  }
		 System.out.println("+++++clear服务界面++++++");
		 System.out.println("1--------查看垃圾箱状态--------");
		 System.out.println("2-----修改垃圾箱名称和容量-------");
		 System.out.println("3--------需要扔垃圾-----------");
		 System.out.println("输入其他数字返回上一层菜单。");
		 System.out.println("============================");
         System.out.println("请输入你要使用的功能：\n");
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
		 System.out.println("请输入垃圾箱的新名字：");
		 name=in.nextLine();cls();
		 System.out.println("修改成功");
		 System.out.println("请输入垃圾箱的新容量：");
		 stat=putnumber();
		 System.out.println("修改成功，感谢您的配合！！");
	}
	private void BoxStat() {
		System.out.println("垃圾箱名称："+name+"。垃圾箱容量："+stat+"mg");
		System.out.println("垃圾箱重量为："+mg+"。占容量百分比："+(double)(mg*100)/stat+"%");				
	}
	void gettop() throws numbers{
		System.out.println("请扔垃圾：（输入质量大小）");
		    mg+=putnumber();
        if(mg>=100)
        {
          System.out.println("电机后退10圈");
          System.out.println("电机前进3圈（转身）");
          System.out.println("翻转垃圾桶，倒垃圾");
          System.out.println("等待2秒后，翻转还原垃圾桶");
          System.out.println("原路返回");
         }
      else
       System.out.println("垃圾箱还未满，时刻准备着为主人服务!");
      }

}
class singAI  extends publicAI{
    String[][] songs=new String[20][2];
    int couple=2;
    void singAImanu() throws numbers{
	System.out.println("音乐王子AI为你服务！");
	 for(int i=0;i<4;i++){
	    if(i>0){
		  System.out.println("欢迎回来，还需要什么帮助？\n");
		 }	
	System.out.println("+++++AI音乐界面++++++");
	System.out.println("1------搜索歌曲--------");
	System.out.println("2------随机播放歌曲-----");
	System.out.println("3------浏览本地歌曲-----");
	System.out.println("4------添加歌曲到本地----");
	System.out.println("输入其他数字返回上一层菜单。");
	System.out.println("=====================");
    System.out.println("\n请输入你要使用的功能：");
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
	  System.out.println("请输入歌曲名称：");
	  songs[i][0]=in.nextLine();cls();
	  System.out.println("请输入歌手名称：");
	  songs[i][1]=in.nextLine();cls();
	  System.out.println("添加成功，谢谢配合！！");
	  couple++;
}
     private void localSong() {
	  songs[0][0]="冬天的秘密";songs[0][1]="周传雄";
	  songs[1][0]="甜蜜蜜"   ;songs[1][1]="邓丽君";
	  System.out.println(" @歌曲名称@        @歌手@");	  
	  for(int i=0;i<couple;i++){
		  System.out.printf("《%6s》 %12s\n",songs[i][0],songs[i][1]);
	  }
		  System.out.println("=====================");
}
     private void ScanSong() throws numbers {
	  System.out.println("随机中，请稍后.....");
	  int i=(int)(Math.random()*couple);
	     Song(songs[i][0]);
}
     void gettop() throws numbers{
	  System.out.println("主人输入歌曲名称：\n");
      String song=in.nextLine();
      String www=song;
      System.out.println("网络搜素中，请稍后.....%87\n");
      if(song.equals(www)){
          Song(www);
     }
     else
       System.out.println("时刻准备着为主人服务!");
   }
     void Song(String www) throws numbers{
         System.out.println("找到歌曲："+www+".AVI");
         System.out.println("播放中");
         System.out.println(www+"----*---------");
         System.out.println("    >      =      <");
         System.out.println("设置：单曲循环");    	 
     }
}
class manu extends publicAI{
     void mainmanu() throws numbers{
          System.out.println("********功能介绍*********");
	      System.out.println("1-------清洁机器人-------");
          System.out.println("2-------唱歌机器人-------");
          System.out.println("=======================");
          System.out.println("\n请输入你要使用的功能：");
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
	   System.out.println("欢迎来到AI之家,有什么需要我帮助的吗?");
	   for(int i=0;i<4;i++){
		if(i>0){
			System.out.println("欢迎回来，还需要什么帮助？\n");
		}
		   try{
			 manu manus=new manu();
	          manus.mainmanu();
	          }catch(numbers e){
	        	  System.out.println(e.toString());
	          }
		   System.out.println("Ctrl+Z结束程序");
			  
	  }
   }
}