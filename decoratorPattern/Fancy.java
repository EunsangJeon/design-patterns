public class Fancy extends TextViewDeco {
    public Fancy(Element element) {
        this.element = element;
    }

    @Override
    public String render() {
        return element.render() + " + Fancy";
    }
}
