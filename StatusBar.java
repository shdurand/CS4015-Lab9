import java.util.ArrayList;
import java.util.List;

public class StatusBar implements StockObserver {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.attach(this);
    }

    public void show() {
        System.out.println("Status Bar:");
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void update(){ show(); }
}
