public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Frog( true, true, "Harrold", "green", 4, 17, false);
        animals[1] = new Parrot(true, true, "Aki", "colorful");
        animals[2] = new Pig(true,true,"Piglet", "pink",4);


        for (int i = 0; i < animals.length; i++) {
            animals[i].Voice();
        }
    }

}

