import java.util.HashMap;

public class PeachTree extends Tree {
    HashMap<String, String> roots;


    //setter


    // Constructor
    public PeachTree(HashMap<String, String> roots) {
        this.roots = roots;
    }

    //getter

    @Override
    public HashMap<String, String> getRoot() {
        return roots;
    }

    @Override
    public String getName() {
        return "Peach";
    }

    @Override
    protected String getSurname() {
        return "PeachSurname";
    }
}
