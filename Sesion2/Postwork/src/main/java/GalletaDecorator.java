public class GalletaDecorator implements Helado {
    private Helado helado;
    public GalletaDecorator (Helado helado){
        this.helado = helado;
    }

    @Override
    public String getDescription(){
        return helado.getDescription() + ", con galleta extra";
    }

    @Override
    public int getPrice(){
        return helado.getPrice() + 15;
    }
}