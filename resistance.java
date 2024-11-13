import java.io.*;
import java.util.*;
class resistor
	{
		double resistance;
		void giveData(resistor R1,resistor R2){
			resistance = R1.resistance;
			resistance = R2.resistance;
		}
		void displayData(resistor R1,resistor R2)
		{
			System.out.println("Resistor-1 Resistance:"+R1.resistance);
			System.out.println("Resistor-2 Resistance:"+R2.resistance);
		}
	}
class SeriesCircuit extends resistor
	{
		double calculateSeriesResistance(resistor R1,resistor R2)
		{
		SeriesCircuit s1=new SeriesCircuit();
		double res = R1.resistance+R2.resistance;
		return res;
		}
	}
class ParallelCircuit extends resistor
	{
	double calculateParallelResistance(resistor R1,resistor R2)
		{
			ParallelCircuit p1=new ParallelCircuit();
			double res = (1/R1.resistance)+(1/R2.resistance);
			res=1/res;
			return res;
		}
	}
class ResistorExecute
	{
		public static void main(String args[])
		{
			double r1,r2;
			resistor R1=new resistor();
			resistor R2=new resistor();
			resistor r=new resistor();
			SeriesCircuit s=new SeriesCircuit();
			ParallelCircuit p=new ParallelCircuit();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter resistance value for Resistor-1:");
			R1.resistance=sc.nextDouble();
			System.out.println("Enter resistance value for Resistor-2:");
			R2.resistance=sc.nextDouble();
			r.giveData(R1,R2);
			r.displayData(R1,R2);
			System.out.println("Series Resistance:"+s.calculateSeriesResistance(R1,R2));
			System.out.println("Parallel Resistance:"+p.calculateParallelResistance(R1,R2));
      
		}
	}
