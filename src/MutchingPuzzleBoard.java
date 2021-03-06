
public class MutchingPuzzleBoard
{
	private char[][] puzzle;//hold puzzle board 
	private String[] keyWord;
	int lengthPuzzle;
	MutchingPuzzleBoard(char[][] pBoard, String[] kyList, int plength)
	{
		puzzle = pBoard;
		keyWord= kyList; 
		lengthPuzzle = plength;
	}
	public void mutchingRtoL()
	{
		int kyloc = 0;
		String candidate1;
		String[] candicates = new String[4];
		String result = "";
		int kylength;
		while(kyloc < keyWord.length)
		{
			String currentKey = keyWord[kyloc];
			char fl = currentKey.charAt(0); //get the first letter of keyword
			
			for(int i = 0; i < lengthPuzzle; i++)
			{//walk though vertically
				for(int j = 0; j < lengthPuzzle; j++)
				{
					int t = 0;//where t points to the next char
					if(fl == puzzle[i][j])
					{//First Letter matched up!
						candidate1 = "";//init candidate1
						kylength = currentKey.length();
						for(int k = 0; k < kylength; k++)
						{//walk from left to right
							t = j-k;
							if(t < 0 || t > keyWord.length)
							{
								
								candidate1 += " ";
							}
							else
							{
								candidate1 += String.valueOf(puzzle[i][t]);
								
							}	
						}//for-k
						if(keyWord[kyloc].equalsIgnoreCase(candidate1))
						{
							result = "start at (" +  String.valueOf(i) + "," + String.valueOf(j) +")"
									+" end at (" + String.valueOf(t) + "," + String.valueOf(j) + ")";
							System.out.printf("[%s] = %s \n",candidate1,result);
						}
						else
						{
							
						}
					}//if
				}//for-j
			}// for-i
			kyloc++;
		}//while
		
	}
	public void mutchingLtoR()
	{
		int kyloc = 0;
		String candidate1;
		String[] candicates = new String[4];
		String result = "";
		int kylength;
		while(kyloc < keyWord.length)
		{
			String currentKey = keyWord[kyloc];
			char fl = currentKey.charAt(0); //get the first letter of keyword
			
			for(int i = 0; i < lengthPuzzle; i++)
			{//walk though vertically
				for(int j = 0; j < lengthPuzzle; j++)
				{
					int t = 0;//where t points to the next char
					if(fl == puzzle[i][j])
					{//First Letter matched up!
						candidate1 = "";//init candidate1
						kylength = currentKey.length();
						for(int k = 0; k < kylength; k++)
						{//walk from left to right
							t = j+k;
							if(t < 0 || t > keyWord.length)
							{
								candidate1 += " ";
							}
							else
							{
								candidate1 += String.valueOf(puzzle[i][t]);
							}	
						}//for-k
						if(keyWord[kyloc].equalsIgnoreCase(candidate1))
						{
							result = "start at (" +  String.valueOf(i) + "," + String.valueOf(j) +")"
									+" end at (" + String.valueOf(t) + "," + String.valueOf(j) + ")";
							System.out.printf("[%s] = %s \n",candidate1,result);
						}
						else
						{
							
						}
					}//if
				}//for-j
			}// for-i
			kyloc++;
		}//while
		
	}
	
	public void mutchingTtoD()
	{
		int kyloc = 0;
		String candidate1;
		String[] candicates = new String[4];
		String result = "";
		int kylength;
		while(kyloc < keyWord.length)
		{
			String currentKey = keyWord[kyloc];
			char fl = currentKey.charAt(0); //get the first letter of keyword
			
			for(int i = 0; i < lengthPuzzle; i++)
			{//walk though vertically
				for(int j = 0; j < lengthPuzzle; j++)
				{
					int t = 0;//where t points to the next char
					if(fl == puzzle[i][j])
					{//First Letter matched up!
						candidate1 = "";//init candidate1
						kylength = currentKey.length();
						for(int k = 0; k < kylength; k++)
						{//walk from left to right
							t = i+k;
							if(t < 0 || t > keyWord.length)
							{
								
								candidate1 += " ";
							}
							else
							{
								//System.out.println("t = " + t);
								//System.out.println("j = " + j);
								candidate1 += String.valueOf(puzzle[t][j]);
								
							}	
						}//for-k
						if(keyWord[kyloc].equalsIgnoreCase(candidate1))
						{
							result = "start at (" +  String.valueOf(i) + "," + String.valueOf(j) +")"
									+" end at (" + String.valueOf(t) + "," + String.valueOf(j) + ")";
							System.out.printf("[%s] = %s \n",candidate1,result);
						}
						else
						{
							
						}
					}//if
				}//for-j
			}// for-i
			kyloc++;
		}//while
		
	}//mutchingTtoD();
	
	public void muchingDtoT()
	{
		int kyloc = 0;
		String candidate1;//Temporally store char which is cast to string
		String[] candicates = new String[4];//store String around puzzle[i][j]
		String result = "";//store the final result
		int kylength;
		while(kyloc < keyWord.length)
		{
			String currentKey = keyWord[kyloc];
			char fl = currentKey.charAt(0); //get the first letter of keyword
			
			for(int i = 0; i < lengthPuzzle; i++)
			{//walk though vertically
				for(int j = 0; j < lengthPuzzle; j++)
				{
					int t = 0;//where t points to the next char
					if(fl == puzzle[i][j])
					{//First Letter matched up!
						candidate1 = "";//init candidate1
						kylength = currentKey.length();
						for(int k = 0; k < kylength; k++)
						{//walk from left to right
							t = i-k;
							if(t < 0 || t > keyWord.length)
							{
								
								candidate1 += " ";
							}
							else
							{
								candidate1 += String.valueOf(puzzle[t][j]);
								
							}	
						}//for-k
						if(keyWord[kyloc].equalsIgnoreCase(candidate1))
						{
							result = "start at (" +  String.valueOf(i) + "," + String.valueOf(j) +")"
									+" end at (" + String.valueOf(t) + "," + String.valueOf(j) + ")";
							System.out.printf("[%s] = %s \n",candidate1,result);
						}
						else
						{
							
						}
					}//if
				}//for-j
			}// for-i
			kyloc++;
		}//while
		
	}//muchingDtoT()
	

}
