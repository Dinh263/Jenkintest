import java.util.Arrays;

public class Calculator {
    public static void main(String[] args){
        System.out.println("=========start testing=========== ");
        String[] str = {"hello", "the","world"};
        Arrays.stream(str).forEach(i->{
            System.out.println(i);
        });

        System.out.println("=========done testing=========== ");
    }


}
