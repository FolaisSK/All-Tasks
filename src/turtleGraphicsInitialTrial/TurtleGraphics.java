package turtleGraphicsInitialTrial;

public class TurtleGraphics {
    private boolean penDown;
    private int[][] board;
    private int row;
    private int column;
    private int position;

    public TurtleGraphics(){
        this.board = new int[20][20];
        this.row = 0;
        this.column = 0;
        this.position = 0;
    }

    public void isUp(){
        this.penDown = false;
    }

    public void isDown(){
        this.penDown = true;
        board[row][column] = 1;
    }

    public void turnRight(){
        this.position = (position + 1) % 4;
    }

    public void turnLeft(){
        this.position = (position + 3) % 4;
    }

    public void move(int spaces){
        for(int count = 0; count < spaces; count++){
            if(position == 0) column = goRight();
            if(position == 1) row = goDown();
            if(position == 2) column = goLeft();
            if(position == 3) row = goUp();

            if(penDown == true) board[row][column] = 1;
        }
    }

    public void display(){
        for(int rows = 0; rows < board.length; rows++){
            for(int columns = 0; columns < board.length; columns++){
                if(board[rows][columns] == 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    private int goRight(){
        return ++this.column;
    }

    private int goLeft(){
        return --this.column;
    }

    private int goUp(){
        return --this.row;
    }

    private int goDown(){
        return ++this.row;
    }

}
