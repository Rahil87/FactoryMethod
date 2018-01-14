package factory;

public class Main {

	public static void main(String[] args) {
		  Factory factory = new StudentCreator();
	       Factory factory1 = new TeacherCreator();
	      Product product=factory.getData();
	      Product product1=factory1.getData();
	      product.showData();
	      product1.showData();

	}

}
