public class InsertSort {

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int e = 1; e < arr.length; e++) {
            for (int i = e - 1; i >= 0 && arr[i + 1] < arr[i]; i--) {
                    swap(arr, i + 1, i);
            }
        }
      /*  for(int e=1;e<arr.length;e++){
            int i=e;
            while (i>0){
                if(arr[i]<arr[i-1]){
                    swap(arr,i,i-1);
                    i--;
                }else{
                    break;
                }
            }
        }*/
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 23, 12, 67, 34};
        printArray(arr);
//        insertSort(arr);
        selectSort(arr);
        printArray(arr);
    }


    public static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] > arr[minIndex] ? minIndex : j;
            }
            swap(arr,minIndex,i);
        }
    }
}
