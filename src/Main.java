public class Main{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Uh ohohohohohoh");

        int arr[]={14,56,3,4,5,6,48,18,9,10, 36};
        bubblesort_algorithm(arr);

        for(int number:arr){
            System.out.println(number);
        }
    }

    public static void bubblesort_algorithm(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                int init_val = arr[j-1];
                int val_2 = arr[j];

                if(val_2 < init_val){
                    //int temp=arr[j];
                    arr[j]=init_val;
                    arr[j-1] = val_2;
                }
            }
        }

    }

    public static void merge_sort(int[] arr){
        if(arr.length <= 1){
            return;
        }

        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];
    }
}