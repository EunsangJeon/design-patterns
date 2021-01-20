public class Renderer {
    public static void main(String[] args) {
        Element textView = new TextView();
        textView = new ThreeDimensional(textView);
        textView = new Horizontal(textView);
        textView = new Vertical(textView);

        System.out.println(textView.render());
    }
}
