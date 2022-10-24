public class PriestSpecialAttack extends SpecialAttack
{
	public void specialAttack(fight battlefield , Knight knight , Assassin assassin , Master master , Archer archer , Priest priest , int rage , int mp)
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
}
