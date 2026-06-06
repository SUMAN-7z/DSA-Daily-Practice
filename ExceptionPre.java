class dataNotFoundException extends Exception {
    dataNotFoundException(String message) {
        super(message);
    }

}

public class ExceptionPre {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 3, 75, 6, 4 };
        int key = 77;
        boolean found = false;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    System.out.println("Found");
                    found = true;
                    break;
                }
            }

            if (found == false) {
                throw new dataNotFoundException("Element not found in array");
            }
        } catch (dataNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
