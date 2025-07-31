class Solution {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i = 0; i < digits.length; i++) {
            h.put(digits[i], h.getOrDefault(digits[i], 0) + 1);
        }
        int c[] = new int[10];
        for (int i = 100; i < 999; i = i + 2) {
            c[i / 100]++;
            c[(i / 10) % 10]++;
            c[i % 10]++;
            if (h.containsKey(i / 100) && c[i/100]<= h.get(i/100)&& h.containsKey((i / 10) % 10) && c[(i / 10) % 10]<= h.get((i / 10) % 10) &&h.containsKey(i % 10) && c[i%10] <=h.get(i%10)) {
                ans.add(i);
            }
            c[i/100]=0;
            c[(i / 10) % 10]=0;
            c[i % 10]=0;
        }
        int arr[] = new int[ans.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}