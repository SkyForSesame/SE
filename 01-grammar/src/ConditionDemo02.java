public class ConditionDemo02 {
    public static void main(String[] args) {
        // 请输入学生成绩（0-100之间的整数）： 90以上为A , 80-90:B , 60-80:C ， 0-60：D ，输入分数范围有误提示
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入学生成绩");
//        int grade = scanner.nextInt();
//        //对成绩进行判断
//        if(grade<0 || grade>100){
//            System.out.println("学生成绩输入有误");
//        }else if(grade > 90){
//            System.out.println("学生成绩为A");
//        }else if(grade > 80){
//            System.out.println("学生成绩为B");
//        }else if(grade>60){
//            System.out.println("学生成绩为C");
//        }else{
//            System.out.println("学生成绩为D");
//        }
//        int grade = scanner.nextInt()/10;
        //对成绩进行判断
//        if(grade<0 || grade>10){
//            System.out.println("学生成绩输入有误");
//        }else if(grade == 9){
//            System.out.println("学生成绩为A");
//        }else if(grade == 8){
//            System.out.println("学生成绩为B");
//        }else if(grade > 6){
//            System.out.println("学生成绩为C");
//        }else{
//            System.out.println("学生成绩为D");
//        }
        //用switch进行替换
//        switch (grade){
//            case 10:
//            case 9:
//                System.out.println("A");
//                break;
//            case 8:
//            case 7:
//                System.out.println("B");
//                break;
//            case 6:
//                System.out.println("C");
//                break;
//            default:
//                System.out.println("D");
//        }
        //三元运算符
        System.out.println(1<2?"hello":"world");

    }
}
