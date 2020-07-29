package Demo09;

public class Man /*implements Person*/{

		interface hh{
			 void eat();
		}
		void run(hh h) {
			h.eat();
		}
		/*	@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("≥‘ ∫");
			}
		*/
		public static void main(String[] args) {
			hh aa = new hh() {
				
				@Override
				public void eat() {
					// TODO Auto-generated method stub
					System.out.println("ddd");
				}
			};
			
		}
}
