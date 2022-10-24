public class support extends character
{
	public support(int health,int mana,int time,int _team)
	{
		super(health,mana,time,_team);
	}
	//***********************************************************************************************
	public void normalpriest(fight battlefield,int target,shortRange knight,shortRange assassin,longRange master,longRange archer,support priest)
	{
		priest.mp = priest.mp-10;
		switch(battlefield.field[target])
		{
			case"knight":
				if(knight.hp<80)
				{
					knight.hp = knight.hp+20;
				}
				else
				{
					knight.hp = 100;
				}
				
				if(knight.mp<25)
				{
					knight.mp = knight.mp+15;
				}
				else
				{
					knight.mp = 40;
				}
				battlefield.fieldInt[target][0] = knight.hp;
				battlefield.fieldInt[target][1] = knight.mp;
				break;
				
			case"assassin":
				if(assassin.hp<60)
				{
					assassin.hp = assassin.hp+20;
				}
				else
				{
					assassin.hp = 80;
				}
				
				if(assassin.mp<35)
				{
					assassin.mp = assassin.mp+15;
				}
				else
				{
					assassin.mp = 50;
				}
				battlefield.fieldInt[target][0] = assassin.hp;
				battlefield.fieldInt[target][1] = assassin.mp;
				break;
			case"master":
				if(master.hp<30)
				{
					master.hp = master.hp+20;
				}
				else
				{
					master.hp = 50;
				}
				
				if(master.mp<85)
				{
					master.mp = master.mp+15;
				}
				else
				{
					master.mp = 100;
				}
				battlefield.fieldInt[target][0] = master.hp;
				battlefield.fieldInt[target][1] = master.mp;
				break;
			case"archer":
				if(archer.hp<40)
				{
					archer.hp = archer.hp+20;
				}
				else
				{
					archer.hp = 60;
				}
				
				if(archer.mp<65)
				{
					archer.mp = archer.mp+15;
				}
				else
				{
					archer.mp = 80;
				}
				battlefield.fieldInt[target][0] = archer.hp;
				battlefield.fieldInt[target][1] = archer.mp;
				break;
			case"priest":
				if(priest.hp<40)
				{
					priest.hp = priest.hp+20;
				}
				else
				{
					priest.hp = 60;
				}
				
				if(priest.mp<85)
				{
					priest.mp = priest.mp+15;
				}
				else
				{
					priest.mp = 100;
				}
				battlefield.fieldInt[target][0] = priest.hp;
				battlefield.fieldInt[target][1] = priest.mp;
				break;
			default:
				break;
			
		}
		
	}//方法結束
	public void specialpriest(fight battlefield,shortRange knight,shortRange assassin,longRange master,longRange archer,support priest)
	{
		for(int a=0;a<5;a++)//從位置0檢查到位置5
		{
			switch(battlefield.field[a])//判斷職業名稱
			{
				case"knight":
					if(knight.hp<50)
					{
						knight.hp = knight.hp+50;
					}
					else
					{
						knight.hp =100;
					}
					battlefield.fieldInt[a][0] = knight.hp;//更新陣列
					break;
				case"assassin":
					if(assassin.hp<40)
					{
						assassin.hp = assassin.hp+40;
					}
					else
					{
						assassin.hp =80;
					}
					battlefield.fieldInt[a][0] = assassin.hp;//更新陣列
					break;
				case"master":
					if(master.hp<25)
					{
						master.hp = master.hp+25;
					}
					else
					{
						master.hp =50;
					}
					battlefield.fieldInt[a][0] = master.hp;//更新陣列
					break;
				case"archer":
					if(archer.hp<30)
					{
						archer.hp = archer.hp+30;
					}
					else
					{
						archer.hp =60;
					}
					battlefield.fieldInt[a][0] = archer.hp;//更新陣列
					break;
				case"priest":
					break;
				default:
					break;
			}//switch檢查角色結束
		}//迴圈檢查0-5結束
		mp = mp-30;
	}//方法結束
	
	public void normalwitch(fight battlefield,int order)
	{
		boolean call = true;
		if(order==0)
		{	
			for(int i=9;i>4;i--)
			{
				if(battlefield.field[i].equals("barbarian(clone)"))
				{
					System.out.println("場上存在野蠻人魁儡，故女巫不進行召喚");
					call = false;
					break;
				}
			}
			
			for(int k=9;k>4;k--)
			{
				if(battlefield.fieldInt[k][0]==0&&battlefield.fieldInt[k-1][0]!=0)//判斷最後一格
				{
					battlefield.field[k] = "barbarian(clone)";
					battlefield.fieldInt[k][0] = 120;
					battlefield.fieldInt[k][1] = 0;
					battlefield.fieldInt[k][2] = 1;//該回合野蠻人不攻擊
					battlefield.fieldInt[k][3] = -1;
					battlefield.fieldInt[k][4] = 0;
					System.out.println("女巫召喚野蠻人");
				}
				
			}
		}
		else if(order==1)
		{	
			for(int i=9;i>4;i--)
			{
				if(battlefield.field[i].equals("barbarian(clone1)"))
				{
					System.out.println("場上存在野蠻人魁儡，故女巫不進行召喚");
					call = false;
					break;
				}
			}
			
			for(int k=9;k>4;k--)
			{
				if(battlefield.fieldInt[k][0]==0&&battlefield.fieldInt[k-1][0]!=0)//判斷最後一格
				{
					battlefield.field[k] = "barbarian(clone1)";
					battlefield.fieldInt[k][0] = 120;
					battlefield.fieldInt[k][1] = 0;
					battlefield.fieldInt[k][2] = 1;//該回合野蠻人不攻擊
					battlefield.fieldInt[k][3] = -1;
					battlefield.fieldInt[k][4] = 0;
					System.out.println("女巫召喚野蠻人");
				}
				
			}
		}
		else if(order==2)
		{
			for(int i=9;i>4;i--)
			{
				if(battlefield.field[i].equals("barbarian(clone2)"))
				{
					System.out.println("場上存在野蠻人魁儡，故女巫不進行召喚");
					call = false;
					break;
				}
			}
			
			for(int k=9;k>4;k--)
			{
				if(battlefield.fieldInt[k][0]==0&&battlefield.fieldInt[k-1][0]!=0)//判斷最後一格
				{
					battlefield.field[k] = "barbarian(clone2)";
					battlefield.fieldInt[k][0] = 120;
					battlefield.fieldInt[k][1] = 0;
					battlefield.fieldInt[k][2] = 1;//該回合野蠻人不攻擊
					battlefield.fieldInt[k][3] = -1;
					battlefield.fieldInt[k][4] = 0;
					System.out.println("女巫召喚野蠻人");
				}
				
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}