package com.PBOALZIDAN;

import com.terminal.Console;

class playerhiierarki {
    private  String name;

    playerHierarki(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void show(){
        Console.log("Menggunakan Console");
        Console.log("Player name : " + this.name);
    }
}