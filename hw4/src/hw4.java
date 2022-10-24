import java.util.*;
import java.io.*;

public class hw4
{
	public static void main(String args[])
	{	
		boolean game = true;
		String mission1 = "未完成";
		String mission2 = "未完成";
		String mission3 = "未完成";
		String mission4 = "未完成";
		String mission5 = "未完成";
		boolean soloman = false;
		while(game)
		{
			String moveCommand="";
			fight battlefield = new fight();//存取戰鬥陣列使用
			battlefield.cleanfield();
			
			
			
			shortRange knight = new shortRange(100,40,1,1);
			shortRange assassin = new shortRange(80,50,1,1);
			shortRange barbarian = new shortRange(120,0,1,-1);
			longRange master = new longRange(50,100,1,1);
			longRange archer = new longRange(60,80,1,1);
			longRange wizard = new longRange(80,0,1,-1);
			support priest = new support(60,100,1,1);
			support witch =new support(80,0,1,-1);
			
			System.out.println("============================================================");
			System.out.println("歡迎來到RPG角色大亂鬥，尋找所羅門王的寶藏");
			System.out.println("以下為任務列表");
			System.out.println("============================================================");
			System.out.print("   任務列表        "); System.out.printf("%-6s","完成狀況"); System.out.println("");
			System.out.print("任務1-訓練課程     ");System.out.printf("%-6s",mission1); System.out.println("");
			System.out.print("任務2-黑暗叢林     ");System.out.printf("%-6s",mission2); System.out.println("");
			System.out.print("任務3-地獄峽谷     ");System.out.printf("%-6s",mission3); System.out.println("");
			System.out.print("任務4-靈魂深淵     ");System.out.printf("%-6s",mission4); System.out.println("");
			System.out.print("任務5-地獄之路     ");System.out.printf("%-6s",mission5); System.out.println("");
			System.out.println("============================================================");
			System.out.println("請輸入選擇任務及角色指令");
			
			boolean mission = false;
			boolean check = true;
			int missionOrder = 0;//目前任務編號
			printMap location = new printMap();//紀錄玩家位置
			location.x = 0;//紀錄玩家所在位置
			location.y = 0;
			Scanner command = new Scanner(System.in);//作為玩家輸入
			String _command = command.nextLine();
			String[]_commandCut = _command.split(" |,");//分割玩家指令
			while(check)
			{
				if(_commandCut[0].equals("exit"))
				{
					System.out.println("感謝遊玩");
					game = false;
					mission = false;
					check = false;
				}
		
				else if(_commandCut[0].equals("select"))
				{
					try//check whether the input is correct
					{
						missionOrder = Integer.parseInt(_commandCut[1]);
						check = false;
						mission = true;
						break;
					}
					catch(Exception e)
					{
						System.out.println("輸入錯誤，請重新輸入指令");
						check = true;
						break;
					}
				    
				}
		
				else
				{
					System.out.println("輸入錯誤，請重新輸入指令");
					_command = command.nextLine();
					_commandCut = _command.split(" ");
				}
		
			}//檢查迴圈結束
			
			String missionCode = "";
			int people = 0;
			String[][] map = new String[10][10];
			switch(missionOrder)//讀入地圖
			{
				case 1:
					try
					{	
						Scanner read = new Scanner(new FileInputStream("Mission/1.txt"));
						missionCode = read.nextLine();
						people = Integer.parseInt(read.nextLine());
						for(int a=0;a<10;a++)
						{
							String[] mapSplit = read.nextLine().split(",");
							for(int b=0;b<10;b++)
							{
								map[b][a] = mapSplit[b];
							}
						}
							
						System.out.println("進入任務1，訓練課程");
						check = true;
					}
					catch(FileNotFoundException e)
					{
						System.out.println("File not found exception handling.");
					}
					break;
				case 2:
					try
					{	
					    Scanner read = new Scanner(new FileInputStream("Mission/2.txt"));
						missionCode = read.nextLine();
						people = Integer.parseInt(read.nextLine());
						for(int a=0;a<10;a++)
						{
							String[] mapSplit = read.nextLine().split(",");
							for(int b=0;b<10;b++)
							{
								map[b][a] = mapSplit[b];
							}
						}
						System.out.println("進入任務2:黑暗森林");
						check = true;
					}
					catch(FileNotFoundException e)
					{
						System.out.println("File not found exception handling.");
					}
					break;
				case 3:
					try
					{	
					    Scanner read = new Scanner(new FileInputStream("Mission/3.txt"));
						missionCode = read.nextLine();
						people = Integer.parseInt(read.nextLine());
						for(int a=0;a<10;a++)
						{
							String[] mapSplit = read.nextLine().split(",");
							for(int b=0;b<10;b++)
							{
								map[b][a] = mapSplit[b];
							}
						}
						System.out.println("進入任務3，煉獄峽谷");
						check = true;
					}
					catch(FileNotFoundException e)
					{
						System.out.println("File not found exception handling.");
					}
					break;
				case 4:
					try
					{	
					    Scanner read = new Scanner(new FileInputStream("Mission/4.txt"));
						missionCode = read.nextLine();
						people = Integer.parseInt(read.nextLine());
						for(int a=0;a<10;a++)
						{
							String[] mapSplit = read.nextLine().split(",");
							for(int b=0;b<10;b++)
							{
								map[b][a] = mapSplit[b];
							}
						}
						System.out.println("進入任務4，靈魂深淵");
						check = true;
					}
					catch(FileNotFoundException e)
					{
						System.out.println("File not found exception handling.");
					}
					break;
				case 5:
					try
					{	
					    Scanner read = new Scanner(new FileInputStream("Mission/5.txt"));
						missionCode = read.nextLine();
						people = Integer.parseInt(read.nextLine());
						for(int a=0;a<10;a++)
						{
							String[] mapSplit = read.nextLine().split(",");
							for(int b=0;b<10;b++)
							{
								map[b][a] = mapSplit[b];
							}
						}
						System.out.println("進入任務5，煉獄之道");
						check = true;
					}
					catch(FileNotFoundException e)
					{
						System.out.println("File not found exception handling.");
					}
					break;
				default:
					System.out.println("任務選擇錯誤");
					check = false;
					mission = false;
					break;
						
			}
			if(check)
			{
				if(_commandCut.length!=people+2)//確認指派人數
				{
					System.out.println("指派人數錯誤");
					mission = false;
					check = false;
				}
			}
			if(check)
			{
				switch(people)//在戰鬥陣列中放入玩家陣營
				{
					case 3:
						if(!_commandCut[2].equals(_commandCut[3])&&!_commandCut[3].equals(_commandCut[4]))
						{
							battlefield.putPlayer(_commandCut[2],_commandCut[3],_commandCut[4],"none","none",knight,assassin,master,archer,priest);
						}
						else
						{
							System.out.println("輸入錯誤，職業不可重複");
							mission = false;
						}
						break;
					case 4:
						if(!_commandCut[2].equals(_commandCut[3])&&!_commandCut[3].equals(_commandCut[4])&&!_commandCut[4].equals(_commandCut[5]))
						{
							battlefield.putPlayer(_commandCut[2],_commandCut[3],_commandCut[4],_commandCut[5],"none",knight,assassin,master,archer,priest);
						}
						else
						{
							System.out.println("輸入錯誤，職業不可重複");
							mission = false;
						}
						break;
					case 5:
						if(!_commandCut[2].equals(_commandCut[3])&&!_commandCut[3].equals(_commandCut[4])&&!_commandCut[4].equals(_commandCut[5])&&!_commandCut[5].equals(_commandCut[6]))
						{
							battlefield.putPlayer(_commandCut[2],_commandCut[3],_commandCut[4],_commandCut[5],_commandCut[6],knight,assassin,master,archer,priest);
						}
						else
						{
							System.out.println("輸入錯誤，職業不可重複");
							mission = false;
						}
						break;
					default:
						break;
				}
				int[] forInitial = location.findInitial(map);//輸入任務起始點
				System.out.println("初始位置為"+forInitial[0]+forInitial[1]);
				location.x = forInitial[0];
				location.y = forInitial[1];
			}
			while(mission)
			{
				
				System.out.println("============================================================");
				System.out.println("任務代號："+missionOrder);
				System.out.println(missionCode);
				location.print(map);
				System.out.println("請輸入移動方向");
				moveCommand = command.nextLine();
				while(moveCommand.length()!=1)
				{
					System.out.println("輸入錯誤，請重新輸入移動指令");
					moveCommand = command.nextLine();
				}
				location.move(map,moveCommand);
				switch(map[location.x][location.y])
				{
					case"A":
						System.out.println("修怕囉");
						battlefield.putEnemy("A",barbarian,wizard,witch);
						battlefield.war(battlefield,knight,assassin,master,archer,priest,barbarian,wizard,witch,soloman);
						for(int a=0;a<5;a++)
						{
							battlefield.fieldInt[a][2] = 0;//cd全部歸0
						}
						knight.cd = 1;
						assassin.cd = 1;
						master.cd = 1;
						archer.cd = 1;
						priest.cd = 1;
						break;
					case"B":
						System.out.println("修怕囉");
						battlefield.putEnemy("B",barbarian,wizard,witch);
						battlefield.war(battlefield,knight,assassin,master,archer,priest,barbarian,wizard,witch,soloman);
						for(int a=0;a<5;a++)
						{
							battlefield.fieldInt[a][2] = 0;//cd全部歸0
						}
						knight.cd = 1;
						assassin.cd = 1;
						master.cd = 1;
						archer.cd = 1;
						priest.cd = 1;
						break;
					case"C":
						System.out.println("修怕囉");
						battlefield.putEnemy("C",barbarian,wizard,witch);
						battlefield.war(battlefield,knight,assassin,master,archer,priest,barbarian,wizard,witch,soloman);
						for(int a=0;a<5;a++)
						{
							battlefield.fieldInt[a][2] = 0;//cd全部歸0
						}
						knight.cd = 1;
						assassin.cd = 1;
						master.cd = 1;
						archer.cd = 1;
						priest.cd = 1;
						break;
					case"D":
						System.out.println("修怕囉");
						battlefield.putEnemy("D",barbarian,wizard,witch);
						battlefield.war(battlefield,knight,assassin,master,archer,priest,barbarian,wizard,witch,soloman);
						for(int a=0;a<5;a++)
						{
							battlefield.fieldInt[a][2] = 0;//cd全部歸0
						}
						knight.cd = 1;
						assassin.cd = 1;
						master.cd = 1;
						archer.cd = 1;
						priest.cd = 1;
						break;
					case"E":
						System.out.println("修怕囉");
						battlefield.putEnemy("E",barbarian,wizard,witch);
						battlefield.war(battlefield,knight,assassin,master,archer,priest,barbarian,wizard,witch,soloman);
						for(int a=0;a<5;a++)
						{
							battlefield.fieldInt[a][2] = 0;//cd全部歸0
						}
						knight.cd = 1;
						assassin.cd = 1;
						master.cd = 1;
						archer.cd = 1;
						priest.cd = 1;
						break;
					case"Y":
						System.out.println("恭喜老爺賀喜夫人，完成任務啦");
						switch(missionOrder)
						{
							case 1:
								mission1 = "已完成";
								break;
							case 2:
								mission2 = "已完成";
								break;
							case 3:
								mission3 = "已完成";
								break;
							case 4:
								mission4 = "已完成";
								break;
							case 5:
								mission5 = "已完成";
								break;
							
						}
						
					if(mission1.equals("已完成")&&mission2.equals("已完成")&&mission3.equals("已完成")&&mission4.equals("已完成")&&mission5.equals("已完成"))
					{
						System.out.println("恭喜你已完成所有關卡，獲得所羅門王的寶藏，並解鎖所羅門王的詛咒");
						soloman = true;
					}
					mission = false;
					break;					
				}
				
				map[location.x][location.y] = "1";
				if(battlefield.fieldInt[0][0]==0&&battlefield.fieldInt[1][0]==0&&battlefield.fieldInt[2][0]==0&&battlefield.fieldInt[3][0]==0&&battlefield.fieldInt[4][0]==0)
				{
					System.out.println("角色全數陣亡，任務失敗");
					mission = false;
				}
				
			}			
				
						
				
		}
				
		
	}
	
	
	
	
	
	
}