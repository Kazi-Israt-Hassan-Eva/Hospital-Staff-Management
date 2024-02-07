////Decorator Design patter  STEP:3
//Create abstract decorator class implementing the Promotion interface.

public abstract class PromotionStaff implements Promotion {
    protected Promotion staffPromotion;
    public PromotionStaff(Promotion staffPromotion){
        //eliminate the confusion between class attributes and parameters with the same name
        this.staffPromotion = staffPromotion;
    }

    public void calculatePromotion(){
        Promotion.calculatePromotion();
    }
}
