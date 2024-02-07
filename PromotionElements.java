//Decorotor design pattern STEP:4

public class PromotionElements extends PromotionStaff {
    public PromotionElements(Promotion staffPromotion) {
        super(staffPromotion);
    }
    public void calculatePromotion(){
        Promotion.calculatePromotion();
        setPromotionList(staffPromotion);
    }
    private void setPromotionList(Promotion staffPromotion) {
        System.out.println("Need for Promotion");
    }
}
