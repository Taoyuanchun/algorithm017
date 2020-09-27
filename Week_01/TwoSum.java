public class TwoSum {
    public int[] twoSum(int[] nums,int target) {
        int[] a=new int[2];
        int numsSize = nums.length;
        for(int i=0;i<numsSize-1;i++){
            for(int j=i+1;j<numsSize;j++){
                if (nums[i] + nums[j]==target) {
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
            }
        }
        return new int[0];  //return null;
    }
}
