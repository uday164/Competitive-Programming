
import java.util.*;

class Hamming
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		String str = Integer.toBinaryString(a);
		String str1 = Integer.toBinaryString(b);

		if (str.length() < str1.length())
		{
			int j = str1.length() - str.length();

			for(int i = 0;i<j;i++)
			{
				str = "0" + str;
			}
			
		}

		else if(str.length() > str1.length())
		{
			int j = str.length() - str1.length();

			for(int i = 0;i<j;i++)
			{
				str1 = "0" + str1;
			}

		}

        int count =0;
		for (int k = 0;k<str.length();k++)
		{
			if (str.charAt(k)!=str1.charAt(k))
			{
				count++;
			}
			
		}

		System.out.println(count);

		
	}
}
