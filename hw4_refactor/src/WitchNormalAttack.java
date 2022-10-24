public class WitchNormalAttack extends NormalAttack
{
	@Override
	public void normalAttack(fight battlefield,int order)
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
