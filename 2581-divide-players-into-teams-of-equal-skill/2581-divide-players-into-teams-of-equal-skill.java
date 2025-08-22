class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int l=0;
        int n=skill.length;
        int r=n-1;
        int sum=skill[l]+skill[r];
        int x=sum;
        long ans=skill[l++]*skill[r--];
        while(l<r){
            if(skill[l]+skill[r]!=x){
                return -1;
            }
            ans=ans+skill[l++]*skill[r--];
        }
        return ans;
    }
}