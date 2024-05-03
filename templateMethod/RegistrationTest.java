package templateMethod;

public class RegistrationTest extends AutomatedTest {
    @Override
    void prepareTest() {
        System.out.println("Preparing registration test...");

    }

    @Override
    void executeTest() {
        System.out.println("Executing registration test...");
    }

    @Override
    void cleanUp() {
        System.out.println("Cleaning up after registration test...");
    }
}
