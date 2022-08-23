public class Main {
    public static void main(String[] args) {
        Cat catn = new Cat();
        Cat catz = new Cat("Sharik");
        Cat caty = new Cat(catz);
        System.out.println(Cat.catsAmount);

        caty.scannerCat();
        caty.printCat();
    }
}
