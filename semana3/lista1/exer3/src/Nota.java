/*
Frequentemente, os professores gostam de visualizar as notas dos alunos por faixa de notas. Faça um
programa que monte um gráfico de barras, exibindo os dados de um array. O array pode usar os mesmos
números representado pela quantidade de asteriscos em cada faixa. Um exemplo de saída é apresentado a
seguir:
0-1 = *
1-2 =
2-3 = *****
...
9-10 = *





 */
public class Nota{
    private int value;

    public Nota(int value){
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}