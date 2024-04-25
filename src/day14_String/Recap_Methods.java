package day14_String;

public class Recap_Methods { public static void main(String[]args){

    String s= "pen";//s is a String declared by LITERALS and stored in STRING POOL IN HEAP
    String s2=new String("pen");//s2 is a String object declared by'new' keyword, stored in HEAP.

    System.out.println("Compare with ==" +    (s==s2));//compares the MEMORY LOCATION. That is why is false

    System.out.println("Compare with .equals(): \t"+ s.equals(s2 )); //.equals compares the value. sin they are same the result is TRUE

    System.out.println("Compare with .equals(): \t"+ s.equals("Pen"));//This is false because of the Uppercase // pen vs Pen---> false
    System.out.println("Compare with .equals(): \t"+ s.equalsIgnoreCase("Pen" ));// pen vs Pen ---> true, because ignore the case sensitiveness

    boolean isSame=s.equalsIgnoreCase("PEN");
    if(isSame){
        System.out.println("By ignoring the case sensitiveness the result is true");} else {
        System.out.println("Even ignoring the case sensitiveness, the result is false");}


    System.out.println("---------------------");
    if(!isSame){
        System.out.println("By ignoring the case sensitiveness the result is true");} else {
        System.out.println("Even ignoring the case sensitiveness, the result is false");}

    System.out.println(s.length());
    int a=9;
    int num= (a+"").length();
    //a.length(); //doesnot work because .lenght method belongs to String class.

    System.out.println(a);
    System.out.println((a+"").length());//1 when i want to know number of characters
    System.out.println(a+"");//this one is converted into the String// 9 + "" --> "9"


if (num %2==0){
    System.out.println("length of num is even number");}else {
    System.out.println("length of num is odd number");}
String word= "loopcamp";
if (word.length()%2==0){
    System.out.println("length of number is even");} else {
    System.out.println("length of number is odd");}







}
}
