package EADs.EAD2.Exercicio3;

public class Notas {
    public double nota1;
    public double nota2;
    public double nota3;

    public Notas(double nota1, double nota2, double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double somaDasNotas(){
        return nota1 + nota2 + nota3;
    }

    public void situacaoAluno(){

        System.out.println("\n---------------------------------------");
        System.out.println("\nNota final: " + somaDasNotas());
        
        if (somaDasNotas() >= 60) {
            System.out.println("Aprovado!\n");
        } else {
            double faltante = 60 - somaDasNotas();
            System.out.println("Reprovado!");
            System.out.println("Faltando " + faltante + " pontos\n");
        }
    }
}
