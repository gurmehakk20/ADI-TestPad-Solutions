static void printCousins(Node root, int k) {
    if (root == null) 
    {
      System.out.print(-1);
      return;
    }
	boolean found = false;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    
    if (root.data == k){
      System.out.print(-1);
      return;
    } 
    
    while (!q.isEmpty() && found == false)
    {
      int size = q.size();
      for (int i = 0; i < size; i++)
      {
        Node nd = q.poll();
        if (nd.leftChild != null && nd.leftChild.data == k || nd.rightChild != null && nd.rightChild.data == k)
        {
          found = true;
        }
        else
        {
          if (nd.leftChild != null) q.add(nd.leftChild);
          if (nd.rightChild != null) q.add(nd.rightChild);
        }
      } 
    }
    
    if (found == true)
    {
      int s = q.size();
      if (s == 0) 
      {
        System.out.print(-1);
      	return;
      }
      for (int i = 0; i < s; i++)
      {
        Node n = q.poll();
        System.out.print(n.data + " ");
      }
    }
    else System.out.print(-1);
  }