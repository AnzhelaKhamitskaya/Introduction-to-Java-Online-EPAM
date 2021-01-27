//—оставить программу, котора€ в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов).

package by.epam.jo_02_04_05.bean;

public class Program {

    public static void main(String[] args) {

        int[] arr = new int[] {13,2,1};

        printMaxSecondElement(arr);

    }

    public static int GetMaxElement(int[] arr){
        int maxElement = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        return maxElement;
    }

    public static int GetMaxSecondElement(int[] arr, int maxElement){

        int MaxSecondElement = maxElement;

        for (int i = 0; i < arr.length; i++){

            if (arr[i] < MaxSecondElement) {

                MaxSecondElement = arr[i];

                for (int j = i+1; j < arr.length; j++){

                    if (arr[j] > MaxSecondElement && arr[j] < maxElement) {
                        MaxSecondElement = arr[j];
                    }
                }
                break;
            }
        }

        return MaxSecondElement;
    }

    public static void printMaxSecondElement(int[] arr){

        int maxElement = GetMaxElement(arr);

        int maxSecondElement = GetMaxSecondElement(arr, maxElement);

        if(maxSecondElement!=maxElement) {
            System.out.print("¬торое по величине число в массиве = " + maxSecondElement);
        }else {
            System.out.print("¬се числа одинаковые");
        }
    }
}
