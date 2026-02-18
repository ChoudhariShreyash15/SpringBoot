package Java11;

public class Strings {
    public static void main(String[] args) {
        String s = "abc\ndef";
        System.out.println(s.lines().count()); //print count
        System.out.println(s.lines()); //print object

        String s1 = """
                {
                  "name": "Pratik",
                  "id": 123
                }
                """; //print text as it is
        System.out.println(s1);

        var a = 10;
        System.out.println(a);

        System.out.println(s.isBlank());
        System.out.println(s.isEmpty());
        System.out.println(s.repeat(3) + '\n');
        System.out.println(s.strip() + '\n');
        System.out.println(s.stripLeading() + '\n');
        System.out.println(s.stripTrailing() + '\n');
        System.out.println(s.stripIndent() + '\n');
        System.out.println(s.charAt(2));
    }
}
