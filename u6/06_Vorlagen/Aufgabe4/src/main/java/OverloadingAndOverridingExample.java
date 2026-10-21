class Base {
    void copyTo(Object other) {
        // Method 1
        IO.println("1");
    }

    void copyTo(Base other) {
        // Method 2   }
        IO.println("2");
    }
}

class Sub extends Base {
    void copyTo(Base other) {
        // Method 3
        IO.println("3");
    }

    void copyTo(Sub other) {
        // Method 4
        IO.println("4");
    }
}

public class OverloadingAndOverridingExample {


    public static void main(String[] args) {
        Sub sub = new Sub();
        Base base = new Sub();
        Object obj = new Sub();
        var v = obj;

        base.copyTo(obj);
        base.copyTo(base);
        base.copyTo(sub);
        sub.copyTo(obj);
        sub.copyTo(base);
        sub.copyTo(sub);

    }
}
