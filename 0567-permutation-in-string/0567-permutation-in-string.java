// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         if(s1.length()>s2.length()){
//             return false;
//         }
//         int k=s1.length();
//         int t[]=freq(s1);
//         //System.out.println(Arrays.toString(t));
//         for(int l=0;l<=s2.length()-k;l++){
//             String s=s2.substring(l,l+k);
//             int a[]=freq(s);
//             //System.out.println(Arrays.toString(a));

//             if(Arrays.equals(t,a)){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static int[] freq(String s){
//         int arr[]=new int[26];
//         for(char c:s.toCharArray()){
//             arr[c-'a']++;
//         }
//         return arr;
//     }
// }


class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] freq = new int[26];
        int[] wfreq = new int[26];
        int k = s1.length();
        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < k; i++) {
            wfreq[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(freq, wfreq)) {
            return true;
        }
        for (int i = k; i < s2.length(); i++) {
            wfreq[s2.charAt(i) - 'a']++;
            wfreq[s2.charAt(i - k) - 'a']--;
            if (Arrays.equals(freq, wfreq)) {
                return true;
            }
        }
        return false;
    }
}
