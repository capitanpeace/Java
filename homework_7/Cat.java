package homework_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety=false;

    }
    @Override
    public String toString() {
        return "CAT: " + name + " | APPETITE: " + appetite + "| Satiety: " + satiety;
    }

    public void eat(Plate p) {
        if (p.getFood()>=appetite) {
            p.decreaseFood(appetite);
            satiety=true;
        }
    }


}