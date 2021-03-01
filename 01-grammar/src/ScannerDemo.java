import java.util.Scanner;  // 工具包 - idea自动化操作

public class ScannerDemo {
    public static void main(String[] args) {
//        System.out.println("hello world");
        //创建输入工具 - 相当于 有了一把键盘，键盘名称sc
        Scanner sc = new Scanner(System.in);
//        System.out.println("hello");
        System.out.println("提示：请输入一个整数");
        //输入工具基本用法 - 阻塞
//        String input = sc.next();
//        String input = sc.nextLine();
//        System.out.println("用户输入为："+input);
//        System.out.println("world");
        System.out.println(sc.nextInt());
    }

}
