public class Person {
    public int addNumbers(int m, int n) {
        return m+n;
    }
    public void sayHello() {
        System.out.println("Hello, world!");
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sayHello();
        System.out.println(p1.addNumbers(5,10));
    }
}
