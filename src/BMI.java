public class BMI {

    private double weight;
    private double height;

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }


 public double showResult()
 {
     double res=0;
     return res =this.weight/(this.height*this.height);
 }

}
