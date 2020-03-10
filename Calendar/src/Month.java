public enum Month {
	я╡вемэ,кчрхи,аепегемэ,йб╡ремэ,рпюбемэ,вепбемэ,кхоемэ,яепоемэ,бепеяемэ,фнбремэ,кхярноюд,цпсдемэ;
	
		public static Month NowMonth(int b,int n) {		
		 int  e =1;	
		 if(n>=1){e=n;} else if(b>=1) {	e=b;}        
		switch(e) {
		case 1:	return я╡вемэ;
		case 2:	return кчрхи;
		case 3:	return аепегемэ;
		case 4:	return йб╡ремэ;
		case 5:	return рпюбемэ;
		case 6:	return вепбемэ;
		case 7:	return кхоемэ;
		case 8:	return яепоемэ;
		case 9:	return бепеяемэ;
		case 10:return фнбремэ;
		case 11:return кхярноюд;
		case 12:return цпсдемэ;			
		}
		return null;		 
	}
		public static boolean Vusokosnuj(int v) {
			boolean h= false;
			if(v % 4 == 0)
		    {		   
		        if(v % 100 != 0 || ( v % 100 == 0 && v % 400 == 0)) 
		        {     h=true;   }                               	            
		    } else {h=false;}                           	 			
		return h;
			
}
	}	

		

	

