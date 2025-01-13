package app;

public class Particionador {

    private int[] valores;
    private int left;
    private int right;
    private int pivot;
    private int i;

    public Particionador(int[] valores, int left, int right) {
        this.valores = valores;
        this.left = left;
        this.right = right;
    }

    public int particionar() {
        inicializarParticionamento();
        realizarVarredura();
        realizarTrocaDoPivo();
        return i;
    }

    private void inicializarParticionamento() {
        pivot = valores[left];
        i = left;
    }

    private void realizarVarredura() {
        for (int j = i + 1; j <= right; j++) {
            if (valores[j] <= pivot) {
                i++;
                swap(i, j);
            }
        }
    }

    private void realizarTrocaDoPivo() {
        swap(left, i);
    }

    private void swap(int i, int j) {
        int temp = valores[i];
        valores[i] = valores[j];
        valores[j] = temp;
    }
}
