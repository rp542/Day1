class Armstrong2{
	public static void main(String[] args)
	{
		int n,p,sum=0,i;
		System.out.println("Armstrong numbers are");
		for(i=100;i<=999;i++)
		{
			n=i;
			while(n>0)
			{
				p=n%10;
				sum=sum+(p*p*p);
				n=n/10;
			}
			
		
		if(sum==i)
		{
			System.out.println(i+"");
		}
		sum=0;
	}
}
}