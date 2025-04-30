package pw3;
//this is for testing the Point.java as you asked

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        System.out.println("--- Testing Point Class ---");
        System.out.println("Point p1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Point p2: (" + p2.getX() + ", " + p2.getY() + ")");

        System.out.println("Distance from p1 to origin: " + p1.distance());

        System.out.println("Distance between p1 and p2: " + p1.distance(p2));

        p1.translate(2, 3);
        System.out.println("After translating p1 by (2, 3): (" + p1.getX() + ", " + p1.getY() + ")");

        Point[] points = { new Point(1, 1), new Point(2, 2), new Point(3, 3) };
        Point barycenter = Point.barycenter(points);
        System.out.println("Barycenter of points: (" + barycenter.getX() + ", " + barycenter.getY() + ")");

        Segment segment = new Segment(new Point(0, 0), new Point(3, 4));

        System.out.println("\n--- Testing Segment Class ---");
        System.out.println("Segment endpoints: (" + 
            segment.getP1().getX() + ", " + segment.getP1().getY() + ") and (" + 
            segment.getP2().getX() + ", " + segment.getP2().getY() + ")");

        System.out.println("Segment length: " + segment.length());

        segment.setP1(new Point(1, 1));
        segment.setP2(new Point(4, 5));
        System.out.println("Updated segment endpoints: (" + 
            segment.getP1().getX() + ", " + segment.getP1().getY() + ") and (" + 
            segment.getP2().getX() + ", " + segment.getP2().getY() + ")");
        System.out.println("Updated segment length: " + segment.length());
    }
}
