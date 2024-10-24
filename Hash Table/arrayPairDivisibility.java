static int isArrayDivisibleInPairs(int arr[], int n, int k){
    // Write your code here
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      int rem = arr[i]%k;
      if (rem < 0)
      {
        rem += k;
      }
      map.put(rem, map.getOrDefault(rem, 0) + 1);
    }
    
    for (int rem : map.keySet()) {
      int freq = map.get(rem);

      if (rem == 0) {
        if (freq % 2 != 0) {
          return 0;  
        }
      } 
      else {
        int comp = k - rem;
        if (map.getOrDefault(comp, 0) != freq) {
          return 0; 
        }
      }
    }
    return 1;
  }