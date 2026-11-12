public class App1 {
    static void main(){
    long result = factorial(5);
            System.out.println(result);
    }
    public static long factorial(int x){
        if (x <= 0 ){
            return 1;
        }
        else{
            return x * factorial(x-1);
        }

    }
    public static void reduceByOne(int n) {
   //     if (n == 0)
  //          System.out.print("Touch down");

  //      else if (n > 0) {
   //         reduceByOne(n - 1);
        if(n > 0){
            reduceByOne(n-1);
        }
    }
}
