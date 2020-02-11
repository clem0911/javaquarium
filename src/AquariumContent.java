public class AquariumContent {
    public static Algea create(int value) {
        Algea algea = new Algea();
        algea.value = value;
        return algea;
    }

    public static Fishes create(String name, Boolean sexe) {
        Fishes f = new Fishes();
        f.name_ = name;
        f.sexe_ = sexe;
        return f;
    }

    public void display() {
        display();
    }
}
