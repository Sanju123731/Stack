class Solution {
    public String decodeString(String s) {
      Stack<Integer> numSt=new Stack<>();
      Stack<StringBuilder> strSt=new Stack<>();
      StringBuilder currStr=new StringBuilder();
      int currNum=0;
      for(char ch:s.toCharArray())
      {
        if(Character.isDigit(ch))
        {
            currNum=currNum*10+(ch-'0');
        }
        else if(ch=='[')
        {
            numSt.push(currNum);
            strSt.push(currStr);
            currNum=0;
            currStr=new StringBuilder();
        }
        else if(ch==']')
        {
            int repeat=numSt.pop();

        
        StringBuilder prevStr=strSt.pop();
        for(int i=0;i<repeat;i++)
        {
            prevStr.append(currStr);
        }
        currStr=prevStr;
      }

      else{
          currStr.append(ch);
      }
    }
    return currStr.toString();
}
}