package structural.facade;

/**
 * Created by h.elahi on 11/12/2018.
 */
public class ClacFranchiseAmount {

    public Long calculateFranchiseAmount(Long totalAmount,Integer franchisePercent){
        return totalAmount*franchisePercent/100;
    }
}
