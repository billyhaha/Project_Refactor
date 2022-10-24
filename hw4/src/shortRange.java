public class shortRange extends character
{
	public int rage;
	public shortRange(int health,int mana,int time,int _team)
	{
		super(health,mana,time,_team);
		rage = 0;
	}
	public void normalknight(fight battlefield,boolean qi)
	{
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
	//*********************************************************************************************************
	public void specialknight(fight battlefield,boolean qi)
	{
		System.out.println("狂劍士使用狂暴打擊");
		for(int a=5;a<10;a++)
		{
			if(battlefield.fieldInt[a][0]!=0)
			{
				double damage = 0;
			    if(qi)
				{
					damage = 25+25*(0.05*rage+0.1);
					System.out.println("狂劍士獲得靈氣加成");
				}
				else
				{
					damage = 25+25*(0.05*rage);
				}
				battlefield.fieldInt[a][0] = battlefield.fieldInt[a][0]-((int)damage);
				System.out.println(battlefield.field[a]+"失去"+(int)damage+"生命");
				if(battlefield.fieldInt[a][0]<=0)
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
					
				}
				break;
			}
		}
		for(int b=5;b<10;b++)
		{
			if(battlefield.fieldInt[b][0]!=0)
			{
				double damage = 0;
			    if(qi)
				{
					damage = 25+25*(0.05*rage+0.1);
					System.out.println("狂劍士獲得靈氣加成");
				}
				else
				{
					damage = 25+25*(0.05*rage);
				}
	//*************************************************************************************
				battlefield.fieldInt[b][0] = battlefield.fieldInt[b][0]-((int)damage);
				System.out.println(battlefield.field[b]+"失去"+(int)damage+"生命");
	//**************************************************************************************
				if(battlefield.fieldInt[b][0]<=0)
				{
					System.out.println(battlefield.field[b]+"  is dead");
					for(int c=b;c<9;c++)//補位
					{
						battlefield.field[c] = battlefield.field[c+1];
						battlefield.fieldInt[c][0] = battlefield.fieldInt[c+1][0];
						battlefield.fieldInt[c][1] = battlefield.fieldInt[c+1][1];
						battlefield.fieldInt[c][2] = battlefield.fieldInt[c+1][2];
						battlefield.fieldInt[c][3] = battlefield.fieldInt[c+1][3];
						battlefield.fieldInt[c][4] = battlefield.fieldInt[c+1][4];
					}
					battlefield.field[9] = "";//最後一位歸零
					battlefield.fieldInt[9][0] = 0;
					battlefield.fieldInt[9][1] = 0;
					battlefield.fieldInt[9][2] = 0;
					battlefield.fieldInt[9][3] = 0;
					battlefield.fieldInt[9][4] = 0;
					
				}
				break;
			}
		}
		rage = 0;
		mp = mp-25;
		
		
	}
	public void normalassassin(fight battlefield,boolean qi)
	{
		System.out.println("刺客使用背刺");
		for(int a=9;a>4;a--)
		{
			if(battlefield.fieldInt[a][0]!=0)
			{
				double damage = 0;
			    if(qi)
				{
					damage = 20+20*(0.05*rage+0.1);
					System.out.println("刺客獲得靈氣加成");
				}
				else
				{
					damage = 20+20*(0.05*rage);
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
		}//判斷敵人for結束
		mp = mp-10;
		
	}
	public void specialassassin(fight battlefield,boolean qi,int target)
	{
		System.out.println(battlefield.field[target]+"  慘遭刺殺");
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
		
		mp = mp-25;
		rage = 0;
	}//方法結束
	
	public int normalbarbarian(fight battlefield,boolean qi,int anger,shortRange knight,shortRange assassin,longRange master,longRange archer,support priest)
	{
		System.out.println("野蠻人使用嘲諷");
		for(int a=0;a<5;a++)
		{
			if(battlefield.fieldInt[a][0]!=0)//當該格角色血量不為零
			{
		
				System.out.println(battlefield.field[a]+"耐不住衝動，跑到了最前排");
				
				String caller = battlefield.field[a];
				
				for(int c=a;c<4;c++)
				{
					battlefield.field[c] = battlefield.field[c+1];
				}
				battlefield.field[4] = caller;
				
				for(int b=0;b<5;b++)//陣列垂直格
				{
					int call = battlefield.fieldInt[a][b];//先創立變數call儲存最後一格角色資料
					for(int c=a;c<4;c++)//其他資料向後遞補
					{						
						battlefield.fieldInt[c][b] = battlefield.fieldInt[c+1][b];					
					}			
					battlefield.fieldInt[4][b] = call;//將call變數資料放回陣列位置4(最前排)
					
				}
				//嘲諷移動結束
				double damage = 0;//開始攻擊
			    if(qi)
				{
					damage = 10+10*(0.05*anger+0.1);
					System.out.println("野蠻人獲得靈氣加成");
				}
				else
				{
					System.out.println("before"+anger);
					damage = 10+10*(0.05*anger);
				}
				battlefield.fieldInt[4][0] = battlefield.fieldInt[4][0]-((int)damage);
				System.out.println(battlefield.field[4]+"失去"+(int)damage+"生命");
				
				switch(battlefield.field[a])//檢查該格角色名稱，並扣除生命
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
				
				
				if(battlefield.fieldInt[4][0]<=0)//判斷玩家死亡
				{
					System.out.println(battlefield.field[4]+"  is dead");
					for(int c=4;c>0;c--)
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
				}//判斷結束
				
				
				break;//跳出for迴圈
			}//
			
		}//for迴圈結束
		anger++;
		if(anger==10)//當攻擊後怒氣為10
		{
			System.out.println("野蠻人觸發怒氣");
			double damage = 0;//開始攻擊
			if(qi)
			{
				damage = 10+10*(0.05*10+0.1);
				System.out.println("野蠻人獲得靈氣加成");
			}
			else
			{
				damage = 10+10*(0.05*10);
			}
			battlefield.fieldInt[4][0] = battlefield.fieldInt[4][0]-((int)damage);
			System.out.println(battlefield.field[4]+"失去"+damage+"生命");
			switch(battlefield.field[4])//檢查該格角色名稱，並扣除生命
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
			if(battlefield.fieldInt[4][0]<=0)//判斷敵人死亡
			{
				System.out.println(battlefield.field[4]+"  is dead");
				for(int c=4;c>0;c++)
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
			}//判斷結束
			anger = 0;
		}
		return anger;
	}//嘲諷結束
	
}
