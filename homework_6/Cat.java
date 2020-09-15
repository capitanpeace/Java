package homework_6;

public class Cat extends Animal {
    int Max_Run=200;

    float Max_Jump=2.0f;
    @Override
    void run(int length){
        if ((length >= 0) && (length <= Max_Run)) System.out.println("run: true");
        else System.out.println("run: false");

    }
    @Override
    void swim(int length){
        System.out.println("swim: false");
    }
    @Override
    void jump(float height){
        if ((height >= 0) && (height <= Max_Jump)) System.out.println("jump: true");
        else System.out.println("jump: false");
    }
}
