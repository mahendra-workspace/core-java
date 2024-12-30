package Java8;

import java.util.Optional;

public class OptionalClass {
    
    public static void main(String[] args) {
        
        // creating otpional with non-null value
        Optional<String> optinalValue  = Optional.of("Hello java 8");
        System.out.println(optinalValue.get());

        //creating optional with null value
        Optional<String> nullValue = Optional.ofNullable(null);

        optinalValue.ifPresent(value-> System.out.println("Value is Pressent"));

        String defaultValue = nullValue.orElse("Default Value");
        System.out.println(defaultValue);

        String fetchValue = nullValue.orElseGet(()-> "Fetched value");
        System.out.println(fetchValue);

        try{
            nullValue.orElseThrow(()-> new IllegalArgumentException("Value Not Found"));

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
