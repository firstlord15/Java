package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
            max = Math.max(max, arr[i].split("/").length);
        }

        ArrayList<String> arrayList = new ArrayList<>();
        String startDir = arr[0].split("/")[0];
        for (int i = 0; i < n; i++) {
            String[] line = arr[i].split("/");
            for (int j = 0; j < line.length; j++) {
                if (!arrayList.contains(line[j]+"="+j) && !(line[j]+"="+j).equals(startDir+"="+0)) {
                    arrayList.add(line[j]+"="+j);
                }
            }
        }

        arrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String word1 = s1.split("=")[0];
                String word2 = s2.split("=")[0];
                return word1.compareToIgnoreCase(word2);
            }
        });

        arrayList.add(0, startDir+"="+0);
        for (String element : arrayList) {
            String[] elements = element.split("=");
            System.out.println(" ".repeat(Integer.parseInt(elements[1])) + elements[0]);
        }
    }
}