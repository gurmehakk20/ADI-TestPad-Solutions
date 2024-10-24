static boolean isUniqueChars(String str){
    // Write your code here
    Map<Character, Integer> freqMap = new HashMap<>();
    for (char c : str.toCharArray()) {
      if (freqMap.containsKey(c)) return false;
      freqMap.put(c, 1);
      
    }
    return true;
  }