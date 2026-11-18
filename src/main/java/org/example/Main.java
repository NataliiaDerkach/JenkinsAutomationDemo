package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String str = "abcbad";

        List<Character> dup = new ArrayList<>();
        boolean flag = false;

        for (char c : str.toCharArray()) {
            if (dup.contains(c)) {
                System.out.println(c);
                flag = true;
                break;
            }
            dup.add(c);
        }
        if (!flag) {
            System.out.println("No duplicates found!");
        }
    }
}
