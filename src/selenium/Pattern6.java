package selenium;

public class Pattern6 {

	public static void main(String[] args) {
		//Part-1:Top horizontal line
		for(int i=1;i<=30;i++)
		{
			System.out.print("-");
		}
		System.out.println();
		//Part-2:Middle part
		for(int i=1;i<=6;i++)
		{
			//2 pipes(|) and 8 spaces between them
			for(int j=1;j<=30;j++)
			{
				if(j==1 || j==30)
				{
					System.out.print("|");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//Part-3:Bottom horizontal line
		for(int i=1;i<=30;i++)
		{
			System.out.print("-");
		}
	}

}
