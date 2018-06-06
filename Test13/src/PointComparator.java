import java.awt.Point;
import java.util.Comparator;

public class PointComparator implements Comparator<Point>{

	public int compare(Point p1, Point p2){
		int dx = p1.x - p2.x;
		int dy = p1.y - p2.y;
		
		if(dx==0){
			return dy;
			
		}else{
			return dx;
		}

	}

}
