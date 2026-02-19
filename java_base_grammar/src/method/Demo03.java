package method;

public class Demo03 {
    public static void main(String args[]) {
        // 遍历打印所有传入的参数
        for(int i=0; i<args.length; i++){
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
/*(base) PS E:\postgraduateLife\java_start\java_start\java_base_grammar\src> cd ./method
(base) PS E:\postgraduateLife\java_start\java_start\java_base_grammar\src\method> javac Demo03.java
(base) PS E:\postgraduateLife\java_start\java_start\java_base_grammar\src\method> javac -encoding UTF-8 Demo03.java
(base) PS E:\postgraduateLife\java_start\java_start\java_base_grammar\src\method> cd ..
(base) PS E:\postgraduateLife\java_start\java_start\java_base_grammar\src> java method.Demo03
(base) PS E:\postgraduateLife\java_start\java_start\java_base_grammar\src> java method.Demo03 my name is junan
args[0]: my
args[1]: name
args[2]: is
args[3]: junan

*/