
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String[] s1={"A1B","A2C","12","A5C"};
		getSum(s1);
	}*/
		/*String[] s1={"A2B","23","A9C","A5C"};
		getSum(s1);*/
		
		String[] s1={"A2B","67","A8B","A9C"};
		getSum(s1);
	}
		public static void getSum(String[] s1)
		{
			/*int sum=0;
			for(int i=0;i<s1.length;i++)
			{
				for(int j=0;j<s1[i].length();j++)
				{
					char c=s1[i].charAt(j);
					if(Character.isDigit(c))
					{
						String t=String.valueOf(c);
						int n=Integer.parseInt(t);
						sum=sum+n;
					}
				}
			}
			System.out.println(sum);
		}*/
			    
			/*int sum=0;
			for(int i=0;i<s1.length;i++)
			{
				for(int j=0;j<s1[i].length();j++)
				{
					char c=s1[i].charAt(j);
					if(Character.isDigit(c))
					{
						String t=String.valueOf(c);
						int n=Integer.parseInt(t);
						sum=sum+n;
					}
				}
				
				
			}
			System.out.println(sum);*/
			
			int sum=0;
			for(int i=0;i<s1.length;i++)
			{
				for(int j=0;j<s1[i].length();j++)
				{
					char c=s1[i].charAt(j);
					if(Character.isDigit(c))
					{
						String t=String.valueOf(c);
						int n=Integer.parseInt(t);
						sum=sum+n;
					}
				}
			}
			System.out.println(sum);
			
		}	
}
				

