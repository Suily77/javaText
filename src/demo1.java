import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demo1 {
    /**
     * 不能使用单引号
     */
    //String s='qww';
    String s1="hello";
    String s2;//成员变量可以不赋值，java没有全局变量的概念
    public static void main(String[] args) {
    Integer str = null;
   System.out.println(str+new demo1().s1+new demo1().s2);
    }
}
