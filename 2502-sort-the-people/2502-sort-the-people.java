class Solution {
    class Person {
        String name;
        int ht;

        Person(String name, int ht) {
            this.name = name;
            this.ht = ht;
        }
    }

    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        //    for(int i=0;i<n-1;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(heights[j]<heights[j+1]){
        //             int temp=heights[j];
        //             heights[j]=heights[j+1];
        //             heights[j+1]=temp;
        //             String t=names[j];
        //             names[j]=names[j+1];
        //             names[j+1]=t;
        //         }
        //     }
        //    } 
        //    return names;
        ArrayList<Person> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(new Person(names[i],heights[i]));
        }
        Collections.sort(l,(a,b)-> b.ht-a.ht);
        for(int i=0;i<n;i++){
            names[i]=l.get(i).name;
        }
        return names;
    }
}