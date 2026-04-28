class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        Stack <Integer> st=new Stack<>();
        int[]res=new int[n];
         for(int i=n-1;i>=0;i--)
         {
            while(!st.isEmpty() && nums2[i]>=st.peek())
            {
                st.pop();
            }
            if(st.isEmpty())
            res[i]=-1;
            else
            res[i]=st.peek();
            st.push(nums2[i]);
         }
         int[]result=new int[nums1.length];
         for(int i=0;i<nums1.length;i++)
         {
            int value=nums1[i];
            for(int j=0;j<nums2.length;j++)
            {
                if(nums2[j]==value)
                {
                  result[i]=res[j];
                  break;
                }
            }
         }
         return result;
    }
}