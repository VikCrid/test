public class test {
    public static void main (String [] args){
        int [] a = {1,3,5};
        int b = 3;
            for(int c:a){
                b=b/c;
            }
            UnderTest test = new UnderTest();
            test.toPrint("for testing");
            int c = test.toCalc(4,5);
            test.toPrint("calc "+c);
    }
}
