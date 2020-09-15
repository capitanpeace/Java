package homework_6;

public abstract class Animal {
    int Max_Run = 0;
    int Max_Swim= 0;
    float Max_Jump=0;

    abstract void run(int length);
    abstract void swim(int length);
    abstract void jump(float height);

}
