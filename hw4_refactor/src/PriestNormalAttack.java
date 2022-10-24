public class PriestNormalAttack extends NormalAttack
{
	@Override
	public void normalAttack(fight battlefield, int target , Knight knight , Assassin assassin,  Master master , Archer archer,
			Priest priest)
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
}