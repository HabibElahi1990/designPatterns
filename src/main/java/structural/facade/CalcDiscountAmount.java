package structural.facade;

/**
 * Created by h.elahi on 11/12/2018.
 */
public class CalcDiscountAmount {

    public Long calculateDiscountAmount(Long totalAmount,Integer discountPercent){
        return totalAmount*discountPercent/100;
    }
}
