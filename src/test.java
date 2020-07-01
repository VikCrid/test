public class test {
    public static void main (String [] args){
        int [] a = {1,3,5};
        int b = 3;
            for(int c:a){
                b=b/c;
            }
            UnderTest test = new UnderTest("for testing");
            test.toPrint();
    }
}
