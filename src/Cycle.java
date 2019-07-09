public class Cycle {
    public static void main(String[] args) {
        int x = 10;

        //while循环：满足布尔表达式即执行循环语句块
        System.out.println("while循环: \n");

        while ( x < 12 ){
            System.out.println("value of x :" + x );
            x++;
            System.out.println("\n");
        }

        //do...while循环：即使不满足布尔表达式也至少执行一次循环语句块
        System.out.println("do...while循环: \n");

        do{
            System.out.println("value of x:" + x );
            x++;
            System.out.println("\n");
        }while( x < 14);

        //for循环执行次数在执行前就已经确定的
        System.out.println("for循环: \n");

        for(int y = 10; y < 14; y = y + 1){
            System.out.println("value of y:" + y);
            System.out.println("\n");
        }

        //java增强for循环：数组增强型for循环
        System.out.println("Java增强for循环: \n");

        int [] numbers = {10,20,30,40,50};
        for (int z :numbers){
            if ( z == 30){
                //可以添加break和continue控制循环语句中断或者跳出该循环
                continue;
            }
            System.out.print(z);
            System.out.print(",");
        }
    }
}
