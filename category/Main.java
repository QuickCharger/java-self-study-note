package category;

import java.util.*;

import category.BookInfo;
import category.Category;

public class Main{
    public static Map<Category, List<BookInfo>> categoryMap = new HashMap<Category, List<BookInfo>>();

    public static void printDeptmentInfo(){
        for(Category cate : categoryMap.keySet()) {
            System.out.println("category: " + cate.getName());
            List<BookInfo> books = categoryMap.get(cate);
            System.out.println("图书编号\t\t图书名称\t\t图书价格\t\t图书作者\t\t出版时间");
            for(int i = 0; i < books.size(); ++i) {
                BookInfo b = books.get(i);
                System.out.println(b.getId() + "\t\t" + b.getName() + "\t\t" + b.getPrice() + "\t\t" + b.getAuthor() + "\t\t" + b.getStartTime());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Category category1 = new Category(1, "数据库");
        Category category2 = new Category(2, "程序设计");
        Category category3 = new Category(3, "平面设计");

        BookInfo book1 = new BookInfo(1, "sick java", 25, "author1", "2012-01-01");
        BookInfo book2 = new BookInfo(2, "影视", 78, "author2", "2012-01-02");
        BookInfo book3 = new BookInfo(3, "MySQL", 41, "author2", "2012-01-03");
        BookInfo book4 = new BookInfo(4, "sick java 2", 27, "author3", "2012-01-04");
        BookInfo book5 = new BookInfo(5, "SQL Server", 68, "author1", "2012-01-05");

        List<BookInfo> pList1 = new ArrayList<BookInfo>();
        pList1.add(book1);
        pList1.add(book4);

        List<BookInfo> pList2 = new ArrayList<BookInfo>();
        pList2.add(book3);
        pList2.add(book5);

        List<BookInfo> pList3 = new ArrayList<BookInfo>();
        pList3.add(book2);

        Main.categoryMap.put(category1, pList1);
        Main.categoryMap.put(category2, pList2);
        Main.categoryMap.put(category3, pList3);
        Main.printDeptmentInfo();
    }
}
