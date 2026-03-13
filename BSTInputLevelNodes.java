//nodes from left to right at given level
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

public class BSTInputLevelNodes{

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

    void printLevel(int level){
        if(root==null) return;

        Queue<Node> q=new LinkedList<>();
        q.add(root);

        int currentLevel=0;

        while(!q.isEmpty()){

            int size=q.size();

            if(currentLevel==level){
                for(int i=0;i<size;i++){
                    Node temp=q.poll();
                    System.out.print(temp.data+" ");
                }
                return;
            }

            for(int i=0;i<size;i++){
                Node temp=q.poll();

                if(temp.left!=null)
                    q.add(temp.left);

                if(temp.right!=null)
                    q.add(temp.right);
            }

            currentLevel++;
        }
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        BSTInputLevelNodes tree=new BSTInputLevelNodes();

        System.out.print("Enter number of nodes: ");
        int n=sc.nextInt();

        System.out.println("Enter nodes:");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            tree.root=tree.insert(tree.root,x);
        }

        System.out.print("Enter level: ");
        int level=sc.nextInt();

        System.out.print("Nodes at level "+level+": ");
        tree.printLevel(level);
    }
}