import java.util.HashMap;

public abstract class Tree {
    //Array
    HashMap<String, String> roots;

//method getName and getSurname
    public abstract String getName();

    protected abstract String getSurname();
//setter
// Setter
public void setRoot(HashMap<String,String> roots) {
    this.roots = roots;
}

    //method getRoot

    public HashMap<String, String> getRoot() {
        return roots;
    }

}


