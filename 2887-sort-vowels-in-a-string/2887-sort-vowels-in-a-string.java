class Solution {
    public String sortVowels(String s) {
        char arr[] = s.toCharArray();
        int n = s.length();
        int co = 0;
        for (int i = 0; i < n; i++) {
            char c = arr[i];
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
                    || c == 'u') {
                co++;
            }
        }
        char v[] = new char[co];
        int x = 0;
        for (int i = 0; i < n; i++) {
            char c = arr[i];
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
                    || c == 'u') {
                v[x++] = c;
            }
        }
        Arrays.sort(v);
        x=0;
        for (int i = 0; i < n; i++) {
            char c = arr[i];
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
                    || c == 'u') {
                arr[i] = v[x++];
            }
        }
        return new String(arr);
    }
}