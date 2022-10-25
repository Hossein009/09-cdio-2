package dasuki;
import java.util.Random;

public class DiceCup {

    private int Faces;
    private int FaceValue;

    private int SumTerning;

    //DiceCup Her så definerer vi en terning, som har værdien 1 for hver side, og den har 6 sider.
    public DiceCup(int Faces, int FaceValue) {
        this.Faces = Faces;
        this.FaceValue = FaceValue;
    }

    //Den her metode er raflebæget, den gør således at FaceValue
    public int roll() {
        Random ran = new Random();
        setFaceValue(ran.nextInt((Faces) + 1));
        return FaceValue;
    }

    //Den her linje forneden sætter FaceValue til FaceValue
    public void setFaceValue(int FaceValue) {
        this.FaceValue = FaceValue;
    }
    //Den her linje retunerer facevalue
    public int getFaceValue() {
        return FaceValue;
    }

    //Vi returner variablen
    public int getFaces() {
        return faces;
    }
    //Vi sætter variablen
    public void setFaces(int faces) {
        this.faces = faces;
    }

}
