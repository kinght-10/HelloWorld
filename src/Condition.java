public class Condition {
    public static void main(String[] args) {

        //如果布尔表达式的值为 true，则执行 if 语句中的代码块，否则执行 if 语句块后面的代码
        System.out.println("if语句：");

        int x = 10;
        if (x < 20) {
            System.out.println("这是if语句");
        }

        //if 语句后面可以跟 else 语句，当 if 语句的布尔表达式值为 false 时，else 语句块会被执行
        System.out.println("\nif-else语句：");

        int y = 30;
        if (y < 20) {
            System.out.println("这是if-else语句");
        } else {
            System.out.println("这是if-else语句");
        }
        //if 语句后面可以跟 else if…else 语句，这种语句可以检测到多种可能的情况
        System.out.println("\nif-elif-else语句：");

        int z = 40;
        if (z == 10) {
            System.out.println("Value of X is 10");
        } else if (z == 20) {
            System.out.println("Value of X is 20");
        } else if (z == 30) {
            System.out.println("Value of X is 30");
        } else {
            System.out.println("这是if-elif-else 语句");
        }

        /*使用嵌套的 if…else 语句是合法的。也就是说你可以在另一个 if 或者 else if 语句中使用 if
        或者 else if 语句。另外你可以像 if 语句一样嵌套 else if...else*/
        System.out.println("\n嵌套if-else语句：");

        int a = 30;
        int b = 10;
        if(a == 30){
            if (b == 10) {
                System.out.println("A = 30 and B = 10");
            }
        }

        //switch case 语句判断一个变量与一系列值中某个值是否相等，每个值称为一个分支。
        System.out.println("\nswitch-case语句：");
        char grade = 'B';
        switch (grade)
        {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
                break;
            case 'F':
                System.out.println("你需要再努力努力");
                break;
            default:
                System.out.println("未知等级");
                break;
        }
        System.out.println("你的等级是" + grade );
    }
}
