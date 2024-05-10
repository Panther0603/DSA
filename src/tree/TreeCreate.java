package tree;

import LinkedList.ListCreate;

public class TreeCreate {

    public  Node root;
    public class   Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static int index=-1;
    public  Node createTree(int arr[]){
        ++index;

        if(arr[index]==-1){
            return null;
        }

        Node node = new Node(arr[index]);
        node.left=createTree(arr);
        node.right=createTree(arr);
        return node;
    }

    public static void main(String[] args) {
        int arr[]={1,2,-1,-1,7,8};



    }
}
