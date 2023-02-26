package com.company.menu;

import com.company.menu.*;

public class DemoAppl {
    public static void main(String[] args) {
        InputOutput inputOutput = new ConsoleInputOutput();

        ExitItem exitItem = new ExitItem(inputOutput);

        Item pelmeni = new Item(inputOutput) {
            @Override
            public String displayedName() {
                return "пельмени";
            }

            @Override
            public void perform() {
                this.inputOutput.displayLine("тесто");
                this.inputOutput.displayLine("мясо");
            }
        };

        Item syrniki = new Item(inputOutput) {
            @Override
            public  String displayedName() {
                return "сырники";
            }

            @Override
            public void perform() {
                this.inputOutput.displayLine("творог");
                this.inputOutput.displayLine("сметана");
            }
        };

        Item backItem = new Item(inputOutput) {
            @Override
            public  String displayedName() {
                return "назад";
            }

            @Override
            public void perform() {
            }

            @Override
            public boolean isExit() {
                return true;
            }
        };

        Item mainMenu = new Item(inputOutput) {

            @Override
            public  String displayedName() {
                return "Главное меню";
            }

            @Override
            public void perform() {
                Item[] items = {pelmeni, syrniki, backItem};

                Menu menu = new Menu(inputOutput, items);

                menu.runMenu();
            }
        };

        Item greenTea = new Item(inputOutput) {
            @Override
            public  String displayedName() {
                return "Зеленый чай";
            }

            @Override
            public void perform() {
                this.inputOutput.displayLine("Классический зеленый чай 200мл");
            }
        };
        Item tea = new Item(inputOutput) {
            @Override
            public  String displayedName() {
                return "Черный чай";
            }

            @Override
            public void perform() {
                this.inputOutput.displayLine("Классический черный чай 200мл");
            }
        };


        Item beverages = new Item(inputOutput) {
            @Override
            public  String displayedName() {
                return "Напитки";
            }

            @Override
            public void perform() {
                Item[] items = {greenTea, tea, backItem};

                Menu menu = new Menu(inputOutput, items);

                menu.runMenu();
            }
        };

        Item[] items = {mainMenu, beverages};

        Menu menu = new MenuWithExit(inputOutput, items);

        menu.runMenu();








    }

}
