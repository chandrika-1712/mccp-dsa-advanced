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

public class BSTLevelsRange{

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

    void nodesBetweenLevels(int start,int end){

        if(root==null) return;

        Queue<Node> q=new LinkedList<>();
        q.add(root);

        int level=0;

        while(!q.isEmpty()){

            int size=q.size();

            for(int i=0;i<size;i++){

                Node temp=q.poll();

                if(level>=start && level<=end)
                    System.out.print(temp.data+" ");

                if(temp.left!=null)
                    q.add(temp.left);

                if(temp.right!=null)
                    q.add(temp.right);
            }

            level++;

            if(level>end) break;
        }
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        BSTLevelsRange tree=new BSTLevelsRange();

        System.out.print("Enter number of nodes: ");
        int n=sc.nextInt();

        System.out.println("Enter nodes:");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            tree.root=tree.insert(tree.root,x);
        }

        System.out.print("Enter start level: ");
        int start=sc.nextInt();

        System.out.print("Enter end level: ");
        int end=sc.nextInt();

        System.out.print("Nodes between levels: ");
        tree.nodesBetweenLevels(start,end);
    }
}