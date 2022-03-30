package jdbc;

import javax.swing.JOptionPane;

public class TesteConexao {
    public static void main(String[] args){
        try{
            new ConnectorFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conexão com sucesso");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "ops aconteceu o erro:" +erro);
        }
    }
}
