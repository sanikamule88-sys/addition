public class ClassA

{
    int c;
    static int e;

    void classA() {
        System.out.println(++c);
        System.out.println(++e);
    }

    public static void main(String[] args) {
        int a = 34;
        int b = 21;

        new ClassA().e = a++ + ++b;
        int d = --a + --b + new ClassA().e--;
        System.out.println(e);

        e = a++ + b++ + new ClassA().e + d--;
        int f = -a + --b + new ClassA().e - d++;

        int sum = a + b + new ClassA().e + d + e + f;
        System.out.println("sum=" + sum);
    }
}
