package array;

public class Demo02 {
    public static void main(String[] args) {
        int [][] array ={{1,2},{3,4},{5,6,7}};
        // 遍历外层数组（行）
        for (int i = 0; i < array.length; i++) {
            // 遍历内层数组（列）
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");//注意这里是print
                //System.out.print(array[i][j]);//这个会黏在一起
            }
            // 每行结束后换行
            System.out.println();
        }

    }
}
