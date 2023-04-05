public interface StockPublisher{
    void attach(StockObserver observer);
    void detach(StockObserver observer);
    void notifyObservers();
}