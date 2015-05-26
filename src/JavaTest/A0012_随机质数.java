package JavaTest;

public class A0012_������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int random = (int)((Math.random())*100+1);
		boolean test = isPrime(random);
		System.out.println(random+" is "+test);

	}

	public static boolean isPrime(long n) {
		if (n <= 3) {
			return n > 1;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

}
