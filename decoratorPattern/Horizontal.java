public class Horizontal extends TextViewDeco {
    public Horizontal(Element element) {
        this.element = element;
    }

    @Override
    public String render() {
        return element.render() + " + Horizontal";
    }
}
