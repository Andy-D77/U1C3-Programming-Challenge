public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    private String calcModel;
    private int idNumber;

    public Solution(String model, int id) {
        calcModel = model;
        idNumber = id;
    }

    public Solution(int id) {
        calcModel = "TI-84";
        idNumber = 1001;
    }

    public String getCalcModel() {
        //implement code here
        return calcModel;
    }

    public void setCalcModel(String newModel) {
        calcModel = newModel;
    }

    public int getIdNumber() {
        //implement code here
        return idNumber;
    }

    public void setIdNumber(int newId) {
        idNumber = newId;
    }

    public void incrementId() {
        idNumber += 1;
    }

    public double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public double subtract(double num1, double num2) {
        double s = num1 - num2;
        return s;
    }

    public double multiply(double num1, double num2) {
        double m = num1 * num2;
        return m;
    }

    public int quotient(int num1, int num2) {
        int q = num1 / num2;
        return q;
    }

    public int remainder(int num1, int num2) {
        int r = num1 % num2;
        return r;
    }

    public String divisionResult(int num1, int num2) {
        //implement code here
        return quotient(num1, num2) + " R " + remainder(num1, num2);
    }

    public String coordinatePair(int x, int y) {
        //implement code here
        return "(" + x + ", " + y +")";
    }

    public int average(int num1, int num2) {
        double av = ((double) num1 + num2 + 1) / 2;
        return (int) av;
    }

    public String info() {
        //implement code here
        return "This calculator is a model " + calcModel + " with id " + idNumber;
    }

}
