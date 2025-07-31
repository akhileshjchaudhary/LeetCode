class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mainList = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        mainList.add(list1);

        if(numRows==1){
            return mainList;
        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        mainList.add(list2);

        if(numRows==2){
            return mainList;
        }

        for(int i=1; i<numRows-1; i++){
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            for(int j=0; j<mainList.get(i).size()-1; j++){
                int sum = mainList.get(i).get(j)+mainList.get(i).get(j+1);
                newList.add(sum);
            }
            newList.add(1);
            mainList.add(newList);
        }
        return mainList;
    }
}