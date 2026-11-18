public interface IA {


    default void f() {
        IO.println("A::f()");
    }

    default void g() {
        IO.println("A::g()");
    }
}