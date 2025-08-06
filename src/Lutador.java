public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;



    public Lutador(String nome, String nacionalidade, int idade, float peso, float altura, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.setCategoria();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() {
        if (this.peso < 52.2f) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3f) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9f) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2f) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }
    public void apresentar(){
        System.out.println("APRESENTAMOSSSSS!");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: "+getNacionalidade());
        System.out.println(getIdade()+" Anos");
        System.out.println("Pesando "+getPeso()+"Kg");
        System.out.println(getAltura()+"m de altura");
        System.out.println("Ganhou "+getVitorias()+" vezes");
        System.out.println("Perdeu "+getDerrotas()+" vezes");
        System.out.println("Empatou "+getEmpates()+" vezes");
    }
    public void status(){
        System.out.println(getNome());
        System.out.println("É um peso "+getCategoria());
        System.out.println(getVitorias()+" vitorias");
        System.out.println(getDerrotas()+"Derrotas");
        System.out.println(getEmpates()+"Empates");
    }

    public void empatarLuta() {
        setEmpates(getEmpates()+1);
    }
}
