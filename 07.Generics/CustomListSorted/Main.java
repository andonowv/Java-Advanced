package CustomListSorted;

import CustomList.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        CustomList<String> customList = new CustomList<String>();
        while (!command.equals("END")){
            String [] tokens = command.split("\\s+");
            String operation = tokens[0];
            switch (operation){
                case "Add":
                    String el = tokens[1];
                    customList.add(el);
                    break;
                case "Remove":
                    int elToRe = Integer.parseInt(tokens[1]);
                    customList.remove(elToRe);
                    break;
                case "Contains":
                    String contains = tokens [1];
                    System.out.println(customList.contains(contains));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(tokens[1]);
                    int secondIndex = Integer.parseInt(tokens[2]);
                    customList.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    String greater = tokens [1];
                    System.out.println(customList.countGreaterThan(greater));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    for (String token : customList) {
                        System.out.println(token);
                    }
                    break;

            }

            command = scanner.nextLine();
        }
    }
}

