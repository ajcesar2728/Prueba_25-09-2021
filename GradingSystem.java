public class GradingSystem {
    private double[][] matriz;
    private int n;
    String porc;

    public double[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(double[][] matriz) {
        this.matriz = matriz;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String stat1() {
        double sum = 0;

        for (double[] fila : matriz) {
            sum += fila[3];
        }
        double promedio = sum / n;

        int contador = 0;
        for (double[] z : matriz) {
            if (z[3] < promedio)
                contador += 1;
        }
        String cont = String.valueOf(contador);
        return cont;
    }

    public String stat2() {

        double porcentajes = 0;
        for (double[] z : matriz) {
            if (z[3] > 9.0 && z[3] <= 10.0)
                porcentajes += 1;
        }
        double porcent = porcentajes / n;
        String por = String.format("%.2f", porcent);
        return por;
    }

    public String stat3() {
        int[] nota_clase = new int[3];
        String[] nombre_materias = { "idiomas", "historia", "literatura" };
        for (double[] z : matriz) {
            if (z[3] < 6)
                nota_clase[(int) z[2] - 1] += 1;
        }
        int limite = 0;
        int indice = 0;
        for (int i = 0; i < nota_clase.length; i++) {
            if (nota_clase[i] > limite) {
                limite = nota_clase[i];
                indice = i;
            }
        }
        String nom_mat = String.valueOf(nombre_materias[indice]);
        return nom_mat;

    }

    public String stat4() {
        double[] nota_estudiante = new double[6];
        String[] nombre_estudiante = { "armando", "nicolas", "daniel", "maria", "marcela", "alexandra" };
        for (double[] z : matriz) {
            if (z[2] == 1.0)
                nota_estudiante[(int) z[0] - 1] += z[3];
        }
        double limite1 = 0;
        int indice1 = 0;
        for (int i = 0; i < nota_estudiante.length; i++) {
            if (nota_estudiante[i] > limite1) {
                limite1 = nota_estudiante[i];
                indice1 = i;
            }
        }

        return (nombre_estudiante[indice1]);
    }
}