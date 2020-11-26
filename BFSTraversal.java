class Traversal {
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> g, int N) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        q.add(0);
        BFSUtil(g, q, set, list);
        return list;
    }
    
    public static void BFSUtil(ArrayList<ArrayList<Integer>> g, Queue<Integer> q, Set<Integer> set, ArrayList<Integer> list){
        if(q.size() == 0) return;
        int temp = q.poll();
        list.add(temp);
        set.add(temp);
        for(int i : g.get(temp)){
            if(!set.contains(i)){
                q.add(i);set.add(i);
            }
        }
        BFSUtil(g, q, set, list);
    }
}