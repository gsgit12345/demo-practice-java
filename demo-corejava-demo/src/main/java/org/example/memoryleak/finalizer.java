package org.example.memoryleak;

public class finalizer {
    @Override
    protected void finalize() throws Throwable {
        while (true) {
            Thread.yield();
        }
    }

    public static void main(String str[]) {
        while (true) {
            for (int i = 0; i < 100000; i++) {
                finalizer force = new finalizer();
            }
        }
    }
}
