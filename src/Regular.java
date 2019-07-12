import java.util.regex.*;

public class Regular {
    //start和end方法
    public static final String REGEX1 = "\\bcat\\b";
    public static final String INPUT2 = "cat cat cat cattie cat";

    //replaceFirst和replaceAll 方法
    private static String REGEX = "dog";
    private static String INPUT = "The dog says meow. " +
            "All dogs say meow.";
    private static String REPLACE = "cat";

    public static void main(String[] args) {
        String content = "I am noob " +
                "from runoob.com";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern,content);
        System.out.println("字符串中是否包含了'runoob'子字符串？" + isMatch);

        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String patn = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r =Pattern.compile(patn);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find()){
            System.out.println("Found value:"+ m.group(0));
            System.out.println("Found value:"+ m.group(1));
            System.out.println("Found value:"+ m.group(2));
            System.out.println("Found value:"+ m.group(3));
        }else {
            System.out.println("NO MATCH");
        }
        //start和end方法
        System.out.println("\nstart和end方法:");
        Pattern p = Pattern.compile(REGEX1);
        Matcher matcher = p.matcher(INPUT2);
        int count = 0;

        while(matcher.find()){
            count++;
            System.out.println("Match number" + count);
            System.out.println("start():" + matcher.start());
            System.out.println("end():" + matcher.end());


         //replaceFirst和replaceAll方法
         System.out.println("\nreplaceFirst和replaceAll方法:");
         Pattern p1 = Pattern.compile(REGEX);
         // get a matcher object
         Matcher m1 = p1.matcher(INPUT);
         INPUT = m1.replaceAll(REPLACE);
         System.out.println(INPUT);
        }
    }
}
