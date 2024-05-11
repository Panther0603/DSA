package HashMapImpl;



import com.sun.jdi.Value;

import java.util.LinkedList;
import java.util.List;


public class HashMapImpl<K,V> {


    public static class HashMapCode<K, V> {

        public static class HashMap<K, V> {
            static class Node<K, V> {
                K key;
                V val;

                public Node(K key, V val) {
                    this.key = key;
                    this.val = val;
                }
            }


            private int n; //  highest Node size
            private int N; // bucket size
            public static LinkedList<Node>[] buckets; // array of LinkedList

            @SuppressWarnings("unchecked")
            public HashMap() {
                N = 4;
                buckets = new LinkedList[4];
                for (int i = 0; i < 4; i++) {
                    this.buckets[i] = new LinkedList<>();
                }
            }

            private int hashFunction(K key) {
                // bi =bucket index

                int bi =key.hashCode(); // this could give the negative values also for that we will update math.abs
                return Math.abs(bi)%N;
            }

            @SuppressWarnings("unchecked")
            private void rehash(){
                LinkedList<Node> oldBucket[]= buckets;
                buckets= new LinkedList[2*N];
                for(int i=0;i<2*N;i++){
                  buckets[i]=new LinkedList<>();
                }

                for(int i=0;i<oldBucket.length;i++){
                    LinkedList<Node> ll=oldBucket[i];
                    for(int j=0;j<ll.size();j++){
                        Node<K,V> node= ll.get(j);
                        put(node.key,node.val);  // updated the old value in the new bucket
                    }
                }
            }

            public void put(K key, V val) {
                int bi = hashFunction(key); // hash function index
                int di = searchInLL(bi, key);

                if (di == -1) {
                    buckets[bi].add(new Node(key,val));
                    n++;
                }else{
                    Node data=buckets[bi].get(di);
                    data.val= val;
                }
                double lambda = (double) n/N;
                if(lambda>2.0){

                    // rehashing
                }
            }

            private int searchInLL(int bi, K key) {

                int di=-1;
                LinkedList<Node> linkedList= buckets[bi];
                for(int i=0;i<linkedList.size();i++){
                    if(linkedList.get(i).key==key){
                        return  i;
                    }
                }
                return di;
            }
            public  int size(){
                int totSize=0;
                for(int i=0;i<buckets.length;i++){
                   totSize+=(buckets[i]).size();
                }
                return totSize;
            }
            public V get(K key){
                int bi=hashFunction(key);
                LinkedList<Node> ll= buckets[bi];
                int di= searchInLL(bi,key);
                if(di==-1){
                    return  null;
                }else{
                 Node<K,V> node=ll.get(di);
                 return node.val;
                }
            }
        }




        public static void main(String[] args) {

           HashMap<String,Integer> mapCode= new HashMap<>();
           mapCode.put("India",12);
           mapCode.put("UK",12);
           mapCode.put("KIn",12);
           mapCode.put("KIdn",12);

            System.out.println(mapCode.size());
        }

    }



}
