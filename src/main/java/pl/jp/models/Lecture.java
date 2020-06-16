package pl.jp.models;

public class Lecture {

    private String name;

    private String[] slideNames;

    private int slideAmount;

    public Lecture() {

    }

    public Lecture(String name, String[] slideNames, int slideAmount) {
        this.name = name;
        this.slideNames = slideNames;
        this.slideAmount = slideAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSlideNames() {
        return slideNames;
    }

    public void setSlideNames(String[] slideNames) {
        this.slideNames = slideNames;
    }

    public int getSlideAmount() {
        return slideAmount;
    }

    public void setSlideAmount(int slideAmount) {
        this.slideAmount = slideAmount;
    }
}
