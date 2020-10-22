import zunit.TestSuite;

public class TestClassWithStrings extends TestSuite {

    @Override
    public void testMethodList() {
        passingTest();
        failingTest();
    }

    public static void main(String[] args) {
        TestClassWithStrings testClass = new TestClassWithStrings();
        testClass.runTestSuite();
    }

    private void passingTest() {
        assertEquals("String1", "String1");
    }

    private void failingTest() {
        assertEquals("String1", "String2");
    }
}
