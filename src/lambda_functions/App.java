package lambda_functions;

public class App {
    public static void main(String[] args) {
        Human tom = new Human();
        tom.walk();

        Robot qaz = new Robot();
        qaz.walk();

        walker(tom);

        walker(new Walkable() {
            @Override
            public void walk() {
                System.out.println("Custom object walking...");
            }
        });

        walker(() -> {
            System.out.println("Another object who are able to walk...");
            System.out.println("And another object who are able to walk...");
        });  //labda expression


        Walkable aBlockOfCode = () -> {
            System.out.println("Another object who are able to walk...");
            System.out.println("And another object who are able to walk...");
        };  //labda expression
        walker(aBlockOfCode);

        // A lambda expression are blocks of code used to implement the method defined for a function interface

        aLambdaInterface variable1 = ()-> System.out.println("hello there");  //a lambda expression instead of sayHello method
        variable1.oneMethod();

        Calculate sumVariable = (a,b) -> a+b;
        System.out.println(sumVariable.compute(4,6));

        Calculate noneZeroDiv = (a,b) -> a/b;
        System.out.println(noneZeroDiv.compute(10,2));

        // Convert revert string function into a lambda expression
        myGenericInterface<String> reverser = (s) -> {
            String result = "";
            for (int i = s.length()-1; i >=0 ; i--) {
                result = result+s.charAt(i);
            }
            return result;
        };
        System.out.println(reverser.work("vehicle"));

        // Convert factorial function into a lambda expression
        FactorialWorker factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n ; i++) {
                result = result*i;
            }
            return result;
        };
        System.out.println(factorial.work(3));

    }

    public static void walker(Walkable walkableEntity){
        walkableEntity.walk();
    }

    public void sayHello(){
        System.out.println("hello there!");
    }
    public int sum(int arg1, int arg2){
        return arg1+arg2;
    }

    public int NoneZeroDivide(int arg1, int arg2){
        if(arg1 ==0){
            return 0;
        }
        return arg1/arg2;
    }
    public String reverse(String str){
        String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            result = result+str.charAt(i);
        }
        return result;
    }

    public int factorial(int num){
        int result = 1;
        for (int i = 1; i <=num ; i++) {
            result = result*i;
        }
        return result;
    }
}

interface Calculate{
    public int compute(int a, int b);
}

interface StringWorker{
    public String work(String s);
}

interface FactorialWorker{
    public int work(int n);
}


//This generic interface are able to use different data type, you don't need anymore a interface for any type of data
interface myGenericInterface<T>{
    public T work(T t);
}
