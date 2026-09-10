class Solution {
    public boolean validMountainArray(int[] arr) {

        int n = arr.length;

        // A mountain needs at least 3 elements
        if (n < 3) {
            return false;
        }

        int i = 0;

        // Go uphill
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak cannot be first or last
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Go downhill
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        // We must reach the last element
        return i == n - 1;
    }
}