public class TesteLampada{
    public static void main(String[] args){
        Lampada l = new Lampada();
        l.ligar();

        if(l.isSituacaoLampada()){
            System.out.println("Lâmpada ligada");
        }
        else{
            System.out.println("Lâmpada desligada");
        }
    }
}