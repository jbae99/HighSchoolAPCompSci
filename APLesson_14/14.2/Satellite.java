import java.util.ArrayList;
public class Satellite
{
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));


       double[] home = {0, 0};


       String printout = "\n\n" +
               "==========================" + "\nStarting locations...";


       for (Location l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }


       printout += "\n\n" + "==========================" +
                   "\nDistance from home...";


       for (Location l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }
	   
	   String movement = "\n\n" + 
				"==========================";
				
		double x;
		double y;
				
		for (Location l : locate)
		{
			x = (Math.random() * 99 + 1);
			y = (Math.random() * 99 + 1);
			
			l.move(x,y);
			movement += String.format("%nAfter %d Moved (%.2f, %.2f)%nNew Location: (%s)", l.getID(), x, y, getLocation(l.getLoc()));
		}
		
		movement += "\nDistance from home...";
		
		for (Location l : locate)
		{
			movement += String.format("%nDistance for %d: %.2f", l.getID(), getDistance(l.getLoc(), home));
		}


       System.out.println(printout);
	   System.out.println(movement);
   }


   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return String.format("%4.4s, %4.4s",loc[0], loc[1]);
   }
}
