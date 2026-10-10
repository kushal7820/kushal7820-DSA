class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        for( char c:s.toCharArray()) s1.push(c);
        for( char c:t.toCharArray()) s2.push(c);
        char[] reverse1=new char[s.length()];
        char[] reverse2=new char[t.length()];
        for(int i=0;i<s.length();i++){
            reverse1[i]=s1.pop();
            reverse2[i]=s2.pop();
        }
        Arrays.sort(reverse1);
        Arrays.sort(reverse2);
        return Arrays.equals(reverse1,reverse2);
    }
}