//THIS IS AN EXAMPLE OF RUNTIME POLYMORPHISM

package LAB_4.Exercise1;

class A {
    public void Speak() {
        System.out.println("Hi! My name is A");
    }
}

class B extends A {
    public void Speak() {
        System.out.println("Hi! My name is B");
    }
}

class C extends A {
    public void Speak() {
        System.out.println("Hi! My name is C");
    }
}

class D extends B {
    public void Speak() {
        System.out.println("Hi! My name is D");
    }
}

class E extends C {
    public void Speak() {
        System.out.println("Hi! My name is E");
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        // It will run because D is subclass of A, and a will have attributes and method
        // of A not B.
        // However D's Speak() method overrides A's Speak() method.
        A a1 = new D();
        a1.Speak();

        // Not Possible: A is superclass of D.
        // D d = new A();
        // To run do casting:
        // D d = new D();
        // ((A)d).Speak();

        // Same as a1
        A a2 = new C();
        a2.Speak();

        // Same as d;
        // E e = new C();
    }
}