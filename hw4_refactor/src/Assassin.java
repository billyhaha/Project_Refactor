public class Assassin extends character
{
	NormalAttack normalAtt;
	SpecialAttack specialAtt;
	int rage;
	public Assassin(int health, int mana, int time, int _team) 
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
		if(this.hp<70)
		{
			this.hp = this.hp+10;
		}
		else
		{
			this.hp = 80;
		}
		
		if(this.mp<40)
		{
			this.mp = this.mp+10;
		}
		else
		{
			this.mp = 50;
		}
	}
}
