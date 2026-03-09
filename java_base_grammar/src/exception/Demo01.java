package exception;

public class Demo01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c=0;
        System.out.println("===================主动抛出的异常======================");
        if(b==0){//主动抛出异常，throw  throws
            throw new ArithmeticException();//主动抛出的异常，提前知道这个不满足，，直接抛出爆红
        }

        System.out.println("===================监控捕获处理异常======================");
        //try catch必须要，finally不需要，一般finally处理善后，关闭io流啥的
        try {//try监控运行区域
            System.out.println(a/b);
        }catch(ArithmeticException e){//catch（想要不捕获的异常类型）捕获异常Throwable超类（最高的类）
            System.out.println("程序出现异常，变量b不能为0");
    }finally {//处理善后工作
            System.out.println("finally");
        }
        //假设要捕获多个异常，要从小到大,从上到下，范围要么包含要么不相交
        try {//try监控运行区域
            System.out.println(a/b);
        }
        catch(Error e){//catch（想要不捕获的异常类型）捕获异常Throwable超类（最高的类）
            System.out.println("程序出现异常，方法体闭环出不去");
        } catch(Throwable e){//catch（想要不捕获的异常类型）捕获异常Throwable超类（最高的类），Exception也行
            System.out.println("程序出现异常，变量b不能为0");
        }finally {//处理善后工作
            System.out.println("finally");
        }
        System.out.println("==================================================================");
        try {//try监控运行区域
            a();
        }catch(Error e){//catch（想要不捕获的异常类型）捕获异常Throwable超类（最高的类）
            System.out.println("程序出现异常，方法体闭环出不去");
        }finally {//处理善后工作
            System.out.println("finally");
        }
        System.out.println("==================================================================");
        System.out.println(a/b);//没有放在try里面就会爆红，放在try里面就有异常捕获不会爆红并进行相关操作
        //快捷键选中，然后ctrl+alt+t
        }

    public static void a(){
        b();
    }
    public static void b(){
        a();
    }
}
