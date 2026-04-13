class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        int found1 = 0;
        int found2 = 0;
        boolean flag = false;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = true;
                found1 = i;
                found2 = j;
                break;
            }
            i++;
            j--;
        }

        if (flag == true) {
            List<Character> list = new ArrayList<>();
            for (int k = 0; k < s.length(); k++) {
                list.add(s.charAt(k));
            }

            List<Character> list1Copy = new ArrayList<>(list);
            list1Copy.remove(found1);
            List<Character> list1Copy1 = new ArrayList<>(list1Copy);
            Collections.reverse(list1Copy);

            boolean flag1 = false;
            if (!(list1Copy1.equals(list1Copy))) {
                flag1 = true;
            }

            List<Character> list2Copy = new ArrayList<>(list);
            list2Copy.remove(found2);
            List<Character> list2Copy2 = new ArrayList<>(list2Copy);
            Collections.reverse(list2Copy);

            boolean flag2 = false;
            if (!(list2Copy2.equals(list2Copy))) {
                flag2 = true;
            }

            if (flag1 == true && flag2 == true) {
                return false;
            }
        }
        return true;
    }
}