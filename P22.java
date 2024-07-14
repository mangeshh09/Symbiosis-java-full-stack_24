//22.	Java Programs to Convert a Person's Name in Abbreviated

public class P22 {
    public static void main(String[] args) {
        String name = "Sachin Tendulkar";
        String[] words = name.split(" ");
        String initials = words[0].substring(0, 1) + words[1].substring(0, 1);
        System.out.println(initials);
    }
}
