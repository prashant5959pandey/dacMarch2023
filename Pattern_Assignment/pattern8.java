class pattern8{
    public static void  main(String args[]){
	   for(int i=1;i<=5;i++)
	   {
		   for(int k=1;k<=5-i;k++)
		      { System.out.print(" ");}
		   for(int j=6-i;j>=i;j++)
		      { System.out.print(j+" ");}
		   System.out.println();
	   }  
   }
   
}

/*
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
	*/
	