import java.util.Scanner;

public class ConditionWork {
    public static void main(String[] args) {
        /**
         * 1、输出“你是男人吗？”，回答如果是true，
         * 那么输出“原来你是男人呀，呵呵”，如果回答是：false，那么输出“你的性别难道是女?”。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("你是男人吗？");
        String answer = sc.next();
        if(answer.equals("是")){
            System.out.println("原来你是男人呀，呵呵");
        }else if(answer.equals("否")){
            System.out.println("你的性别难道是女");
        }else{
            System.out.println("输入有误");
        }
//        String a ="是",b="是";
//        System.out.println(a==b);
    }
}
