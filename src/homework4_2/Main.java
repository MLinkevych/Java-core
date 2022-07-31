package homework4_2;

public class Main {
    public static void main(String[] args) {
        Bird [] bird = new Bird[4];
        bird[0] = new Eagle("Black", "Lays big eggs");
        bird[1] = new Swallow("Grey", "Lays small eggs");
        bird[2] = new Kiwi("Brown", "Lays medium eggs");
        bird[3] = new Penguin("Black and white", "Lays big eggs");
        for (int i = 0; i < 4; i++) {
            System.out.println(bird[i]);
        }

    }
}
