static int getPairsCount(int arr[], int n, int k) {
	// Write your code here
    Map<Integer, Integer> map = new HashMap<>();
    int cnt = 0;
    for (int i = 0; i < n; i++)
    {
      if (map.containsKey(k + arr[i])){
        cnt+= map.get(k + arr[i]);
      }
      if (map.containsKey(arr[i] - k)){
        cnt += map.get(arr[i] - k);
      }
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
      
    }
    
    return cnt;
    
  }