import java.util.*;
import java.io.*;

public class fight
{
	String[] field = new String[10]; //決鬥場
	int[][] fieldInt = new int[10][5]; //每個角色狀態
	FieldOperation operate = new FieldOperation();
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
	public void putPlayer(String first,String second,String third,String fourth,String fifth,Knight knight,Assassin assassin,Master master,Archer archer,Priest priest)
	{
		String[] position = {first , second , third , fourth , fifth};
		int i = 4;
		for(String now_position : position)
		{
			switch(now_position)
			{
			case "R1":
				field[i] = "knight";
				fieldInt[i][0] = knight.hp;
				fieldInt[i][1] = knight.mp;
				fieldInt[i][2] = 0;
				fieldInt[i][3] = knight.team;
				fieldInt[i][4] = knight.rage;
				break;
			case "R2":
				field[i] = "assassin";
				fieldInt[i][0] = assassin.hp;
				fieldInt[i][1] = assassin.mp;
				fieldInt[i][2] = 0;
				fieldInt[i][3] = assassin.team;
				fieldInt[i][4] = assassin.rage;
				break;
			case "R3":
				field[i] = "master";
				fieldInt[i][0] = master.hp;
				fieldInt[i][1] = master.mp;
				fieldInt[i][2] = 0;
				fieldInt[i][3] = master.team;
				break;
			case "R4":
				field[i] = "archer";
				fieldInt[i][0] = archer.hp;
				fieldInt[i][1] = archer.mp;
				fieldInt[i][2] = 0;
				fieldInt[i][3] = archer.team;
				break;
			case "R5":
				field[i] = "priest";
				fieldInt[i][0] = priest.hp;
				fieldInt[i][1] = priest.mp;
				fieldInt[i][2] = 0;
				fieldInt[i][3] = priest.team;
				break;
			case "none":
				break;
			default:
				System.out.println("輸入錯誤，請重新輸入");
				break;
			}
			i--;
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
	public void putEnemy(String command,Barbarian barbarian,Wizard wizard,Witch witch)
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
		public void war(fight battlefield,Knight knight,Assassin assassin,Master master,Archer archer,Priest priest,Barbarian barbarian,Wizard wizard,Witch witch,boolean soloman)
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
											check = operate.change(_commandCut,a,battlefield);
											if(!check)//當成功交換
											{
												a = 5;
												knight.cd++;
												fieldInt[Integer.parseInt(_commandCut[1])][2] = knight.cd;
											}
											break;
										case "rest":
											knight.rest();
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
												knight.setNormalAttack(new KnightNormalAttack());
												knight.normalAtt.normalAttack(battlefield, chi, knight.rage, knight.mp);
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
												knight.setSpecialAttack(new KnightSpecialAttack());
												knight.specialAtt.specialAttack(battlefield, chi , knight.rage , knight.mp);
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
											if(operate.soloman(battlefield, soloman))
											{
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
											check = operate.change(_commandCut,a,battlefield);
											if(!check)//當成功交換
											{
												a = 5;
												assassin.cd++;
												fieldInt[Integer.parseInt(_commandCut[1])][2] = assassin.cd;
											}										
											break;
										case "rest":
											assassin.rest();
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
												assassin.setNormalAttack(new AssassinNormalAttack());
												assassin.normalAtt.normalAttack(battlefield, chi, assassin.rage, assassin.mp);
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
															assassin.setSpecialAttack(new AssassinSpecialAttack());
															assassin.specialAtt.specialAttack(battlefield , chi , target , assassin.rage , assassin.mp);
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
															assassin.setSpecialAttack(new AssassinSpecialAttack());
															assassin.specialAtt.specialAttack(battlefield , chi , target , assassin.rage , assassin.mp);
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
															assassin.setSpecialAttack(new AssassinSpecialAttack());
															assassin.specialAtt.specialAttack(battlefield , chi , target , assassin.rage , assassin.mp);
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
															assassin.setSpecialAttack(new AssassinSpecialAttack());
															assassin.specialAtt.specialAttack(battlefield , chi , target , assassin.rage , assassin.mp);
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
											if(operate.soloman(battlefield, soloman))
											{
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
											check = operate.change(_commandCut,a,battlefield);
											if(!check)//當成功交換
											{
												a = 5;
												master.cd+=2;
												fieldInt[Integer.parseInt(_commandCut[1])][2] = master.cd;
											}			
											
											break;
										case "rest":
											System.out.println("master血量"+master.hp);
											master.rest();
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
												master.setNormalAttack(new MasterNormalAttack());
												master.normalAtt.normalAttack(battlefield, chi, a, master.mp);											}
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
												master.setSpecialAttack(new MasterSpecialAttack());
												master.specialAtt.specialAttack(battlefield , chi , a , master.rage , master.mp);
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
											if(operate.soloman(battlefield, soloman))
											{
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
											check = operate.change(_commandCut,a,battlefield);
											if(!check)//當成功交換
											{
												a = 5;
												archer.cd+=2;
												fieldInt[Integer.parseInt(_commandCut[1])][2] = archer.cd;
											}			
											break;
										case "rest":
											archer.rest();
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
												archer.setNormalAttack(new ArcherNormalAttack());
												archer.normalAtt.normalAttack(battlefield , chi , target , archer.mp);
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
												archer.setSpecialAttack(new ArcherSpecialAttack());
												archer.specialAtt.specialAttack(battlefield , chi , archer.rage , archer.mp);
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
											if(operate.soloman(battlefield, soloman))
											{
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
											check = operate.change(_commandCut,a,battlefield);
											if(!check)//當成功交換
											{
												a = 5;
												priest.cd+=3;
												fieldInt[Integer.parseInt(_commandCut[1])][2] = priest.cd;
											}			
											break;
										case"rest":
											priest.rest();
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
												priest.setNormalAttack(new PriestNormalAttack());
												priest.normalAtt.normalAttack(battlefield,target,knight,assassin,master,archer,priest);
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
												priest.setSpecialAttack(new PriestSpecialAttack());
												priest.specialAtt.specialAttack(battlefield,knight,assassin,master,archer,priest , priest.rage , priest.mp);
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
											if(operate.soloman(battlefield, soloman))
											{
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
								barbarian.setNormalAttack(new BarbarianNormalAttack());
								fieldInt[i][4] = barbarian.normalAtt.normalAttack(battlefield,chi,fieldInt[i][4],knight,assassin,master,archer,priest);
								fieldInt[i][2]++;//cd增加
								battlefield.printfield();
								break;
							case"barbarian(clone)":
								fieldInt[i][4] = barbarian.normalAtt.normalAttack(battlefield,chi,fieldInt[i][4],knight,assassin,master,archer,priest);
								fieldInt[i][2]++;//cd增加
								battlefield.printfield();
								break;
							case"barbarian(clone1)":
								fieldInt[i][4] = barbarian.normalAtt.normalAttack(battlefield,chi,fieldInt[i][4],knight,assassin,master,archer,priest);
								fieldInt[i][2]++;//cd增加
								battlefield.printfield();
								break;
							case"barbarian(clone2)":
								fieldInt[i][4] = barbarian.normalAtt.normalAttack(battlefield,chi,fieldInt[i][4],knight,assassin,master,archer,priest);
								fieldInt[i][2]++;//cd增加
								battlefield.printfield();
								break;
							case"wizard":
								wizard.setNormalAttack(new WizardNormalAttack());
								fieldInt[i][4] = wizard.normalAtt.normalAttack(battlefield,chi,i,knight,assassin,master,archer,priest);
								fieldInt[i][2] = fieldInt[i][2]+2;//cd增加
								battlefield.printfield();
								break;
							case"witch":
								witch.setNormalAttack(new WitchNormalAttack());
								witch.normalAtt.normalAttack(battlefield,0);
								fieldInt[i][2] = fieldInt[i][2]+3;//cd增加
								battlefield.printfield();
								break;
							case"witch1":
								witch.setNormalAttack(new WitchNormalAttack());
								witch.normalAtt.normalAttack(battlefield,1);
								fieldInt[i][2] = fieldInt[i][2]+3;//cd增加
								battlefield.printfield();
								break;
							case"witch2":
								witch.setNormalAttack(new WitchNormalAttack());
								witch.normalAtt.normalAttack(battlefield,2);
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