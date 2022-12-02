import java.util.Scanner;

public class ArrayInWave {
    public static void printWave(int arr[][]) {
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        printWave(arr);
    }

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and column of an array");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("enter " + i + " row and " + j + " column element in an array");
                arr[i][j] = sc.nextInt();
            }
        }
        print(arr);

    }

    public static void main(String[] args) {
        input();

    }

}
