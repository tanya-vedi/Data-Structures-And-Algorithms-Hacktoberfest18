public static void count_sort(int[] arr)
	{
		int max = 0;
		for(int x: arr)
		{
			if(x > max){
				max = x;
			}
		}
		int[] freq = new int[max + 1];
		int[] out = new int[arr.length];
		
		for(int  i =0 ;i < arr.length ; i++)
		{
			freq[arr[i]]++;
		}

		int j=0;
		for(int i = 0; i <= max; i++)
		{
			int temp = freq[i];
			while(temp-- > 0)
			{
				out[j] = i;
				j++;
			}
		}
		
		for(int i = 0; i < arr.length ; i++)
		{
			System.out.print(out[i]+" ");
		}
		
	}