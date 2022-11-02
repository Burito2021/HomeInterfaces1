import java.util.HashMap;

public class WalnutTree extends Tree{


    //getter
    public HashMap<String, String> getRoot() {

        return roots;
    }



    // Setter
    public void setRoot(HashMap<String,String> roots) {
        this.roots = roots;
    }

    //Constructor
    public WalnutTree(HashMap<String,String> roots) {
        this.roots = roots;
    }


    //methods getName and getSurname override

    @Override
    public String getName() {
        return "Walnut";
    }

    @Override
    protected String getSurname() {
        return "WalnutSurname";
    }

}
