
public class FirstDay {
	
	public static int NewM ( int firstday,int  lastday,int prev,int nex) {
							
		if(lastday==29 || lastday==28 || lastday==36)
		{	firstday=1;		} 
			if(lastday==30 || lastday==37)
			{	firstday=2; }
				if(lastday==31 || lastday==38)
				{	firstday=3;	}
					if(lastday==32 )
					{ firstday=4;	}
						if(lastday==33)
						{ firstday=5;	}
							if(lastday==34)
							{	firstday=6;	}
								if(lastday==35)
								{	firstday=7;	}
						//-------------------------------------		
								if(lastday==21 ||  lastday==14)
								{	firstday=7;		} 
									if(lastday==20 || lastday==13)
									{	firstday=6; }
										if(lastday==19 || lastday==12)
										{	firstday=5;	}
											if(lastday==18 || lastday==11 )
											{ firstday=4;	}
												if(lastday==17 || lastday==10)
												{ firstday=3;	}		
												  if(lastday==16 || lastday==9)
												   { firstday=2;	}
												     if(lastday==15 || lastday==8)
												       { firstday=1;	}
 return firstday;
    }
 }
