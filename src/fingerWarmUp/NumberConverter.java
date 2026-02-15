package fingerWarmUp;

public class NumberConverter {
    static void main() {
        taskOne(4500000);
        taskTwo(67);
        taskThree(5600);
        taskFour(-430000);
        taskFive(45.6789F);
        taskSix(9999.999);
        taskSeven(10000);
        taskEight(2500000);
    }

    public static void taskOne(int number) {
        String value = "" + number;

        System.out.printf(4 + "," + 500 + ",000\n");

    }

    public static void taskTwo(int number){
        float output = (float) number;
        String value = "" + output ;
        System.out.printf("%s0%n",value);
    }

    public static void taskThree(int number){
        String value = "+" + number;
        System.out.println(value);
    }

    public static void taskFour(int number){
        String value = "" + number;
        String firstPart = value.substring(0,4);
        String secondPart = value.substring(4,7);
        System.out.println(firstPart + "," + secondPart);
    }

    public static void taskFive(double number){
        double output = (double) number;
       // output /= 0.01;
        System.out.printf("%f%n",  output);
    }

    public static void taskSix(double number){
        double output = Math.round(number);
        String value = "" + output;
        System.out.printf("%s%n", value.substring(0,5));
    }

    public static void taskSeven(int number){
        number /= 1000;
        String value = "" + number;
        System.out.printf("%sK%n",value);
    }

    public static void taskEight(int number){
        double value = (double) number / 1000000;
        String output = "" + value;
        System.out.printf("%sM",output.substring(0,3));
    }

}
