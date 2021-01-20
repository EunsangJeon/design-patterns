public class Plain extends TextViewDeco {
    public Plain(Element element) {
        this.element = element;
    }

    @Override
    public String render() {
        return element.render() + " + Plain";
    }
}
