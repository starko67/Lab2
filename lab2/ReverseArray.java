package lab2;
public class ReverseArray {
    public static void main(String[] args) {
        String[] array = {"раз", "два", "три", "четыре", "пять"};

        System.out.println("Исходный массив:");
        printArray(array);

        reverseArray(array);

        System.out.println("Массив после перестановки:");
        printArray(array);
    }

    public static void reverseArray(String[] arr) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            // Меняем местами элементы от начала и конца массива
            String temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }
    }

    public static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}