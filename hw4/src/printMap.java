public class printMap
{
	public int x;
	public int y;
	public void print(String[][]missionMap)
	{
		for(int a=0;a<10;a++)
		{
			for(int b=0;b<10;b++)
			{
				if(b==x&&a==y)
				{
					System.out.print("P ");
				}
				else
				{
					if(missionMap[b][a].equals("1"))
					{
						System.out.print(" "+" ");
					}
					else
					{
						System.out.print(missionMap[b][a]+" ");
					}
				}
			}
			System.out.println("");
		}
	}
	public int[] findInitial(String[][]missionMap)
	{
		int[]initial = new int[2];
		for(int a=0;a<10;a++)
		{
			for(int b=0;b<10;b++)
			{
				if(missionMap[b][a].equals("X"))
				{
					System.out.println("find the initial");
					initial[0] = b;
					initial[1] = a;
					break;
				}
				
			}
			
		}
		return initial;
	}
	public void move(String[][]missionMap,String command)
	{
		switch(command)
		{
			case "U":
				if(y-1<0)
				{
					System.out.println("此路不通ㄏㄏ");
				}
				else if(missionMap[x][y-1].equals("0"))
				{
					System.out.println("此路不通ㄏㄏ");
				}
				else
				{
					y--;
				}
				break;
			case "D":
				if(y+1>9)
				{
					System.out.println("此路不通ㄏㄏ");
				}
				else if(missionMap[x][y+1].equals("0"))
				{
					System.out.println("此路不通ㄏㄏ");
				}
				else
				{
					y++;
				}
				break;
			case "L":
				if(x-1<0)
				{
					System.out.println("此路不通ㄏㄏ");
				}
				else if(missionMap[x-1][y].equals("0"))
				{
					System.out.println("此路不通ㄏㄏ");
				}
				else
				{
					x--;
				}
				break;
			case "R":
				if(x+1>9)
				{
					System.out.println("此路不通ㄏㄏ");
				}
				else if(missionMap[x+1][y].equals("0"))
				{
					System.out.println("此路不通ㄏㄏ");
				}
				else
				{
					x++;
				}
				break;
			default:
				System.out.println("輸入錯誤");
				break;
		}
	}
}