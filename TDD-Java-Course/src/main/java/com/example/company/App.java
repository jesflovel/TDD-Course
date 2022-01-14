package com.example.company;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App 
{
    public static void main( String[] args )
    {

    }
 /*
    public static List<String> fizzBuzz(int size) {

        if(size < 0 || size > 20){
            throw new IllegalArgumentException("No puede ser menor a cero o mayor de 20");
        }

        List<String> result = new ArrayList<>();
        int i;
        for (i = 1; i <= size; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                result.add("FizzBuzz");
            else if (i % 3 == 0)
                result.add("Fizz");
            else if (i % 5 == 0)
                result.add("Buzz");
            else
                result.add(i + "");
        }
        return result; */

    //Refactorizado:

    public static List<String> fizzBuzz(int size) {

        if(size < 0 || size > 20){
            throw new IllegalArgumentException("No puede ser menor a cero o mayor de 20");
        }

        return IntStream.rangeClosed(1, size)
                .mapToObj(i -> i % 5 == 0 ? (i % 3 == 0 ? "FizzBuzz" : "Buzz") : (i % 3 == 0 ? "Fizz" : i+""))
                .collect(Collectors.toList());
    }
  }

