public class UnderTest {
    String forPrint = "";

    public UnderTest() {
    }

    public UnderTest(String forPrint) {
        this.forPrint = forPrint;
    }
    public void toPrint(String forPrint){
        System.out.println(forPrint);
    }
    public int toCalc(int a, int b){
        return a+b;
    }
}
