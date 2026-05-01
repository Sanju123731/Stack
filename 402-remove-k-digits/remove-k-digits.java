class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(char ch:num.toCharArray())
        {
            while(k>0 && !st.isEmpty() && st.peek()>ch)
            {
                st.pop();
                k--;
            }
            st.push(ch);
        }
         while(k>0 && !st.isEmpty())
         {
            st.pop();
            k--;
         } 
         StringBuilder str=new StringBuilder();
         while(!st.isEmpty())
         {
            str.append(st.pop());
         }
         str.reverse();
         int i=0;
         while(i<str.length()&& str.charAt(i)=='0')
         i++;
         String ans=str.substring(i);
         if(ans.length()==0) return "0";
         else return ans;
    }
}