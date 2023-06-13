/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TelaDeCadastro;



/**
 *
 * @author Caue
 */
public class Quiz {
      private String resposta;
    private String feedback;
    private int valores;
    private String perguntas;

    public Quiz(String resposta, String feedback, int valores, String perguntas) {
        this.resposta = resposta;
        this.feedback = feedback;
        this.valores = valores;
        this.perguntas = perguntas;
    }
    
    /**
     *
     * @return
     */
    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getValores() {
        return valores;
    }

    /**
     *
     * @param valores
     */
    public void setValores(int valores) {
        this.valores = valores;
    }

    public String getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(String perguntas) {
        this.perguntas = perguntas;
    }
    
}
   