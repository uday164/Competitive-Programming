
import java.util.*;

class MaxProfit
{
	int get_max_profit(ArrayList<Integer> stock_prices)
	{
		int size = stock_prices.size();
		int max = stock_prices.get(1) - stock_prices.get(2) ;

		for (int i = 0;i<size - 1;i++)
		{
			for (int j = i + 1;j<size;j++)
			{
				int x = stock_prices.get(j) - stock_prices.get(i);

				if (x > max)
				{
					max = x;	
				}
							
			}			
		}

		return max;

	}
}

class StockPrices
{
	public static void main(String[] args)
	{
		MaxProfit obj = new MaxProfit();

		ArrayList<Integer> stock_prices = new ArrayList<Integer>();

		Scanner scan = new Scanner(System.in);
	    try
	    {
	        while (scan.hasNextLine())
	        {

	            String line = scan.nextLine();
	    
	            if (line.equals(""))
	            {
	            	System.out.println(Arrays.toString(stock_prices.toArray()));
	                scan.close();
	                break;
	            }

	            int x = Integer.parseInt(line);
	            stock_prices.add(x);
	        }

	    }
	    finally
	    {
	        if (scan != null)
	        scan.close();
	    }

	    int y = obj.get_max_profit(stock_prices);

	    System.out.println(y);	
	}
}
