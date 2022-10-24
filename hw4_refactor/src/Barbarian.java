public class Barbarian extends character
{
	NormalAttack normalAtt;
	int rage;
	public Barbarian(int health, int mana, int time, int _team)
	{
		super(health, mana, time, _team);
		rage = 0;
	}
	public void setNormalAttack(NormalAttack normal)
	{
		this.normalAtt = normal;
	}
}
