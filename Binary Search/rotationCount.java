static Scanner sc = new Scanner(System.in);

public static void solve() {
    int n = sc.nextInt();
    int pre = sc.nextInt();
    int ans = -1;
    for (int i = 1; i < n; i++) {
        int num = sc.nextInt();
        if (num < pre) {
            ans = i;
        }
        pre = num;
    }
    System.out.println(ans);
}

public static void main(String[] args) {
    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
        solve();
    }
}