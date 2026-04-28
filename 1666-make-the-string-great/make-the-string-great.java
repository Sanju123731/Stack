class Solution {
    public String makeGood(String s) {
        
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            if(res.length()==0)
            {
                res.append(curr);
            }
            else{
                char top=res.charAt(res.length()-1);
                if(Character.toLowerCase(top)==Character.toLowerCase(curr) && top!=curr)
                {
                    res.deleteCharAt(res.length()-1);
                }
                else{
                    res.append(curr);
                }
            }
        }
        return res.toString();
    }
}