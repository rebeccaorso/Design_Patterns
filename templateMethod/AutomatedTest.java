package templateMethod;

public abstract class AutomatedTest {
    public void runTest() {
        prepareTest();
        executeTest();
        cleanUp();
    }
    abstract void prepareTest();
    abstract void executeTest();
    abstract void cleanUp();
}
