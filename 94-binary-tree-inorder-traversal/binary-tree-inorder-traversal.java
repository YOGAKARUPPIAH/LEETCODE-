
class Solution {    
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        TreeNode current = root;
        while(current != null){

            if(current.left != null){ 
              TreeNode pred = current.left;
              while(pred.right != null && pred.right != current){
                pred = pred.right;
              }
              if(pred.right == null){  
                pred.right = current;
                current = current.left;
              }
              else if(pred.right == current){
                pred.right = null;
                arr.add(current.val);
                current = current.right; 
              }
              
            }
            else{  
              arr.add(current.val);
              current = current.right;  
            }
        }
        return arr;
    }
 }

