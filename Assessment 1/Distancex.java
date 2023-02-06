package Problem_point;


	class Point {

		private double x;
		private double y;

		Point(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public double getX() {
			return x;
		}

		public double getY() {
			return y;
		}

		
		public double getDistance(Point p) {

			return Math.sqrt((this.getX() - p.getX()) * (this.getX() - p.getX())
					+ (this.getY() - p.getY()) * (this.getY() - p.getY()));
		}

	}

	public class Distancex {

		public static void main(String[] args) {

			Point p1 = new Point(2, 3);

			Point p2 = new Point(5, 6);

			double distance = p1.getDistance(p2);

			System.out.println("the Distance from p1 to p2 is:"+distance);
		}

	}
	
