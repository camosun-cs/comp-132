package lab7;

/**
 * An immutable two-dimensional point.
 * 
 * @author mterpstra
 */
public class Point {
    /**
     * Point at the origin (0,0) of the coordinate system.
     */
    public static final Point ORIGIN = new Point(0, 0);

    /**
     * This Point's x-coordinate
     */
    public final double X;
    /**
     * This Point's y-coordinate
     */
    public final double Y;
    
    /**
     * Create a new Point given its horizontal and vertical-axis coordinates.
     * 
     * @param x the horizontal (x) distance from the ORIGIN
     * @param y the vertical (y) distance from the ORIGIN
     */
    public Point(double x, double y) {
        X = x;
        Y = y;
    }
    
    /**
     * Calculate the straight-line distance from this Point to the given
     * location.
     * 
     * @param otherX x-coordinate to measure towards
     * @param otherY y-coordinate to measure towards
     * @return distance from (this.X, this.Y) to (otherX, otherY)
     */
    public double distanceFrom(double otherX, double otherY) {
        return Math.sqrt(
            Math.pow((this.X - otherX), 2)
            + Math.pow((this.Y - otherY), 2)
        );
    }
    
    /**
     * Calculate the straight-line distance from this Point to the given
     * location.
     * 
     * @param otherPt the location to measure the distance towards
     * @return distance from (this.X, this.Y) to (otherPt.X, otherPt.Y)
     */
    public double distanceFrom(Point otherPt) {
        return distanceFrom(otherPt.X, otherPt.Y);
    }
    
    // note: no JavaDoc needed; it is inherited from the definition in Object!
    @Override
    public String toString() {
        return "Point [" + X + ", " + Y + "]";
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
