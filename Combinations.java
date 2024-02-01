class Solution {
    static List<List<Integer>> result;

    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        getSubsets(arr, 0, new ArrayList<Integer>(), k);

        return result;
    }

    public static void getSubsets(int arr[], int index, ArrayList<Integer> current, int k) {
        if (current.size() == k) {
            result.add(new ArrayList<Integer>(current));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (arr.length - i >= k - current.size()) { // Pruning if remaining elements are not enough to form a k-size combination
                current.add(arr[i]);
                getSubsets(arr, i + 1, current, k);
                current.remove(current.size() - 1);
            }
        }
    }
}