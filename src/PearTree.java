import java.util.HashMap;

public class PearTree extends Tree {

     public PearTree(HashMap<String,String> roots) {
         this.roots = roots;
    }


    @Override
    public HashMap<String, String> getRoot() {

        return roots;
    }
    @Override
    public String getName() {
        return "Pear";
    }

    @Override
    protected String getSurname() {
        return "Pear";
    }



}
