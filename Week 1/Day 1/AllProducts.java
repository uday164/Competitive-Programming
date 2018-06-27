
import java.util.*;

class Products
{
	void all_products(ArrayList<Integer> all_numbers)
	{
		ArrayList<Integer> new_numbers = new ArrayList<Integer>();

		int size = all_numbers.size();
		

		for (int i = 0;i<size;i++){
			int product = 1;
			for (int j = 0;j<size;j++){
				if (i!=j)
				{
					product *= all_numbers.get(j);
					// System.out.println(product);	
				}
			}
			new_numbers.add(product);	
		}
		System.out.println(Arrays.toString(new_numbers.toArray()));
	}
}

class AllProducts
{
	public static void main(String[] args)
	{
		Products obj = new Products();

		ArrayList<Integer> all_numbers = new ArrayList<Integer>();

		Scanner scan = new Scanner(System.in);
	    try
	    {
	        while (scan.hasNextLine())
	        {

	            String line = scan.nextLine();
	    
	            if (line.equals(""))
	            {
	            	System.out.println(Arrays.toString(all_numbers.toArray()));
	                scan.close();
	                break;
	            }

	            int x = Integer.parseInt(line);
	            all_numbers.add(x);
	        }

	    }
	    finally
	    {
	        if (scan != null)
	        scan.close();
	    }

	    obj.all_products(all_numbers);
	}
}
