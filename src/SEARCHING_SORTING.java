import java.util.zip.ZipInputStream;

public class SEARCHING_SORTING {
    public static void BubbleSort(int arr[]) {
        for (int i=0;i< arr.length-1;i++){
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
    public static void SelectionSort(int arr[]){
        for (int i = 0; i < arr.length-1 ; i++) {
            int small=i;
            for (int j = i; j < arr.length ; j++) {
                if (arr[j]<arr[small]){
                    small=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[small];
            arr[small]=t;
        }
    }
    public static void InsertionSort(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            int j=i-1;
            int temp=arr[i] ;
            while (j>0&&temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void merge(int[]arr,int si, int m,int ei ){
        int []t=new int[ei-si+1];
        int i=si;
        int j=m+1;
        int k=0;
        while (i<=m && j<=ei){
            if (arr[i]<arr[j]){
                t[k]=arr[i];
                i++;
            }
            else {
                t[k]=arr[j];
                j++;
            }

            k++;
        }
        while (i<=m){
            t[k++]=arr[i++];
        }
        while (j<=ei){
            t[k++]=arr[j++];
        }
        for ( k = 0,i=si; k< t.length ; k++,i++) {
            arr[i]=t[k];
        }
    }
    public static void mergesort(int[]arr,int si,int ei){
        if (si>=ei)return;
        int m=si+(ei-si)/2;
        mergesort(arr,si,m);
        mergesort(arr,m+1,ei);
        merge(arr,si,m,ei);
    }
    public static void quicksort(int arr[],int si,int ei){
        if (si>=ei)return;
        int pvx=partion(arr,si,ei);
        quicksort(arr,si,pvx-1);
        quicksort(arr,pvx+1,ei);
    }
    public static int partion(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for (int j = si; j <arr.length ; j++) {
            if (arr[j]<pivot){
                i++;
                int t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
            }
        }
        i++;
      //
        arr[ei]=arr[i];
        arr[i]=pivot;
        return i;
    }
    public static void main(String[] args) {
        int []arr={1,2,13,321,2414,141,41,445,5};
       //  BubbleSort(arr);
        // SelectionSort(arr);
    // InsertionSort(arr);
      //  mergesort(arr,0,arr.length-1);
        quicksort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
