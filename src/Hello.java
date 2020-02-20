import java.util.stream.IntStream;

public class Hello {
    public static void main(String[] args){
        System.out.println("=========start testing===========");
        System.out.println("**********only get the odd number************");
        IntStream.range(1,100).forEach(x->{
            if(x%2==0){
                System.out.println(x);
            }
        });
        System.out.println("**********only get the number can divide for 5 ************");
        IntStream.range(1,50).forEach(x->{
            if(x%5==0){
                System.out.println(x);
            }
        });
        System.out.println("=========done testing===========");
    }
}
