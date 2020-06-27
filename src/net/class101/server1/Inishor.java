package net.class101.server1;

import java.util.Map;

public class Inishor {
    Map<String, String> recipeMap;

    public Inishor(Map<String, String> recipeMap) {
        this.recipeMap = recipeMap;
    }

    public String dropBread(String burger){
        String bread = this.recipeMap.get(burger);
        // TODO 로직 필요
        String bakedBread = bread;
        return bakedBread;
    }
}
