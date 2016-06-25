package spec

import org.concordion.api.extension.Extensions
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

/**
 * Created by tim on 2/07/15.
 */
@RunWith(ConcordionRunner.class)
@Extensions([SpecificationToggleExtension])
public class ExampleTest {

    public boolean isTrue() {
        return true;
    }

    public boolean throwException() throws Exception {
        throw new Exception();
    }

}