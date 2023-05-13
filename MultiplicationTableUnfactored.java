package firstJavaProject;

public class MultiplicationTableUnfactored {
	void print () {
		for(int i=1; i<=10; i++);
		int i = 1;
				System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
	}
	void print (int table) {
		for (int i=1; i<=10; i++);
		System.out.printf("%d * %d = %d", table, i, table *i).println();
	}
	void print (int table,int to, int from) {
		for (int i=from; i<=to; i++ );
		System.out.printf("%d * %d = %d", table, i, table * i).println();
	}
}
	