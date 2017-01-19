
public class stirling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<=10;i++){
			for (int j=0; j<=10;j++){
				int c=StirlingNum(i,j);
		System.out.println("["+i+","+j+"]="+c);
			}
		}
	}
public static int StirlingNum(int n, int m){
	if(n==0&& m==0){
		return 1;
	}
	if(n==0){
		return 0;
	}
	if(m==0){
		return 0;
	}
	return StirlingNum(n-1,m-1)+(n-1)*StirlingNum(n-1,m);
}
}

