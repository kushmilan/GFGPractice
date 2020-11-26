class Traversal{
    
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int N){
       Set<Integer> set = new HashSet<>();
       ArrayList<Integer> list = new ArrayList<>();
       DfsUtil(g, set, 0, list);
       return list;
    }
    
    public static void DfsUtil(ArrayList<ArrayList<Integer>> g, Set<Integer> set, int t, ArrayList<Integer> list){
        set.add(t);
        list.add(t);
        for(int i : g.get(t)){
            if(!set.contains(i)){
                DfsUtil(g, set, i, list);
            }
        }  
    }
}

-------------------------------------------------------------------------------------------------------------------------------