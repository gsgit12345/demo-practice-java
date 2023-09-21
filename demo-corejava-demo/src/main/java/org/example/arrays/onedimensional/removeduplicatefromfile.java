package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;

public class removeduplicatefromfile {

	int count = 0;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		removeduplicatefromfile ff = new removeduplicatefromfile();
		ff.MostRepeatedWordInFile();
	}

	public static void removeDuplicateFromFile() throws IOException {
		// PrintWriter object for output.txt
		PrintWriter output = new PrintWriter("D:\\file\\output.txt");
		// BufferedReader object for input.txt
		BufferedReader input = new BufferedReader(new FileReader("D:\\file\\input.txt"));
		String line = input.readLine();
		// set store unique values
		HashSet<String> hs = new HashSet<String>();
		// loop for each line of input.txt
		while (line != null) {
			// write only if not
			// present in hashset
			if (hs.add(line))
				output.println(line);
			line = input.readLine();
		}
		output.flush();
		// closing resources
		input.close();
		output.close();
		System.out.println("File operation performed successfully");
	}
public static void MostRepeatedWordInFile() throws IOException
{
    String line, word = "";    
    int count = 0, maxCount = 0;    
    ArrayList<String> words = new ArrayList<String>();    
        
    //Opens file in read mode    
    FileReader input = new FileReader("D:\\file\\input.txt");    
    BufferedReader br = new BufferedReader(input);          
    //Reads each line    
    while((line = br.readLine()) != null) {    
        String string[] = line.toLowerCase().split("([,.\\s]+) ");    
        //Adding all words generated in previous step into words    
        for(String s : string){    
            words.add(s);    
        }    
    }         
    //Determine the most repeated word in a file    
    for(int i = 0; i < words.size(); i++){    
        count = 1;    
        //Count each word in the file and store it in variable count    
        for(int j = i+1; j < words.size(); j++){    
            if(words.get(i).equals(words.get(j))){    
                count++;    
            }     
        }    
        //If maxCount is less than count then store value of count in maxCount     
        //and corresponding word to variable word    
        if(count > maxCount){    
            maxCount = count;    
            word = words.get(i);    
        }    
    }    
        
    System.out.println("Most repeated word: " + word);    
    br.close();    
}    


}

