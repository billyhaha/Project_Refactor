public class KnightNormalAttack extends NormalAttack
{

	@Override
	public void normalAttack(fight battlefield , boolean qi , int rage , int mp)
	{
		// TODO Auto-generated method stub
		System.out.println("狂劍士使用斬擊");
		for(int a=5;a<10;a++)
		{
			if(battlefield.fieldInt[a][0]!=0)
			{
				double damage = 0;
			    if(qi)
				{
					damage = 15+15*(0.05*rage+0.1);
					System.out.println("狂劍士獲得靈氣加成");
				}
				else
				{
					damage = 15+15*(0.05*rage);
				}
				battlefield.fieldInt[a][0] = battlefield.fieldInt[a][0]-((int)damage);
				System.out.println(battlefield.field[a]+"失去"+(int)damage+"生命");
		//********************************************************************************************
				if(battlefield.fieldInt[a][0]<=0)//判斷敵人死亡
				{
					System.out.println(battlefield.field[a]+"  is dead");
					for(int c=a;c<9;c++)
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
		//***********************************************************************************
				}
				if(rage!=10)
				{
					rage++;
				}
				break;
			}
		}
		mp = mp-5;
		
	}
}
	
