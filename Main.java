public class Main {
    private static Validate_students main;

    public static final String[] validAccount = new String[] { "C0220H", "C0202H1", "______", "123456","C0320G" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String args[]) {
        main = new Validate_students();
        for (String clas : validAccount) {
            boolean isvalid = main.validate(clas);
            System.out.println("Account is " +clas +" is valid: "+ isvalid);
        }
        for (String clas : invalidAccount) {
            boolean isvalid = main.validate(clas);
            System.out.println("Account is " +clas +" is valid: "+ isvalid);
        }
    }
}
