package SearchingAndSorting;

public class MergeSort {

    public  static  void sort(int[] arr, int start, int end){

        if(start>=end) {
            return;
        }
            int mid = start+(end-start)/2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            mergeArray(arr,start,end,mid);

    }

    public  static  void mergeArray(int[] arr, int start, int end, int mid){

        System.out.println("Come with "+start+ " "+end+" "+mid);
        int temp=mid+1;

        int l = mid-start+1;
        int r = end-mid;
        int[] left= new int[l];
        int[] right= new int[r];

        int i=0;
        while(i<l){
           left[i]=arr[start+i];
           i++;
        }
        int j=0;
        while (j<r){
            right[j]=arr[mid+j+1];
            j++;
        }

        i=0;
        j=0;
        int k=start;
        while (i<l && j<r){
            if(left[i] <= right[j]){
                arr[k]=left[i];
                i++;
            }else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }

        while (i<l){
            arr[k]=left[i];
            i++;
            k++;
        }
        while (j<r){
            arr[k]=right[j];
            j++;
            k++;
        }
    }




    public static void main(String[] args) {
        int arr[]={1,4,5,2,4,7,9};
        sort(arr,0,arr.length-1);

        for (int i=0;i<arr.length;++i){
            System.out.println(arr[i]);
        }
    }
}
