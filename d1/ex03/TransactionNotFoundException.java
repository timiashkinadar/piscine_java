package d1.ex03;

public class TransactionNotFoundException extends RuntimeException{
    public TransactionNotFoundException(String s){
        super(s);
    }
}
