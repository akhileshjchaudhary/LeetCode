class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        List<List<Character>> mainList = new ArrayList<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                mainList.add(list);
                list = new ArrayList<>();
            } else {
                list.add(text.charAt(i));
            }
        }

        mainList.add(list);

        List<Character> brokenList = new ArrayList<>();

        for (int i = 0; i < brokenLetters.length(); i++) {
            brokenList.add(brokenLetters.charAt(i));
        }

        int count = 0;

        for (int i = 0; i < mainList.size(); i++) {
            boolean flag = false; 
            for (int j = 0; j < brokenList.size(); j++) {
                if((mainList.get(i).contains(brokenList.get(j)))){
                    flag = true;
                }
            }
            if(flag == false){
                count++;
            }
        }
        return count;
    }
}