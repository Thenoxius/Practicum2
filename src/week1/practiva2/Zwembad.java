package week1.practiva2;
//herupload
public class Zwembad {
    private double lengte;
    private double breedte;
    private double diepte;
    public Zwembad (double lg, double br, double dp){
        lengte = lg;
        breedte = br;
        diepte = dp;
    }
    public Zwembad(){}
    public double getLengte(){return lengte;}
    public double getBreedte(){return  breedte;}
    public double getDiepte(){return diepte;}
    public void setLengte(double nwLg){lengte = nwLg;}
    public void setBreedte(double nwBr){breedte = nwBr;}
    public void setDiepte(double nwDp){diepte = nwDp;}
    public double inhoud(){return lengte * breedte * diepte;}
    public String toString() {
        String s ="Dit zwembad is "+ breedte +" meter breed, "+lengte+" meter lang, en "+diepte+" meter diep";
        return s;}



}
