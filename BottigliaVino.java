public class BottigliaVino extends Bottiglia{
    protected String vigneto;
    protected String luogoImbottigliamento;
    
    public BottigliaVino(BottigliaVino bot){
        super(bot);
        this.vigneto = bot.vigneto;
        this.luogoImbottigliamento = bot.luogoImbottigliamento;
    }
    
    public BottigliaVino(String vigneto, String luogoImbottigliamento){
        super();
        this.vigneto = vigneto;
        this.luogoImbottigliamento = luogoImbottigliamento;
    }
    
    public String toString(){
        String info = "";
        info += "\tvigneto\t\t\t" + vigneto + "\n";
        info += "\ttipologia\t\t\t" + tipologia + "\n";
        info += "\tcolore\t\t\t" + colore + "\n";
        info += "\tluogoImbottigliamento\t\t\t" + luogoImbottigliamento + "\n";
        info += "\tannoImbottigliamento\t\t\t" + annoImbottigliamento + "\n";
        info += "\tprezzoStimato\t\t\t" + prezzoStimato + "\n";
        return info;
    }
    
    public boolean equals(BottigliaVino bot){
        if(this.vigneto != bot.vigneto)return false;
        if(this.tipologia != bot.tipologia)return false;
        if(this.colore != bot.colore)return false;
        if(this.luogoImbottigliamento != bot.luogoImbottigliamento)return false;
        if(this.annoImbottigliamento != bot.annoImbottigliamento)return false;
        return true;
    }
}