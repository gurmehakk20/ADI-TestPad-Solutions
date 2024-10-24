static int largSubArray(int ar[], int n){
    // Write your code here
    Map<Integer,Integer> map = new HashMap<>();
    int ans = 0;
    int curr = 0;
    for (int i = 0; i < n; i++)
    {
      curr += ar[i];
      if (curr == 0)  ans = i+1;
      if (map.containsKey(curr))
      {
        int len = i - map.get(curr);
        ans = Math.max(ans, len);
      }
      else
      {
        map.put(curr, i);
      }
    }
    return ans == 0 ? -1 : ans;
    
  }