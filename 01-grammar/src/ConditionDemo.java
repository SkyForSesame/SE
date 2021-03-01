import java.util.Scanner;

public class ConditionDemo {
    public static void main(String[] args) {
        //提示
        System.out.println("请输入您的年龄");
        //创建扫描器
        Scanner scanner = new Scanner(System.in);
        //等待用户输入数据，并保存
        int age = scanner.nextInt();
//        使用条件语法对age变量进行判断
        if(age>0 && age<18){
            System.out.println("未成年禁止入内");
        }else if(age<100 && age>=18){
            System.out.println("欢迎光临");
        }else{
            System.out.println("年龄输入有误，再见");
        }
        // 请输入学生成绩（0-100之间的整数）： 90以上为A , 80-90:B , 60-80:C ， 0-60：D ，输入分数范围有误提示
        //判断参数是否合法
//        if(age>0 || age<100){
//            //对合法参数进行判断
//            if(age<18){
//                System.out.println("未成年禁止入内");
//            }else{
//                System.out.println("欢迎光临");
//            }
//        }else{
//            System.out.println("年龄输入有误，再见");
//        }
    }
}
