// Use a for loop to print the even numbers between 1 and 50,
// including the first even number, and the number 50. Print each number on a new line.



public class ForLoopEvenNumberNovTenth {
    public static void main(String[] arg){
        for (int x=0; x<50; x++){
            if(x%2==0)
                System.out.println("Even numbers are \t"+x);
        }
    }
}
