public class HelloWorld{
	public static void main(String[] args){
		int i,j;
		for (i=0;i<100;i++)
			for(j=0;j<10;j++)
				if(i==j*j){
					System.out.printf("i=%d,j=%d\n",i,j);
				}
	}
}
