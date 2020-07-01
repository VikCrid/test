public class test {
    public static void main (String [] args){
        int [] a = {1,0,5};
        int b = 3;
        try{
            for(int c:a){
                b=b/c;
            }
        }catch(ArithmeticException e){
            System.out.println(e);
        }

    }
}
