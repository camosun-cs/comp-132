package lab7;

/**
 * Defines an equiangular and equilateral (regular) closed planar figure
 * constructed of line segments (polygon).
 * 
 * Cannot be used to represent figures with fewer than 3 sides (aka.
 * "degenerate" polygons).
 * 
 * @author mterpstra
 */
public class RegularPolygon {
    // number of sides / points in this shape; never lower than 3
    private int sides;
    // distance from the centre to any outer point
    private double radius;
    /**
     * Center coordinates of this polygon
     */
    public Point center;
    
    /**
     * Constructs a regular triangle centered on the origin with a radius of 1.
     */
    public RegularPolygon() {
        this(3, 1, Point.ORIGIN);
    }
    
    /**
     * Constructs a polygon with the given number of sides, centered on the
     * origin, with a radius of 1.
     * 
     * If an invalid number of sides is given, the constructed polygon will
     * be a triangle.
     * 
     * @param n number of sides
     */
    public RegularPolygon(int n) {
        this(n, 1, Point.ORIGIN);
    }
    
    /**
     * Constructs a polygon with the given number of sides and radius, centered
     * on the origin.
     * 
     * If an invalid number of sides is given, the constructed polygon will
     * be a triangle.
     * 
     * If a radius of 0 or less is given, a value of 1.0 will be used instead.
     * 
     * @param n number of sides
     * @param r distance from the origin to any one of the outer points
     */
    public RegularPolygon(int n, double r) {
        this(n, r, Point.ORIGIN);
    }
    
    /**
     * Constructs a polygon with the given number of sides, radius, and center.
     * 
     * If an invalid number of sides is given, the constructed polygon will
     * be a triangle.
     * 
     * If a radius of 0 or less is given, a value of 1.0 will be used instead.
     * 
     * @param n number of sides
     * @param r distance from the center to any one of the outer points
     * @param c center coordinates
     */
    public RegularPolygon(int n, double r, Point c) {
        if (n >= 3) sides = n;
         else sides = 3;
        if (r > 0) radius = r;
         else radius = 1.0;
        center = c;
    }

    /**
     * Get the number of sides (also points) in this polygon
     * 
     * @return number of sides
     */
    public int getSides() { return sides; }
    
    /**
     * Change the number of sides (or points) in this polygon.
     * 
     * Input values less than 3 will be ignored.
     * 
     * @param n number of sides
     */
    public void setSides(int n) {
        if (n >= 3) sides = n;
        // else, leave the number of sides unchanged
        // it would be better to throw an Exception here, but we haven't
        // learned about those yet!
    }
    
    /**
     * Get the size of this polygon, expressed using the circumradius (the
     * distance from its center to any one of its points).
     * 
     * @return radial size
     */
    public double getRadius() { return radius; }
    
    /**
     * Set the distance of any point in this polygon from its center (the
     * circumradius).
     * 
     * Input values 0 or less will be ignored.
     * 
     * @param r radial size
     */
    public void setRadius(double r) {
        if (r > 0) radius = r;
        // else, leave the radius unchanged
        // it would be better to throw an Exception here, but we haven't
        // learned about those yet!
    }
    
    /**
     * Get the size of this polygon, expressed as the length of a side or the
     * distance between two neighboring points.
     * 
     * @return length of one edge
     */
    public double getSideLength() {
        return (2 * radius * Math.sin(Math.PI / sides));
    }
    
    /**
     * Set the length of one side of the polygon.
     * 
     * Input values of 0 or less will be ignored.
     * 
     * @param len length of one edge
     */
    public void setSideLength(double len) {
        if (len <= 0) return;
        radius = len / (2 * Math.sin(Math.PI / sides));
    }
    
    /**
     * Calculate the coordinates of each corner of the polygon.
     * 
     * Returns a new array on every invocation.
     * 
     * @return array of corner Point's in counter-clockwise order
     */
    public Point[] getPoints() {
        Point[] answer = new Point[sides];
        double innerAngle = 2 * Math.PI / sides;
        for (int i = 0; i < sides; i++) {
            answer[i] = new Point(
                Math.cos(innerAngle * i) + center.X,
                Math.sin(innerAngle * i) + center.Y
            );
        }
        return answer;
    }
    
    @Override
    public String toString() {
        return String.format(
            "RegularPolygon: %s with radius %.2f centered at (%.2f, %.2f)",
            polyName(this.sides),
            this.radius,
            this.center.X,
            this.center.Y
        );
    }
    
    /**
     * Return the standard English name for a regular polygon with the given
     * number of sides.
     * 
     * Returns "not a polygon" for input values less than 3.
     * 
     * @param n number of sides
     * @return 
     */
    public static String polyName(int n) {
        if (n < 3) return "not a polygon";
        switch (n) {
            case 3: return "triangle";
            case 4: return "square";
            case 5: return "pentagon";
            case 6: return "hexagon";
            case 7: return "septagon";
            case 8: return "octagon";
            case 9: return "nonagon";
            case 10: return "decagon";
            case 11: return "hendecagon";
            case 12: return "dodecagon";
            case 13: return "tridecagon";
            case 14: return "tetradecagon";
            case 15: return "pendedecagon";
            case 16: return "hexdecagon";
            case 17: return "heptdecagon";
            case 18: return "octdecagon";
            case 19: return "enneadecagon";
            case 20: return "icosagon";
            default: return (n + "-gon");
        } 
    }
    
    /**
     * Ad-hoc unit tests for this class
     * 
     * @param args ignored
     */
    public static void main(String[] args) {
        // TODO
    }
    
}
