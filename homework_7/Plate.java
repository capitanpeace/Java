package homework_7;

public class Plate {
    private int food;
    public Plate(int food)

    {
        this.food = food;
    }
    public void decreaseFood(int n)
    {
        if(food>n)
        food -= n;

    }
    int getFood(){
        return food;

    }
    @Override
    public String toString()
    {
        return "PLATE: " + food;
    }

    public void info()
    {
        System.out.println("plate: " + food);
    }
    void increaseFood(int b){
        food += b;

    }

}
