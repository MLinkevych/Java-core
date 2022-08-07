package homework4_2;

public class Main {
    public static void main(String[] args) {
        Bird [] bird = {
        new Eagle("Black", "Lays big eggs"),
        new Swallow("Grey", "Lays small eggs"),
        new Kiwi("Brown", "Lays medium eggs"),
        new Penguin("Black and white", "Lays big eggs"),
        };
            for (int i = 0; i < 4; i++) {
            System.out.println(bird[i]);
        }

    }
}
