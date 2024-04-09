class Estudante{
    String nome;
    int idade;
    double peso;
    char sexo;

    public Estudante(String nome, int idade, double peso, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
    }

    public void maisUAno(int ano){
        this.idade += ano;

    }

    public static void main (String[] args){

        Estudante est1 = new Estudante("Marcos", 22, 89.6, 'M');
        est1.maisUAno(5);

        System.out.println(est1.nome);
        System.out.println(est1.idade);
        System.out.println(est1.peso);
        System.out.println(est1.sexo);

        

    }
}