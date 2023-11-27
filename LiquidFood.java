public class LiquidFood extends Food{

    int viscosity;

    public LiquidFood(String d, int cal, int vis) {
        super(d, cal);
        viscosity = vis;
    }

    public int getVis() {
        return viscosity;
    }

    public void getVis(int v) {
        viscosity = v;
    }

    public boolean equals(Object obj) {
        if(obj instanceof LiquidFood) {
            return(((LiquidFood)obj).getVis() == viscosity && (LiquidFood)obj).get
        }
    }
    
}
