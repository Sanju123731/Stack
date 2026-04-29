class Solution {
    public List<String> buildArray(int[] target, int n) {
        int m=target.length;
        
        List<String> res=new ArrayList<>();
        int j=0;
        for(int i=1;i<=n;i++)
        {
            if(j==target.length)
            break;
            res.add("Push");

            if(target[j]==i)
             j++;
      
        else{
            res.add("Pop");
        }
        }
        return res;
    }
}