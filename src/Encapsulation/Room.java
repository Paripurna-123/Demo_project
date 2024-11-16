package Encapsulation;

public class Room 
{
	private String tv;
	private String fan;
	private String table;
	private String chair;
	private String switchbox;
	private String light;
	private String door;
 public static void main(String[] args) {
	tv t=new tv();
	t.setWeight(200);
	System.out.println(t.getWeight());
}
}
