static int findRightSibling(Node root, int key) {
    // Write your code here
    boolean found = false;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    
    while (!q.isEmpty())
    {
      int size = q.size();
      for (int i = 0; i < size; i++)
      {
        Node nd = q.poll();
        if (found == true) return nd.data;
        if (nd.data == key) found = true;
        
        if (nd.left != null)
        {
          q.add(nd.left);
        }
        if (nd.right != null)
        {
          q.add(nd.right);
        }
      }
      if (found == true) return -1;
    }
    return -1;
    
  }