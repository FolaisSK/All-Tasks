package sevenSegmentDisplay;

public class LEDScreen {

    private int[][] screen;
    private final int rowSize = 7;
    private final int columnSize = 4;

    public LEDScreen(){
        screen = new int[rowSize][columnSize];
    }

    public int[][] getScreen(){
        return screen;
    }

    public  void setOnSegments(String activeSegments){
        if(activeSegments.contains("A")) switchOnA();
        if(activeSegments.contains("B")) switchOnB();
        if(activeSegments.contains("C")) switchOnC();
        if(activeSegments.contains("D")) switchOnD();
        if(activeSegments.contains("E")) switchOnE();
        if(activeSegments.contains("F")) switchOnF();
        if(activeSegments.contains("G")) switchOnG();

    }

    public void displayScreen(){
        for(int i = 0; i < screen.length; i++){
            for(int j = 0; j < screen[0].length; j++){
                System.out.print(screen[i][j]);
            }
            System.out.println();
        }
    }

    public void display(){
        for(int i = 0; i < screen.length; i++){
            for(int j = 0; j < screen[0].length; j++){
                if(screen[i][j] == 1) System.out.print("#");
                if(screen[i][j] == 0) System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void blankScreen(){
        for(int i = 0; i < screen.length; i++){
            for(int j = 0; j < screen[0].length; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private void switchOnA(){
        for(int i = 0; i < columnSize; i++){
            screen[0][i] = 1;
        }
    }

    private void switchOnB(){
        for(int i = 0; i < columnSize; i++){
            screen[i][3] = 1;
        }
    }

    private void switchOnG(){
        for(int i = 0; i < columnSize; i++){
           screen[3][i] = 1;
        }
    }

    private void switchOnD(){
        for(int i = 0; i < columnSize; i++){
            screen[6][i] = 1;
        }
    }

    private void switchOnC(){
        for(int i = 3; i < rowSize; i++){
            screen[i][3] = 1;
        }
    }

    private void switchOnF(){
        for(int i = 0; i < columnSize; i++){
            screen[i][0] = 1;
        }
    }

    private void switchOnE(){
        for(int i = 3; i < rowSize; i++){
            screen[i][0] = 1;
        }
    }
}
