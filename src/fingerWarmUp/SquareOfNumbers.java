package fingerWarmUp;

public class SquareOfNumbers {
    static void main() {
        display(func());
    }

    public static int[][] func(){
        int[][] array = new int[7][7];

        for(int row = 0; row < array.length; row++){
            int number = 4;
            for(int col = 0; col < array.length; col++){
                array[row][col] = number;

            }
        }

        return array;
    }

    public static void display(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
