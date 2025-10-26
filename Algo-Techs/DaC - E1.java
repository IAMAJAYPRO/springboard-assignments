
class Tester {

    public static int[] getMaxMin(int arr[], int low, int high) {
        int a1[] = new int[2], a2[] = new int[2];
        if (high <= low) {
            if (arr[low] > arr[high]) {
                a1[0] = arr[low];
                a1[1] = arr[high];
            } else {
                a1[0] = arr[low];
                a1[1] = arr[high];
            }
            return a1;
        }
        int mid = (high + low) / 2;
        a1 = getMaxMin(arr, low, mid);
        a2 = getMaxMin(arr, mid+1, high);
        if (a2[0] > a1[0]) {
            a1[0] = a2[0];
        }
        if (a2[1] < a1[1]) {
            a1[1] = a2[1];
        }
        return a1;
    }

    public static void main(String args[]) {
        int arr[] = {1000, 10, 5, 1, 2000};

        int[] maxMin = getMaxMin(arr, 0, arr.length - 1);

        System.out.println("Minimum value is " + maxMin[1]);
        System.out.println("Maximum value is " + maxMin[0]);
    }
}
