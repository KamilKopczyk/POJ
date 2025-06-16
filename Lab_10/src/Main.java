import Tasks.Run;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        Run run = new Run();
        run.RunMain();






    }
}

//zad 1
//Scanner input = new Scanner(System.in);
//        System.out.println("Podaj tekst: ");
//String text = input.nextLine();
//
//text = text.toLowerCase().replaceAll("[.,!?;:]", "");
//String[] words = text.split("\\s++");
//
//Map<String,Integer> wordMap = new HashMap<>();
//
//        for(String word: words){
//
//        wordMap.put(word, wordMap.getOrDefault(word,0) + 1);
//
//        }
//        System.out.println("Lista wystąpień słów: \n");
//
//        for(Map.Entry<String, Integer> entry: wordMap.entrySet()){
//        System.out.println(entry.getKey() + ": " + entry.getValue());
//        }


// dzialania na plikach
//String fileName = "test.txt";
//Map<String, Integer> wordMap = new HashMap<>();
//
//        try{
//Scanner fielscanner = new Scanner(new File(fileName));
//StringBuilder sb = new StringBuilder();
//
//            while (fielscanner.hasNextLine()){
//
//        sb.append(fielscanner.nextLine()).append(" ");
//
//            }
//
//                    fielscanner.close();
//
//String text = sb.toString().toLowerCase().replaceAll("[.,!?;:]", "");
//String[] words = text.split("\\s++");
//
//            for (String word : words) {
//        if(!word.isEmpty())
//        wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
//
//        }
//        System.out.println("Lista wystąpień słów: \n");
//            for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
//        System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//
//
//
//        }
//        catch (FileNotFoundException e){
//        System.out.println("Nie można znaleźć pliku: " + fileName);
//        }