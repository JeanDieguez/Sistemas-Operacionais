package SistemasOperacionais.NanoTime;

public class VetorFuncao {
    void tempoFuncao1000(int vetor[]){
        
        double tempoInicial = System.nanoTime();
        for(int i = 0; i<1000;i++){  
            vetor[i] = 0;          
        }
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        tempoTotal = tempoTotal / Math.pow(10,9);

        System.out.printf("Tempo total para o vetor de 1000 é : %f segundos \n",tempoTotal);

    }
    void tempoFuncao10000(int vetor[]){
        
        double tempoInicial = System.nanoTime();
        for(int i = 0; i<10000;i++){ 
            vetor[i] = 0;           
        }
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        tempoTotal = tempoTotal / Math.pow(10,9);

        System.out.printf("Tempo total para o vetor de 10000 é : %f segundos \n",tempoTotal);


    }
    void tempoFuncao100000(int vetor[]){
        
        double tempoInicial = System.nanoTime();
        for(int i = 0; i<100000;i++){   
            vetor[i] = 0;         
        }
        double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        tempoTotal = tempoTotal / Math.pow(10,9);

        System.out.printf("Tempo total para o vetor de 100000 é : %f segundos \n",tempoTotal);
    }    
}
