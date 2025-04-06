public class Marker {
    private double x, y;
    private MarkerStyle style;

    public Marker(double x, double y, MarkerStyle style) {
        this.x = x;
        this.y = y;
        this.style = style;
    }

    public void render() {
        style.display(x, y);
    }
}
