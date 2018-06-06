import java.awt.Point;

public class PointComparatorExample {

	public static void main(String[] args) {
		Point[] points = {new Point(4,-2),
						new Point (3,9),
						new Point (-1,5),
						new Point (3,7)};
		};
		Arrays.sort(points, new PointComparator());
		for(Point p : points){
			System.out.println("(" + p.x +" , " + p.y + ")");
		}

	}


