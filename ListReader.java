
package independentcopy.reader;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bsoule
 */
public class ListReader implements Reader{
    
     private List <String> ListArray = new ArrayList();

    @Override
    public String readln() {
        
        ListArray.add("Line one");
        ListArray.add("Line two");
            return ListArray.toString();
    }
}
