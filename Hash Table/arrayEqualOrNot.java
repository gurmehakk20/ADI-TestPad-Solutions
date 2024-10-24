static int arraysEqualorNot(int[] A, int[] B) {
    // Write your code here
    if (A.length != B.length) {
      return 0;
    }
    Map<Integer, Integer> freq = new HashMap<>();
    for (int num : A) {
      freq.put(num, freq.getOrDefault(num, 0) + 1);
    }
	for (int num : B) {
      if (!freq.containsKey(num)) {
        return 0; 
      }
      freq.put(num, freq.get(num) - 1);
      if (freq.get(num) == 0) {
        freq.remove(num); 
      }
    }

    return freq.isEmpty() ? 1 : 0;
  }