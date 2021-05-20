public class BmiService {
    public int calculate(float height, int mass) {
        float heightFloat = height / 100;
        int BodyMassIndex = (int) (mass / (heightFloat * heightFloat));
        return  BodyMassIndex;
    }
}