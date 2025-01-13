package app;

public class QuickSort {

    private int[] valores;

    private QuickSort(int[] valores) {
        this.valores = valores;
    }

    public static QuickSort getInstancia(int[] valores) {
        return new QuickSort(valores);
    }

    public int getSize() {
        return valores.length;
    }

    public int[] ordenar(int left, int right) {
        if (left < right) {
            Particionador particionador = new Particionador(valores, left, right);
            int indicePivot = particionador.particionar();
            ordenar(left, indicePivot - 1);
            ordenar(indicePivot + 1, right);
        }
        return valores;
    }
}
