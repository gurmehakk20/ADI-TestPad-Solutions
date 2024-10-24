static int kthDistinctElement(int arr[], int N, int K) {
	// Write your code here
    if (N < K) return 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++)
    {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    int curr = 0;
    for (int i = 0; i < N; i++)
    {
      if (map.get(arr[i]) == 1) curr++;
      if (curr == K) return arr[i];
    }
    
    return 0;
    
    
  }