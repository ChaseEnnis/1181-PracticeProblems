// Chase Ennis
public class Rating implements Comparable<Rating>{

    private double sumOfRatings; //the sum of all of the ratings
    private int raters; //the number of people who have rated an item

    public Rating(){
        sumOfRatings=0.0;
        raters=0;
    } 
    public Rating(double sumOfRatings, int raters) {
        this.sumOfRatings=sumOfRatings;
        this.raters=raters;
    }
    public void addRating(double newRating){
        //increase the sumOfRatings by newRating and increase the number of raters by one
        sumOfRatings+=newRating;
        raters= raters +1;
    }
    public double getAverageRating(){ 
        // return the average rating; if there are no raters so far, return 0.0
        if (raters>0){
            return sumOfRatings/ (double) raters;
        }
        else {
            return 0.0;
        }

    }
    public String toString() {
        String s = getAverageRating() + " based on " + raters + " reviews";
        return s;

        // display the average rating and how many reviews it is based on; for example, if the sum of the ratings is 32 
        //and that is based on ratings from ten people, the toString method willreturn “3.2 based on 10 reviews
    }
    

    //Your Rating	class	should	also	implement	the	Comparable	interface – Ratings	
    //should	be	sorted	such	that	the	highest	average	rating	appears	first.	If	two	Rating	
    //objects	have	the	same	average,	the	one	with	the	higher	number	of	reviews	should	
    //appear	first
    public int compareTo(Rating o) {
        if (this.getAverageRating()> o.getAverageRating()){
            return -1;
        }
        if (this.getAverageRating()< o.getAverageRating()){
            return 1;
        }
        if (this.getAverageRating()== o.getAverageRating()){
            if(this.raters>o.raters){
                return -1;
            }
            else {
                return 1;
            }
        }
        else {
            return 0;
        }
    }
    
    
    
    
    
    
    
}