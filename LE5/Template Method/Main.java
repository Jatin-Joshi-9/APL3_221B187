public class Main
{
	public static void main(String[] args) {
		Beverage b=new Whisky();
		System.out.println("************************Recipe for Whisky********************");
		b.templateMethod(50);
		b=new Beer();
		System.out.println("\n\n************************Recipe for Beer********************");
		b.templateMethod(200);

	}
	
}