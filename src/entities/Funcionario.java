package entities;

public class Funcionario {
	public String name;
	public double grossalary;
	public double tax;


	 public double grossalary (double grossalary) {
		 return this.grossalary += grossalary;
	 }
	
	 public double netSalary (double tax) {
		 return this.grossalary -= tax;	  
	  }
	 
		public String toString() {
			return name
			+", R$ "	
			+ String.format("%.2f ", grossalary)
			+ String.format("%.2f ", tax);
		}
		
		public double string () {
			return grossalary - tax;
				
			
		}
		//}
		//+"Tax: "
		//+ String.format("%.2f", salary)
			//+" units, Total: $ "
			//+ String.format("%.2f",totalValuesInStock());

}

 
