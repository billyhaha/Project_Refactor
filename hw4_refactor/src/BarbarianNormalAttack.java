public class BarbarianNormalAttack extends NormalAttack
{
	@Override
	public int normalAttack(fight battlefield,boolean qi,int anger,Knight knight,Assassin assassin,Master master,Archer archer,Priest priest)
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
