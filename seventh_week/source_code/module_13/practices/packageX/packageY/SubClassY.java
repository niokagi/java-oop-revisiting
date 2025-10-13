package packageX.packageY;

public class SubClassY {
    SuperClassX objX = new SuperClassX();
    SubClassY objY = new SubClassY();

    void subclassMethodY() {
        objY.subclassMethodY();
        int i;
        i = objY.superClassVarX;
    }
}
