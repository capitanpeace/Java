package homework_7;

public class Main
{

    public static void main(String[] args)
    {
    Cat[] cats= new Cat[3];
    cats[0]=new Cat("Barsik",10);
    cats[1]=new Cat("Mosya",5);
    cats[2]=new Cat("Fisk",20);
    Plate plate = new Plate(100);
    for(Cat c: cats){
    	System.out.println(c);}
		System.out.println("\n" + plate);
		System.out.println("***********************************************");
		System.out.println("increase food by 20");
		plate.increaseFood(20);
		System.out.println(plate);
		System.out.println("***********************************************");
		System.out.println("Cats take food:");
		for(int i=0;i<cats.length;i++){
			cats[i].eat(plate);
			System.out.println(cats[i]);
			plate.info();
		}

	}
}



