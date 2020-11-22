public class WeekEight {

    public boolean isPowerOfTwo(int n) {
        return (n>0) && (n & (n-1))==0;
    }

    public int hammingWeight(int n) {
        int count = 0;
        int bit = 1;
        for(int i = 0; i<32; i++){
            if((n & bit) != 0){
                count ++;
            }
            bit = bit << 1;
        }
        return count;
    }

    public int reverseBits(int n) {
        int ans = 0;
        for(int i = 0; i<32; i++){
            ans = (ans<<1) + (n&1);
            n >>= 1;
        }
        return ans;
    }
}
