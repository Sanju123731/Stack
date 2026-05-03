class Solution {
    public boolean checkValidString(String s) {
      Stack<Integer>st=new Stack<>();
       Stack<Integer>starSt=new Stack<>();
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        if(ch=='('){
           st.push(i);
       }
       else if(ch=='*')
        starSt.push(i);
        else{
            if(!st.isEmpty()) st.pop();
            else if(!starSt.isEmpty()) starSt.pop();
            else return false;
         }
    }
    while(!st.isEmpty() && !starSt.isEmpty())
    {
      if(st.peek()<starSt.peek())
      {
        st.pop();
        starSt.pop();
      }
      else
      {
        return false;
      }
     
    }
     return st.isEmpty();
}
}