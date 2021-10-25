package com.eacuamba.java_como_programar.chapter_7._7_14_using_args_of_command_line.using_command_line_args;

public class InitArray {

    public static void main(String[] args){
        if(args.length != 3){
            System.out.printf("Please re-enter the entire command, including%n"+"an array size, initial value, and increment.%n");
        }else {
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

//            for(int index = 0; index< array.length; index++){
//                array[index] = initialValue + index * increment;
//            }

            for(int index = 0; index< array.length; index++){
                if(array[0] == initialValue){
//                    array[index] = array[--index] + increment; //don't work because you're remove one in the index and then compare again in the loop condition, look, you have 1 in the index then when you execute --index you got 0 in the index variable again and then make an stack overflow, because the value never change, even when you in the for connstraint say index++, your a go around and around and you know, index =1, --index, then index = 0, then index++, we have again one inside index.
                    array[index] = array[index-1] + increment;
                }else
                    array[0] = initialValue;
            }


            System.out.printf("%10s:%10s%n", "Index", "Value");

            int counter = 0;
            for (int value: array)
                System.out.printf("%10d:%10d%n", counter++, value);



        }

    }
}
