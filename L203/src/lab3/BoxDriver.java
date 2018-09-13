/* Name: zhshuorong 
	Lab Section: L2 
	Lecture Section:03
	Date:06/09/2018
	Assignment:Lab3
	Description:Part_2
	*/
package lab3;

public class BoxDriver {
	 public static void main( String[] args )
	 {
		 Box box1 = new Box( ); // this references the no-arg constructor
		 Box box2 = new Box( 20., 30., 40., "green" );
		 Box box3 = new Box(); // Instantiate an object of type Box and name it box3. Set the dimensions
		// to be height = 18, width = 36, depth = 18. The color is blue.
		 box3.setcolour("blue");
		 box3.setheight(18);
		 box3.setwidth(36);
		 box3.setdepth(18);
		 Box box4 = new Box(box3);// Instantiate an object of type Box using the copy constructor. Name the object
		 box4.setcolour("red");// Change the box color for box4 to red:
		 box1.setwidth(24);// Change the width dimension of box1 to 24. :
		 // Display the surface area of each box and label your output by box color.
		 System.out.println(box1.getcolour()+"area is" + "\n" + box1.boxarea());
		 System.out.println(box2.getcolour()+ "area is" + "\n" + box2.boxarea());
		 System.out.println(box3.getcolour()+ "area is" + "\n" + box3.boxarea());
		 System.out.println(box4.getcolour()+ "area is" + "\n" + box4.boxarea());
		 System.out.println("the all 4 box area is " +
		 box1.boxarea()+box2.boxarea()+box3.boxarea()+box4.boxarea()); // Display the total surface area of all the combined boxes:
		// Display the volume of each individual box and label the box by color:
		 System.out.println(box1.getcolour()+"volume is" + "\n" + box1.boxvolume());
		 System.out.println(box2.getcolour()+"volume is" + "\n" + box2.boxvolume());
		 System.out.println(box3.getcolour()+"volume is" + "\n" + box3.boxvolume());
		 System.out.println(box4.getcolour()+"volume is" + "\n" + box4.boxvolume());
		// Display the total storage volume of all the combined boxes:
		 System.out.println("the all 4 box bolume is " +
				 box1.boxvolume()+box2.boxvolume()+box3.boxvolume()+box4.boxvolume());
		 box1.setcolour("yellow");
		 box1.setheight(15);// Change the color of box1 to yellow and change its height to 15.
		// Use the Box toString method to show the state of each object.
		 System.out.println(box1.toString());
		 System.out.println(box2.toString());
		 System.out.println(box3.toString());
		 System.out.println(box4.toString());
	 }

}
