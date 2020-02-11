import java.util.ArrayList;

public class Aquarium {
    public void displayContent() {
        for (AquariumContent it : aquarium) {
            it.display();
        }
    }

    public void addContent(AquariumContent content) {
        aquarium.add(content);
    }

    private ArrayList<AquariumContent> aquarium = new ArrayList<>();
}
