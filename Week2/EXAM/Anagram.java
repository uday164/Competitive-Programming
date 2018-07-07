
import java.util.*;
import java.lang.String;

class Anagram
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String st = sc.nextLine();

		st = st.replaceAll(" ","");
		st = st.toLowerCase();

		String st1 = sc.nextLine();

		st1 = st1.replaceAll(" ","");
		st1 = st1.toLowerCase();

		int len = st.length();

		Func obj = new Func();

		int y = obj.permute(st,st1,0,len-1);
		if (y==0)
		{
			System.out.println("false");
			
		}
	}
}



class Func
{
	String swap(String st,String st1, int i, int j)
	{
		char[] arr = st.toCharArray();

		char temp = arr[i];

		arr[i] = arr[j];

		arr[j] = temp;

		String st2 = String.valueOf(arr);

		return st2;

	}

	int permute(String st,String st1, int start, int end)
	{
		int flag = 0;
		if (start == end)
		{
			if (st.equals(st1))
			{
				flag = 1;
				System.out.println("True");
				System.exit(0);
				
			}

			return 0;	
		}

		for (int i =start;i<=end ;i++ )
		{
			st = swap(st,st1,start,i);
            permute(st,st1,start+1,end);
            st = swap(st,st1,start,i);
		}

		return flag;
	}
}

