package Ex;

class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }

}

class SubstractionbleCalculator extends Calculator {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

class CalculatorDemo1 {
    public static void main(String[] args) {

        SubstractionbleCalculator c1 = new SubstractionbleCalculator();

        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();

    }
}