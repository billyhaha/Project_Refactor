import java.util.*;
import java.io.*;

public class fight
{
	String[] field = new String[10];
	int[][] fieldInt = new int[10][5];
	public void cleanfield()
	{
		for(int a=0;a<5;a++)
		{
			for(int b=0;b<10;b++)
			{
				fieldInt[b][a] = 0;
			}
		}
		for(int c=0;c<10;c++)
		{
			field[c] = "";
		}
	}
	//********************************************************************************************************************
	public void putPlayer(String first,String second,String third,String fourth,String fifth,shortRange knight,shortRange assassin,longRange master,longRange archer,support priest)
	{
		switch (first)
		{
			case "R1":
				field[4] = "knight";
				fieldInt[4][0] = knight.hp;
				fieldInt[4][1] = knight.mp;
				fieldInt[4][2] = 0;
				fieldInt[4][3] = knight.team;
				fieldInt[4][4] = knight.rage;
				break;
			case "R2":
				field[4] = "assassin";
				fieldInt[4][0] = assassin.hp;
				fieldInt[4][1] = assassin.mp;
				fieldInt[4][2] = 0;
				fieldInt[4][3] = assassin.team;
				fieldInt[4][4] = assassin.rage;
				break;
			case "R3":
				field[4] = "master";
				fieldInt[4][0] = master.hp;
				fieldInt[4][1] = master.mp;
				fieldInt[4][2] = 0;
				fieldInt[4][3] = master.team;
				break;
			case "R4":
				field[4] = "archer";
				fieldInt[4][0] = archer.hp;
				fieldInt[4][1] = archer.mp;
				fieldInt[4][2] = 0;
				fieldInt[4][3] = archer.team;
				break;
			case "R5":
				field[4] = "priest";
				fieldInt[4][0] = priest.hp;
				fieldInt[4][1] = priest.mp;
				fieldInt[4][2] = 0;
				fieldInt[4][3] = priest.team;
				break;
			default:
				System.out.println("輸入錯誤，請重新輸入");
				break;
		}
		switch (second)
		{
			case "R1":
				field[3] = "knight";
				fieldInt[3][0] = knight.hp;
				fieldInt[3][1] = knight.mp;
				fieldInt[3][2] = 0;
				fieldInt[3][3] = knight.team;
				fieldInt[3][4] = knight.rage;
				break;
			case "R2":
				field[3] = "assassin";
				fieldInt[3][0] = assassin.hp;
				fieldInt[3][1] = assassin.mp;
				fieldInt[3][2] = 0;
				fieldInt[3][3] = assassin.team;
				fieldInt[3][4] = assassin.rage;
				break;
			case "R3":
				field[3] = "master";
				fieldInt[3][0] = master.hp;
				fieldInt[3][1] = master.mp;
				fieldInt[3][2] = 0;
				fieldInt[3][3] = master.team;
				break;
			case "R4":
				field[3] = "archer";
				fieldInt[3][0] = archer.hp;
				fieldInt[3][1] = archer.mp;
				fieldInt[3][2] = 0;
				fieldInt[3][3] = archer.team;
				break;
			case "R5":
				field[3] = "priest";
				fieldInt[3][0] = priest.hp;
				fieldInt[3][1] = priest.mp;
				fieldInt[3][2] = 0;
				fieldInt[3][3] = priest.team;
				break;
			default:
				System.out.println("輸入錯誤，請重新輸入");
				break;
		}
		switch (third)
		{
			case "R1":
				field[2] = "knight";
				fieldInt[2][0] = knight.hp;
				fieldInt[2][1] = knight.mp;
				fieldInt[2][2] = 0;
				fieldInt[2][3] = knight.team;
				fieldInt[2][4] = knight.rage;
				break;
			case "R2":
				field[2] = "assassin";
				fieldInt[2][0] = assassin.hp;
				fieldInt[2][1] = assassin.mp;
				fieldInt[2][2] = 0;
				fieldInt[2][3] = assassin.team;
				fieldInt[2][4] = assassin.rage;
				break;
			case "R3":
				field[2] = "master";
				fieldInt[2][0] = master.hp;
				fieldInt[2][1] = master.mp;
				fieldInt[2][2] = 0;
				fieldInt[2][3] = master.team;
				break;
			case "R4":
				field[2] = "archer";
				fieldInt[2][0] = archer.hp;
				fieldInt[2][1] = archer.mp;
				fieldInt[2][2] = 0;
				fieldInt[2][3] = archer.team;
				break;
			case "R5":
				field[2] = "priest";
				fieldInt[2][0] = priest.hp;
				fieldInt[2][1] = priest.mp;
				fieldInt[2][2] = 0;
				fieldInt[2][3] = priest.team;
				break;
			default:
				System.out.println("輸入錯誤，請重新輸入");
				break;
		}
		switch (fourth)
		{
			case "R1":
				field[1] = "knight";
				fieldInt[1][0] = knight.hp;
				fieldInt[1][1] = knight.mp;
				fieldInt[1][2] = 0;
				fieldInt[1][3] = knight.team;
				fieldInt[1][4] = knight.rage;
				break;
			case "R2":
				field[1] = "assassin";
				fieldInt[1][0] = assassin.hp;
				fieldInt[1][1] = assassin.mp;
				fieldInt[1][2] = 0;
				fieldInt[1][3] = assassin.team;
				fieldInt[1][4] = assassin.rage;
				break;
			case "R3":
				field[1] = "master";
				fieldInt[1][0] = master.hp;
				fieldInt[1][1] = master.mp;
				fieldInt[1][2] = 0;
				fieldInt[1][3] = master.team;
				break;
			case "R4":
				field[1] = "archer";
				fieldInt[1][0] = archer.hp;
				fieldInt[1][1] = archer.mp;
				fieldInt[1][2] = 0;
				fieldInt[1][3] = archer.team;
				break;
			case "R5":
				field[1] = "priest";
				fieldInt[1][0] = priest.hp;
				fieldInt[1][1] = priest.mp;
				fieldInt[1][2] = 0;
				fieldInt[1][3] = priest.team;
				break;
			case "none":
				break;
			default:
				System.out.println("輸入錯誤，請重新輸入");
				break;
		}
		switch (fifth)
		{
			case "R1":
				field[0] = "knight";
				fieldInt[0][0] = knight.hp;
				fieldInt[0][1] = knight.mp;
				fieldInt[0][2] = 0;
				fieldInt[0][3] = knight.team;
				fieldInt[0][4] = knight.rage;
				break;
			case "R2":
				field[0] = "assassin";
				fieldInt[0][0] = assassin.hp;
				fieldInt[0][1] = assassin.mp;
				fieldInt[0][2] = 0;
				fieldInt[0][3] = assassin.team;
				fieldInt[0][4] = assassin.rage;
				break;
			case "R3":
				field[0] = "master";
				fieldInt[0][0] = master.hp;
				fieldInt[0][1] = master.mp;
				fieldInt[0][2] = 0;
				fieldInt[0][3] = master.team;
				break;
			case "R4":
				field[0] = "archer";
				fieldInt[0][0] = archer.hp;
				fieldInt[0][1] = archer.mp;
				fieldInt[0][2] = 0;
				fieldInt[0][3] = archer.team;
				break;
			case "R5":
				field[0] = "priest";
				fieldInt[0][0] = priest.hp;
				fieldInt[0][1] = priest.mp;
				fieldInt[0][2] = 0;
				fieldInt[0][3] = priest.team;
				break;
			case "none":
				break;
			default:
				System.out.println("輸入錯誤，請重新輸入");
				break;
		}
    }
	//*****************************************************************************************************************
	public void printfield()
	{
		System.out.println("=========================================================================");
		System.out.printf("%-11s","||位置");
		for(int c=0;c<10;c++)
		{
			System.out.print("||");
			System.out.printf("%-11s",c);
		}
		System.out.println("");
		
		System.out.printf("%-11s","||職業");
		for(int c=0;c<10;c++)
		{
			System.out.print("||");
			System.out.printf("%-11s",field[c]);		
		}
		System.out.println("");
		
		System.out.printf("%-11s","||血量");
		for(int b=0;b<10;b++)
		{
			System.out.print("||");
			System.out.printf("%-11s",fieldInt[b][0]);		
		}
		System.out.println("");
		
		System.out.printf("%-11s","||魔力");
		for(int b=0;b<10;b++)
		{
			System.out.print("||");
			System.out.printf("%-11s",fieldInt[b][1]);	
		}
		System.out.println("");
		
		System.out.printf("%-11s","||CD時間");
		for(int b=0;b<10;b++)
		{
			System.out.print("||");
			System.out.printf("%-11s",fieldInt[b][2]);	
		}
		System.out.println("");
		
		System.out.printf("%-11s","||陣營");
		for(int b=0;b<10;b++)
		{
			System.out.print("||");
			System.out.printf("%-11s",fieldInt[b][3]);	
		}
		System.out.println("");
		
		System.out.printf("%-10s","||怒氣值");
		for(int b=0;b<10;b++)
		{
			System.out.print("||");
			System.out.printf("%-11s",fieldInt[b][4]);	
		}
		System.out.println("");
		
		
	}
	public void putEnemy(String command,shortRange barbarian,longRange wizard,support witch)
	{
		field[5] = "barbarian";
		fieldInt[5][0] = barbarian.hp;
		fieldInt[5][1] = barbarian.mp;
		fieldInt[5][2] = 1;
		fieldInt[5][3] = barbarian.team;
		fieldInt[5][4] = barbarian.rage;
				
		field[6] = "barbarian";
		fieldInt[6][0] = barbarian.hp;
		fieldInt[6][1] = barbarian.mp;
		fieldInt[6][2] = 1;
		fieldInt[6][3] = barbarian.team;
		fieldInt[6][4] = barbarian.rage;
		switch(command)
		{
			case "A":
				field[7] = "barbarian";
				fieldInt[7][0] = barbarian.hp;
				fieldInt[7][1] = barbarian.mp;
				fieldInt[7][2] = 1;
				fieldInt[7][3] = barbarian.team;
				fieldInt[7][4] = barbarian.rage;
				break;
			case "B":
				field[7] = "wizard";
				fieldInt[7][0] = wizard.hp;
				fieldInt[7][1] = wizard.mp;
				fieldInt[7][2] = 1;
				fieldInt[7][3] = wizard.team;
				break;
			case "C":
				field[7] = "wizard";
				fieldInt[7][0] = wizard.hp;
				fieldInt[7][1] = wizard.mp;
				fieldInt[7][2] = 1;
				fieldInt[7][3] = wizard.team;
				
				field[8] = "witch";
				fieldInt[8][0] = wizard.hp;
				fieldInt[8][1] = wizard.mp;
				fieldInt[8][2] = 1;
				fieldInt[8][3] = wizard.team;
				break;
			case "D":
				field[7] = "witch1";
				fieldInt[7][0] = witch.hp;
				fieldInt[7][1] = witch.mp;
				fieldInt[7][2] = 1;
				fieldInt[7][3] = witch.team;
				
				field[8] = "witch2";
				fieldInt[8][0] = wizard.hp;
				fieldInt[8][1] = wizard.mp;
				fieldInt[8][2] = 1;
				fieldInt[8][3] = wizard.team;
				break;
			case "E":
				field[7] = "wizard";
				fieldInt[7][0] = wizard.hp;
				fieldInt[7][1] = wizard.mp;
				fieldInt[7][2] = 1;
				fieldInt[7][3] = wizard.team;
				
				field[8] = "wizard";
				fieldInt[8][0] = wizard.hp;
				fieldInt[8][1] = wizard.mp;
				fieldInt[8][2] = 1;
				fieldInt[8][3] = wizard.team;
				
				field[9] = "witch";
				fieldInt[9][0] = wizard.hp;
				fieldInt[9][1] = wizard.mp;
				fieldInt[9][2] = 1;
				fieldInt[9][3] = wizard.team;
				break;
			
		}
	}
		public void war(fight battlefield,shortRange knight,shortRange assassin,longRange master,longRange archer,support priest,shortRange barbarian,longRange wizard,support witch,boolean soloman)
		{
			boolean onWar = true;
			
			while(onWar)
			{
				System.out.println("進入戰鬥，請輸入戰鬥指令");
				Scanner command = new Scanner(System.in);
				
				knight.cd--;
				assassin.cd--;
				master.cd--;
				archer.cd--;
				priest.cd--;
					
				for(int z=0;z<5;z++)
				{
					switch(field[z])
					{
						case"knight":
							fieldInt[z][2] = knight.cd;
							break;
						case"assassin":
							fieldInt[z][2] = assassin.cd;
							break;
						case"master":
							fieldInt[z][2] = master.cd;
							break;
						case"archer":
							fieldInt[z][2] = archer.cd;
							break;
						case"priest":
							fieldInt[z][2] = priest.cd;
							break;
						
					}
				}
				
				
				for(int f=5;f<10;f++)//敵人CD-1
				{
					fieldInt[f][2]--;
					if(fieldInt[f][2]<0)
					{
						fieldInt[f][2] = 0;
					}
				}
				
				for(int a=4;a>=0;a--)//從位置4開始進行判斷
				{								
					boolean chi = false;//確認是否獲得靈氣加成
					System.out.println("a="+a);
					if(a>0)
					{
						if(field[a+1].equals("priest")||field[a-1].equals("priest"))//當左一格或右一格為牧師時
						{
							chi = true;
						}
					}
					else
					{
						if(field[a+1].equals("priest"))
						{
							chi = true;
						}
					}
					if(fieldInt[a][2]==0)//當cd為0
					{			
						battlefield.printfield();
						switch(field[a])
						{
		//***************************************************************************
							case"knight"://狂劍士進行攻擊
								System.out.println("目前控制狂劍士，請輸入指令");
								boolean check = true;
								while(check)
								{
									String _command = command.nextLine();//讀取玩家輸入
									String[] _commandCut = _command.split(" ");
									
									switch(_commandCut[0])
									{
										case "exchange":											
											int exchange = 0;//宣告變數exchange儲存交換位置
											String change = "";//宣告變數change儲存職業名稱資料
											int changeInt = 0;//宣告變數changeInt儲存數值資料
											try
											{
												exchange = Integer.parseInt(_commandCut[1]);
												
											}
											catch(Exception e)
											{
												System.out.println("位置輸入錯誤");
												break;
											}
											if(exchange>4||exchange<0||field[exchange].equals(""))//當該格不存在角色或是為敵人時
											{
												System.out.println("位置輸入錯誤");
												break;
											}
											knight.cd = knight.cd+1;//先將該角色cd增加
											fieldInt[a][2] = knight.cd;//更新陣列
											change = field[a];//儲存該角色資料
											field[a] = field[exchange];//
											field[exchange] = change;//交換名稱
											for(int b=0;b<5;b++)//交換數值
											{
												changeInt = fieldInt[a][b];
												fieldInt[a][b] = fieldInt[exchange][b];
												fieldInt[exchange][b] = changeInt;
											}										
											check = false;
											a = 5;//重新檢查

											break;
											
										case "rest":
											if(knight.hp<90)
											{
												knight.hp = knight.hp+10;
											}
											else
											{
												knight.hp = 100;
											}
											
											if(knight.mp<30)
											{
												knight.mp = knight.mp+10;
											}
											else
											{
												knight.mp = 40;
											}
											check = false;
											knight.cd++;//狂劍士cd增加
											fieldInt[a][0] = knight.hp;//更新陣列
											fieldInt[a][1] = knight.mp;
											fieldInt[a][4] = knight.rage;
											fieldInt[a][2] = knight.cd;
											
											break;
											
										case "normal":
											if(fieldInt[a][1]>=5)
											{
												knight.normalknight(battlefield,chi);
											}
											else
											{
												System.out.println("mana is not enough");
												break;
											}
											check = false;
											knight.cd++;//狂劍士cd增加
											fieldInt[a][1] = knight.mp;//更新陣列
											fieldInt[a][4] = knight.rage;
											fieldInt[a][2] = knight.cd;
											break;
										case "special":
											if(fieldInt[a][1]>=25&&fieldInt[a][4]==10)
											{
												knight.specialknight(battlefield,chi);
											}
											else
											{
												System.out.println("mana is not enough or rage is not enough");
												break;
											}
											check = false;
											knight.cd++;//狂劍士cd增加
											fieldInt[a][1] = knight.mp;//更新陣列
											fieldInt[a][4] = knight.rage;
											fieldInt[a][2] = knight.cd;
											
											break;
										case "soloman":
											if(soloman)
											{
												System.out.println("發動所羅門王的詛咒");
												for(int h=5;h<10;h++)
												{
													field[h] = "";
													fieldInt[h][0] = 0;
													fieldInt[h][1] = 0;
													fieldInt[h][2] = 0;
													fieldInt[h][3] = 0;
													fieldInt[h][4] = 0;
												}
												check = false;
											}											
											else
											{
												System.out.println("輸入錯誤knight，請重新輸入");
											}
											break;
										default:
											System.out.println("輸入錯誤knight，請重新輸入");
									}
								}
								
								
								break;
		//************************************************************************************************
							case"assassin"://控制刺客
								System.out.println("目前控制刺客，請輸入指令");
								check = true;
								while(check)
								{
									String _command = command.nextLine();
									String[] _commandCut = _command.split(" ");
										
									switch(_commandCut[0])
									{
										case "exchange":
											
											int exchange = 0;//同狂劍士
											String change = "";
											int changeInt = 0;
											try
											{
												exchange = Integer.parseInt(_commandCut[1]);
												
											}
											catch(Exception e)
											{
												System.out.println("位置輸入錯誤");
												break;
											}
											if(exchange>4||exchange<0||field[exchange].equals(""))
											{
												System.out.println("位置輸入錯誤");
												break;
											}
											assassin.cd = master.cd+1;
											fieldInt[a][2] = assassin.cd;//更新陣列
											change = field[a];
											field[a] = field[exchange];
											field[exchange] = change;//交換名稱
											for(int b=0;b<5;b++)//交換數值
											{
												changeInt = fieldInt[a][b];
												fieldInt[a][b] = fieldInt[exchange][b];
												fieldInt[exchange][b] = changeInt;
											}										
											check = false;											
											a = 5;//重新檢查
											break;
										case "rest":
											if(assassin.hp<70)
											{
												assassin.hp = assassin.hp+10;
											}
											else
											{
												assassin.hp = 80;
											}
											
											if(assassin.mp<40)
											{
												assassin.mp = assassin.mp+10;
											}
											else
											{
												assassin.mp = 50;
											}
											check = false;
											assassin.cd++;
											fieldInt[a][0] = assassin.hp;
											fieldInt[a][1] = assassin.mp;
											fieldInt[a][4] = assassin.rage;
											fieldInt[a][2] = assassin.cd;
											break;
											
										case "normal":
											if(assassin.mp>=10)
											{
												assassin.normalassassin(battlefield,chi);
											}
											else
											{
												System.out.println("mana is not enough");
												break;
											}
											check = false;
											assassin.cd++;
											fieldInt[a][1] = assassin.mp;
											fieldInt[a][4] = assassin.rage;
											fieldInt[a][2] = assassin.cd;
											break;
										case "special":
											int target = 0;
											if(assassin.mp>=25&&assassin.rage==10)
											{
												try
												{
													target = Integer.parseInt(_commandCut[1]);											
												}
												catch(Exception e)
												{
													System.out.println("位置輸入錯誤");
													break;
												}
												if(target<5||target>9||field[target].equals(""))
												{
													System.out.println("位置輸入錯誤");
													break;
												}
												switch(field[target])
												{
													case"barbarian":
														if(fieldInt[target][0]>48)
														{
															System.out.println("敵人血量過高，無法暗殺");
															break;
														}
														else
														{
															assassin.specialassassin(battlefield,chi,target);
														}
														break;
													case"wizard":
														if(fieldInt[target][0]>32)
														{
															System.out.println("敵人血量過高，無法暗殺");
															break;
														}
														else
															{
															assassin.specialassassin(battlefield,chi,target);
														}
														break;
													case"witch":
														if(fieldInt[target][0]>32)
														{
															System.out.println("敵人血量過高，無法暗殺");
															break;
														}
														else
														{
																assassin.specialassassin(battlefield,chi,target);
														}
														break;
													case"barbarian(clone)":
														if(fieldInt[target][0]>48)
														{
															System.out.println("敵人血量過高，無法暗殺");
															break;
														}
														else
														{
															assassin.specialassassin(battlefield,chi,target);
														}
														break;
													
												}
												
											}
											else
											{
												System.out.println("mana is not enough or rage is not enough");
												break;
											}
											assassin.cd++;
											fieldInt[a][1] = assassin.mp;
											fieldInt[a][4] = assassin.rage;
											fieldInt[a][2] = assassin.cd;
											check = false;
											break;
										case "soloman":
											if(soloman)
											{
												System.out.println("發動所羅門王的詛咒");
												for(int h=5;h<10;h++)
												{
													field[h] = "";
													fieldInt[h][0] = 0;
													fieldInt[h][1] = 0;
													fieldInt[h][2] = 0;
													fieldInt[h][3] = 0;
													fieldInt[h][4] = 0;
												}
												check = false;
											}
											else
											{
												System.out.println("輸入錯誤assassin，請重新輸入");
											}
											break;	
										default:
											System.out.println("輸入錯誤assassin，請重新輸入");
											break;
									}
								}
								
								break;
			//****************************************************************************************				
							case"master":
								System.out.println("目前控制元素法師，請輸入指令");
								check = true;
								while(check)
								{
									String _command = command.nextLine();
									String[] _commandCut = _command.split(" ");
									
									switch(_commandCut[0])
									{
										case "exchange":
											
											int exchange = 0;
											String change = "";
											int changeInt = 0;
											try
											{
												exchange = Integer.parseInt(_commandCut[1]);
												
											}
											catch(Exception e)
											{
												System.out.println("位置輸入錯誤");
												break;
											}
											if(exchange>4||exchange<0||field[exchange].equals(""))
											{
												System.out.println("位置輸入錯誤");
												break;
											}
											master.cd = master.cd+2;
											fieldInt[a][2] = master.cd;
											change = field[a];
											field[a] = field[exchange];
											field[exchange] = change;//交換名稱
											for(int b=0;b<5;b++)//交換數值
											{
												changeInt = fieldInt[a][b];
												fieldInt[a][b] = fieldInt[exchange][b];
												fieldInt[exchange][b] = changeInt;
											}																	
											a = 5;
											check = false;
											break;
										case "rest":
											System.out.println("master血量"+master.hp);
											if(master.hp<40)
											{
												master.hp = master.hp+10;
											}
											else
											{
												master.hp = 50;
											}
											
											if(master.mp<90)
											{
												master.mp = master.mp+10;
											}
											else
											{
												master.mp = 100;
											}
											System.out.println("master血量"+master.hp);
											check = false;
											master.cd = master.cd+2;
											fieldInt[a][0] = master.hp;
											fieldInt[a][1] = master.mp;
											fieldInt[a][2] = master.cd;
											break;
										case "normal":
											if(fieldInt[a][1]>=15)
											{
												master.normalmaster(battlefield,chi,a);
											}
											else
											{
												System.out.println("mana is not enough");
												break;
											}
											check = false;
											master.cd = master.cd+2;
											fieldInt[a][1] = master.mp;
											fieldInt[a][2] = master.cd;
											
											break;
										case "special":
											if(fieldInt[a][1]>=25)
											{
												master.specialmaster(battlefield,chi,a);
											}
											else
											{
												System.out.println("mana is not enough ");
												break;
											}
											check = false;
											master.cd = master.cd+2;
											fieldInt[a][1] = master.mp;
											fieldInt[a][2] = master.cd;
											break;
										case "soloman":
											if(soloman)
											{
												System.out.println("發動所羅門王的詛咒");
												for(int h=5;h<10;h++)
												{
													field[h] = "";
													fieldInt[h][0] = 0;
													fieldInt[h][1] = 0;
													fieldInt[h][2] = 0;
													fieldInt[h][3] = 0;
													fieldInt[h][4] = 0;
												}
												check = false;
											}
											else
											{
												System.out.println("輸入錯誤master，請重新輸入");
											}
											break;
										default:
											System.out.println("輸入錯誤master，請重新輸入");
									}
								}
								
									
								break;
			//************************************************************************************************				
							case"archer":
								System.out.println("目前控制天弓箭手，請輸入指令");
								check = true;
								while(check)
								{
									String _command = command.nextLine();
									String[] _commandCut = _command.split(" ");
									
									switch(_commandCut[0])
									{
										case "exchange":
											
											int exchange = 0;
											String change = "";
											int changeInt = 0;
											try
											{
												exchange = Integer.parseInt(_commandCut[1]);
												
											}
											catch(Exception e)
											{
												System.out.println("位置輸入錯誤");
												break;
											}
											if(exchange>4||exchange<0||field[exchange].equals(""))
											{
												System.out.println("位置輸入錯誤");
												break;
											}
											archer.cd = archer.cd+2;
											fieldInt[a][2] = archer.cd;
											change = field[a];
											field[a] = field[exchange];
											field[exchange] = change;//交換名稱
											for(int b=0;b<5;b++)//交換數值
											{
												changeInt = fieldInt[a][b];
												fieldInt[a][b] = fieldInt[exchange][b];
												fieldInt[exchange][b] = changeInt;
											}										
											a = 5;
											check = false;
											break;
										case "rest":
											if(archer.hp<50)
											{
												archer.hp = archer.hp+10;
											}
											else
											{
												archer.hp = 60;
											}
											
											if(archer.mp<70)
											{
												archer.mp = archer.mp+10;
											}
											else
											{
												archer.mp = 80;
											}
											archer.cd = archer.cd+2;
											fieldInt[a][0] = archer.hp;
											fieldInt[a][1] = archer.mp;
											fieldInt[a][2] = archer.cd;
											check = false;
											break;
											
										case "normal":
											int target = 0;
											try
											{
												target = Integer.parseInt(_commandCut[1]);											
											}
											catch(Exception e)
											{
												System.out.println("位置輸入錯誤");
												break;
											}
											if(target<5||target>9||field[target].equals(""))
											{
												System.out.println("位置輸入錯誤");
												break;
											}
											if(fieldInt[a][1]>=10)
											{
												archer.normalarcher(battlefield,chi,target);
											}
											else
											{
												System.out.println("mana is not enough");
												break;
											}
											check = false;
											archer.cd = archer.cd+2;
											fieldInt[a][1] = archer.mp;
											fieldInt[a][2] = archer.cd;
											break;
										case "special":
											if(fieldInt[a][1]>=25)
											{
												archer.specialarcher(battlefield,chi);
											}
											else
											{
												System.out.println("mana is not enough");
												break;
											}
											check = false;
											archer.cd = archer.cd+2;
											fieldInt[a][1] = archer.mp;
											fieldInt[a][2] = archer.cd;
											break;
										case "soloman":
											if(soloman)
											{
												System.out.println("發動所羅門王的詛咒");
												for(int h=5;h<10;h++)
												{
													field[h] = "";
													fieldInt[h][0] = 0;
													fieldInt[h][1] = 0;
													fieldInt[h][2] = 0;
													fieldInt[h][3] = 0;
													fieldInt[h][4] = 0;
												}
												check = false;
												
											}
											else
											{
												System.out.println("輸入錯誤archer，請重新輸入");
											}
											break;
										default:
											System.out.println("輸入錯誤archer，請重新輸入");
									}
								}
								fieldInt[a][1] = archer.mp;
								break;
			//******************************************************************************************				
							case"priest":
								System.out.println("目前控制牧師，請輸入指令");
								check = true;
								while(check)
								{
									String _command = command.nextLine();
									String[] _commandCut = _command.split(" ");
									
									switch(_commandCut[0])
									{
										case "exchange":
											
											int exchange = 0;
											String change = "";
											int changeInt = 0;
											try//檢查輸入位置
											{
												exchange = Integer.parseInt(_commandCut[1]);
												
											}
											catch(Exception e)
											{
												System.out.println("位置輸入錯誤");
												break;
											}
											if(exchange>4||exchange<0||field[exchange].equals(""))
											{
												System.out.println("位置輸入錯誤");
												break;
											}
											priest.cd = priest.cd+3;
											fieldInt[a][2] = priest.cd;
											change = field[a];
											field[a] = field[exchange];
											field[exchange] = change;//交換名稱
											for(int b=0;b<5;b++)//交換數值
											{
												changeInt = fieldInt[a][b];
												fieldInt[a][b] = fieldInt[exchange][b];
												fieldInt[exchange][b] = changeInt;
											}										
											check = false;
											a = 5;
											break;
										case"rest":
											
											if(priest.hp<50)
											{
												priest.hp = priest.hp+10;
											}
											else
											{
												priest.hp = 60;
											}
											
											if(priest.mp<90)
											{
												priest.mp = priest.mp+10;
											}
											else
											{
												priest.mp = 100;
											}
											priest.cd = priest.cd+3;
											fieldInt[a][0] = priest.hp;
											fieldInt[a][1] = priest.mp;
											fieldInt[a][2] = priest.cd;
											check = false;
											break;
										case "normal":
											int target = 0;
											try//獲得目標位置
											{
												target = Integer.parseInt(_commandCut[1]);											
											}
											catch(Exception e)
											{
												System.out.println("位置輸入錯誤");
												break;
											}
											if(target<0||target>4||field[target].equals(""))//檢查輸入位置
											{
												System.out.println("位置輸入錯誤");
												break;
											}
											if(fieldInt[a][1]>=10)//檢查魔力
											{
												priest.normalpriest(battlefield,target,knight,assassin,master,archer,priest);
												check = false;
											}
											else
											{
												System.out.println("mana is not enough");
												System.out.println("請重新輸入");
												break;
											}
											check = false;
											priest.cd = priest.cd+3;
											fieldInt[a][1] = priest.mp;
											fieldInt[a][2] = priest.cd;
											break;
										case "special":
											if(fieldInt[a][1]>=30)
											{
												priest.specialpriest(battlefield,knight,assassin,master,archer,priest);
												check = false;//檢查結束
												
											}
											else
											{
												System.out.println("mana is not enough");
												break;
											}
											check = false;
											priest.cd = priest.cd+3;
											fieldInt[a][1] = priest.mp;
											fieldInt[a][2] = priest.cd;
											break;
			//*****************************************************************************************				
										case "soloman":
											if(soloman)
											{
												System.out.println("發動所羅門王的詛咒");
												for(int h=5;h<10;h++)
												{
													field[h] = "";
													fieldInt[h][0] = 0;
													fieldInt[h][1] = 0;
													fieldInt[h][2] = 0;
													fieldInt[h][3] = 0;
													fieldInt[h][4] = 0;
												}
												check = false;
											}
											else
											{
												System.out.println("輸入錯誤priest，請重新輸入");
											}
											break;
										default:
											System.out.println("輸入錯誤priest，請重新輸入");
											break;
										
									}//switch檢查指令結束，陣列更新已在方法中完成
								}//check迴圈檢查結束
							default:
								break;
						}//角色檢查結束
					}//cd=0檢查結束
					if(fieldInt[5][0]==0&&fieldInt[6][0]==0&&fieldInt[7][0]==0&&fieldInt[8][0]==0&&fieldInt[9][0]==0)
					{
						System.out.println("敵人全數陣亡");
						onWar = false;
						break;
					}
					
				}
				if(fieldInt[5][0]==0&&fieldInt[6][0]==0&&fieldInt[7][0]==0&&fieldInt[8][0]==0&&fieldInt[9][0]==0)
				{
					System.out.println("敵人全數陣亡");
					onWar = false;
					break;
				}//玩家攻擊全部結束	
				
		//**************************玩家攻擊結束***********敵人攻擊開始*********************************************
				System.out.println("進入敵人攻擊階段");
				
				for(int i=5;i<10;i++)
				{
					boolean chi = false;//確認是否獲得靈氣加成
					System.out.println("i="+i);
					if(i<9)
					{
						if(field[i+1].equals("witch")||field[i-1].equals("witch"))//當左一格或右一格為女巫時
						{
							chi = true;
						}
					}
					else
					{
						if(field[i-1].equals("witch"))
						{
							chi = true;
						}
					}
					if(fieldInt[i][2]==0)//當cd為0
					{
						switch(field[i])//判斷該格敵人
						{
							case"barbarian":
								//System.out.println(fieldInt[i][4]);
								fieldInt[i][4] = barbarian.normalbarbarian(battlefield,chi,fieldInt[i][4],knight,assassin,master,archer,priest);
								fieldInt[i][2]++;//cd增加
								battlefield.printfield();
								break;
							case"barbarian(clone)":
								fieldInt[i][4] = barbarian.normalbarbarian(battlefield,chi,fieldInt[i][4],knight,assassin,master,archer,priest);
								fieldInt[i][2]++;//cd增加
								battlefield.printfield();
								break;
							case"barbarian(clone1)":
								fieldInt[i][4] = barbarian.normalbarbarian(battlefield,chi,fieldInt[i][4],knight,assassin,master,archer,priest);
								fieldInt[i][2]++;//cd增加
								battlefield.printfield();
								break;
							case"barbarian(clone2)":
								fieldInt[i][4] = barbarian.normalbarbarian(battlefield,chi,fieldInt[i][4],knight,assassin,master,archer,priest);
								fieldInt[i][2]++;//cd增加
								battlefield.printfield();
								break;
							case"wizard":
								wizard.normalwizard(battlefield,chi,i,knight,assassin,master,archer,priest);
								fieldInt[i][2] = fieldInt[i][2]+2;//cd增加
								battlefield.printfield();
								break;
							case"witch":
								witch.normalwitch(battlefield,0);
								fieldInt[i][2] = fieldInt[i][2]+3;//cd增加
								battlefield.printfield();
								break;
							case"witch1":
								witch.normalwitch(battlefield,1);
								fieldInt[i][2] = fieldInt[i][2]+3;//cd增加
								battlefield.printfield();
								break;
							case"witch2":
								witch.normalwitch(battlefield,2);
								fieldInt[i][2] = fieldInt[i][2]+3;//cd增加
								battlefield.printfield();
								break;
							default:
								break;
						}//判斷敵人switch結束
						
					}//判斷cdif結束
					
					System.out.println("該回合敵人攻擊結束");
				}//敵人攻擊結束
	//******************************************************該回合結束******************************************************		
				System.out.println("所有敵人攻擊結束");
				battlefield.printfield();			
				if(fieldInt[0][0]==0&&fieldInt[1][0]==0&&fieldInt[2][0]==0&&fieldInt[3][0]==0&&fieldInt[4][0]==0)
				{
					System.out.println("角色全數陣亡");
					onWar = false;
				}
			}//戰鬥迴圈全部結束	
		}//戰鬥方法全部結束	
}