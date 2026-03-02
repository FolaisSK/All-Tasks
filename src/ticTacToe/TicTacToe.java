package ticTacToe;

public class TicTacToe {

    static void main() {
        char[][] filledFloor = setCharacters();
        printXAndOFloor(filledFloor);
        System.out.println();
        print1And0Floor(filledFloor);
    }


    public static char[][] createFloor(){
        char[][] floor = new char[3][3];
        return floor;
    }

    public static char[][] setCharacters(){
        char[][] floor = createFloor();
        floor[0][0] = 'X';
        floor[0][1] = 'O';
        floor[0][2] = 'X';
        floor[1][0] = 'O';
        floor[1][1] = 'X';
        floor[1][2] = 'O';
        floor[2][0] = 'X';
        floor[2][1] = 'O';
        floor[2][2] = 'O';
        return floor;
    }

    public static void printXAndOFloor(char[][] filledFloor){
        for(int row = 0; row < filledFloor.length; row++){
            for(int column = 0; column < filledFloor.length; column++){
                System.out.print(filledFloor[row][column]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public  static void print1And0Floor(char[][] filledFloor){
        for(int row = 0; row < filledFloor.length; row++){
            for(int column = 0; column < filledFloor.length; column++){
                if(filledFloor[row][column] == 'X'){
                    System.out.print(1);
                }
                if(filledFloor[row][column] == 'O'){
                    //System.out.print(0);
                    int result = (filledFloor[row][column] == 'X') ? 1 : 0;
                    System.out.print(result);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
