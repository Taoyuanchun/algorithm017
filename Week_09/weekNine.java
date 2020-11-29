import java.util.HashMap;

public class weekNine {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int n = ch.length;

        for (int i = 0; i < n; i += 2 * k){
            int left = i;
            int right = (i + k - 1 < n) ? i + k -1 : n - 1; //判断下标是否越界
            while (left <= right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        String str = new String(ch);
        return str;

    }


    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),1);
            else
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}
