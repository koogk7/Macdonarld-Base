package net.class101.server1;

import java.util.ArrayList;
import java.util.Map;

public class Macdonald {
    private Kiosk kiosk;
    private Inishor inishor;
    private Assembler assembler;

    public Macdonald() {
        String[] products = {"불고기"};
        this.kiosk = new Kiosk(products, "주) 남양");
        //Todo 다른것들 초기화 필요함
    }

    public String order(Client client, String buger, int amount){
        this.kiosk.takenOrder(client, buger);
        String bakedBread = this.inishor.dropBread(buger);
        return this.assembler.completeBurger(bakedBread, buger);
    }
}
