public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 10, 8, 9, 12};
        System.out.println("Trước sắp xếp: ");
        for (int num : arr)
            System.out.print(num + ",");
        System.out.println("");
        System.out.println("Sau sắp xếp: ");
        insertSort(arr);
        System.out.println("Kết quả");
        for(int num : arr)
        System.out.print(num + ",");
    }
    public static void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int k = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                for(int num :arr) {
                    System.out.print(num + ",");
                }
                System.out.println("");
                j--;
            }
            arr[j + 1] = k;
            }
        }
}
