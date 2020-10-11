import java.util.ArrayList;
import java.util.List;

public class Postorder {
    public List<Integer> postorder(Node root){
        List<Integer> res=new ArrayList<>();
        order(root,res);
        return res;
    }
    public void order(Node root,List<Integer> res){
        if(root==null)
            return;
        for(Node child:root.children){
            order(child,res);
        }
        res.add(root.val);
    }
}
