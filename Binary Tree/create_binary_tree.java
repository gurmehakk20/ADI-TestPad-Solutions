static Node buildTree(int arr[], int n) {
  if (n == 0) return null;
  if (n == 1) return new Node(arr[0]);
  Node root = null;
  root = new Node(arr[0]);
  Queue<Node> q = new LinkedList<>();
  q.add(root);
  int idx = 1;
  while (!q.isEmpty())
  {
    int size = q.size();
    for (int i = 0; i < size; i++)
    {
      Node nd = q.poll();
      if (idx < n)
      {
        nd.left = new Node(arr[idx]);
        idx++;
        q.add(nd.left);
      }
      if (idx < n)
      {
        nd.right = new Node(arr[idx]);
        idx++;
        q.add(nd.right);
      }
    }
  }
  return root;
}