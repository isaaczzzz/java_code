import java.util.ArrayList;
import java.util.Scanner;

public class Goods {
    private String id;
    private String name;
    private int price;
    private String intro;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opt;
        int price;
        boolean flag;
        String id, name, intro;
        ArrayList<Goods> list = new ArrayList<>();

        System.out.println("-----商品管理系统-----");
        System.out.println("1.添加商品");
        System.out.println("2.查看商品");
        System.out.println("3.删除商品");
        System.out.println("0.退出");

        while (true) {
            System.out.println("请输入选择:");
            opt = in.nextInt();
            switch (opt) {
                case 1 -> {
                    System.out.println("输入商品编号:");
                    id = in.next();
                    System.out.println("输入商品名称:");
                    name = in.next();
                    System.out.println("输入商品价格:");
                    price = in.nextInt();
                    System.out.println("输入商品简介");
                    intro = in.next();
                    Goods newGoods = new Goods(id, name, price, intro);
                    flag = true;
                    for (Goods g : list)
                        if (g.getId().equals(id) || name.equals(g.getName())) {
                            System.out.println("商品已经存在");
                            flag = false;
                            break;
                        }
                    if (flag) {
                        list.add(newGoods);
                        System.out.println("添加成功!");
                    }
                }
                case 2 -> {
                    System.out.println("输入需要查找的商品编号:");
                    id = in.next();
                    flag = true;
                    for (Goods g : list)
                        if (g.getId().equals(id)) {
                            g.showInfo();
                            flag = false;
                            break;
                        }
                    if (flag)
                        System.out.println("商品信息未找到");
                }
                case 3 -> {
                    System.out.println("输入需要删除的商品编号:");
                    id = in.next();
                    flag = true;
                    for (Goods g : list)
                        if (g.getId().equals(id)) {
                            list.remove(g);
                            flag = false;
                            System.out.println("删除成功!");
                            break;
                        }
                    if (flag)
                        System.out.println("商品信息未找到");
                }
                case 0 -> System.exit(0);
                default -> System.out.println("编号输入错误，请重新输入!");
            }
        }
    }

    public Goods(String id, String name, int price, String intro) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.intro = intro;
    }

    public String getId() {
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
