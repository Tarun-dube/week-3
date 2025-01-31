package sorting;


public class MergeSort {
   static void merge(int[] a, int l, int m, int r) {

       int[] merged=new int[r-l+1];
       int index1=l,index2=m+1;
       int k=0;
       
       while(index1<=m && index2<=r) {
           if(a[index1]<a[index2]) {
               merged[k++]=a[index1++];

           }
           else {
               merged[k++]=a[index2++];
           }
       }
       while(index1<=m) {
           merged[k++]=a[index1++];
       }
       while(index2<=r) {
           merged[k++]=a[index2++];
       }

       for(int i=0,j=l;i<merged.length;i++,j++){
           a[j]=merged[i];
       }

    }
    public static void mergeSort(int[] arr, int left, int right) {
        int mid=left+(right-left)/2;
        if(left>=right) return;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        merge(arr,left,mid,right);

    }
    public static void main(String[] args) {
        int [] prices={3,21,7,9,11,12};
        mergeSort(prices,0,prices.length-1);

        for(int i=0;i<prices.length;i++) {
            System.out.print(prices[i]+" ");
        }
    }
}
