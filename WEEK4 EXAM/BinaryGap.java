import java.util.*;


class BinaryGap
{
	public static void main(String[] args)
	{
		 HashSet<Integer> h = new HashSet<Integer>();

		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();

 		 if (a<0)
		 {
		 	a = -a;		 	
		 }

		 String str = Integer.toBinaryString(a);

		 int count = 0;

		 int maxcount = 0;

		 for (int i = 0;i<str.length();i++ )
		 {
		 	if (str.charAt(i)=='1')
		 	{
		 		count++;
		 	}

		 	else
		 	{
		 		if (count > maxcount)
		 		{
		 			maxcount = count;
		 			
		 		}
		 		count = 0;
		 	}

		 }

		 System.out.println(maxcount);
		
	}
}
