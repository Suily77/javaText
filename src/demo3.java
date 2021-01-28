public class demo3 {
    public static void main(String[] args) {
        String s=new String("m")+new String("k");
        String s1=s.intern();
        //System.out.println(s1=="mk");//true
        System.out.println(s=="mk");//true
        System.out.println("====================================");
        String th1=new String("t") +new String("h");
        String th2=th1.intern();
        System.out.println(th2=="th");//true
        System.out.println(th1=="th");//false
    }
}
