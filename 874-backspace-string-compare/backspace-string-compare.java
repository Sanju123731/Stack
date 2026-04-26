class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    public String build(String s)
    {
        Stack<Character> st=new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(ch=='#')
            {
                if(!st.isEmpty())
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder res=new StringBuilder();
        for(char c:st)
        {
            res.append(c);
        }

       return res.toString();
    }
}