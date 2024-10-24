static int areSameTree(Node t1, Node t2) {
	// Write your code here
    if (t1 == null && t2 == null) return 1;
    if (t1 == null || t2 == null) return 0;
    
    if (t1.data != t2.data)
    {
      return 0;
    }
    int left = areSameTree(t1.left, t2.left);
    int right = areSameTree(t1.right, t2.right);
    if (left == 0 || right == 0)
    	return 0;
    return 1;
  }