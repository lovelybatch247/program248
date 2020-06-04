//import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
	public static int ne;
	public static int j;
	int lsum;
	int rsum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 obj=new Test2();
		
		//System.out.println("Enter the no of test cases");
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++) {
			//System.out.println("Enter the no of elements in array");
		    ne=sc.nextInt();
			int arr[]=new int[ne];
			//System.out.println("Enter the elements in array");
			for(j=0;j<ne;j++) {
				arr[j]=sc.nextInt();
			}
			//System.out.println(Arrays.toString(arr));
			
			String result=obj.balancedSums(arr);
			System.out.println(result);
		}
		
		

	}
	public String balancedSums(int[] arr) {
		int c=1;
		int r;
		int l;
		
		//String x="Yes";
		
		for(c=1;c<=ne-2;c++) {
			lsum=0;
			rsum=0;
			for(l=0;l<c;l++) {
				lsum+=arr[l];
				
			}
			//System.out.println(lsum);
			for(r=c+1;r<=ne-1;r++) {
				rsum+=arr[r];
				
			}
			//System.out.println(rsum);
			if(lsum==rsum) {
				return "YES";
				}
		}
		return "NO";
		
		
	}

}
