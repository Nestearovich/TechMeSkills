package com.example.lib;
//анонимные классы
public class Anonim {

    static IRepositori iRepositori = new IRepositori() {//анонмный класс
        @Override
        public void login(String userName, String password) {
            System.out.println("hello");

        }
    };

    static Anonym anonym = new Anonym() {
        @Override
        void hackNetwork() {
            super.hackNetwork();
            System.out.println("child hack the world");
        }
    };

    public static void main(String[] args) {
        iRepositori.login("user name", "password");
        anonym.hackNetwork();
    }
}
    class Anonym {
    void hackNetwork() {
        System.out.println("i hacked the world");
    }
    }

