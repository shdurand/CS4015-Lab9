import java.util.ArrayList;
import java.util.List;

public class Stock implements StockPublisher {
    private String symbol;
    private float price;
    private List<StockObserver> observers;

    public Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void attach(StockObserver observer){
        this.observers.add(observer);
    }

    @Override
    public void detach(StockObserver observer){
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for(var observer : observers){
            observer.update();
        }
    }
}
