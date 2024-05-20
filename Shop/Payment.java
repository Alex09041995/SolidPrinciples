package Shop;

import java.math.BigDecimal;

public interface Payment {
    
    void doTransaction(BigDecimal amount); /** реализация метода транзакции суммы  */
}
