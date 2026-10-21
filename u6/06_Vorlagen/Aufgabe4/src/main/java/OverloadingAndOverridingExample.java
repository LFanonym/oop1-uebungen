class Base {
    void copyTo(Object other) {
        // Method 1
    }

    void copyTo(Base other) {
        // Method 2   }
    }
}

class Sub extends Base {
    void copyTo(Base other) {
        // Method 3
    }

    void copyTo(Sub other) {
        // Method 4
    }
}

public class OverloadingAndOverridingExample {


    public static void main(String[] args) {
        Sub sub = new Sub();
        Base base = new Sub();
        Object obj = new Sub();
        var v = obj;

        // TODO
    }
}
