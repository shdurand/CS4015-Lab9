public class Demo{

    public static void main(String[] args){
        Stock s1 = new Stock("AAA", 1);
        Stock s2 = new Stock("BBB", 2);
        Stock s3 = new Stock("CCC", 3);

        StockListView listView = new StockListView();
        listView.addStock(s1);
        listView.addStock(s2);
        listView.addStock(s3);

        StatusBar bar = new StatusBar();
        bar.addStock(s2);
        bar.addStock(s3);

        listView.show();
        bar.show();

        System.out.println();
        s2.setPrice(3);

    }


}