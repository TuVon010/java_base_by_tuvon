package method;

public class Demo04 {
    public static void main(String[] args) {
        printMax(1.0, 2.5, 3.2); // 传入多个参数
        printMax(); // 不传入参数也合法

    }
    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }

}
