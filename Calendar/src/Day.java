public class Day  {
	public static String Days(String n, int m,int year,int firstdate ) {
		int month =0,nex=0,prev=0;
		String pov="";
		
		if(m == 1) 	
		{ month=31;prev=31;		                                  
		 if(m==1 && month ==31 && Month.Vusokosnuj(year)==false) 
		 { 	 nex=28;  return Name.NewName(n,m,year,firstdate,nex,prev);	 }
		 else if(m==1 && month ==31 && Month.Vusokosnuj(year)==true) 
		 { 	 nex=29; }	 return Name.NewName(n,m,year,firstdate,nex,prev);	}
		
		if( m == 2 &&  Month.Vusokosnuj(year)==false)
		{ month=28;	prev=31; nex=31;                              	  
		  return Name.NewName(n,m,year,firstdate,nex,prev);
		} else
		if(m == 2 &&  Month.Vusokosnuj(year)==true )
		{   month=29;prev=31;nex=31;	                           			
		return Name.NewName(n,m,year,firstdate,nex,prev);	}
		
		if(m == 3)	
		{ month=31;nex=30;
		if(m == 2 &&  Month.Vusokosnuj(year)==false )
		{  prev=28;	} else if( m == 2 &&  Month.Vusokosnuj(year)==true)
		{prev=29;}	return Name.NewName(n,m,year,firstdate,nex,prev);	}
		if(m == 4)	{ month=30;	prev=31;  nex=31; return Name.NewName(n,m,year,firstdate,nex,prev);}
		if(m == 5)	{ month=31;	prev=30;  nex=30; return Name.NewName(n,m,year,firstdate,nex,prev);}
		if(m == 6)	{ month=30;	prev=31;  nex=31; return Name.NewName(n,m,year,firstdate,nex,prev);}
		if(m == 7)	{ month=31;	prev=30;  nex=31; return Name.NewName(n,m,year,firstdate,nex,prev);}
		if(m == 8)	{ month=31;	prev=31;  nex=30; return Name.NewName(n,m,year,firstdate,nex,prev);}
		if(m == 9)	{ month=30;	prev=31;  nex=31; return Name.NewName(n,m,year,firstdate,nex,prev);}
		if(m == 10)	{ month=31;	prev=30;  nex=30; return Name.NewName(n,m,year,firstdate,nex,prev);}
		if(m == 11)	{ month=30; prev=31;  nex=31; return Name.NewName(n,m,year,firstdate,nex,prev);}
		if(m == 12)	{ month=31;	prev=30;  nex=31; return Name.NewName(n,m,year,firstdate,nex,prev);}
			
		return pov;		
	}
}	
	
