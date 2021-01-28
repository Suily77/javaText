public class demo2 {
    public static void main(String[] args) {
        String a="a";
        String b="b";
        String ab="ab";
        String ab1=a+b;
        System.out.println(ab1);
        System.out.println(ab1==ab);//false，比较的是地址，也就是变量本身的值
        System.out.println(ab.equals(ab1));//true，比较的是字符串内容，适用于对象
        System.out.println(ab.intern()==ab);//true?
        System.out.println(ab.intern()==ab1);//false?
        System.out.println("ab"==ab1);//false，"ab"指向String ab
        System.out.println("ab"==ab);//true
        /**
         * 即“ab”和ab.intern（）没有区别
         * ==有一方不是地址，会去查找定义的变量地址
         */
        System.out.println(ab.intern()==ab1.intern());//true,转化成规范的字符串
        System.out.println("====================================");
        String c=new String ("c");
        String c1=c;
        String d=new String("d");
        System.out.println(c==c1);//true
        System.out.println(c==d);//false

        System.out.println("====================================");

        String f="f";
        String g="g";
        String fg=f+g;
        System.out.println("f"==f);//true
        System.out.println("fg"==fg);//false,找不到成员变量是“fg”的
        System.out.println("fg"==fg.intern());//true
        System.out.println("====================================");

        String t="t";
        String h="h";
        String th=t+h;
        String th1=new String("t") +new String("h");
        System.out.println(th1=="th");//false，动态创建的对象或者变量不会放入串池中
        System.out.println(th=="th");//false,找不到成员变量是“fg”的
        String th2=th1.intern();
        System.out.println("th"==th2);//true
        System.out.println("th"==th1);//false
        System.out.println("th"==th);//false
        String th3=th.intern();//false
        System.out.println("th"==th);//false
    }
}
