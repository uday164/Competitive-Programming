import java.util.*;

class Permutation
{
	HashSet<String> s = new HashSet<String>();
	String StringSort(String st)
	{
		char temparray[] = st.toCharArray();
		Arrays.sort(temparray);
		return new String(temparray);

	}
	
	String swap(String st,int a, int b)
	{
		char[] carr = st.toCharArray();
		char tmp = carr[a];
		carr[a] = carr[b];
		carr[b] = tmp;
		return String.valueOf(carr);
	}

	void permute(String st, int start, int end)
	{
		if (start == end)
		{
			// System.out.println(st);
			check_bal(st);
			return;
		}

		for (int i = start;i<=end;i++)
		{
			st = swap(st,start,i);
			permute(st,start+1,end);
			st = swap(st,start,i);
        }  
	}

	void check_bal(String st)
	{
		int length = st.length();

		if (length % 2 != 0)
		{
			// System.out.println(st);
			// System.out.println("Un-balanced");
			return;			
		}

		char[] stack = new char[length];
		int top = -1;

		for (int i = 0;i<length;i++)
		{
			char ch = st.charAt(i);

			if (ch == '(' || ch == '[' || ch == '{')
			{
				stack[++top] = ch;
				
			}
			
			else if (ch == ']' || ch == '}' || ch == ')' )
			{
				if (top > -1)
				{
					if (stack[top] == get_rel(ch))
					{
						top--;
						
					}

					else
					{
						// System.out.println(st);
						// System.out.println("Not balanced");
						return;

					}
					
				}
				
			}
		}

		if (top == -1)
		{
			 s.add(st);
			 // System.out.println(st);
			 // System.out.println("Balanced");
			
		}
		else
		{
			// System.out.println(st);
			// System.out.println("un-Balanced");
			return;

		}

	}

	char get_rel(char c)
	{
		switch(c)
		{
			case ')':
			         return '(';
			case '}':
			         return '{';
			case ']':
			         return '[';
			default:
			         return 0;
		}
	}

}


class BracketValidator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		Permutation Final = new Permutation();
		// int n = st.length();
		String st = "()";

		for (int i = 0;i<=x-2;i++)
		{
			st = st + "()";
	
		}
		int n = st.length();

		st = Final.StringSort(st);
		Final.permute(st,0,n-1);
		System.out.println(Final.s);		
	}
}
