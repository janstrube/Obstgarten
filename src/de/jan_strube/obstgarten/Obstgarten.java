package de.jan_strube.obstgarten;

import java.util.Random;

public class Obstgarten {

    public static void main(String[] args) {

        int rabeGewonnen = 0;
        int spielerGewonnen = 0;
        
        for (int i = 0; i < 10000 ; i++) {
            int aepfel = 10;
            int birnen = 10;
            int kirschen = 10;
            int pflaumen = 10;
            int rabe = 9;
            
            Random wuerfel = new Random();
        
            do {
                int wurf = wuerfel.nextInt(6) + 1;
                //System.out.println("Wurf: " + wurf);
                switch (wurf) {
                    case 1:
                        if (aepfel > 0)
                            aepfel--;
                        break;
                    case 2:
                        if (birnen > 0)
                            birnen--;
                        break;
                    case 3:
                        if (kirschen > 0)
                            kirschen--;
                        break;
                    case 4:
                        if (pflaumen > 0)
                            pflaumen--;
                        break;
                    case 5:
                        for (int j = 0; j < 2; j++) {
                            if (aepfel > 0)
                                aepfel--;
                            else if (birnen > 0)
                                birnen--;
                            else if (kirschen > 0)
                                kirschen--;
                            else if (pflaumen > 0)
                                pflaumen--;
                        }
                        break;
                    case 6:
                        rabe--;
                        break;
                }
            } while ((aepfel > 0 || birnen > 0 || kirschen > 0 || pflaumen > 0) && rabe > 0);
            
            if (rabe > 0) {
                System.out.println("Spieler gewinnt.");
                spielerGewonnen++;
            }
            else {
                System.out.println("Rabe gewinnt.");
                rabeGewonnen++;
            }
        }
        
        System.out.println("Rabe: " + rabeGewonnen + ", Spieler : " + spielerGewonnen);
    }

}
