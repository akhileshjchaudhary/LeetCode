class Solution {
    public String largestOddNumber(String nums) {
        boolean flag=false; int breakPoint=0;
        for(int i=nums.length()-1; i>=0; i--){
            int curr=(int) nums.charAt(i);
            if(curr%2!=0){
                breakPoint=i;
                flag=true;
                break;
            }
        }
        
        String ans="";
        if(flag==true){
            for(int i=0; i<=breakPoint; i++){
                ans=ans+nums.charAt(i);
            }
        }
        return ans;
    }
}