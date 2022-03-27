import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("a");
        c.add("b");
        c.add("c");

        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
