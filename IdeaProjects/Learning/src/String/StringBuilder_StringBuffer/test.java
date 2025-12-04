package String.StringBuilder_StringBuffer;

public class test {
    public static void main(String[] args) {
        StringBuilder  stringBuilder=new StringBuilder("abc");
        StringBuffer  stringBuffer=new StringBuffer("abc");
        System.out.println(stringBuffer.equals(stringBuilder));

        StringBuilder  stringBuilder1=new StringBuilder("abc");
        StringBuilder  stringBuidler2=new StringBuilder("abc");
        System.out.println(stringBuidler2.equals(stringBuilder));


    }
}