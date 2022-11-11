public class Main {
    public static void main(String[] args) {
        System.out.println("Goodbye, World!"); 
        System.out.println(multiply(2));
        stuff a = new stuff(7);
        System.out.println(a.getX());
        a.setX(0);
        System.out.println(a.getX());

        sophiaTest b = new sophiaTest();
        System.out.println(b.addition(69));
    }

        // f(x) = 2x

    public static int multiply(int x){
        return 2*x;
    }

}

class stuff{
    private int x;

    public stuff(int number){
        x = number;
    }

    public int getX(){
        return x;
    }

    public void setX(int number){
        x = number;
        return;
    }
}


class things{
    private int x;

    public things(int number){
        x = number;
    }
    
}

class something{
    private int w;

    public something(int x){
        w = x;
        
    }
    public int getW() {
        return w;
    }
}


class sophiaTest {
    private int s = 7;
    
    public int addition (int x) { // f(x)=x+7
        return x + 7;
    }

    public int moreAddition(int y){ // f(y)= s+y
        return s + y;
    }

    public sophiaTest(){
        
    }
    
}
