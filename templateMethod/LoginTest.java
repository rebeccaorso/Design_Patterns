package templateMethod;

public class LoginTest extends AutomatedTest {
    @Override
    void prepareTest() {
        System.out.println("Preparing login test...");
    }

    @Override
    void executeTest() {
        System.out.println("Executing login test...");
    }

    @Override
    void cleanUp() {
        System.out.println("Cleaning up after login test...");
    }
}
