package com.company;

public class Table {
    private String name;

    Table (String name){
        this.name=name;
    }
    public void print()
    {
        System.out.print("    Table: " + this.name);
        System.out.println();
    }
}