class LinguagemFavorita {

    String nome;
    String ide;
    int anoDeCriacao;

    public LinguagemFavorita(String nome, String ide, int anoDeCriacao) {
        this.nome = nome;
        this.ide = ide;
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita [nome=" + nome + ", ide=" + ide + ", anoDeCriacao=" + anoDeCriacao + "]";
    }

}