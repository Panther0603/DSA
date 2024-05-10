package LinkedList;

public class ListCreate {


    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public Node head=null;
    public Node tail=null;
    public int size=0;

    public void add(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            tail=node;
            System.out.println("first node added");
        }else {
            tail.next=node;
            tail=node;
        }
        size++;
        System.out.println("data added ");
        if(size==3){
            deleteNode(node);
        }
        System.out.println("node deleted with "+size);

    }


    public void addNode(Node node){
        if(head==null){
            head=node;
            tail=node;
            System.out.println("first node added");
        }else {
            tail.next=node;
            tail=node;
        }
        size++;

    }

    public void  printList(ListCreate listCreate){
        if(listCreate.head!=null){
            Node tempHead=listCreate.head;
            while(tempHead!=null){
                System.out.print(tempHead.data+", ");
                tempHead=tempHead.next;
            }
        }
    }

    public boolean deleteNode(Node node){
        System.out.println("node deleting current size "+size);
        if(node !=null && head !=null){
          Node tempNodePointer= head;
          while(tempNodePointer!=null && tempNodePointer.next !=null ){
              System.out.println("hello");
              if(tempNodePointer.next == node)
              {
                  tempNodePointer.next=tempNodePointer.next.next;
                 size--;
                 return  true;
              }
              tempNodePointer=tempNodePointer.next;
          }
          return false;
        }
        return  false;
    }
    public static void main(String[] args) {
        ListCreate listCreate= new ListCreate();
//        listCreate.add(1);
//        listCreate.add(2);
//        listCreate.add(3);
//        listCreate.add(4);
//        listCreate.add(5);

        listCreate.addNode(new Node(1));
        listCreate.addNode(new Node(2));

        listCreate.addNode(new Node(4));
        listCreate.addNode(new Node(5));

        Node node= new Node(3);
     //   listCreate.addNode(node);


        listCreate.printList(listCreate);
        System.out.println();
        System.out.println(listCreate.size+"\n \n");

        listCreate.deleteNode(node);
        listCreate.printList(listCreate);
        System.out.println();

        System.out.println(listCreate.size);
    }
}
