import org.junit.Test;
import tutorial.StringConcatenator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by saberseddik on 2015-10-16.
 */
public class TestStringConcatenator {
    @Test
    public void testConcatenate(){
        assertThat( new StringConcatenator().concatenate("1","234","5"),equalTo("12345"));
    }
}
