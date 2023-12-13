public class Bottiglia{
    protected String tipologia;
    protected String colore;
    protected String annoImbottigliamento;
    protected double prezzoStimato;
    
    public Bottiglia(Bottiglia bot){
        this.tipologia = bot.tipologia;
        this.colore = bot.colore;
        this.annoImbottigliamento = bot.annoImbottigliamento;
        this.prezzoStimato = bot.prezzoStimato;
    }
    
    public Bottiglia(){
        this.tipologia = tipologia;
        this.colore = colore;
        this.annoImbottigliamento = annoImbottigliamento;
        this.prezzoStimato = prezzoStimato;
    }
}