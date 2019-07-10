public class JavaOperator {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        //算数运算符
        System.out.println("算数运算符：");
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );

        //关系运算符
        System.out.println("关系运算符：");
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

        //逻辑运算符
        System.out.println("逻辑运算符：");
        int e = 60;
        int f = 13;
        int g = 0;
        g = e & f;
        System.out.println("e & f = " + g );

        g = e | f;
        System.out.println("e | f = " + g );

        g = e ^ f;
        System.out.println("e ^ f = " + g );

        g = ~e;
        System.out.println("~e = " + g );

        g = e << 2;
        System.out.println("e << 2 = " + g );

        g = e >> 2;
        System.out.println("e >> 2  = " + g );

        g = e >>> 2;
        System.out.println("e >>> 2 = " + g );

        //位运算符
        boolean h = true;
        boolean i = false;
        System.out.println("位运算符：");
        System.out.println("h && i = " + (h&&i));
        System.out.println("h || i = " + (h||i) );
        System.out.println("!(h && i) = " + !(h && i));

        //赋值运算符
        System.out.println("位运算符：");
        int j = 10;
        int k = 20;
        int l = 0;
        l = j + k;
        System.out.println("l = j + k = " + l );
        l += j ;
        System.out.println("l += j  = " + l );
        l -= j ;
        System.out.println("l -= j = " + l );
        l *= j ;
        System.out.println("l *= j = " + l );
        j = 10;
        l = 15;
        l /= j ;
        System.out.println("l /= j = " + l );
        j = 10;
        l = 15;
        l %= j ;
        System.out.println("l %= j  = " + l );
        l <<= 2 ;
        System.out.println("l <<= 2 = " + l );
        l >>= 2 ;
        System.out.println("l >>= 2 = " + l );
        l >>= 2 ;
        System.out.println("l >>= 2 = " + l );
        l &= j ;
        System.out.println("l &= j  = " + l );
        l ^= j ;
        System.out.println("l ^= j   = " + l );
        l |= j ;
        System.out.println("l |= j   = " + l );

        //条件运算符
        System.out.println("条件运算符：");
        int m , n;
        m = 10;
        // 如果 m 等于 1 成立，则设置 n 为 20，否则为 30
        n = (m == 1) ? 20 : 30;
        System.out.println( "Value of n is : " +  n );

        // 如果 m 等于 10 成立，则设置 n 为 20，否则为 30
        n = (m == 10) ? 20 : 30;
        System.out.println( "Value of n is : " + n );
    }
}
