static int getPairsCount(int arr[], int n, int k) {
    // Write your code here
    int ans = 0;
    int low = 0, high = n - 1;
    while (low < high) {
        int sum = arr[low] + arr[high];
        if (sum == k) {

            int cur1 = 1, cur2 = 1;
            while (low < high && arr[low] == arr[low + 1]) {
                cur1++;
                low++;
            }
            while (low < high && arr[high] == arr[high - 1]) {
                cur2++;
                high--;
            }
            if (low == high) {
                ans += (cur1 * (cur1 - 1)) / 2;
            } else {
                ans += (cur1 * cur2);
            }
            low++;
            high--;

        } else if (sum < k) {
            low++;
        } else {
            high--;
        }
    }

    return ans;

}