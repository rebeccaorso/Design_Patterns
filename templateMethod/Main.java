package templateMethod;

public class Main {
    public static void main(String[] args) {
    AutomatedTest loginTest = new LoginTest();
        loginTest.runTest();

        System.out.println();

    AutomatedTest registrationTest = new RegistrationTest();
        registrationTest.runTest();
}

}
