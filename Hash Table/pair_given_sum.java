static boolean pairSum(int arr[], int n, int k) {
	// Write your code here
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      int comp = k - arr[i];

      if (map.containsKey(comp)) {
        return true;
      }

      map.put(arr[i], i);
    }
    return false;
    
  }