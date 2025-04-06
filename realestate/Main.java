public class Main {
    public static void main(String[] args) {
        System.out.println("== Гость просматривает объект ==");
        Image image1 = new ProxyImage("house1.jpg");
        image1.displayThumbnail();
        image1.displayFullImage();

        System.out.println("\n== Агент загружает изображение ==");
        AuthProxyImage agentImage = new AuthProxyImage("house2.jpg", true);
        agentImage.uploadOrReplaceImage();

        System.out.println("\n== Гость пытается загрузить изображение ==");
        AuthProxyImage guestImage = new AuthProxyImage("house3.jpg", false);
        guestImage.uploadOrReplaceImage();
    }
}
