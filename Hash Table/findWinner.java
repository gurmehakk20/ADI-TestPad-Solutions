static String inspectStrings(String[] words) {
    // Write your code here
    Map<String, Integer> freqMap = new HashMap<>();
    for (String str : words) {
      freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
    }
    int maxFreq = 0;
    String res = "";
    for (Map.Entry<String, Integer> entry : freqMap.entrySet())
    {
      String curr = entry.getKey();
      int currFre = entry.getValue();
      if (currFre > maxFreq || (currFre == maxFreq && curr.compareTo(res) > 0))
      {
        res = curr;
        maxFreq = currFre;
      }
    }
    
    return res;
  }