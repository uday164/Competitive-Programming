import java.util.*;

class CountingBits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int[] arr = new int[a+1];

		for (int i = 0;i<=a ;i++ )
		{
			int count = 0;
			String str = Integer.toBinaryString(i);

			for (int j = 0;j<str.length() ;j++ )
			{
				if (str.charAt(j)=='1')
				{
					count++;
				}	
			}

			arr[i] = count;
			
		}

		System.out.println(Arrays.toString(arr));
		
	}
}
