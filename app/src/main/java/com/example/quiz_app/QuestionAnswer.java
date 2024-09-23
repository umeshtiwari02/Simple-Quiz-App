package com.example.quiz_app;

public class QuestionAnswer {

    public static String[] question = {
            "Number of primitive data types in Java are ?",
            "What is the size of float and double in java?",
            "Automatic type conversion is possible in which of the possible cases?",
            "Select the valid statement.",
            "When an array is passed to a method, what does the method receive?",
            "Select the valid statement to declare and initialize an array",
            "Arrays in java are-",
            "When is the object created with new keyword?",
            "In which of the following is toString() method defined?",
            "compareTo() returns"
    };
    public static String[][] choices = {
            {"6", "7", "8", "9"},
            {"32 and 64" , "32 and 32" , "64 and 32" , "64 and 64"},
            {"Byte to int" , "Int to long" , "Long to int" , "Short to int"},
            {"char[] ch = new char(5)" , "char[] ch = new char[5]" , "char[] ch = new char()" , "char[] ch = new char[]"},
            {"The reference of the array" , "A copy of the array" , "Length of the array" , "Copy of first element"},
            {"int[] A = {}" , "int[] A = {1,2,3}" , "int[] A = (1,2,3)" , "int[][] A = {1,2,3}"},
            {"Object references", "objects", "Primitive data type", "None"},
            {"At run time", "At compile time", "Depends on the code", "None"},
            {"java.lang.Object", "java.lang.String", "java.lang.util", "None"},
            {"True", "False", "An int value", "None"}
    };
    public static String[] correctAnswers = {
            "8",
            "32 and 64" ,
            "Int to long",
            "char[] ch = new char[5]",
            "The reference of the array",
            "int[] A = {1,2,3}",
            "objects",
            "At run time",
            "java.lang.Object",
            "An int value"
    };
}