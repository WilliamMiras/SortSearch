class sortArray {

    public static void bubbleSort() {
        int[][] localArray = twoDimArray.copyArray();
        int COL = 0;
        int SIZE = localArray.length;
        int limit = SIZE - 1;
        int[] temp;

        for( ; limit > 0; limit--) {
            for(int i = 0; i < limit; i++) {
                if(localArray[i][COL] > localArray[i+1][COL]) {
                    temp = localArray[i];
                    localArray[i] = localArray[i+1];
                    localArray[i+1] = temp;
                }
            }
        }

        System.out.println("\nBubble Sort: ");
        twoDimArray.display(localArray);
    }

    public static void selectionSort() {
        int[][] localArray = twoDimArray.copyArray();
        int COL = 1;
        int SIZE = localArray.length;
        int limit = SIZE - 1;
        int[] temp;
        int indexOfSmallest;

        for(; limit > 0; limit--) {
            indexOfSmallest = limit;
            for(int i = 0; i < limit; i++) {
                if(localArray[i][COL] < localArray[indexOfSmallest][COL]) {
                    indexOfSmallest = i;
                }
            }
            if(limit != indexOfSmallest) {
                temp = localArray[limit];
                localArray[limit] = localArray[indexOfSmallest];
                localArray[indexOfSmallest] = temp;
            }
        }

        System.out.println("\nSelection Sort: ");
        twoDimArray.display(localArray);
    }

    public static void shellSort() {
        int[][] localArray = twoDimArray.copyArray();
        int COL = 2;
        int SIZE = localArray.length;
        int[] temp;

        for(int gap = SIZE/2; gap >= 1; gap = gap/2) {
            for(int i = gap; i < SIZE; i++) {
                for(int j = i; j >= gap && localArray[j-gap][COL] > localArray[j][COL]; j = j - gap) {
                    temp = localArray[j - gap];
                    localArray[j - gap] = localArray[j];
                    localArray[j] = temp;
                }
            }
        }

        System.out.println("\nShell Sort: ");
        twoDimArray.display(localArray);
    }

    public static void insertionSort() {
        int[][] localArray = twoDimArray.globalArray;
        int tmp;
        int ROW = 4;
        int SIZE = localArray.length - 1;

        for (int i = 1; i < SIZE; i++) {
            for (int j = i; j > 0 && localArray[ROW][j] < localArray[ROW][j - 1]; j--) {
                tmp = localArray[ROW][j];
                localArray[ROW][j] = localArray[ROW][j - 1];
                localArray[ROW][j - 1] = tmp;
            }
        }

        System.out.println("\nInsertion Sort: ");
        twoDimArray.display(localArray);
    }
}

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

        System.out.println("\nSearching for: " + num);
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
        int colFound = col + 1;
        System.out.println("Found! In Column: [" + colFound + "]");
        for (int i = 0; i <= globalArray[col].length; i++) {
            System.out.println("| " + globalArray[i][col] + " |");
        }
        System.out.println();
    }

    public static void display(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" | " + array[i][j]);
            }
            System.out.println(" |");
        }
    }

    public static int[][] copyArray() {
        int[][] newArray = new int[globalArray.length][globalArray[0].length];

        for(int i = 0; i < globalArray.length; i++) {
            System.arraycopy(globalArray[i], 0, newArray[i], 0, globalArray[i].length);
        }

        return newArray;
    }

}

public class Main {
    public static void main(String[] args) {
        sortArray.bubbleSort();
        sortArray.selectionSort();
        sortArray.shellSort();
        sortArray.insertionSort();
        twoDimArray.search(-1);
    }
}