package uj.wmii.pwj.introduction;

public class QuadraticEquation {

    public double[] findRoots(double a, double b, double c) {
        double delta = b * b - (4 * a * c);

        if (delta > 0) {
            double[] x = new double[2];
            double sqrt_delta = Math.sqrt(delta);

            x[0] = (-b + sqrt_delta) / (2 * a);
            x[1] = (-b - sqrt_delta) / (2 * a);

            return x;
        } else if (delta == 0) {
            double[] x = new double[1];

            x[0] = (-b) / (2 * a);

            return x;
        } else
            return new double[0];
    }
}

