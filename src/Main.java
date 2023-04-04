public class Main {
    public static void main(String[] args) {
        Stuhl erster = new Stuhl(5);
        erster.setzHoehe(7f);
        float x= erster.getHoehe();
        //System.out.println("Anzahl beine: " + erster.getBeine());
        System.out.println("Anzahl Schrauben: " + erster.getSchrauben());
    }
}