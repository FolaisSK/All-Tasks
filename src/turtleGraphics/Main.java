package turtleGraphics;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);
        TurtleGraphics turtle = new TurtleGraphics();

        int command = 0;

        while (command != 9){
            turtle.commandMenu();
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
}
