package Uyga_vazifa;

public class futbol_01 {
    public static void main(String[] args) {
        futbol gol = new futbol();
        gol.setLiga("Super Liga");
        gol.setClub("Xorazm");
        gol.setAge(1989);

        System.out.println("Futbol ligasi: " + gol.getLiga());
        System.out.println("Futbol clubi: " + gol.getClub());
        System.out.println("Club tashkil topgan yil: " + gol.getAge());
    }
}
