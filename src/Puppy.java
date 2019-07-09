public class Puppy{
    int puppyAge;
    public Puppy(String name){
        //这个构造器仅有一个参数：name
        System.out.println("小狗的名字是：" + name);
    }
    //该方法没有返回值
    public void setAge(int age){
        puppyAge = age;
    }
    //该方法需要返回一个int参数
    public int getAge() {
        System.out.println("小狗的年龄为：" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args){
        //创建对象，引用数据类型Puppy
        Puppy myPuppy = new Puppy("tommy");
        //通过方法设定age
        myPuppy.setAge(2);
        //调用另一个方法获取age
        myPuppy.getAge();
        //访问成员变量
        System.out.println("变量值：" + myPuppy.puppyAge);
    }
}