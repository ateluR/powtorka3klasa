public  class Main {
    public static void main(String[] args) {
        System.out.println("cwel po lewej");

        uczen uczen = new uczen("Edek", "Fredek");
        System.out.println("Liczba uczniów"+ uczen.getLiczbaUczniow());
        System.out.println(uczen);
        uczen uczen2 = new uczen("Ela", "Mela");
        System.out.println("Liczba uczniów"+ uczen.getLiczbaUczniow());
        System.out.println(uczen2);
        uczen uczen3 = new uczen("Ala ", "Fala");
        System.out.println("Liczba uczniów"+ uczen.getLiczbaUczniow());
        System.out.println(uczen3);
    }
}