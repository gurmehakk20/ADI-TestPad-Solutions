static int maxFrequency(int arr[], int N) {
	// Write your code here
    int maxi = Integer.MIN_VALUE;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++)
    {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
      maxi = Math.max(maxi, map.get(arr[i]));
    }
    Arrays.sort(arr);
    for (int i = 0; i < N; i++)
    {
      if (map.get(arr[i]) == maxi) return arr[i];
    }
    return  0;
    
  }