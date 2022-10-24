public class MasterNormalAttack extends NormalAttack
{

	@Override
	public void normalAttack(fight battlefield, boolean qi, int loc, int mp) 
	{
		{
			int number = 0;
			System.out.println("元素法師使用火球術");
			for(int a=1;a<5;a++)
			{
				if(battlefield.fieldInt[loc+a][3]==-1)//為敵方陣營
				{
					if(battlefield.fieldInt[loc+a][0]!=0)//血量不為0
					{
						double damage = 0;
						if(qi)
						{
							damage = 30+30*0.1;
							System.out.println("元素法師獲得靈氣加成");
						}
						else
						{
							damage = 30;
						}
						battlefield.fieldInt[loc+a][0] = battlefield.fieldInt[loc+a][0]-((int)damage);
						System.out.println(battlefield.field[loc+a]+"失去"+(int)damage+"生命");
				//********************************************************************************************
						if(battlefield.fieldInt[loc+a][0]<=0)//判斷敵人死亡
						{
							System.out.println(battlefield.field[loc+a]+"  is dead");
							for(int c=loc+a;c<9;c++)
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
						number++;
						if(number==2)
						{
							break;
						}
					}
				}
			}
			mp = mp-15;
		}
		
	}
}
