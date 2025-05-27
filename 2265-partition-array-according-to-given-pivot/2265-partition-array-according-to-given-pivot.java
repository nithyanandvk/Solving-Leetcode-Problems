class Solution {
    public int[] pivotArray(int[] arr, int pivot) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        int n = arr.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < pivot) {
                l1.add(arr[i]);
            } else if (arr[i] > pivot) {
                l2.add(arr[i]);
            } else {
                c++;
            }
        }
        int x = 0;
        for (int i = 0; i < l1.size(); i++) {
            arr[x] = l1.get(i);
            x++;
        }
        for (int i = 0; i < c; i++) {
            arr[x] = pivot;
            x++;
        }
        for (int i = 0; i < l2.size(); i++) {
            arr[x] = l2.get(i);
            x++;
        }
        return arr;
    }
}