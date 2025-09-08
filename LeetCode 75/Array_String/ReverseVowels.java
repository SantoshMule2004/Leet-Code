class ReverseVowels {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        StringBuilder str = new StringBuilder(s);
        int i = 0, j = s.length() - 1;
        while(i < j) {
            if(vowels.contains(str.charAt(i)) && vowels.contains(str.charAt(j))) {
                char temp = str.charAt(i);
                str.setCharAt(i, str.charAt(j));
                str.setCharAt(j, temp);
                i++;
                j--;
            } else {
                if(!vowels.contains(str.charAt(i)))
                    i++;

                if(!vowels.contains(str.charAt(j)))
                    j--;
            }
        }
        return str.toString();
    }
}