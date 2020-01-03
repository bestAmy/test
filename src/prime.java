public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean m=true;
		int count=0;
		for(int i = 2; ;i++){
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					m=false;
					break;
				}
				else{
					m=true;
				}
			}
			if(m==true){
				System.out.print(i+" ");
				count++;
				if(count%10==0){
					System.out.println();
				}
			}
			else if(count==50){
				break;
			}
		}
	}

}
