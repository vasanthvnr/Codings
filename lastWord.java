class Solution {
    public int lengthOfLastWord(String s) {
        int last = s.length() - 1;

        while (last >= 0 && s.charAt(last) == ' ') {//to remove he spaces
            last--;
        }

        int start = last;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }

        return last - start;        
    }
}
