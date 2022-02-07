import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opt;
        int id, price;
        boolean flag;
        String name, intro;
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
                    id = in.nextInt();
                    System.out.println("输入商品名称:");
                    name = in.next();
                    System.out.println("输入商品价格:");
                    price = in.nextInt();
                    System.out.println("输入商品简介");
                    intro = in.next();
                    Goods newGoods = new Goods(id, name, price, intro);
                    flag = true;
                    for (Goods g : list)
                        if (g.getId() == id || name.equals(g.getName())) {
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
                    id = in.nextInt();
                    flag = true;
                    for (Goods g : list)
                        if (id == g.getId()) {
                            g.showInfo();
                            flag = false;
                            break;
                        }
                    if (flag)
                        System.out.println("商品信息未找到");
                }
                case 3 -> {
                    System.out.println("输入需要删除的商品编号:");
                    id = in.nextInt();
                    flag = true;
                    for (Goods g : list)
                        if (id == g.getId()) {
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
}
