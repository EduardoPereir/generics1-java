package application;

import services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintService<Integer> list = new PrintService<>();
        System.out.print("How many values? ");
        int n = sc.nextInt();

        for ( int i = 1; i <= n; i ++){
            int v1 = sc.nextInt();
            list.addValue(v1);
        }

        list.print();
        System.out.println("\nFirst: " + list.first());

        sc.close();
    }
}
