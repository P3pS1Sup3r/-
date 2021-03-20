package Lab3;

public class Hobbits {
    
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;

        while (z<2) {
            z+=1;
            h[z] = new Hobbits();
            h[z].name = "Бильбо";

            if (z==1) {
                h[z].name = "Федор";
            }

            if (z==2) {
                h[z].name = "Сеня";
            }

            System.out.println(h[z].name + " - ");
            System.out.println("Имя хорошего 
                                                хоббита");
        }
    }
}
