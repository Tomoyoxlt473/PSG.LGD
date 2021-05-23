/**
 * @author xlt473
 * @version 1.0
 * @description
 * @date 2021/5/23 14:44
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String p = "abcdef";//这一行注释，下面均为ture
        String s3 = s1 +s2;
        String s4 = s3.intern();
        System.out.println(s3==s4);
        System.out.println(s3=="abcdef");
    }

}
