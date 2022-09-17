package main;

import cinema.Menu;
import cinema.Sala;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(new Sala(1,10,10,"rodando","morbius"));
        System.out.printf("%d", menu.inputInt());
        menu.fazMenu();
        boolean done = false;
        menu.fazMenu();
        do{
            menu.escolha();
        }while (!done);
    }
}
