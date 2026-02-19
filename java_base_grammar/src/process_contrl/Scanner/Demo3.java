package process_contrl.Scanner;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //从键盘接收数据
        //局部变量；必须声明和初始化值
        int i = 0;
        float f = 0f;
        System.out.println("请输入整数：");
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("输出一个整数数据i:" + i);
            scanner.nextLine(); // 清空缓冲区剩余的 " 01\n"
        }else{
            System.out.println("输入的不是整数");
        }
        //你输入的 10 01 被拆成了两段，第一段 10 给了整数读取，第二段 01 自动给了浮点数读取，
        // 所以浮点数的提示后没有让你手动输入，直接读取了缓冲区剩余内容。
        //若想每次提示都手动输入，需在读取后用 nextLine() 清空缓冲区，或每次输入仅填对应类型的单个值。

        System.out.println("请输入单精度浮点数：");
        if (scanner.hasNextFloat()) {
            f = scanner.nextFloat();
            System.out.println("输出一个单精度浮点数:" + f);
        }else{
            System.out.println("输入的不是单精度浮点数");
        }
        scanner.close();
        /*System.in 只需在创建 Scanner 对象时指定一次，即可通过该对象反复读取控制台输入；
        重复创建 Scanner(System.in) 会导致输入异常，开发中建议只创建一个 Scanner 对象；
        用完 Scanner 后调用 close() 关闭通道，是更规范的写法（避免资源占用）。*/
    }
}
