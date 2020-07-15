package corejava;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static Singleton singleton = new Singleton( );

    public int i = 1;

    private Singleton() { }

    public static Singleton getInstance( ) {
        return singleton;
    }

    public Object readResolve() {
        return getInstance( );
    }

    public static void main(String[] args) {
        Singleton s1 = getInstance();
        System.out.println(s1.hashCode());

        Singleton s2 = getInstance();
        System.out.println(s2.hashCode());
    }
}
