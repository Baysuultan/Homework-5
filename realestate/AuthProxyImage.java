public class AuthProxyImage extends ProxyImage {
    private boolean isAgentLoggedIn;

    public AuthProxyImage(String filename, boolean isAgentLoggedIn) {
        super(filename);
        this.isAgentLoggedIn = isAgentLoggedIn;
    }

    public void uploadOrReplaceImage() {
        if (isAgentLoggedIn) {
            System.out.println("Изображение загружено или заменено.");
        } else {
            System.out.println("Ошибка: Только авторизованные агенты могут загружать изображения.");
        }
    }
}
