package com.javarush.task.task17.task1711;

import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case ("-c"):
                synchronized (allPeople) {
                    if ((args.length - 1) % 3 == 0) {
                        for (int i = 1; i < args.length; i = i + 3) {
                            String name = args[i];
                            String sex = args[i + 1];
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                            Date birthday = simpleDateFormat.parse(args[i + 2]);
                            Person person = sex.equals("м") ? Person.createMale(name, birthday) : Person.createFemale(name, birthday);
                            allPeople.add(person);
                            System.out.print(allPeople.indexOf(person) + " ");
                        }
                    }
                    break;
                }

            case ("-u"):
                synchronized (allPeople) {
                    if ((args.length - 1) % 4 == 0) {
                        for (int i = 1; i < args.length; i = i + 4) {
                            int index = Integer.parseInt(args[i]);
                            Person person = allPeople.get(index);
                            person.setName(args[i + 1]);
                            person.setSex(args[i + 2].equals("м") ? Sex.MALE : Sex.FEMALE);
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                            Date birthday = simpleDateFormat.parse(args[i + 3]);
                            person.setBirthDate(birthday);
                        }
                    }
                    break;
                }

            case ("-d"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int index = Integer.parseInt(args[i]);
                        Person person = allPeople.get(index);
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                    }
                    break;
                }

            case ("-i"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int index = Integer.parseInt(args[i]);
                        Person person = allPeople.get(index);
                        String name = person.getName();
                        String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        String birthday = simpleDateFormat.format(person.getBirthDate());
                        System.out.println(name + " " + sex + " " + birthday);
                    }
                    break;
                }
        }
    }
}

