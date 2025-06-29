package com.cognizant.junit_setup;

public class MathUtils {
    
    // Addition method
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Comparison method
    public static boolean isGreater(int a, int b) {
        return a > b;
    }
    
    // Null return method
    public static Object returnNull() {
        return null;
    }
    
    // Object creation method
    public static Object createObject() {
        return new Object();
    }
    
    // Main method for direct execution
    public static void main(String[] args) {
        System.out.println("MathUtils Execution Demo:");
        System.out.println("2 + 3 = " + add(2, 3));
        System.out.println("Is 5 > 3? " + isGreater(5, 3));
        System.out.println("Return null: " + returnNull());
        System.out.println("Create object: " + createObject());
    }
}