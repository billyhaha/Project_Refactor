public class ArcherSpecialAttack extends SpecialAttack
{
	@Override
	public void specialAttack(fight battlefield,boolean qi , int rage , int mp)
	{
		System.out.println("天弓箭手使用箭雨");
		double damage = 0;
		if(qi)
		{
			damage = 15+15*0.1;
			System.out.println("天弓箭手獲得靈氣加成");
		}
		else
		{
			damage = 15;
		}
		
		for(int a=5;a<10;a++)//先攻擊在場所有敵人
		{
			if(battlefield.fieldInt[a][0]!=0)
			{
				battlefield.fieldInt[a][0] = battlefield.fieldInt[a][0]-((int)damage);
				System.out.println(battlefield.field[a]+"失去"+(int)damage+"生命");		
				
			}
		}
		
		for(int b=5;b<10;b++)//再逐一檢查
		{
			if(battlefield.fieldInt[b][0]<=0)//判斷敵人死亡
			{
				System.out.println(battlefield.field[b]+"  is dead");
				for(int c=b;c<9;c++)
				{
					battlefield.field[c] = battlefield.field[c+1];
					battlefield.fieldInt[c][0] = battlefield.fieldInt[c+1][0];
					battlefield.fieldInt[c][1] = battlefield.fieldInt[c+1][1];
					battlefield.fieldInt[c][2] = battlefield.fieldInt[c+1][2];
					battlefield.fieldInt[c][3] = battlefield.fieldInt[c+1][3];
					battlefield.fieldInt[c][4] = battlefield.fieldInt[c+1][4];
				}
				battlefield.field[9] = "";
				battlefield.fieldInt[9][0] = 0;
				battlefield.fieldInt[9][1] = 0;
				battlefield.fieldInt[9][2] = 0;
				battlefield.fieldInt[9][3] = 0;
				battlefield.fieldInt[9][4] = 0;
			}
			
		}
		mp = mp-25;
	}
}
