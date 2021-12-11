package com.basics;

public class CountSpaces {
    public static void main(String[] args) {
        String input = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        new CountSpaces().countDistinctCharacters(input);
    }

    public void countDistinctCharacters(String input) {
        int noOfSpaces =0;
        int noOfAlphabets =0;
        int noOfNumerics =0;
        int noOfSymbols =0;
for (char c : input.toCharArray()) {
    if(Character.isAlphabetic(c))
        noOfAlphabets++;
    else if(Character.isDigit(c))
        noOfNumerics++;
    else if(c==' ')
        noOfSpaces++;
    else
        noOfSymbols++;
}
System.out.println("noOfSpaces: "+noOfSpaces+"\nnoOfAlphabets: "+noOfAlphabets+"\nnoOfNumerics: "+noOfNumerics+"\nnnoOfSymbols: "+noOfSymbols);
    }
}
