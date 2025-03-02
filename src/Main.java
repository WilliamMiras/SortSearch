

class twoDimArray {
    public static int[][] globalArray = {
            {5, 3, 2, 16},
            {9, 8, 10, 17},
            {4, 7, 11, 18},
            {2, 5, 9, 12},
            {7, 9, 4, 10}
    };

    public static void search(int num) {
        int ROW = 4, size = globalArray[ROW].length, high = size - 1, low = 0;
        int mid;
        boolean found = false;

        while (high >= low && !found) {
            mid = (high + low) / 2;

            if (globalArray[ROW][mid] == num) {
                found = true;
                displayCol(mid);
            }
            else if (globalArray[ROW][mid] > num) {
                high = mid - 1;
            }
            else if (globalArray[ROW][mid] < num) {
                low = mid + 1;
            }
        }

        if(!found) {
            System.out.println("\nSearch Failed: [" + num + "] could not be found");
        }

    }

    public static void displayCol(int col) {

        for (int i = 0; i <= globalArray[col].length; i++) {
            System.out.println(globalArray[i][col]);
        }
        System.out.println();
    }

}

public class Main {
    public static void main(String[] args) {
            twoDimArray.search(0);
    }
}