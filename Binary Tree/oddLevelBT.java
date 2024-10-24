class Result {
    static void printOdd(Node root) {
      // Write your code here
      if (root == null) return;
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      int curr = 1;
      while (!q.isEmpty())
      {
        //level
        int size = q.size();
        for (int i = 0; i < size; i++)
        {
          Node nd = q.poll();
          if (curr%2 == 1){
            System.out.print(nd.data);
            System.out.print(" ");
          }
          if (nd.left != null)
          {
            q.add(nd.left); 
          }
          if (nd.right != null)
          {
            q.add(nd.right);
          }
        }
        //System.out.println();
        //System.out.print(" ");
        curr++;
      }
    }
  }