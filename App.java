package tp02_3;

public class App {
    public static void main(String[] args) {
        Ingénieur ingénieur = new Ingénieur("Amine","Fadssi","amin.fadssi@gmail.com",
                "0613022347",5000,"web developer");
        Manager manager = new Manager("Mustapha","Said","mustapha@gmail.com",
                "0655684304",7000,"IT");
        System.out.println(ingénieur);
        System.out.println(manager);
    }
}
