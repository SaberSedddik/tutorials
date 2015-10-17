package tutorial;

/**
 * Created by saberseddik on 2015-10-16.
 */
public class StringConcatenator {
    public String concatenate(String... values){
        StringBuilder sb =new StringBuilder();
        for (String value:values){
            sb.append(value);
        }
        return sb.toString();
    }
}
