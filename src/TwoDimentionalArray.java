
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
public class TwoDimentionalArray 
{

		/*this class is to read a puzzle board from text-file
		 * and read contained words in the board.
		 * After reading the file line by line, break up into char array
		 * and restore the data into 2-dimensional array
		 */
		
		public static void main(String[] args)
		{
			//System.out.println("hello");
			String inputFileName = "/Users/kaya/Documents/CSAssignments/CS146HW1/src/input.txt";//name of input file
			File inputFile = new File(inputFileName);
			String contained ="";
			int row = 0;
			int column = 0;
			char[][] puzzle; //= new char[4][4];//[row][column]
			int lengthPuzzle = 0;
			try
			{
				//creating instances of input-stream
				FileInputStream fis = new FileInputStream(inputFile);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);
				
				//read data from text-file 
				String line;
				line = br.readLine();//read the first row
				char[] rowChars = line.toCharArray();//convert to char array
				lengthPuzzle = rowChars.length;
				puzzle = new char[lengthPuzzle][lengthPuzzle];
				for(int index = 0; index < lengthPuzzle; index++)
				{
					puzzle[0][index] = rowChars[index];
					System.out.printf("puzzle[0][%d] = " + puzzle[0][index] + "\n",index);
				}//insert elements in the first row into the puzzle board
				/*
				 * Note: to initialize puzzle, need to figure out the length of row and columns before getting in loop
				 */
				
				row = 1;//initialize rowIndex to be 1
				// read rest of rows
				while((line = br.readLine())!= null)
				{//output the data on a terminal
					if(line.equals(""))
					{
						line=br.readLine();//read one more line to exclude 
						contained = line;
						System.out.println("contained = " + contained);
					}
					else
					{
						System.out.println("row = "+ row);
						rowChars = line.toCharArray();//another line converted to char Array
						for(int col = 0; col < lengthPuzzle; col++)
						{
							puzzle[row][col] = rowChars[col];//insert chars to puzzle column by column
						}
					}
					//System.out.println(line);
					row++;//move to the next row
				}//while- there exist line in input.txt
				//close the file
				br.close();
				
				//System.out.println();
				System.out.println();
				System.out.println();
				String[] keyWord = contained.split(" ");//to hold string type word 
				for(int i = 0; i < keyWord.length; i++)
				{
					System.out.printf("splited[%d] = " + keyWord[i] + "\n",i);
				}
				MutchingPuzzleBoard pd = new MutchingPuzzleBoard(puzzle, keyWord, lengthPuzzle);
				System.out.println("-----Result from MuchingPuzzleBoard-----\n");
				System.out.println("-----searching top to down-----");
				pd.mutchingTtoD();
				System.out.println("-----searching down to top-----");
				pd.muchingDtoT();
				System.out.println("-----searching Right to Left-----");
				pd.mutchingRtoL();
				System.out.println("-----searching Left to Right-----");
				pd.mutchingLtoR();
				
				
				//Search!
				/*
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
					{
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
										candidate1 += String.valueOf(puzzle[t][j]);
										
									}	
								}//for-k
								if(keyWord[kyloc].equalsIgnoreCase(candidate1))
								{
									result = "start at (" +  String.valueOf(i) + "," + String.valueOf(j) +")"
											+"end at (" + String.valueOf(t) + "," + String.valueOf(j) + ")";
									System.out.printf("[%s] = %s",candidate1,result);
								}
								else
								{
									
								}
							}//if
						}//for-j
					}// for-i
					kyloc++;
				}//while*/
			}//try
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
			
			
			
			
			
			
			
			
		}//main
		
	
	 
}
