package Uyga_vazifa;

public class mashina {
    public static void main(String[] args) {
        car m5 = new car();
        m5.setModel("     bmw m5    ");
        m5.setAge(2020);
        m5.setMaxspeed("250km/s");
        System.out.println("Mashina turi: " + m5.getModel());
        System.out.println("Mashina yili: " + m5.getAge());
        System.out.println("Mashina tezligi: " + m5.getMaxspeed());

    }
}
