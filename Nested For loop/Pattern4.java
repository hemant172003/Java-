class Pattern4
{
	public static void main(String[] args)
	{
		char a = 'C';
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				System.out.print(a);
			}
				a--;
				System.out.println();
		}
	}
}