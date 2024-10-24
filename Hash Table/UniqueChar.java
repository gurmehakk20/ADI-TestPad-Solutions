static int firstUniqueChar(String str) {
    // Write your code here
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < str.length(); i++)
    {
      map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
    }
    for (int i = 0; i < str.length(); i++)
    {
      int fre = map.get(str.charAt(i));
      if (fre == 1) return i;
    }
    return -1;
  }