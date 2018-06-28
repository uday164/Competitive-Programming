import java.util.*;

class TTracker
{
	ArrayList<Integer> arr = new ArrayList<Integer>();

	void AddTemperature(int temp)
	{
		if (temp>0 && temp<=110)
		{
			arr.add(temp);
		}

		else
		{
			System.out.println("Temperature out of bounds");

		}	

	}

	void minTemperature()
	{
		int x = Collections.min(arr);
		System.out.println(x);
	}

	void maxTemperature()
	{
		int x = Collections.max(arr);
		System.out.println(x);
	}

	void mean()
	{
    	double sum = 0;

        int size = arr.size(); 

    	for (int i = 0; i < size; i++)
    	{
        	sum += arr.get(i);
    	}

    	double x = (sum / size);

    	System.out.println(x);
    }


    void mode()
    {

    	int size = arr.size();
    
    	int maxValue = 0, maxCount = 0;

    	for (int i = 0; i < size; ++i)
    	{
        	int count = 0;

        	for (int j = 0; j < size; ++j)
        	{
            	if (arr.get(j) == arr.get(i))
            		{
            			++count;
            		}
        	}

        	if (count > maxCount)
        	{
           		maxCount = count;
            	maxValue = arr.get(i);
        	}
    	}

    	System.out.println(maxValue);
    	
} 

}


class TemperatureTracker
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		TTracker obj = new TTracker();

		obj.AddTemperature(10);
		obj.AddTemperature(120);
		obj.AddTemperature(20);

		obj.minTemperature();
		obj.mean();
		obj.mode();

		obj.AddTemperature(30);
		obj.AddTemperature(40);
		obj.AddTemperature(20);
		
		obj.maxTemperature();
		obj.mean();
		obj.mode();	
	}
}
