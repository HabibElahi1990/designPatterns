package structural.facade;

/**
 * Created by h.elahi on 11/12/2018.
 */
public class ClacTaxAmount {

    public Long calculateTaxAmount(Long totalAmount,Integer taxPercent){
        return totalAmount*taxPercent/100;
    }
}
