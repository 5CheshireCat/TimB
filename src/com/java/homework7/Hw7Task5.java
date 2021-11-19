package com.java.homework7;

import java.io.*;
import java.util.*;

class Hw7Task5 {

    public static boolean is_find(String s, String w){
        int p = 0;
        while((p = s.indexOf(w, p)) != -1){
            if((p == 0 || !Character.isLetter(s.charAt(p - 1))) &&
                    (p + w.length() >= s.length() || !Character.isLetter(s.charAt(p + w.length()))))
                return true;
            p += w.length();
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader _in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите предложение: ");
        String s = _in.readLine();
        System.out.print("Введите нужное слово: ");
        String w = _in.readLine().trim().toLowerCase();

        String[] arr = s.split("[.?!]+");
        for(int i = 0; i < arr.length; ++i){
            if(is_find(arr[i].toLowerCase(), w))
                System.out.println(arr[i].trim());
        }
    }
}