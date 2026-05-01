class Solution {
    public String decodeString(String s) {
       Stack<Character>st=new Stack<>();
       for(char ch:s.toCharArray())
       {
        if(ch!=']')
         {
            st.push(ch);
         }
         else{
            StringBuilder str=new StringBuilder() ;
            while(!st.isEmpty() && st.peek()!='[')
            {
                str.insert(0,st.pop());
            }
            st.pop();
            StringBuilder num=new StringBuilder() ;
            while(!st.isEmpty() && Character.isDigit(st.peek()))
            {
                num.insert(0,st.pop());
            }
            int repeat=Integer.parseInt(num.toString());
            StringBuilder exp=new StringBuilder();
            for(int i=0;i<repeat;i++)
            {
                exp.append(str);
            }
             for(char c:exp.toString().toCharArray())
           {
            st.push(c);
           }
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