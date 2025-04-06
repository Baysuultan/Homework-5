public class MarkerStyle {
    private String icon;
    private String color;

    public MarkerStyle(String icon, String color) {
        this.icon = icon;
        this.color = color;
    }

    public void display(double x, double y) {
        System.out.printf("Показать метку [%s, %s] на координатах (%.2f, %.2f)%n", icon, color, x, y);
    }
}
