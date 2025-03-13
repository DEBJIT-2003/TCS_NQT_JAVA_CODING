public class Occuring_Index {
    public static int firstOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                result = mid;
                high = mid - 1; // Search in the left half
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static int lastOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                result = mid;
                low = mid + 1; // Search in the right half
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x1 = 5;
        System.out.println("First Occurrence = " + firstOccurrence(arr1, x1));
        System.out.println("Last Occurrence = " + lastOccurrence(arr1, x1));

        int[] arr2 = {1, 3, 5, 5, 5, 5, 7, 123, 125};
        int x2 = 7;
        System.out.println("First Occurrence = " + firstOccurrence(arr2, x2));
        System.out.println("Last Occurrence = " + lastOccurrence(arr2, x2));
    }
}


