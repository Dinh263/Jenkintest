import java.util.stream.IntStream;

public class Hello {
    public static void main(String[] args){
        System.out.println("=========start testing===========");
        IntStream.range(1,100).forEach(x->System.out.println(x));
        System.out.println("=========done testing===========");
    }
}
