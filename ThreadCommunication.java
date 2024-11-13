import java.util.*;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
class ReadAndWrite implements Runnable{
	String file1=null;
	String file2=null;
	ReadAndWrite(String file1, String file2){
		this.file1=file1;
		this.file2=file2;
	}
	public void run(){
		try{
			BufferedReader br=new BufferedReader(new FileReader(file1));
			BufferedWriter bw=new BufferedWriter(new FileWriter(file2));
			String txt=null;
			while((txt=br.readLine())!=null){
				bw.write(txt);
				bw.newLine();
			}
			bw.close();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
		try{
			Thread.sleep(100);
		}
		catch(InterruptedException ei){
			
		}
	}
}
class Print implements Runnable{
	String oFile;
	Print(String oFile){
		this.oFile=oFile;
	}
	public void run(){
		try{
			BufferedReader br=new BufferedReader(new FileReader(oFile));
			String txt=null;
			while((txt=br.readLine())!=null){
				System.out.println("Read and sent:"+txt);
				txt=null;
			}
		}
		catch(FileNotFoundException e){
			
		}
		catch(IOException ie){
			
		}try{
      Thread.sleep(100);
		}
		catch(InterruptedException ei){
			
		}
	}
}
public class Main{
	public static void main(String [] args) throws InterruptedException{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input file name:");
		String file1=sc.next();
		System.out.print("Enter the output file name:");
		String file2=sc.next();
		ReadAndWrite rw=new ReadAndWrite(file1,file2);
		Thread t1=new Thread(rw);
		t1.start();
		t1.join();
		Print p=new Print(file2);
	    Thread t2=new Thread(p);
		t2.start();
		t2.join();
	}
}
input.txt
Hello! Lets start programming

test1.txt
CodeTantra
Start your coding in 60 mins

test2.txt
JAVA is an Object Oriented Programming Language
It is invented by James Gosling

input1.txt
Hello there!
How are you?

test3.txt
Hydrofoil is an underwater fin with a flat or curved wing-like surface.
Ships that use hydrofoils,or foils, are called hydrofoils.
