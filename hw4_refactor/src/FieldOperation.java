public class FieldOperation 
{
	public void cdInitialize(fight battlefield , Knight knight , Assassin assassin , Master master , Archer archer , Priest priest)
	{
		for(int a=0;a<5;a++)
		{
			battlefield.fieldInt[a][2] = 0;//cd全部歸0
		}
		knight.cd = 1;
		assassin.cd = 1;
		master.cd = 1;
		archer.cd = 1;
		priest.cd = 1;
	}
	public boolean soloman(fight battlefield , boolean soloman)
	{
		if(soloman)
		{
			System.out.println("發動所羅門王的詛咒");
			for(int h=5;h<10;h++)
			{
				battlefield.field[h] = "";
				battlefield.fieldInt[h][0] = 0;
				battlefield.fieldInt[h][1] = 0;
				battlefield.fieldInt[h][2] = 0;
				battlefield.fieldInt[h][3] = 0;
				battlefield.fieldInt[h][4] = 0;
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean change(String[] locTo,int loc,fight battlefield)
	{
		int exchange = 0;
		String change = "";
		int changeInt = 0;
		boolean check = false;
		try
		{
			exchange = Integer.parseInt(locTo[1]);		
		}
		catch(Exception e)
		{
			System.out.println("位置輸入錯誤");
			check = true;		
		}
		if(exchange>4||exchange<0||battlefield.field[exchange].equals(""))
		{
			System.out.println("位置輸入錯誤");
			check = true;		
		}
		if(!check)
		{
			change = battlefield.field[loc];//先將發動技能職業存下
			battlefield.field[loc] = battlefield.field[exchange];//被交換的角色名稱覆蓋發動角色
			battlefield.field[exchange] = change;//發動角色放入被交換角色格
			for(int b=0;b<5;b++)//交換數值
			{
				changeInt = battlefield.fieldInt[loc][b];
				battlefield.fieldInt[loc][b] = battlefield.fieldInt[exchange][b];
				battlefield.fieldInt[exchange][b] = changeInt;
			}	
			check = false;
		}			
		return check;
	}
}
