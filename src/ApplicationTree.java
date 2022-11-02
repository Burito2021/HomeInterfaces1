import java.util.HashMap;
import java.util.Map;

public class ApplicationTree {
    public static void main(String[] args) {
      /*HashMap<String, String> roots = new HashMap<>();
        roots.put("appleTree", "1");
        roots.put("pearTree", "2");*/

        HashMap<String, String> roots = new HashMap<>();


        roots.put("Apple", "Apple's tree roots");
        roots.put("Pear", "Pear's tree roots");
        roots.put("Walnut", "Walnut's tree roots");
        roots.put("Peach", "Peach's tree roots");
        Tree appleTree = new AppleTree(roots);
        cutRoots(appleTree);

        Tree pearTree = new PearTree(roots);
        cutRoots(pearTree);

        Tree walnutTree = new WalnutTree(roots);
        cutRoots(walnutTree);

        Tree peachTree = new PeachTree(roots);
        cutRoots(peachTree);

    }


    static public void cutRoots(Tree tree) {
        HashMap<String, String> x = tree.getRoot();
        for (String i : x.keySet()) {
            if (i.equals(tree.getName())) {
                System.out.println(x.get(i));
            }
        }


    }
}
