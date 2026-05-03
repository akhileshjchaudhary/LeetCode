class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Character> sList=new ArrayList<>();
        List<Character> pList=new ArrayList<>();

        List<Integer> list=new ArrayList<>();
        if(s.length()<p.length()){
            return list;
        }

        int i=0, startIndx=0;
        for(; i<p.length(); i++){
            sList.add(s.charAt(i));
            pList.add(p.charAt(i));
        }
        
        Collections.sort(sList);
        Collections.sort(pList);
        if(sList.equals(pList)){
            list.add(startIndx);
        }
        

        for(int j=i; j<s.length(); j++){
            sList.remove(Character.valueOf(s.charAt(startIndx)));
            startIndx++;

            sList.add(s.charAt(j));
            Collections.sort(sList); 

            if(sList.equals(pList)){
                list.add(startIndx);
            }        
        }
        return list;
    }
}