class Main{
  
    static Scanner sc = new Scanner(System.in);
  	public static void solve()
    {
        int n = sc.nextInt();
        int k = sc.nextInt();
      	boolean flag= false;
      	for (int i = 0; i < n; i++)
        {
         	int num = sc.nextInt();
          	if (num == k && flag == false) {
              System.out.println(i);
              flag = true;
            }
        }
      if (flag == false) System.out.println(-1);
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