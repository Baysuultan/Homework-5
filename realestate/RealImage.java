public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadHighResImage();
    }

    private void loadHighResImage() {
        System.out.println("Загрузка полного изображения: " + filename);
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Показать миниатюру: " + filename);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Показать полное изображение: " + filename);
    }
}

