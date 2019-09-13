public class LinearSearch implements Practice03Search
{
	
	public int search(int [] arr, int target)
	{
		//for loop to iterate through each element of the array arr
		for(int i = 0 ; i < arr.length ; i++ )
		{
			//if element in array is target, return i
			if(arr[i] == target)
			{
				return i;
			}
		}
		//if target not found in array, return -1
		return -1;
	}

	//function to return name of the search
	public String searchName()
	{
		return "Linear search";
	}







}