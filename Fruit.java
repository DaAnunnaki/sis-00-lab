public class Fruit extends Food{
    String season;

    public Fruit(String d, int cal, String ses) {
        super(d, cal);
        season = ses;
    }

    public String getSeason() {
        return season;
    }

    public void getSeason(String ses) {
        season = ses;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Fruit) {
            return(((Fruit)obj).getSeason() == season && 
            ((Fruit)obj).getDescription().equals(getDescription()));
        }
        else return false;
    }

    public String toString() {
        return 
    }
    
    
}
