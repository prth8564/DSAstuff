class FibonacciUsingRecursion {
    public static void main(String[] args) {
        fib(5 , 0 ,1);
    }
    static void fib(int range , int f,int s){
        if(range == 0){
            return;
        }
        System.out.println(f+ " ");
        fib(--range,s,f+s);
    }
}
