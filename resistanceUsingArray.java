import java.util.Scanner;



class Resistor{

	double resistance;

		 void giveData(int i){

					      Scanner sc = new Scanner(System.in);

						 System.out.print("Enter resistance value for Resistor-" + (i+1) +":");

						  resistance = sc.nextDouble();

		 }

		void displayData(int i){

						System.out.println("Resistor-" +(i+1)+":" + resistance);

		}

}



class Series extends Resistor{



		Resistor calculateSeriesResistance(Resistor [] obj){

					double seriesResistance=0;

					for(int i =0;i<obj.length;i++)

									seriesResistance +=obj[i].resistance;



					resistance = seriesResistance;

					return this;

		}





}
class Parallel extends Resistor{

		double sum=0;double res=0,mul =1;

		Resistor calculateParallelResistance(Resistor [] obj){

					for(int i =0;i<obj.length;i++){

								sum += (1/obj[i].resistance); 

					}

					resistance = 1/sum;

					return this;

		}

}





class ResistorExecute{





		public static void main(String args[]){



					Scanner sc = new Scanner(System.in);

					System.out.print("Enter the number of resistors:");

					int n = sc.nextInt();

					if(n !=0){



								Resistor rs [] = new Resistor[n];



								// for(int i =0;i<rs.length;i++){

									// rs[i] = new Resistor();

								// }

								for(int i=0;i<rs.length; i++){

												rs[i]=new Resistor();

											rs[i].giveData(i);

								}

								System.out.println("Resistor Values:");

								for(int i =0;i<rs.length;i++)

											rs[i].displayData(i);







								Series rr  = new Series();

								Resistor rx = rr.calculateSeriesResistance(rs);

								System.out.println("Series Resistance:"+rx.resistance);



								Parallel p = new Parallel();

								Resistor pr = p.calculateParallelResistance(rs);

								System.out.println("Parallel Resistance:" + pr.resistance);

					}

					else{

									System.out.println("Please Enter atleast 1 Resistor");
            }

		}



}
