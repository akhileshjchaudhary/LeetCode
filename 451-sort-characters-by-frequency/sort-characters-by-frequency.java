class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());

        list.sort((o1,o2) -> o2.getValue().compareTo(o1.getValue()));

        StringBuilder sb=new StringBuilder();

        for(Map.Entry<Character,Integer> m : list){
            for(int i=0; i<m.getValue(); i++){
                sb.append(m.getKey());
            }
        }
        return sb.toString();
    }
}