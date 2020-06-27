package net.class101.server1;

import java.util.Map;

public class Assembler {
    Map<String,String> assemRecipe;

    public Assembler(Map<String ,String>assemRecipe) {
        this.assemRecipe = assemRecipe;
    }


    public String completeBurger(String burger,String bread){
        String completeBurger = this.assemBurger(burger, bread);
        return this.wrapBurger(completeBurger);
    }

    private String wrapBurger(String completeBuger){
        return "{" + completeBuger + "}";
    }

    private String assemBurger(String burger,String bread){
        String buger = this.assemRecipe.get(burger);
        String completeBuger = buger + bread;
        // 햄버거는 로직....
        return  completeBuger;
    }
}
