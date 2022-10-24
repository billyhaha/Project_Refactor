public class longRange extends character
{
	public longRange(int health,int mana,int time,int _team)
	{
		super(health,mana,time,_team);
	}
	//********************************************************************************************
	public void normalmaster(fight battlefield,boolean qi,int loc)
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
	//************************************************************************************************************
	public void specialmaster(fight battlefield,boolean qi,int loc)
	{
		int number = 0;
		System.out.println("元素法師使用暴風雪");
		for(int a=1;a<5;a++)
		{
			if(battlefield.fieldInt[loc+a][3]==-1)//為敵方陣營
			{
				if(battlefield.fieldInt[loc+a][0]!=0)//血量不為0
				{
					double damage = 0;
					if(qi)
					{
						damage = 25+25*0.1;
						System.out.println("元素法師獲得靈氣加成");
					}
					else
					{
						damage = 25;
					}
					battlefield.fieldInt[loc+a][0] = battlefield.fieldInt[loc+a][0]-((int)damage);
					System.out.println(battlefield.field[loc+a]+"失去"+(int)damage+"生命");
			//********************************************************************************************
					battlefield.fieldInt[loc+a][2]++;//冰凍效果
			//********************************************************************************		
					if(battlefield.fieldInt[loc+a][0]<=0)//判斷敵人死亡
					{
						System.out.println(battlefield.field[a]+"  is dead");
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
		mp = mp-20;
	}
	//******************************************************************************************************
	public void normalarcher(fight battlefield,boolean qi,int target)
	{
		System.out.println("天弓箭手使用破甲箭");
		double damage = 0;
		if(qi)
		{
			damage = 35+35*0.1;
			System.out.println("天弓箭手獲得靈氣加成");
		}
		else
		{
			damage = 35;
		}
		battlefield.fieldInt[target][0] = battlefield.fieldInt[target][0]-((int)damage);
		System.out.println(battlefield.field[target]+"失去"+(int)damage+"生命");			
//************************************************************************************************************
		if(battlefield.fieldInt[target][0]<=0)//判斷敵人死亡
		{
			System.out.println(battlefield.field[target]+"  is dead");
			for(int c=target;c<9;c++)
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
		mp = mp-10;//扣除魔力
	}
	//******************************************************************************************
	public void specialarcher(fight battlefield,boolean qi)
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
	//*******************************************************************************************
	public void normalwizard(fight battlefield,boolean qi,int loc,shortRange knight,shortRange assassin,longRange master,longRange archer,support priest)
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
		}
		
		
	}//術士結束
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}