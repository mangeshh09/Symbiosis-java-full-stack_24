//23.	Java Programs For Calculate A Simple Interest
public class P23 {
    public static void main(String[] args) {
        int principle = 1000;
        int rate = 5;
        int time = 5;
        int si = (principle * rate * time) / 100;
        System.out.println("Simple Interest is: " + si);
    }
}
