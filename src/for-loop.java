public class HelloWorld {
	public static void main(String[] args) {
		int i,j;
		for (i=0;i<100;i++)
			for(j=0;j<10;j++)
					System.out.printf("%d-%d=%d,%d+%d=%d\n",i,j,minus(i,j),i,j,add(i,j));

	}
	
	static public int minus(int x,int y){
		return (x-y);
	}
	
	static public int add(int x,int y){
		return (x+y);
	}
}
