public class SchoolGradingSystem extends GradingSystem {
    public void loadData(String nString, String[] lineas) {
        // Leer n
        int n = Integer.parseInt(nString);
        // Asignar numero de filas en el padre
        setN(n);
        // Crear matriz temporal
        double[][] temp = new double[getN()][4];
        // Ciclo de lectura
        for (int i = 0; i < getN(); i++) {
            // Leer linea de texto
            String linea = lineas[i];
            // Crear vector de Strings
            String[] celda = linea.split(" ");
            // Asignar valores en cada posicion
            temp[i][0] = Double.parseDouble(celda[0]);
            temp[i][1] = Double.parseDouble(celda[1]);
            temp[i][2] = Double.parseDouble(celda[2]);
            temp[i][3] = Double.parseDouble(celda[3]);
        }
        // Asignar la matriz en el padre
        setMatriz(temp);
    }
}