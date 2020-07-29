package Demo07;
@FunctionalInterface
public interface Lambda {
	public abstract int Sum(int a, int b);
}

/*
 * Lambda lambda = (int a, int b) -> { return a + b; }; //µÈĞ§ Lambda lambda = (a,
 * b) -> a + b; int sum = lambda.Sum(10,30); System.out.println(sum);
 */