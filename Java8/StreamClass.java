package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClass {
    
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1,2,5,4,8,69,36,45,75);

        //filter number and collect as a list
        List<Integer> evenNumbers = numbers.stream().filter(n -> n%2==0).collect(Collectors.toList());

        List<Integer> oddNumbers = numbers.stream().filter(n -> n%2==1).collect(Collectors.toList());

        System.out.println("Even Numbers"+evenNumbers);

        System.out.println("Odd Numbers"+ oddNumbers);


    }
}
