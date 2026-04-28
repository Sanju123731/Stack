class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int[]answer=Arrays.copyOf(prices,n);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && prices[st.peek()]>=prices[i])
            {
                int idx=st.pop();
                answer[idx]=prices[idx]-prices[i];
            }
            st.push(i);
        }
        return answer;
    }
}