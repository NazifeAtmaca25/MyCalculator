package org.example.app;

public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public double divide(double a,double b){
        if (b==0){
            throw new IllegalArgumentException("Divide by zero error");
        }
        return a/b;
    }
}
