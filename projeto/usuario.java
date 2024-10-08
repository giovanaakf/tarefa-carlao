package projeto;

public class usuario {public class Usuario {
    private String nome;
    private String email;
    private String telefone;
    private String tipoUsuario; // Ex: "Admin", "Cliente", etc.

    // Construtor
    public Usuario(String nome, String email, String telefone, String tipoUsuario) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuário [Nome=" + nome + ", Email=" + email + ", Telefone=" + telefone + ", Tipo=" + tipoUsuario + "]";
    }
}


}
