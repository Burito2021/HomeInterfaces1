import java.util.HashMap;

public class AppleTree extends Tree {



    //getter
    public HashMap<String, String> getRoot() {

        return roots;
    }



    // Setter
    public void setRoot(HashMap<String,String> roots) {
        this.roots = roots;
    }

    //Constructor
    public AppleTree(HashMap<String,String> roots) {
        this.roots = roots;
    }


    //methods getName and getSurname override

    @Override
    public String getName() {
        return "Apple";
    }

    @Override
    protected String getSurname() {
        return "AppleSurname";
    }


}
