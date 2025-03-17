class Solution {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        generateString(ans,"",n);
        return ans;
    }

    void generateString(List<String> ans, String word , int n)
    {
        if(word.length()==n)
        {
            ans.add(word);
            return;
        }

        generateString(ans,word+"1",n);
        if(word.isEmpty() || word.charAt(word.length()-1)!='0')
        {
            generateString(ans,word+"0",n);
        }
    }

}
