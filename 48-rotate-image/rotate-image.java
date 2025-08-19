class Solution {
    public void rotate(int[][] matrix) {
        List<List<Integer>> mainList = new ArrayList<>();
        for(int i=matrix.length-1; i>=0; i--){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<matrix[0].length; j++){
                list.add(matrix[i][j]);
            }
            mainList.add(list);
        }

        for(int j=0; j<matrix[0].length; j++){
            for(int i=0; i<matrix.length; i++){
                matrix[i][j]=mainList.get(j).get(i);
            }
        }
    }
}