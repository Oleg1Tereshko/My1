
import java.util.ArrayList;
public class NewChuslo {
	public static  String  Chuslo(String name,int m,int year,int firstdate, int nex,int prev) {
		String x="";
		int month = 0,firstday=0,lastday=0;
	    final int matrix = 42;
		  
		ArrayList<String> list = new ArrayList<String>();
		list.add("txtDay1");list.add("txtDay2");list.add("txtDay3");list.add("txtDay4");list.add("txtDay5");
		list.add("txtDay6");list.add("txtDay7");list.add("txtDay8");list.add("txtDay9");list.add("txtDay10");
		list.add("txtDay11");list.add("txtDay12");list.add("txtDay13");list.add("txtDay14");list.add("txtDay15");
		list.add("txtDay16");list.add("txtDay17");list.add("txtDay18");list.add("txtDay19");list.add("txtDay20");
		list.add("txtDay21");list.add("txtDay22");list.add("txtDay23");list.add("txtDay24");list.add("txtDay25");
		list.add("txtDay26");list.add("txtDay27");list.add("txtDay28");list.add("txtDay29");list.add("txtDay30");
		list.add("txtDay31");list.add("txtDay32");list.add("txtDay33");list.add("txtDay34");list.add("txtDay35");
		list.add("txtDay36");list.add("txtDay37");list.add("txtDay38");
		
		
		ArrayList<Integer> listAllM = new ArrayList<Integer>();
		listAllM.add(31);listAllM.add(28);listAllM.add(31);listAllM.add(30);listAllM.add(31);listAllM.add(30);
		listAllM.add(31);listAllM.add(31);listAllM.add(30);listAllM.add(31);listAllM.add(30);listAllM.add(31);
		if(Month.Vusokosnuj(year)==true ) {listAllM.set(1,29);}
		
		if(year>=2020)
		{
		if(m==1 )
		{ month=31;
		firstday=firstdate;          	
		}	   
		if( m == 2 &&  Month.Vusokosnuj(year)==false)  
		{ month=28; 
		lastday=firstdate+listAllM.get(0);firstday=FirstDay.NewM(0,lastday, prev, nex);		
		} 
		if(m == 2 &&  Month.Vusokosnuj(year)==true )
		{  month=29; 
		lastday=firstdate+listAllM.get(0);firstday=FirstDay.NewM(0,lastday, prev, nex);	   
		}	
		if(m == 3) 
		{month=31;	
		lastday=firstdate+listAllM.get(0);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(1);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}		
		if(m == 4 )	
		{ month=30;                                          
		lastday=firstdate+listAllM.get(0);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(1);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(2);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}
		if(m == 5)
		{ month=31;
		lastday=firstdate+listAllM.get(0);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(1);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(2);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(3);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}
		if(m == 6)
		{ month=30;
		lastday=firstdate+listAllM.get(0);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(1);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(2);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(3);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(4);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}
		if(m == 7)
		{ month=31;	
		lastday=firstdate+listAllM.get(0);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(1);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(2);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(3);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(4);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(5);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}
		if(m == 8)
		{ month=31;	
		lastday=firstdate+listAllM.get(0);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(1);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(2);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(3);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(4);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(5);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(6);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}
		if(m == 9)
		{ month=30;	
		lastday=firstdate+listAllM.get(0);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(1);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(2);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(3);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(4);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(5);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(6);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(7);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}
		if(m == 10)
		{ month=31;	
		lastday=firstdate+listAllM.get(0);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(1);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(2);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(3);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(4);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(5);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(6);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(7);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(8);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}
		if(m == 11)
		{ month=30;	
		lastday=firstdate+listAllM.get(0);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(1);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(2);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(3);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(4);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(5);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(6);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(7);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(8);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(9);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}
		if(m == 12)
		{ month=31;
		lastday=firstdate+listAllM.get(0);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(1);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(2);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(3);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(4);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(5);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(6);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(7);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(8);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(9);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=firstday+listAllM.get(10);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}
		} 
		else if(year<2020)
		{
		if(m == 12)
		{ month=31;			
			firstday=firstdate;
		}										
		if(m == 11)
		{ month=30;
		lastday=((firstdate+matrix)-listAllM.get(10));firstday=FirstDay.NewM(0,lastday, prev, nex);		
		}		
		if(m == 10)
		{ month=31;                                
		lastday=(firstdate+matrix)-listAllM.get(10);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=((firstday+matrix)-listAllM.get(9));firstday=FirstDay.NewM(0,lastday, prev, nex);		
		}		
		if(m == 9)
		{ month=30;
		lastday=(firstdate+matrix)-listAllM.get(10);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(9);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(8);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}		
		if(m == 8)
		{ month=31;
		lastday=(firstdate+matrix)-listAllM.get(10);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(9);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(8);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(7);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}		
		if(m == 7)
		{ month=31;
		lastday=(firstdate+matrix)-listAllM.get(10);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(9);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(8);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(7);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(6);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}		
		if(m == 6)
		{ month=30;
		lastday=(firstdate+matrix)-listAllM.get(10);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(9);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(8);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(7);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(6);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(5);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}		
		if(m == 5)
		{ month=31;
		lastday=(firstdate+matrix)-listAllM.get(10);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(9);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(8);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(7);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(6);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(5);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(4);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}	
		if(m == 4)
		{ month=30;
		lastday=(firstdate+matrix)-listAllM.get(10);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(9);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(8);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(7);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(6);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(5);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(4);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(3);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}		
		if(m == 3)
		{ month=31;
		lastday=(firstdate+matrix)-listAllM.get(10);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(9);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(8);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(7);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(6);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(5);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(4);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(3);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(2);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}	
		if( m == 2 &&  Month.Vusokosnuj(year)==false)
		{ month=28; 
		lastday=(firstdate+matrix)-listAllM.get(10);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(9);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(8);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(7);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(6);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(5);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(4);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(3);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(2);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(1);firstday=FirstDay.NewM(0,lastday, prev, nex);
		} 
		if(m == 2 &&  Month.Vusokosnuj(year)==true )
		{  month=29; 
		lastday=(firstdate+matrix)-listAllM.get(10);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(9);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(8);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(7);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(6);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(5);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(4);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(3);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(2);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(1);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}	
		if(m == 1)
		{ month=31;
		lastday=(firstdate+matrix)-listAllM.get(10);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(9);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(8);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(7);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(6);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(5);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(4);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(3);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(2);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(1);firstday=FirstDay.NewM(0,lastday, prev, nex);
		lastday=(firstday+matrix)-listAllM.get(0);firstday=FirstDay.NewM(0,lastday, prev, nex);
		}
		}
		
	if(firstday==2){for(int j=0; j<=0;j++){list.remove(j);}}
	if(firstday==3){for(int j=0; j<=0;j++){list.remove(j);list.remove(j);}}
	if(firstday==4){for(int j=0; j<=0;j++){list.remove(j);list.remove(j);list.remove(j);}}
	if(firstday==5){for(int j=0; j<=0;j++){list.remove(j);list.remove(j);list.remove(j);
	list.remove(j);}}
	if(firstday==6){for(int j=0; j<=0;j++){list.remove(j);list.remove(j);list.remove(j);
	list.remove(j);list.remove(j);}}
	if(firstday==7){for(int j=0; j<=0;j++){list.remove(j);list.remove(j);list.remove(j);
	list.remove(j);list.remove(j);list.remove(j);}}
	if(firstday==8){for(int j=0; j<=0;j++){list.remove(j);list.remove(j);list.remove(j);
	list.remove(j);list.remove(j);list.remove(j);list.remove(j);}}

		
		 for(int i=1;i<=month;i++ )
			{   
				if(list.get(i-1)==name) 
				{        
					  x = String.valueOf(i); 
			          return x;
					}
			  }			
					
		return x;
	}
}



