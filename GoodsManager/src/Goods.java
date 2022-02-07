public class Goods {
    int id;
    String name;
    int price;
    String intro;

    public Goods(int id, String name, int price, String intro) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.intro = intro;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getPrice() {
        return this.price;
    }
    public String getIntro() {
        return this.intro;
    }
    public void showInfo() {
        System.out.println("编号:" + this.id);
        System.out.println("名称:" + this.name);
        System.out.println("价格:" + this.price);
        System.out.println("简介:" + this.intro);
    }
}