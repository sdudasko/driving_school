package common;

import java.util.Random;

public class RepairPriceService {
    public int getPrice() {
        Random rand = new Random();
        return rand.nextInt((20000 - 500) + 1) + 500;
    }
}
