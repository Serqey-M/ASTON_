package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
            String[] array  = {"Представьте", "себе", "ячейки", "в", "камере", "хранения", "Каждая", "имеет", "свой", "номер", "и", "в", "каждой", "хранится", "какой", "объект", "Багаж",
                    "Или", "винная", "карта", "в", "которой", "все", "виды", "вина", "пронумерованы", "и", "когда", "вы", "делаете", "заказ", "вам", "достаточно", "назвать", "номер",
                    "напитка", "Или", "список", "студентов", "группы", "в", "котором", "в", "первой", "ячейке", "будет", "записан", "студент", "Андреев", "а", "в", "последней", "Яковлев",
                    "Или", "список", "пассажиров", "самолёта", "за", "каждым", "из", "которых", "закреплено", "место", "с", "определённым", "номером", "В", "Java", "чтобы", "работать", "с",
                    "подобными", "структурами", "то", "есть", "множеством", "однородных", "данных", "часто", "используют",
                    "массивы", "в", "Java"};

            Set<String> words = new HashSet<>();
            Collections.addAll(words, array);
            System.out.println("1.1 Список уникальных слов");
            System.out.println(words);
            HashMap<String, Integer> hm = new HashMap<>();
            for (String array1 : array) {
                if (hm.containsKey(array1)) {
                    hm.replace(array1, hm.get(array1) + 1);
                } else {
                    hm.put(array1, 1);
                }
            }
            System.out.println();
            System.out.println("1.2 Подсчет сколько раз встречается каждое слово");
            System.out.println(hm);
            System.out.println();

            TelephoneDirectory td1 = new TelephoneDirectory();
            td1.addPhone("Иванов", "11111111");
            td1.addPhone("Иванов", "22222222");
            td1.addPhone("Петров", "33333333");
            td1.addPhone("Сидоров", "44444444");
            td1.getPhone("Иванов");
            td1.getPhone("Петров");
            td1.getPhone("Сидоров");
            System.out.println(td1.telephoneDirectory);
        }
    }
