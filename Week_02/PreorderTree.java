import java.util.ArrayList;
import java.util.List;

public class PreorderTree {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        preorder(root,res);
        return res;
    }
    public void preorder(TreeNode root, List<Integer> res){
        if(root!=null){
            res.add(root.val);
            if(root.left!=null){
                preorder(root.left,res);
            }
            if(root.right!=null){
                preorder(root.right,res);
            }
        }
    }
}
