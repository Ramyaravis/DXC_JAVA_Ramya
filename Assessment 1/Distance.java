package Problem_point;

public class Distance {
	
		public static void main(String[] args) {

			Point Origin = new Point(0, 0);

			Point p1 = new Point(2, 3);

			double distance = Origin.getDistance(p1);

			System.out.println("the Distance from Origin to P1 is:"+distance);
		}

	}


