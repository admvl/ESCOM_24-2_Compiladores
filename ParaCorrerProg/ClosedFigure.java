public class ClosedFigure extends Figure {
  protected double area;
  //other fields and methods
}

public class Polygon extends ClosedFigure {
  public void InsertVertex(Point p, int i) {
    // code to insert vertex at position i
    area = computeArea();
  }

  private double computeArea() {
    //code to compute the area
  }
}

