public class AssassinSpecialAttack extends SpecialAttack
{
	@Override
	public void specialAttack(fight battlefield,boolean qi , int target , int rage , int mp)
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
	}
}
