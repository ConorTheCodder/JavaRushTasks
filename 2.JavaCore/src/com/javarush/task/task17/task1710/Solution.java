package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        if (args[0].equals("-c") && args.length == 4) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = simpleDateFormat.parse(args[3]);
            if (args[2].equals("м")) {
                allPeople.add(Person.createMale(args[1], date));
                System.out.println(allPeople.size() - 1);
            }
            if (args[2].equals("ж")) {
                allPeople.add(Person.createFemale(args[1], date));
                System.out.println(allPeople.size() - 1);
            }

        }

        if (args[0].equals("-r")) {
            if (Integer.parseInt(args[1]) >= 0 && Integer.parseInt(args[1]) < allPeople.size()) {

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                Date birthDate = allPeople.get(Integer.parseInt(args[1])).getBirthDate();
                simpleDateFormat.format(birthDate);
                String sex = allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE) ? "м" : "ж";
                System.out.println(allPeople.get(Integer.parseInt(args[1])).getName() + " " + sex + " "
                        + simpleDateFormat.format(birthDate));

            }
        }
        if (args[0].equals("-u")) {
            if (Integer.parseInt(args[1]) >= 0 && Integer.parseInt(args[1]) < allPeople.size()) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                Person person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(args[2]);
                person.setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
                person.setBirthDate(simpleDateFormat.parse(args[4]));

            }
        }
        if (args[0].equals("-d")) {
            if (Integer.parseInt(args[1]) >= 0 && Integer.parseInt(args[1]) < allPeople.size()) {
                Person person = allPeople.get(Integer.parseInt(args[1]));
                if (!(person.getName() == null) && !(person.getSex() == null) && !(person.getBirthDate() == null)) {
                    person.setName(null);
                    person.setSex(null);
                    person.setBirthDate(null);
                }
            }
        }
    }
}

