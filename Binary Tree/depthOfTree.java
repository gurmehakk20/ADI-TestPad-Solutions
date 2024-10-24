static int treeHeight(Node root) {
	// Write your code here
    if (root == null) return -1;
    int left = treeHeight(root.left);
    int right = treeHeight(root.right);

    return 1 + Math.max(left, right);
    
  }