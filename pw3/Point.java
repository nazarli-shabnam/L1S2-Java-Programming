package pw3;
public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float distance() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public float distance(Point point) {
        float dx = this.x - point.x;
        float dy = this.y - point.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    public void translate(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }

    public static Point barycenter(Point[] points) {
        if (points == null || points.length == 0) {
            return null;
        }

        float sumX = 0;
        float sumY = 0;
        
        for (Point p : points) {
            sumX += p.x;
            sumY += p.y;
        }
        
        return new Point(sumX / points.length, sumY / points.length);
    }
}

 class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public float length() {
        return p1.distance(p2);  
    }
}