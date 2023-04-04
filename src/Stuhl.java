public class Stuhl {
    int anzahlBeine;            //die Felder
    float hoehe;
    boolean lehne;
    int anzahlSchrauben;
    Stuhl(){                    // das sind die Konstruktoren
        anzahlBeine=4;
        hoehe=3.5F;
        lehne=true;
    }
    /*
    Stuhl(int beine){           // (alles was in den Klammern ist = Argumente)
        anzahlBeine=beine;
        hoehe=3.5F;
        lehne=true;
    } */
    Stuhl(int schrauben){
        hoehe=3.5F;
        lehne=true;
        anzahlSchrauben=schrauben;
    }
        float getHoehe() {
        return hoehe;
    }
     /*   int getBeine(){
        return anzahlBeine;
    }
    */
           int getSchrauben() {
               return anzahlSchrauben;
           }
    void verstelleHoehe(float unterschied){
        hoehe+=unterschied;
    }
    void setzHoehe (float neuHoehe){
        if ((neuHoehe >=1 && neuHoehe <=5) || neuHoehe == 8)  {
            hoehe=neuHoehe;
            System.out.println("Die Hoehe ist "+hoehe);
        } else {
            System.out.println("Die Hoehe ist falsch");
        }
    }

}
