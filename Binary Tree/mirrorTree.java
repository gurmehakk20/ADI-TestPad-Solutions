static Node findMirror(Node root) {
    // Write your code here
    if (root == null) return null;
    Node nd = new Node(root.data);
    nd.left = findMirror(root.right);
    nd.right = findMirror(root.left);
    return nd;
    
  }