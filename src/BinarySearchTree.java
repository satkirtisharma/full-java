public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(int data,Node root){
        if (root==null){
            root=new Node(data);
            return root ;
        }
        if(data> root.data){
           root.right= insert(data,root.right);
        }
        else{
            root.left=insert(data,root.left);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean Search(int key,Node root){
        if (root==null){
            return false;
        }if (root.data==key)return true;
        if (root.data>key){
            return Search(key,root.left);
        }
        else {
            return Search(key,root.right);
        }

    }
    public static Node DeleteNode(int key,Node root){
        if(root.data<key){
            root.right=DeleteNode(key, root.right);
        } else if (root.data>key) {
            root.left=DeleteNode(key, root.left);
        }else {
            if ((root.left==null ) && (root.right==null)){;
                    return null;
            }  if (root.right==null) {
                return root.left;
            } else if (root.left==null) {
                return root.right;
            }
            Node is=Inordersuccessor(root.right);
            root.data= is.data;
            root.right=DeleteNode(is.data, root.right);


        }
        return root;
    }
    public static Node Inordersuccessor(Node root){
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }


    public static void main(String[] args) {
        int nums[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for (int i = 0; i < nums.length ; i++) {
           root= insert(nums[i],root);
        }
        inorder(root);
        System.out.println(Search(10,root));
        DeleteNode(3,root);
        inorder(root);
        System.out.println();
        DeleteNode(5,root);
        inorder(root);
    }
}
