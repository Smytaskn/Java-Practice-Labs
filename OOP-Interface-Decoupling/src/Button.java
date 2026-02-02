public class Button {
    private String text;
    private Renderer renderer; // Çizim işini yapacak nesne

    public Button(String text, Renderer renderer) {
        this.text = text;
        this.renderer = renderer;
    }

    public void click() {
        // İş mantığı burada, çizim mantığı renderer'da
        renderer.render(text);
    }
}