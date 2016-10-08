
class reverse
{
	public static void main(String[] args)
	{
	int t=0,n;
	System.out.println("enter number");
	
	n=1234;
	while(n!=0)
	{
		t=t*10;
		t=t+(n%10);
		n=n/10;
	}
	System.out.println("reversed digit"+t);
}
}
