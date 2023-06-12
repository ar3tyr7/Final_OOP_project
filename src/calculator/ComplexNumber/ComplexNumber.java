package calculator.ComplexNumber;


public class ComplexNumber  {
    double real;
    double imagine; 
    public ComplexNumber (double real, double imagine){
        this.real=real;
        this.imagine = imagine;
    }
    public double getReal(){
        return real; 
    }
    public double getImagine(){
        return imagine; 
    }
    
    @Override
    public String toString() {
        return (this.real + " + " + this.imagine + "i");
        
    }
    public void setReal(double real) {
        this.real = real;
    }
    public void setImagine(double imagine) {
        this.imagine = imagine;
    }

}
