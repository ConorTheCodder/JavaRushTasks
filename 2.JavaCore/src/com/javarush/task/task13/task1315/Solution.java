package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }
    class Cat implements Movable, Eat, Edible {
        @Override
        public void eat() {

        }

        @Override
        public void beEaten() {

        }

        @Override
        public void move() {

        }
    }
    class Mouse implements Movable, Edible {
        @Override
        public void beEaten() {

        }

        @Override
        public void move() {

        }
    }

    class Dog implements Movable, Eat {
        @Override
        public void eat() {

        }

        @Override
        public void move() {

        }
    }
}