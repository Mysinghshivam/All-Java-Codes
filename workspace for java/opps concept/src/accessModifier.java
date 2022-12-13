class account{
    public String name;
    protected String email;
    private String password;
    public void setpassword(String pass){
        this.password = pass;
    }
    public String getpassword(){
        return this.password;
    }
}
public class accessModifier {
    public static void main(String[] args) {
        account account1 = new account();
        account1.name = "shivam";
        account1.email = "mysinghshivam@gamil.com";
        account1.setpassword("abcd");
        System.out.println(account1.getpassword());

    }
}
