class Solution {
    public int longestPalindrome(String s) {
        int[] lower=new int[26];
        int[] upper=new int[26];

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a')
             lower[s.charAt(i)-'a']++;
            else
             upper[s.charAt(i)-'A']++;
        }
        int count=0;
        int odd=0;
        for(int i=0;i<26;i++){
            if(lower[i]%2==0){
                count =count+lower[i];
            }
            else{
                count =count+lower[i]-1;
                odd=1;
            }
             if(upper[i]%2==0){
                count =count+upper[i];
            }
            else{
                count =count+upper[i]-1;
                odd=1;
            }
        }
        return count+odd;
    }
}