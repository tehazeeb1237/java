class Sum2{
	public int addnum(int a,int b){
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args){
		int num1=25;
		int num2=15;
		Sum2 obj= new Sum2();
		int res=obj.addnum(num1,num2);
		System.out.println("Sum:"+res);
	}
}
