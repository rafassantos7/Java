public class Atividade2708 {
    public static void main(String[] args) throws Exception {
        Gerente2708 geren = new Gerente2708("Rafael", "534534242", "213242", 
        new Endereco2708("Rua fksdjh", "234", "n sei", "23423", "Salvador", UnidadeFederativa2708.BAHIA)
        , Setor2708.ENGENHARIA , Sexo2708.MASCULINO, "11/07/2001", 5000, Bonificacao2708.GERENTE);
        
        Diretor2708 diretor = new Diretor2708("ADASD", "5435345", "9786455", 
        new Endereco2708("Casas bahia", "122", "Magazine Luiza", "3123", "Salvador", UnidadeFederativa2708.RIO_DE_JANEIRO), Setor2708.MARKETING,  Sexo2708.FEMININO, "02/05/2008", 4000, Bonificacao2708.DIRETOR);
        
        System.out.println(geren.toString());
        System.out.println("\n");
        System.out.println(diretor.toString());
    }
}
