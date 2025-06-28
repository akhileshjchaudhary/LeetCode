class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> main = new ArrayList<>();

        List<String> prevMain = new ArrayList<>();
        for(int i=0; i<strs.length; i++){
            prevMain.add(strs[i]);
        }

        List<String> list = new ArrayList<>();
        for(int i=0; i<strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String str = String.valueOf(arr);
            list.add(str);
        }

        int n = prevMain.size();

        for(int i=0; i<n; i++){
            List<String> inner = new ArrayList<>();
            inner.add(prevMain.get(i));
            for(int j=i+1; j<n; j++){
                if(list.get(i).equals(list.get(j))){
                    inner.add(prevMain.get(j));
                    list.remove(j);
                    prevMain.remove(j);
                    n=prevMain.size();
                    j--;
                }
            }
            main.add(inner);
        }
        return main;
    }
}