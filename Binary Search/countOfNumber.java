class Main{
    static Scanner sc = new Scanner(System.in);
  	public static void solve()
    {
        int n = sc.nextInt();
        int k = sc.nextInt();
      	int ans = 0;
      	for (int i = 0; i < n; i++)
        {
         	int num = sc.nextInt();
          	if (num == k) {
              ans++;
            }
        }
      System.out.println(ans);
    }
    public static void main(String[] args)
    { 
      int t = sc.nextInt();
      
      for (int i = 0; i < t; i++)
      {
        solve();
      }
    }
}