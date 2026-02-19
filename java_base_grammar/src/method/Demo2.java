package method;

public class Demo2 {
    public static void main(String[] args) {
//        int max = max(1, 2);
        double max2=max(1.5,2.5);
//        System.out.println(max);
        System.out.println(max2);
    }
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static double max(double a,double b){
//        if(a>b)
//            return a;
//        else
//            return b;
        return a>b?a:b;
    }
}
