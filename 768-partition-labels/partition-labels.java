class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), i);
        }
        System.out.println(map.get(s.charAt(0)));
        List<Integer> list=new ArrayList<>();
        int size=1, max=-1;
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))>max){
                max=map.get(s.charAt(i));
                
            } if(i==max){
                list.add(size);
                size=0;
            }
            size++;
        }
        return list;
    }
}