import java.util.*;

class MorseWords
{
	public static void main(String[] args)
	{
		HashMap<Character,String> user=new HashMap<Character,String>();
		user.put('A',".-");
		user.put('B',"-...");
		user.put('C',"-.-.");
		user.put('D',"-..");
		user.put('E',".");
		user.put('F',"..-.");
		user.put('G',"--.");
		user.put('H',"....");
		user.put('I',".."); 
		user.put('J',".---");
		user.put('K',"-.-");
		user.put('L',".-..");
		user.put('M',"--");
		user.put('N',"-.");
		user.put('O',"---");
		user.put('P',".--.");
		user.put('Q',"--.-");
		user.put('R',".-.");
		user.put('S',"...");
		user.put('T',"-");
		user.put('U',"..-");
		user.put('V',"...-");
		user.put('W',".--");
		user.put('X',"-..-");
		user.put('Y',"-.--");
		user.put('Z',"--..");

		Scanner sc = new Scanner(System.in);

		String num = sc.nextLine();
		int number = Integer.parseInt(num);

		String[] arr = new String[number];
		String[] arr1 = new String[number];

		for (int i = 0;i < number ;i++ )
		{
			arr[i] = sc.nextLine();
		}

		for (int j = 0;j<number ;j++ )
		{
			String str = arr[j];
			String str1 = "";

			for (int k = 0;k< str.length() ;k++ )
			{

				String value = user.get(str.charAt(k));

				str1 = str1 + value;			
			}

			arr1[j] = str1;
		}


		HashSet<String> h = new HashSet<String>();

		for (int k = 0;k<arr1.length ;k++ )
		{
			h.add(arr1[k]);
		}

		System.out.println(h.size());
			
	}
}
