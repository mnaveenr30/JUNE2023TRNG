class B{
public static void main(){
System.out.println("Main Method Without Argument Called.");
main(30);
}
public static void main(String args[]){
System.out.println("Anil is Typing");
main();
main(20);
}
public static void main(int x){
System.out.println("Main Method With Argument Called"+x*2);
}
}