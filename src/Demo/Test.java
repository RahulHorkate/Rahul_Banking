package Demo;



public class Test {

	public static void main(String[] args) {
		// non static method call from same class
				Test k1= new Test();
				k1.method1();
				k1.method2();
				
				
			}
		public void method1() {
			System.out.println("Rahul Horkate");
		}
		public void method2() {
			System.out.println("Velocity");
		}
		}
