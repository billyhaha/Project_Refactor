public class WizardNormalAttack extends NormalAttack
{
	@Override
	public int normalAttack(fight battlefield, boolean qi, int loc, Knight knight, Assassin assassin, Master master,
			Archer archer, Priest priest) 
	{
		System.out.println("術士使用蝕魂");
		int number = 0;
		for(int a=1;a<5;a++)
		{
			if(battlefield.fieldInt[loc-a][3]==1)//為敵方陣營
			{
				double damage = 0;
				if(qi)
				{
					damage = 15+15*0.1;
					System.out.println("術士獲得靈氣加成");
				}
				else
				{
					damage = 15;
				}
				battlefield.fieldInt[loc-a][0] = battlefield.fieldInt[loc-a][0]-((int)damage);
				System.out.println(battlefield.field[loc-a]+"失去"+(int)damage+"生命");
				
				battlefield.fieldInt[loc][0] = battlefield.fieldInt[loc][0]+((int)damage);//術士獲得血量
				
				if(battlefield.fieldInt[loc][0]>80)
				{
					battlefield.fieldInt[loc][0] = 80;//血量超過最大值時，回到最大值
				}
				
				switch(battlefield.field[loc-a])//檢查該格角色名稱，並扣除生命
				{
					case"knight":
						knight.hp = knight.hp-((int)damage);
						break;
					case"assassin":
						assassin.hp = assassin.hp-((int)damage);
						break;
					case"master":
						master.hp = master.hp-((int)damage);
						break;
					case"archer":
						archer.hp = archer.hp-((int)damage);
						break;
					case"priest":
						priest.hp = priest.hp-((int)damage);
						break;
					default:
						break;
				}//swtich結束
				
		//********************************************************************************************
				if(battlefield.fieldInt[loc-a][0]<=0)//判斷玩家死亡
				{
					System.out.println(battlefield.field[loc-a]+"  is dead");
					for(int c=loc-a;c>0;c--)
					{
						battlefield.field[c] = battlefield.field[c-1];
						battlefield.fieldInt[c][0] = battlefield.fieldInt[c-1][0];
						battlefield.fieldInt[c][1] = battlefield.fieldInt[c-1][1];
						battlefield.fieldInt[c][2] = battlefield.fieldInt[c-1][2];
						battlefield.fieldInt[c][3] = battlefield.fieldInt[c-1][3];
						battlefield.fieldInt[c][4] = battlefield.fieldInt[c-1][4];
					}
					battlefield.field[0] = "";
					battlefield.fieldInt[0][0] = 0;
					battlefield.fieldInt[0][1] = 0;
					battlefield.fieldInt[0][2] = 0;
					battlefield.fieldInt[0][3] = 0;
					battlefield.fieldInt[0][4] = 0;
		//***********************************************************************************
				}
				number++;
				if(number==2)
				{
					break;//已經攻擊兩名玩家
				}
			
			}
		}//術士結束
		return 0;
	}
}
