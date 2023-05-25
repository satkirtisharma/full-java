import java.util.*;
public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Binary_Tree{
        static int idx=-1;
        public static Node buildTree(int node[]){
            idx++;
            if(node[idx]==-1)return null;
            Node n=new Node(node[idx]);
            n.left=buildTree(node);
            n.right=buildTree(node);
            return n;
        }
        public static void insert(Node temp,int key){
            Queue <Node> q=new LinkedList  <Node>() ;
            q.add(temp);
            while (!q.isEmpty()){
                Node curr=q.poll();
                if(curr.left==null){
                    curr.left=new Node(key);
                    break;
                }
                else {
                    q.add(curr.left);
                }
                if(curr.right==null){
                    curr.right=new Node(key);
                    break;
                }
                else {
                    q.add(curr.right);
                }
            }
        }
        public static void preorder(Node n){
            if (n==null)return;
            System.out.println(n.data);
            preorder(n.left);
            preorder(n.right);
        }
        public static void inorder(Node n){
            if(n==null){
               return;
            }
            inorder(n.left);
            System.out.println(n.data);
            inorder(n.right);

        }
        public static void postorder(Node n){
            if(n==null){
                return;
            }
            postorder(n.left);
            postorder(n.right);
            System.out.println(n.data);

        }
        public static void levelorder(Node n){
            for (int i = 1; n!=null ; i++) {
                printcurrentlevel(n,i);
            }
        }
        public static void printcurrentlevel(Node n,int i){
            if(n==null)return;
            if (i==1) System.out.println(n.data);
            else {
                printcurrentlevel(n.left,i-1);
                printcurrentlevel(n.right,i-1);
            }
        }
        public static void levelorder2(Node n) {
            Queue<Node> q = new LinkedList<>();
            q.add(n);
            q.add(null);
            while (!q.isEmpty()) {
                Node c = q.remove();
                if (c == null) {
                    System.out.println();
                    if (q.isEmpty()) return;
                    q.add(null);
                    continue;
                }
                System.out.print(c.data);
                if (c.left != null) {
                    q.add(c.left);
                }
                if (c.right != null) {
                    q.add(c.right);
                }
            }
        }
            public static int height(Node n){
                if (n==null)return 0;
                int lh=height(n.left);
                int rh=height(n.right);
                return Math.max(lh,rh)+1;
            }
        public static int count(Node n){
            if (n==null)return 0;
            int lh=count(n.left);
            int rh=count(n.right);
            return lh+rh+1;
        } public static int sum(Node n){
            if (n==null)return 0;
            int lh= sum(n.left);
            int rh=sum(n.right);
            return lh+rh+n.data;
        }
        public static int diameter(Node n){
            if(n==null)return 0 ;
            int leftdiameter=diameter(n.left);
            int leftht=height(n.left);
            int rightdiameter=diameter(n.right);
            int rightht=height(n.right);
            int selfdiameter=leftht+rightht+1;
            return Math.max(selfdiameter,Math.max(leftdiameter,rightdiameter));
        }
        int diameter;

        public int diameter1(Node node) {
            if (node == null) {
                return 0;
            }
            int leftHeight = diameter1(node.left);
            int rightHeight = diameter1(node.right);
            diameter = Math.max(diameter, leftHeight + rightHeight+1);
            return Math.max(leftHeight, rightHeight) + 1;
        }


    }
    public static void main(String[] args) {
        int[]nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//        int []nodes={5, 3, 1, -1, -1, 4, -1, -1, 8, 7, -1, -1, 9, -1, -1};
        Binary_Tree b=new Binary_Tree();
        Node n=b.buildTree(nodes);
//        System.out.println(n.data);
    //    b.preorder(n);
//        b.inorder(n);
//        b.postorder(n);

        b.levelorder2(n);
////        System.out.println(b.height(n));
////        System.out.println(b.count(n));
////        System.out.println(b.sum(n));
//        System.out.println(b.diameter(n));
//        b.diameter1(n);
//        System.out.println(b.diameter);

    }
}
