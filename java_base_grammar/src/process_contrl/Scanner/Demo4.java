package process_contrl.Scanner;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        //我们可以输入多个数字，并求其总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果:
        Scanner scanner = new Scanner(System.in);
        double sum=0;
        int i=0;
        System.out.println("请输入：");
        while (scanner.hasNextDouble()){
            sum+=scanner.nextDouble();
            i++;
        }
        System.out.println("总和sum:"+sum);
        System.out.println("平均:"+sum/i);
        scanner.close();
    }

}
