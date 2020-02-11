public class main {
    public static void main(String[] argv) {
        Aquarium aquarium = new Aquarium();
        aquarium.addContent(AquariumContent.create("Boulie", true));
        aquarium.addContent(AquariumContent.create(255));
        aquarium.displayContent();
    }
}
