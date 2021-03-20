package Lab3;

public class BooksTestDrive {
    public static void main(String[] args) {
        
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0].Title = "Плоды Ява";
        myBooks[1].Title = "Ява Гетсби";
        myBooks[2].Title = "Сборник рецептов
                                            По ява";
    

        myBooks[0].Author = "БоБ";
        myBooks[1].Author = "Сью";
        myBooks[2].Author = "Ян";

        while (x<3) {
            System.out.println(myBooks[x].Title);
            System.out.println(", Автор");
            System.out.println(myBooks[x].Author);
            x+=1;
        }
    }

}

class Books {
    String Title;
    String Author;
}
