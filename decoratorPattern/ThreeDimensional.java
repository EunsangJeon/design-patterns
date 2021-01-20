public class ThreeDimensional extends TextViewDeco {
    public ThreeDimensional(Element element) {
        this.element = element;
    }

    @Override
    public String render() {
        return element.render() + " + 3D";
    }
}
