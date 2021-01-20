public class Vertical extends TextViewDeco {
    public Vertical (Element element) {
        this.element = element;
    }

    @Override
    public String render() {
        return element.render() + " + Vertical";
    }
}
