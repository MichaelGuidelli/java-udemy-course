public class Rectangle {

    double baseOfRectangle;
    double heightOfRectangle;
    double widthOfRectangle;
    double lengthOfRectangle;

    public double AreaOfRectangle() {
        return baseOfRectangle * heightOfRectangle;
    }

    public double perimeterOfRectangle() {
        return 2 * (lengthOfRectangle + widthOfRectangle);
    }

}
