package org.example.narendra.array.exception;

class Exception_4 {

    public static final void main(String[] args) {
        System.out.println(test());
    }
    private static boolean test() {
        boolean flag = false;
        try {
            return true;
        } catch (Exception e) {
        } finally {
        }
        System.out.println("Outside try-catch-finally");
        return flag;
    }
}