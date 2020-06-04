package selenium;

public class Duplicatechar {

	public static void main(String[] args) {
		String w="automation";
		char ch[]=w.toCharArray();
		int dup[]=new int[10]; 
		int i,j,count;
		for(i=0;i<10;i++) 
		{
			dup[i]=-1;
		}
		for(i=0;i<10;i++)
		{
			count=1;
			for(j=i+1;j<10;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						dup[j]=0;
					}
					
					
				}
			//System.out.println(dup[i]);
			if(dup[i]!=0)
			{
				dup[i]=count;
			}
			
			
		}
		for(i=0;i<10;i++)
		{
			if(dup[i]!=0)
			{
				System.out.println(ch[i]+" duplicated in string "+dup[i]+" times");
			}
		}
	

	}

}
