public class Priest extends character
{
	int rage;
	NormalAttack normalAtt;
	SpecialAttack specialAtt;
	public Priest(int health, int mana, int time, int _team) 
	{
		super(health, mana, time, _team);
		rage = 0;
	}
	public void setNormalAttack(NormalAttack normal)
	{
		this.normalAtt = normal;
	}
	public void setSpecialAttack(SpecialAttack special)
	{
		this.specialAtt = special;
	}
	public void rest()
	{
		if(this.hp<50)
		{
			this.hp = this.hp+10;
		}
		else
		{
			this.hp = 60;
		}
		
		if(this.mp<90)
		{
			this.mp = this.mp+10;
		}
		else
		{
			this.mp = 100;
		}
	}
}
