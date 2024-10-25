static void print(List<Integer> l)
{
  for (int i = 0; i < l.size(); i++)
  {
    System.out.print(l.get(i) + " ");
  }
  System.out.print(l.size() -1);
  
  System.out.println();
}
static int cnt = 0;
static void solve(Node root, List<Integer> l)
{
    if (root == null) {
      return;
    }

	l.add(root.data);
  
    if (root.left == null && root.right == null){ 
      print(l); 
      cnt++;
    }
    else
    {
      solve(root.left, l);
      solve(root.right, l);
    }
  	l.remove(l.size() - 1);
  
  
}
static void printAllPaths(Node root) {
    // Write your code here
  if (root == null) return;
  List<Integer> l = new ArrayList<>();
  solve(root, l);
  System.out.print(cnt);

  }