/* A
   A B
   A B C
   A B C D
   A B C D E
  */
class pattern2{
	public static void main(String args[]){
		for(char i='A';i<='E';i++)
		{   System.out.print("\n");
			for(char j='A';j<=i;j++)
				System.out.print(j+" ");
			   // System.out.println(" "); 
				 
		}
	}
}

/* Pattern3
class pattern3{
	public static void main(String args[]){
		for(char i='A';i<='E';i++)
		{   System.out.print("\n");
			for(char j='A';j<=i;j++)
				System.out.print("*"+" ");
			   // System.out.println(" "); 
				 
		}
	}
}*/