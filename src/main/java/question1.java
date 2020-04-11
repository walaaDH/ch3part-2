
public class question1 {
    
    interface acceptService{
        void accept(int value);
    }
    public static void main(String[] args) {
      acceptService accService = (int value)-> {System.out.printf("%d ", value);};
    }
}
