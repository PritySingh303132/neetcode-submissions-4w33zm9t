class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int n=nums.length;
        // int[] result = new int[n];
        // for(int i=0;i<n;i++){
        //    int product=1;
        //    for(int j=0;j<n;i++){
        //     if(i!=j){
        //         product+=nums[j];
        //     }
        //    }
        //    result[i]=product;
        // }
        // return result;
        int n=nums.length;
        int[] res=new int[n];
        //prefix
        res[0]=1;
        for(int i=1;i<n;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        //suffix
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            
            res[i]=res[i]*suffix;
            suffix=nums[i]*suffix;
        }
        return res;

    }
}  
