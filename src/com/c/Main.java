package com.c;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        float c;
        List<Float> c1 = new ArrayList<Float>();
        List<Float> c2 = new ArrayList<Float>();

        Scanner sc = new Scanner(new File("data/input.txt"));
        boolean select = false;

        while(sc.hasNextFloat()){
            c = sc.nextFloat();
            if (c < 0) {
                select = true;
                continue;
            }
            if (!select) {
                c1.add(c);
            } else {
                c2.add(c);
            }
        }
        sc.close();

        System.out.println("Неотсортированные списки:");
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);
        System.out.println("Отсортированные списки:");
        Collections.sort(c1);
        Collections.sort(c2);
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);

        System.out.println("Отсортированный упорядоченный список:");
        c1.addAll(c2);
        Collections.sort(c1);
        System.out.println("c:"+c1);
    }
}
