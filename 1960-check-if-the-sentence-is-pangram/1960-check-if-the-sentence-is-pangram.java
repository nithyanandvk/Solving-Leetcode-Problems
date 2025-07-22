class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> h=new HashSet<>();
        for(char c:sentence.toCharArray()){
            h.add(c);
        }
        if(h.size()==26){
            return true;
        }else{
            return false;
        }
    }
}