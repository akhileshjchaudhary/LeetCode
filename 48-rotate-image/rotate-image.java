class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        
        List<List<Integer>> mainList=new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Integer> list=new ArrayList<>();
            for(int j=matrix.length-1; j>=0; j--){
            list.add(matrix[j][i]);
            }
            mainList.add(list);
        }
        for(int i=0; i<mainList.size(); i++){
            System.out.println(mainList.get(i));
        }
        for(int i=0; i<m && i<mainList.size(); i++){
            for(int j=0; j<mainList.get(i).size(); j++){
                matrix[i][j]=mainList.get(i).get(j);
            }
        }
    }
}