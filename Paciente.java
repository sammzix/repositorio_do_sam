class Paciente{
    private String nome;
    private int prioridade;
    private String cpf;


    public Paciente(String nome, String cpf, int prioridade){
        this.nome = nome;
        this.cpf = cpf;
        this.prioridade = prioridade;


    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getPrioridade() {
        return prioridade;
    }


    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }


    public int getCpf() {
        return cpf;
    }


    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    

    
 }