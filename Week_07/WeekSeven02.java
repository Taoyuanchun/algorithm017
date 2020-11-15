import java.util.ArrayList;
import java.util.List;

public class WeekSeven02 {
    //括号生成

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(0,0,n,"",res);
        return res;
    }

    private void generate(int left, int right, int n, String s, List<String> res){
        if(right == n && left == n) {
            res.add(s);
            return;
        }
        if(left<n){
            generate(left+1, right, n, s+"(", res);
        }if(right<left){
            generate(left, right+1, n, s+")", res);
        }
    }
}
