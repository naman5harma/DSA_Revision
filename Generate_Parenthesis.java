class Solution {


    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate_the_brackets(n,ans,0,0,"");
        return ans;
    }

    void generate_the_brackets(int n , List<String> ans, int co_open , int co_close, String curr_brackets)
    {
        if(co_open==n && co_close==n)
        {
            ans.add(curr_brackets);
            return;
        }


        if(co_open<n)
        {
            generate_the_brackets(n,ans,co_open+1,co_close,curr_brackets+"(");
        }
        if(co_close<co_open)
        {
            generate_the_brackets(n,ans,co_open,co_close+1,curr_brackets+")");
        }
    }
}
