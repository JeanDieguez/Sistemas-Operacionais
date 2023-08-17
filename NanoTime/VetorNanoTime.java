package SistemasOperacionais.NanoTime;

public class VetorNanoTime{
    public static void main(String[] args) {
        VetorFuncao v = new VetorFuncao();
        int vetor1000[] = new int[1000];
        int vetor10000[] = new int[10000];
        int vetor100000[] = new int[100000];
        
        v.tempoFuncao1000(vetor1000);        
        v.tempoFuncao10000(vetor10000); 
        v.tempoFuncao100000(vetor100000);  
                   
    }
}