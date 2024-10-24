static int solve(Node l, Node r)
  {
    if (l == null && r == null)
     return 1;
    if (l == null && r != null)
    	return 0;
    if (l != null && r == null)
      	return 0;
    
    int left = solve(l.left, r.right);
    int right = solve(l.right, r.left);
    
    if (left == 0 || right == 0) return 0;
    return 1;
    
  }
  static int isFoldable(Node root) {
	// Write your code here
    if (root == null) return 1;
    return solve(root.left, root.right);
    
  }