
import java.util.*;

	class RectangleIntersection
	{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);

			int bottomleftX = sc.nextInt();
			int bottomY = sc.nextInt();

			int width = sc.nextInt();
			int height = sc.nextInt();

			int topleftX = bottomleftX + width;
			int topY = bottomY + height;



			int bottomleftX1 = sc.nextInt();
			int bottomY1 = sc.nextInt();

			int width1 = sc.nextInt();
			int height1 = sc.nextInt();

			int topleftX1 = bottomleftX1 + width1;
			int topY1 = bottomY1 + height1; 


			 if   (  

			 	     (  topleftX  <  bottomleftX1  )
			 	                     || 
			 	     (  topleftX1 < bottomleftX  )
			 	                     ||
			 	     (  topY < bottomY1    )
			 	                     ||
                     (  topY1  <  bottomY )
                  )
			 {
			 	System.out.println("Not Intersecting");
			 }

			 else
			 {
			 	int Bleft = Math.max(bottomleftX, bottomleftX1);
			 	int Bright = Math.max(bottomY, bottomY1);
			 	int Tleft = Math.min(topleftX, topleftX1);
			 	int Tright = Math.min(topY, topY1);

			 	System.out.println(Bleft + " " + Bright);
			 	System.out.println((Tleft-Bleft) + " " + (Tright-Bright));


			 }
			
		}
	}

//    class Rectangle {

//     // coordinates of bottom left corner
//     private int leftX;
//     private int bottomY;

//     // dimensions
//     private int width;
//     private int height;

//     public Rectangle() {}

//     public Rectangle(int leftX, int bottomY, int width, int height) {
//         this.leftX = leftX;
//         this.bottomY = bottomY;
//         this.width  = width;
//         this.height = height;
//     }

//     public int getLeftX() {
//         return leftX;
//     }

//     public int getBottomY() {
//         return bottomY;
//     }

//     public int getWidth() {
//         return width;
//     }

//     public int getHeight() {
//         return height;
//     }
// }
