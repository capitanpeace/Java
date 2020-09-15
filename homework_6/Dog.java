package homework_6;

public class Dog extends Animal {
    int Max_Run=500;
    int Max_Swim=10;
    float Max_Jump=0.5f;
@Override
    void run(int length){
    if ((length >= 0) && (length <= Max_Run)) System.out.println("run: true");

    }
    @Override
    void swim(int length){
        if ((length >= 0) && (length <= Max_Swim)) System.out.println("swim: true");
        else System.out.println("swim: false");
    }
    @Override
    void jump(float height){
        if ((height >= 0) && (height <= Max_Jump)) System.out.println("jump: true");
        else System.out.println("jump: false");
    }
}
