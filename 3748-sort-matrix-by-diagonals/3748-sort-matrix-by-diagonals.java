class Solution {
    public int[][] sortMatrix(int[][] grid) {
        HashMap<Integer,ArrayList<Integer>> h=new HashMap<>();
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int x=i-j;
                h.putIfAbsent(x,new ArrayList<>());
                h.get(x).add(grid[i][j]);
            }
        }
        for(int x:h.keySet()){
            if(x>=0){
                Collections.sort(h.get(x),Collections.reverseOrder());
            }else{
                Collections.sort(h.get(x));
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=h.get(i-j).remove(0);
            }
        }
        return grid;
    }
}