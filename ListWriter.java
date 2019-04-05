
package independentcopy.writer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bsoule
 */
public class ListWriter implements Writer {
    
    private List <String> ListArray = new ArrayList();

    @Override
    public void writeln(String line) {
        ListArray.add(line);
    }
    
}
