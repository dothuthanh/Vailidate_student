import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_students {
    private static Pattern pattern;
    private static final String VALIDTE_REGEX =  "^[CAP]\\d{4}[GHIKLM]$";
    public Validate_students(){
    }
    public boolean validate(String regex){
        pattern =  Pattern.compile(VALIDTE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return  matcher.matches();

    }
}
