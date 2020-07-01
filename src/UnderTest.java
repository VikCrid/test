public class UnderTest {
    String forPrint = "";

    public UnderTest() {
    }

    public UnderTest(String forPrint) {
        this.forPrint = forPrint;
    }
    public void toPrint(){
        System.out.println(forPrint);
    }
}
