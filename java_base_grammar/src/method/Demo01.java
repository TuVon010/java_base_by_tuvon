package method;

public class Demo01 {
    //main方法
    public static void main(String[] args) {
        int add = add(1, 2);
        System.out.println(add);
    }
    //加法
    /*static 是必须的：因为 main 是静态方法，要直接调用 add 就必须让 add 也变成静态的；
public 是推荐的：不是语法强制要求，但符合方法 “对外开放功能” 的设计原则，让权限更清晰；
核心逻辑：静态上下文（main 方法）中，只能直接访问静态成员，非静态成员需要先创建对象才能调用。*/
    public static int add(int a,int b){
        return a+b;
    }
}
