class Pair{
  private Node key;
  private int value;
  
  public Pair(Node key, int value)
  {
    this.key = key;
    this.value = value;
  }
  public int getValue()
  {
    return value;
  }
  public Node getKey()
  {
    return key;
  }
}
class Result {
  static void printTopView(Node root) {
	// Write your code here
    if (root == null) return;
    TreeMap<Integer, Integer> map = new TreeMap<>();
    Queue<Pair> q = new LinkedList<>();
    q.add(new Pair(root, 0));
    
    while (!q.isEmpty())
    {
      Pair p = q.peek();
      q.remove();
      Node nd = p.getKey();
      int dis = p.getValue();
      if (!map.containsKey(dis))
      {
        map.put(dis, nd.data);
      }
      
      if (nd.left != null)
      {
        q.add(new Pair(nd.left, dis-1));
      }
      if (nd.right != null)
      {
        q.add(new Pair(nd.right, dis+1));
      }
    }
    for (Map.Entry<Integer, Integer> entry: map.entrySet())
    {
      System.out.print(entry.getValue() + " ");
    }
    
    
  }
}