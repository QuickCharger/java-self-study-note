package category;

public class BookInfo {
    public int id;
    public String name;
    public int price;
    public String author;
    public String startTime;

    public BookInfo(int id, String name, int price, String author, String startTime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
        this.startTime = startTime;
    }

    public String toString() {
        return this.id + "\t\t" + this.name + "\t\t" + this.price + "\t\t" + this.author + "\t\t" + this.startTime;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
}
