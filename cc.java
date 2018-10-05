package calc;

public class cc {


        double A;
        double B;
        double C=0;

        public cc(double Val1, double Val2)
        {
            this.A = Val1;
            this.B = Val2;
        }

        public double Sumar ()
        {
            C = A + B;
            return C;
        }

        public double Restar()
        {
            C = A - B;
            return C;
        }

        public double Dividir()
        {
            C = A / B;
            return C;
        }

        public double Multiplicar()
        {
            C = A * B;
            return C;
        }
    }

