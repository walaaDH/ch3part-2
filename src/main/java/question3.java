
public class question3 {
    interface emptyService{
        void empty();
    }
    public static void main(String[] args) {
      emptyService eService =()->{System.out.print("welcome to lambda");};
    }
    
}
