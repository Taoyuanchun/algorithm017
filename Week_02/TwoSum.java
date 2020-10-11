import java.util.HashMap;
import java.util.Map;

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

    public int[] twoSum2(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)&&map.get(diff)!=0){
                return new int[]{i,map.get(diff)};
            }
        }
        return new int[0];
    }
}
