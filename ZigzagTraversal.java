import java.util.*;
import java.util.LinkedList;
class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class ZigzagTraversal{

    Node root;

    Node insert(Node root,int data){
        if(root==null)
            return new Node(data);

        if(data<root.data)
            root.left=insert(root.left,data);
        else
            root.right=insert(root.right,data);

        return root;
    }
    //zigzag traversal
    void zigzag(){

        if(root==null) return;

        Queue<Node> q=new LinkedList<>();
        q.add(root);

        boolean leftToRight=true;

        while(!q.isEmpty()){

            int size=q.size();
            List<Integer> level=new ArrayList<>();

            for(int i=0;i<size;i++){

                Node temp=q.poll();

                if(leftToRight)
                    level.add(temp.data);
                else
                    level.add(0,temp.data);

                if(temp.left!=null)
                    q.add(temp.left);

                if(temp.right!=null)
                    q.add(temp.right);
            }

            for(int val:level)
                System.out.print(val+" ");

            leftToRight=!leftToRight;
        }
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        ZigzagTraversal tree=new ZigzagTraversal();

        System.out.print("Enter number of nodes: ");
        int n=sc.nextInt();

        System.out.println("Enter nodes:");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            tree.root=tree.insert(tree.root,x);
        }

        System.out.print("Zigzag Traversal: ");
        tree.zigzag();
    }
}