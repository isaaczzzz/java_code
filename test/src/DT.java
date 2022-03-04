public class DT {

    class A {
        public String show(D obj) {
            return ("A and D");
        }

        public String show(A obj) {
            return ("A and A");
        }
    }

    class B extends A {
        // B可以重写A
        public String show(B obj) {
            return ("B and B");
        }

        // 重写A方法了吗？
        public String show(A obj) {
            return ("B and A");
        }
    }

    class C extends B {
    }

    class D extends B {
    }

    public static void main(String[] args) {
        DT outerclass = new DT();
        A a1 = outerclass.new A();
        A a2 = outerclass.new B();
        B b = outerclass.new B();
        C c = outerclass.new C();
        D d = outerclass.new D();

        System.out.println("1:" + a1.show(b));
        System.out.println("2:" + a1.show(c));
        System.out.println("3:" + a1.show(d));
        System.out.println("4:" + a2.show(b));
        System.out.println("5:" + a2.show(c));
        System.out.println("6:" + a2.show(d));
        System.out.println("7:" + b.show(b));
        System.out.println("8:" + b.show(c));
        System.out.println("9:" + b.show(d));

    }
}