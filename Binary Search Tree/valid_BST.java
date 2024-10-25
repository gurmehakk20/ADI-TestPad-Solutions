static int valid(Node root, long maxi, long mini)
  {
    if (root == null) return 1;

    if (root.data < maxi && root.data > mini)
    {
      int left = valid(root.left, root.data, mini);
      int right = valid(root.right, maxi, root.data);

      if (left == 0 || right == 0) return 0;
      return 1;
    }

    return 0;
  }
  
  static int isBinarySearchTree(Node root) {
    // Write your code here
    return valid(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    
  }