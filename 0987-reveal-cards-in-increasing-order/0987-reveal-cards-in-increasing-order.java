class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        Queue<Integer> q=new LinkedList<>();
        Arrays.sort(deck);
        q.add(deck[n-1]);
        for(int i=n-2;i>=0;i--){
            int m=q.poll();
            q.add(m);
            q.add(deck[i]);
        }
        int j=n-1;
        while(!q.isEmpty()){
            deck[j--]=q.poll();
        }
        return deck;
    }
}