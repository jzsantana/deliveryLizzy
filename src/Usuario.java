public class Usuario {
    private String nomeUsuario;
    private String cpf;
    private String posicaoEndereco;
    private String senhaUsuario;

    public Usuario() {
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public Usuario(String nomeUsuario, String cpf, String posicaoEndereco, String senhaUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpf;
        this.posicaoEndereco = posicaoEndereco;
        this.senhaUsuario = senhaUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPosicaoEndereco() {
        return posicaoEndereco;
    }

    public void setPosicaoEndereco(String posicaoEndereco) {
        this.posicaoEndereco = posicaoEndereco;
    }

    @Override
    public String toString() {
        return nomeUsuario + " " + cpf + " " + posicaoEndereco + " " + senhaUsuario;
    }
}
