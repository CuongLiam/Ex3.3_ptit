public class Main {
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - i - 1; j ++){
                if (arr[j] > arr[j+1]){ //  increase
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = new int[10];

        for (int i = 0 ; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
        }

        bubbleSort(arr);

        for (int i : arr){
            System.out.print(i + " ");
        }

    }
}