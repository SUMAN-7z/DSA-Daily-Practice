package Arrays;
// public class Searching {
//     public static int Linear(int arr[], int key) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 45, 5, 56, 12, 3, 56, 878, 4 };
//         int key = 5;

//         int index = Linear(arr, key);
//         if (index == -1) {
//             System.out.println("Element not found");
//         } else {
//             System.out.println("Element found at index : " + index );
//         }
//     }
// }

public class Searching {
    public static int Linear(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String arr[] = { "java", "python", "c", "c++" };
        String key = "c";

        int index = Linear(arr, key);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index : " + index);
        }
    }
}
