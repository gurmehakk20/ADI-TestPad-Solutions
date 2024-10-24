levelOrder
    // Write your code here
    if (root == null) return;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while (!q.isEmpty())
    {
      //level
      int size = q.size();
      for (int i = 0; i < size; i++)
      {
        Node nd = q.poll();
        System.out.print(nd.data);
        if (i != size - 1) System.out.print(" ");
        if (nd.left != null)
        {
          q.add(nd.left); 
        }
        if (nd.right != null)
        {
          q.add(nd.right);
        }
      }
      System.out.println();
    }
  }