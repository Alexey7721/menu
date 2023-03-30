package com.company.menu.items;

import com.company.menu.InputOutput;

public class ExitItem extends Item {
    private String exitMessage;
    private String displayedName;

    public ExitItem(InputOutput inputOutput, String exitMessage, String displayedName) {
        super(inputOutput);
        this.exitMessage = exitMessage;
        this.displayedName = displayedName;
    }

    public ExitItem(InputOutput inputOutput){
        this(inputOutput, "", "Exit");
    }

    public ExitItem(InputOutput inputOutput, String displayedName){
        this(inputOutput, "", displayedName);
    }

    @Override
    public  String displayedName() {
        return displayedName;
    }

    @Override
    public void perform() {
        System.out.println("назад");
        inputOutput.displayLine(exitMessage);
    }

    @Override
    public boolean isExit() {
        return true;
    }
}
