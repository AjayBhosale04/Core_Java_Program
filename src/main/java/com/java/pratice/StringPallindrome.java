package com.java.pratice;

public class StringPallindrome {
    public static void checkPallindrome(String str){
        boolean result=true;
        int length=str.length();
        for(int i=0;i<length/2;i++){
            if(str.charAt(i)!=str.charAt(length-i-1)){
                result=false;
                break;
            }
        }System.out.println(str+" is pallindrome "+result);
    }
    public static void main(String[] args) {
        checkPallindrome("abcba");
    }
}
