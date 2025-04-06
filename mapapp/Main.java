import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Marker> markers = new ArrayList<>();
        String[] types = {"gas", "restaurant", "hospital"};
        String[] colors = {"red", "green", "blue"};

        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            String type = types[random.nextInt(types.length)];
            String color = colors[random.nextInt(colors.length)];
            double x = random.nextDouble() * 100;
            double y = random.nextDouble() * 100;

            MarkerStyle style = MarkerStyleFactory.getStyle(type, color);
            markers.add(new Marker(x, y, style));
        }

        for (Marker marker : markers) {
            marker.render();
        }

        System.out.println("\nВсего маркеров: " + markers.size());
        System.out.println("Уникальных стилей: " + MarkerStyleFactory.getStyleCount());
    }
}
