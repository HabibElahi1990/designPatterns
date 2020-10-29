package structural.facade;

/**
 * Created by h.elahi on 11/12/2018.
 */
public class Draft {
    private CalcDiscountAmount calcDiscountAmount;
    private ClacFranchiseAmount clacFranchiseAmount;
    private ClacTaxAmount clacTaxAmount;

    public Draft() {
        calcDiscountAmount=new CalcDiscountAmount();
        clacFranchiseAmount=new ClacFranchiseAmount();
        clacTaxAmount=new ClacTaxAmount();
    }
    public Long calculate(Long totalAmount,Integer percent){
        return totalAmount- (calcDiscountAmount.calculateDiscountAmount(totalAmount,percent)
                +clacFranchiseAmount.calculateFranchiseAmount(totalAmount,percent)+
        clacTaxAmount.calculateTaxAmount(totalAmount,percent));
    }
}
