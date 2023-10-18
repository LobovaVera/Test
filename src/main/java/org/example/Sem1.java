package org.example;

public class Sem1 {
    public static void main(String[] args) {
        System.out.println( summa(1, Integer.MAX_VALUE));
    }
    public static int summa(int a, int b){
        assert Integer.MAX_VALUE - Math.abs(a) >= Math.abs(b) : "Ошибка переполнения";
        return a + b;
    }
}
