static void countFrequency(String str) {
    // Write your code here
    Map<Character, Integer> map = new LinkedHashMap<>();
    for (char c: str.toCharArray())
    {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for (Map.Entry<Character, Integer> entry : map.entrySet())
    {
      System.out.print(entry.getKey() + "" + entry.getValue() + " ");
      
    }

  }