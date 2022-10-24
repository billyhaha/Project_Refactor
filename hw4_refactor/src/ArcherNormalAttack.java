public class ArcherNormalAttack extends NormalAttack
{

	@Override
	public void normalAttack(fight battlefield, boolean qi, int target, int mp) {
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
}
