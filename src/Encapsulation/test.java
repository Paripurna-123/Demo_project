package Encapsulation;

public class test extends door
{
    public static void main(String[] args)
    {
	test t=new test();
	t.setBrand("Tata");
	t.setColor("black");
	t.setModel(2024);
	t.setSize(20);
	tv tv=new tv();
	tv.setLength(15);
	tv.setWidth(10);
	tv.setWeight(25);
	System.out.println(t.getBrand());
	System.out.println(t.getColor());
	System.out.println(t.getModel());
	System.out.println(t.getSize()+"sm");
	System.out.println(tv.getLength()+"sm");
	System.out.println(tv.getWidth()+"sm");
	System.out.println(tv.getWeight()+"kg");
	}
}
