/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    HashMap<Integer,Employee> h;
    public int getImportance(List<Employee> employees, int id) {
        h=new HashMap<>();
        for(Employee e:employees){
            h.put(e.id,e);
        }
        return rec(id);
    }
    public int rec(int id){
        Employee e=h.get(id);
        int ans=e.importance;
        for(Integer i:e.subordinates){
            ans=ans+rec(i);
        }
        return ans;
    }
}