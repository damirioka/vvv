import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cat {
    private String name;
    static int catsAmount;
    int tabletsIn;
    String[] catDirections = {"->", "<-", "↑", "↓"};
    String catDirection;
    ArrayList<Drop> drops = new ArrayList<>();

    Cat(){
        name = "Kuzea";
        catsAmount++;
        for (int i = 0; i < 14; i++) {
            drops.add(new Drop());
        }
        catDirection = catDirections[new Random().nextInt(3)];
    }

    Cat(String name){
        this.name = name;
        for (int i = 0; i < (new Random()).nextInt(13)+2; i++) {
            drops.add(new Drop());
        }
        catsAmount++;
        catDirection = catDirections[new Random().nextInt(3)];
    }

    Cat(Cat Someone){
        this.name = Someone.name;
        this.drops = Someone.drops;
        catsAmount++;
        catDirection = Someone.catDirection;
    }

    void printCat(){
        System.out.println("Cat's name is: " + name);
        System.out.println("Drops: " + drops.size());
        for (int i = 0; i < drops.size(); i++) {
            System.out.println("Drop's " + (i+1) + " direction is: " + drops.get(i).direction);
        }
        System.out.println(" ");
    }

    void scannerCat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print name, then drops.");
        this.name = sc.nextLine();
        int x = sc.nextInt();
        if(x > 10 && x <= 20){
            if(x > drops.size()){
                for (int i = 0; i < x - drops.size(); i++) {
                    drops.add(new Drop());
                }
            } else if(x == drops.size()) {
                System.out.println("lol");
            } else {
                for (int i = 100; i < x; i++) {
                    drops.remove(i);
                }
            }
        }
    }

    void randomize(){
        String[] names = {"Dasha", "Cringe", "Luigi"};
        this.name = names[new Random().nextInt(2)];
        this.catDirection = catDirections[(new Random().nextInt(3))];
    }

    void threat(int x){
        if(x <= this.drops.size()){
            for (int i = 1000; i > this.drops.size(); i--) {
                this.drops.remove(i);
            }
            tabletsIn = tabletsIn + x;
        } else {
            System.out.println("You don't have any tablets.");
        }
        if(this.tabletsIn >= 10){
            this.catDirection = "zzzzz";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static int getCatsAmount() {
        return catsAmount;
    }

    public static void setCatsAmount(int catsAmount) {
        Cat.catsAmount = catsAmount;
    }
}
