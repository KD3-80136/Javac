
public class HouredEmp extends Employee
{
	private double hourlyRate;
	private int hrs;
		
		public HouredEmp() {
			
		}
		public HouredEmp(int hrs,int hourlyRate) {
			this.hrs=hrs;
			this.hourlyRate=hourlyRate;
			
			
		}
		 public double CalculateSalary() {
			if(this.hrs>40){
				this.hourlyRate += (this.hrs-40)*1.5*hourlyRate;
			}
			
				return this.hourlyRate*(this.hrs);
			
		 }
}
