public static HashMap<Integer, Integer> map = new HashMap<>();

static Node solve(int post[], int low, int high, int[] curr) {
    
    if (low > high || curr[0] < 0) return null;

    Node root = new Node(post[curr[0]]);
    int id = map.get(post[curr[0]]);  
    curr[0]--;  

    root.rightChild = solve(post, id + 1, high, curr);  
    root.leftChild = solve(post, low, id - 1, curr);    

    return root;
}

static Node buildTree(int in[], int post[], int N) {
    for (int i = 0; i < N; i++) {
        map.put(in[i], i);
    }

    int[] curr = { N - 1 };

    return solve(post, 0, N - 1, curr);
} 