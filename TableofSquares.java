
public class TableofSquares {
	public static void main (String[] args) {
		tableOfSquares(2, 15);
	}

static void getSquare(int n) {
	for(int i=0; i < n || i==n; i++) {
		System.out.println("the square of " + i + " is " + i*i);
	}
}

static void tableOfSquares(int i, int n) {
	if(i < n || i == n) {
		System.out.println("The square of " + i + " is " + i*i);
		tableOfSquares(i+1,n);
	}else {
		return;
	}
  }
}