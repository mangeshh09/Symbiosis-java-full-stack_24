//36.	How to Create Objects in Java

class Person{
    String name;
    int age;
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void display()
    {
        System.out.println("Name : "+name+ " Age : "+age);
    }
}
public class P36
{
    public static void main(String[] args) {
        Person p1 = new Person("Ramesh",20);
        Person p2 = new Person("Suresh",22);
        p1.display();
        p2.display();

    }
}