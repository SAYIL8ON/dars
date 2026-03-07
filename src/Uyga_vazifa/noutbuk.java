package Uyga_vazifa;

public class noutbuk {
    public static void main(String[] args) {
        laptop win = new laptop();
        win.setBrand("lenova");
        win.setRam("8GB");
        win.setPrice("350💸");

        System.out.println("Noutbuk modeli: " + win.getBrand());
        System.out.println("Noutbuk rami: " + win.getRam());
        System.out.println("Noutbuk narxi: " + win.getPrice());
    }
}
