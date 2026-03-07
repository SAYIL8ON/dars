package Uyga_vazifa;

public class car {
    private String model;
    private int age;
    private String maxspeed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model.toUpperCase().trim();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }
}
