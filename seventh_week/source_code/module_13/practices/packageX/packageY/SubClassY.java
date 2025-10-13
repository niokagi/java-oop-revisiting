package packageX.packageY;
// error expected ~ for analytical needs
// import packageX.SuperclassX;

public class SubclassY extends SuperclassX {
    SuperclassX objX = new SubclassY();
    SubclassY objY = new SubclassY();

    void subclassMethodY() {
        objY.superclassMethodX();
        int i;
        i = objY.superclassVarX;
    }
}
