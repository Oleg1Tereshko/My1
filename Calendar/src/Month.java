public enum Month {
	Ѳ����,�����,��������,�²����,�������,�������,������,�������,��������,�������,��������,�������;
	
		public static Month NowMonth(int b,int n) {		
		 int  e =1;	
		 if(n>=1){e=n;} else if(b>=1) {	e=b;}        
		switch(e) {
		case 1:	return Ѳ����;
		case 2:	return �����;
		case 3:	return ��������;
		case 4:	return �²����;
		case 5:	return �������;
		case 6:	return �������;
		case 7:	return ������;
		case 8:	return �������;
		case 9:	return ��������;
		case 10:return �������;
		case 11:return ��������;
		case 12:return �������;			
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

		

	

