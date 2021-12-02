import java.util.ArrayList;

public class Supermarket {

    private int id;
    private String label;
    private int openingHourStart;
    private int getOpeningHourEnd;
    private ArrayList<Article> articles;
    private Food foodOfTheWeek;

    public Supermarket(int id, String label, int openingHourStart, int getOpeningHourEnd) {
        this.id = id;
        this.label = label;
        this.openingHourStart = openingHourStart;
        this.getOpeningHourEnd = getOpeningHourEnd;
        articles=new ArrayList<>();
    }

    public void addArticle(Article article) {
        articles.add(article);
    }

    public Article getArticleById(int id) {
        for(int i=0;i<articles.size();i++) {
            Article a=articles.get(i);
            if(a.getId()==id) {
                return a;
            }
        }
        return null;
    }

    public double getStockValueNet() {
        double sum=0;
        for(Article a: articles) {
            sum+=a.getPrice()*a.getStock();
        }
        return sum;
    }

    public Article getMostExpensiveArticleGross() {
        Article mea=articles.get(0);
        for(Article a: articles) {
            if(a.getPrice()+a.getPrice()*a.getTax()/100>mea.getPrice()+mea.getPrice()*mea.getTax()/100){
                mea=a;
            }
        }
        return mea;
    }

    @Override
    public String toString() {
        String uschi = "Supermarkt:\n";
        for (Article a : articles) {
            uschi += a.getLabel() + ": " + a.getPrice() +"\n";
        }
        return uschi;
    }
}
