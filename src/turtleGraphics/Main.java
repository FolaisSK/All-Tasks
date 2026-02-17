package turtleGraphics;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);
        TurtleGraphics turtle = new TurtleGraphics();

        int command = 0;

        while (command != 9){
            commandMenu();
            System.out.print("Enter a Command: ");
            command = input.nextInt();

            switch (command){
                case 1 -> turtle.isUp();
                case 2 -> turtle.isDown();
                case 3 -> turtle.turnRight();
                case 4 -> turtle.turnLeft();
                case 5 -> {
                    System.out.print("Enter Number of Spaces To Advance: ");
                    int steps = input.nextInt();
                    turtle.move(steps);
                }
                case 6 -> turtle.display();
                case 9 -> System.out.println("PROGRAM EXITED......");
                default -> System.out.println("Invalid Command");
            }
        }
    }

    public static void commandMenu(){
        String menu = """
                COMMAND     MEANING
                1           Pen Up
                2           Pen Down
                3           Turn Right
                4           Turn Left
                5,10        Move forward 10 spaces (replace 10 for a different number of spaces)
                6           Display 20-by-20 array
                9           End of data (sentinel)
                """;
        System.out.println(menu);
    }
}
