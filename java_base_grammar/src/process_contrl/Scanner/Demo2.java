package process_contrl.Scanner;
import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextline方式接收：");
        if(scanner.hasNextLine()){
            String s = scanner.nextLine();
            System.out.println("使用nextline方式输出："+s);
        }

//            String s = scanner.nextLine();
//            System.out.println("使用nextline方式输出："+s);
/*不用 if 能运行：因为你手动输入了内容，输入是确定存在的，所以 nextLine() 能成功读取。
加 if 更规范：在实际开发中（比如输入来源不确定的场景），hasNextLine() 可以让程序更健壮，避免意外情况导致的错误。*/
        scanner.close();
    }
}
