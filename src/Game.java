public class Game {
    String title;
    String gendre;
    private Double price;
    int copiesSold;

    public Game(String title, String gendre, Double price, int copiesSold) {
        this.title = title;
        this.gendre = gendre;
        this.price = price;
        this.copiesSold = copiesSold;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGendre() {
        return gendre;
    }

    public void setGendre(String gendre) {
        this.gendre = gendre;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", gendre='" + gendre + '\'' +
                ", price=" + price +
                ", copiesSold=" + copiesSold +
                '}';
    }

    public void Printing() {
        System.out.println("Game{" +
                "title='" + title + '\'' +
                ", gendre='" + gendre + '\'' +
                ", price=" + price +
                ", copiesSold=" + copiesSold +
                '}');
    }

    //        Streams ForEach method increment price



}

